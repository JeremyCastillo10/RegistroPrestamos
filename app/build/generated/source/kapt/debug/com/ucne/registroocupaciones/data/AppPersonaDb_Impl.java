package com.ucne.registroocupaciones.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.ucne.registroocupaciones.data.dao.PersonaDao;
import com.ucne.registroocupaciones.data.dao.PersonaDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppPersonaDb_Impl extends AppPersonaDb {
  private volatile PersonaDao _personaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Personas` (`personaid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `telefono` TEXT NOT NULL, `celular` TEXT NOT NULL, `email` TEXT NOT NULL, `direccion` TEXT NOT NULL, `fechanacimiento` TEXT NOT NULL, `nombres` TEXT NOT NULL, `ocupacionid` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'da384d12bb1f410fba97e312fb6cbca5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Personas`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPersonas = new HashMap<String, TableInfo.Column>(8);
        _columnsPersonas.put("personaid", new TableInfo.Column("personaid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("telefono", new TableInfo.Column("telefono", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("celular", new TableInfo.Column("celular", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("direccion", new TableInfo.Column("direccion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("fechanacimiento", new TableInfo.Column("fechanacimiento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("nombres", new TableInfo.Column("nombres", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPersonas.put("ocupacionid", new TableInfo.Column("ocupacionid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPersonas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPersonas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPersonas = new TableInfo("Personas", _columnsPersonas, _foreignKeysPersonas, _indicesPersonas);
        final TableInfo _existingPersonas = TableInfo.read(_db, "Personas");
        if (! _infoPersonas.equals(_existingPersonas)) {
          return new RoomOpenHelper.ValidationResult(false, "Personas(com.ucne.registroocupaciones.model.Persona).\n"
                  + " Expected:\n" + _infoPersonas + "\n"
                  + " Found:\n" + _existingPersonas);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "da384d12bb1f410fba97e312fb6cbca5", "4ec3088788467dc34086faa8076134a1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Personas");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Personas`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PersonaDao.class, PersonaDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PersonaDao getPersonaDao() {
    if (_personaDao != null) {
      return _personaDao;
    } else {
      synchronized(this) {
        if(_personaDao == null) {
          _personaDao = new PersonaDao_Impl(this);
        }
        return _personaDao;
      }
    }
  }
}
