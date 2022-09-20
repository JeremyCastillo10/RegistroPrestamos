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
import com.ucne.registroocupaciones.data.dao.OcupacionDao;
import com.ucne.registroocupaciones.data.dao.OcupacionDao_Impl;
import com.ucne.registroocupaciones.data.dao.PersonaDao;
import com.ucne.registroocupaciones.data.dao.PersonaDao_Impl;
import com.ucne.registroocupaciones.data.dao.PrestamoDao;
import com.ucne.registroocupaciones.data.dao.PrestamoDao_Impl;
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
public final class AppDataBase_Impl extends AppDataBase {
  private volatile OcupacionDao _ocupacionDao;

  private volatile PersonaDao _personaDao;

  private volatile PrestamoDao _prestamoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Ocupaciones` (`ocupacionid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `descripcion` TEXT NOT NULL, `salario` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Personas` (`personaid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `telefono` TEXT NOT NULL, `celular` TEXT NOT NULL, `email` TEXT NOT NULL, `direccion` TEXT NOT NULL, `fechanacimiento` TEXT NOT NULL, `nombres` TEXT NOT NULL, `ocupacionid` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Prestamos` (`prestamoid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fecha` TEXT NOT NULL, `vence` TEXT NOT NULL, `personaid` INTEGER NOT NULL, `concepto` TEXT NOT NULL, `monto` REAL NOT NULL, `balance` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ec81864a2c5d8ba59192d42681735391')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Ocupaciones`");
        _db.execSQL("DROP TABLE IF EXISTS `Personas`");
        _db.execSQL("DROP TABLE IF EXISTS `Prestamos`");
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
        final HashMap<String, TableInfo.Column> _columnsOcupaciones = new HashMap<String, TableInfo.Column>(3);
        _columnsOcupaciones.put("ocupacionid", new TableInfo.Column("ocupacionid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOcupaciones.put("descripcion", new TableInfo.Column("descripcion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOcupaciones.put("salario", new TableInfo.Column("salario", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOcupaciones = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOcupaciones = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOcupaciones = new TableInfo("Ocupaciones", _columnsOcupaciones, _foreignKeysOcupaciones, _indicesOcupaciones);
        final TableInfo _existingOcupaciones = TableInfo.read(_db, "Ocupaciones");
        if (! _infoOcupaciones.equals(_existingOcupaciones)) {
          return new RoomOpenHelper.ValidationResult(false, "Ocupaciones(com.ucne.registroocupaciones.model.Ocupation).\n"
                  + " Expected:\n" + _infoOcupaciones + "\n"
                  + " Found:\n" + _existingOcupaciones);
        }
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
          return new RoomOpenHelper.ValidationResult(false, "Personas(com.ucne.registroocupaciones.data.Persona).\n"
                  + " Expected:\n" + _infoPersonas + "\n"
                  + " Found:\n" + _existingPersonas);
        }
        final HashMap<String, TableInfo.Column> _columnsPrestamos = new HashMap<String, TableInfo.Column>(7);
        _columnsPrestamos.put("prestamoid", new TableInfo.Column("prestamoid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("fecha", new TableInfo.Column("fecha", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("vence", new TableInfo.Column("vence", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("personaid", new TableInfo.Column("personaid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("concepto", new TableInfo.Column("concepto", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("monto", new TableInfo.Column("monto", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPrestamos.put("balance", new TableInfo.Column("balance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPrestamos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPrestamos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPrestamos = new TableInfo("Prestamos", _columnsPrestamos, _foreignKeysPrestamos, _indicesPrestamos);
        final TableInfo _existingPrestamos = TableInfo.read(_db, "Prestamos");
        if (! _infoPrestamos.equals(_existingPrestamos)) {
          return new RoomOpenHelper.ValidationResult(false, "Prestamos(com.ucne.registroocupaciones.data.Prestamo).\n"
                  + " Expected:\n" + _infoPrestamos + "\n"
                  + " Found:\n" + _existingPrestamos);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ec81864a2c5d8ba59192d42681735391", "98a0e7ee1a6d26622fb9b8789b56b33d");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Ocupaciones","Personas","Prestamos");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Ocupaciones`");
      _db.execSQL("DELETE FROM `Personas`");
      _db.execSQL("DELETE FROM `Prestamos`");
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
    _typeConvertersMap.put(OcupacionDao.class, OcupacionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PersonaDao.class, PersonaDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PrestamoDao.class, PrestamoDao_Impl.getRequiredConverters());
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
  public OcupacionDao getOcupacionDao() {
    if (_ocupacionDao != null) {
      return _ocupacionDao;
    } else {
      synchronized(this) {
        if(_ocupacionDao == null) {
          _ocupacionDao = new OcupacionDao_Impl(this);
        }
        return _ocupacionDao;
      }
    }
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

  @Override
  public PrestamoDao getPrestamoDao() {
    if (_prestamoDao != null) {
      return _prestamoDao;
    } else {
      synchronized(this) {
        if(_prestamoDao == null) {
          _prestamoDao = new PrestamoDao_Impl(this);
        }
        return _prestamoDao;
      }
    }
  }
}
