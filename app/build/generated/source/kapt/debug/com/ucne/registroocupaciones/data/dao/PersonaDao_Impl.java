package com.ucne.registroocupaciones.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ucne.registroocupaciones.model.Persona;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PersonaDao_Impl implements PersonaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Persona> __insertionAdapterOfPersona;

  private final EntityDeletionOrUpdateAdapter<Persona> __deletionAdapterOfPersona;

  private final EntityDeletionOrUpdateAdapter<Persona> __updateAdapterOfPersona;

  public PersonaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPersona = new EntityInsertionAdapter<Persona>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Personas` (`personaid`,`telefono`,`celular`,`email`,`direccion`,`fechanacimiento`,`nombres`,`ocupacionid`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Persona value) {
        stmt.bindLong(1, value.getPersonaid());
        if (value.getTelefono() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTelefono());
        }
        if (value.getCelular() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCelular());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getDireccion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDireccion());
        }
        if (value.getFechanacimiento() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFechanacimiento());
        }
        if (value.getNombres() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNombres());
        }
        if (value.getOcupacionid() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOcupacionid());
        }
      }
    };
    this.__deletionAdapterOfPersona = new EntityDeletionOrUpdateAdapter<Persona>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Personas` WHERE `personaid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Persona value) {
        stmt.bindLong(1, value.getPersonaid());
      }
    };
    this.__updateAdapterOfPersona = new EntityDeletionOrUpdateAdapter<Persona>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Personas` SET `personaid` = ?,`telefono` = ?,`celular` = ?,`email` = ?,`direccion` = ?,`fechanacimiento` = ?,`nombres` = ?,`ocupacionid` = ? WHERE `personaid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Persona value) {
        stmt.bindLong(1, value.getPersonaid());
        if (value.getTelefono() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTelefono());
        }
        if (value.getCelular() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCelular());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getDireccion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDireccion());
        }
        if (value.getFechanacimiento() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFechanacimiento());
        }
        if (value.getNombres() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNombres());
        }
        if (value.getOcupacionid() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOcupacionid());
        }
        stmt.bindLong(9, value.getPersonaid());
      }
    };
  }

  @Override
  public Object insertPersonas(final Persona persona,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPersona.insert(persona);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deletePersonas(final Persona persona,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPersona.handle(persona);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePersonas(final Persona persona,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPersona.handle(persona);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<Persona> getPersona(final int id) {
    final String _sql = "SELECT * FROM Personas WHERE personaid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Personas"}, new Callable<Persona>() {
      @Override
      public Persona call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonaid = CursorUtil.getColumnIndexOrThrow(_cursor, "personaid");
          final int _cursorIndexOfTelefono = CursorUtil.getColumnIndexOrThrow(_cursor, "telefono");
          final int _cursorIndexOfCelular = CursorUtil.getColumnIndexOrThrow(_cursor, "celular");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfDireccion = CursorUtil.getColumnIndexOrThrow(_cursor, "direccion");
          final int _cursorIndexOfFechanacimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "fechanacimiento");
          final int _cursorIndexOfNombres = CursorUtil.getColumnIndexOrThrow(_cursor, "nombres");
          final int _cursorIndexOfOcupacionid = CursorUtil.getColumnIndexOrThrow(_cursor, "ocupacionid");
          final Persona _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPersonaid;
            _tmpPersonaid = _cursor.getInt(_cursorIndexOfPersonaid);
            final String _tmpTelefono;
            if (_cursor.isNull(_cursorIndexOfTelefono)) {
              _tmpTelefono = null;
            } else {
              _tmpTelefono = _cursor.getString(_cursorIndexOfTelefono);
            }
            final String _tmpCelular;
            if (_cursor.isNull(_cursorIndexOfCelular)) {
              _tmpCelular = null;
            } else {
              _tmpCelular = _cursor.getString(_cursorIndexOfCelular);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpDireccion;
            if (_cursor.isNull(_cursorIndexOfDireccion)) {
              _tmpDireccion = null;
            } else {
              _tmpDireccion = _cursor.getString(_cursorIndexOfDireccion);
            }
            final String _tmpFechanacimiento;
            if (_cursor.isNull(_cursorIndexOfFechanacimiento)) {
              _tmpFechanacimiento = null;
            } else {
              _tmpFechanacimiento = _cursor.getString(_cursorIndexOfFechanacimiento);
            }
            final String _tmpNombres;
            if (_cursor.isNull(_cursorIndexOfNombres)) {
              _tmpNombres = null;
            } else {
              _tmpNombres = _cursor.getString(_cursorIndexOfNombres);
            }
            final String _tmpOcupacionid;
            if (_cursor.isNull(_cursorIndexOfOcupacionid)) {
              _tmpOcupacionid = null;
            } else {
              _tmpOcupacionid = _cursor.getString(_cursorIndexOfOcupacionid);
            }
            _result = new Persona(_tmpPersonaid,_tmpTelefono,_tmpCelular,_tmpEmail,_tmpDireccion,_tmpFechanacimiento,_tmpNombres,_tmpOcupacionid);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Persona>> getAll() {
    final String _sql = "SELECT * FROM Personas";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Personas"}, new Callable<List<Persona>>() {
      @Override
      public List<Persona> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonaid = CursorUtil.getColumnIndexOrThrow(_cursor, "personaid");
          final int _cursorIndexOfTelefono = CursorUtil.getColumnIndexOrThrow(_cursor, "telefono");
          final int _cursorIndexOfCelular = CursorUtil.getColumnIndexOrThrow(_cursor, "celular");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfDireccion = CursorUtil.getColumnIndexOrThrow(_cursor, "direccion");
          final int _cursorIndexOfFechanacimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "fechanacimiento");
          final int _cursorIndexOfNombres = CursorUtil.getColumnIndexOrThrow(_cursor, "nombres");
          final int _cursorIndexOfOcupacionid = CursorUtil.getColumnIndexOrThrow(_cursor, "ocupacionid");
          final List<Persona> _result = new ArrayList<Persona>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Persona _item;
            final int _tmpPersonaid;
            _tmpPersonaid = _cursor.getInt(_cursorIndexOfPersonaid);
            final String _tmpTelefono;
            if (_cursor.isNull(_cursorIndexOfTelefono)) {
              _tmpTelefono = null;
            } else {
              _tmpTelefono = _cursor.getString(_cursorIndexOfTelefono);
            }
            final String _tmpCelular;
            if (_cursor.isNull(_cursorIndexOfCelular)) {
              _tmpCelular = null;
            } else {
              _tmpCelular = _cursor.getString(_cursorIndexOfCelular);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpDireccion;
            if (_cursor.isNull(_cursorIndexOfDireccion)) {
              _tmpDireccion = null;
            } else {
              _tmpDireccion = _cursor.getString(_cursorIndexOfDireccion);
            }
            final String _tmpFechanacimiento;
            if (_cursor.isNull(_cursorIndexOfFechanacimiento)) {
              _tmpFechanacimiento = null;
            } else {
              _tmpFechanacimiento = _cursor.getString(_cursorIndexOfFechanacimiento);
            }
            final String _tmpNombres;
            if (_cursor.isNull(_cursorIndexOfNombres)) {
              _tmpNombres = null;
            } else {
              _tmpNombres = _cursor.getString(_cursorIndexOfNombres);
            }
            final String _tmpOcupacionid;
            if (_cursor.isNull(_cursorIndexOfOcupacionid)) {
              _tmpOcupacionid = null;
            } else {
              _tmpOcupacionid = _cursor.getString(_cursorIndexOfOcupacionid);
            }
            _item = new Persona(_tmpPersonaid,_tmpTelefono,_tmpCelular,_tmpEmail,_tmpDireccion,_tmpFechanacimiento,_tmpNombres,_tmpOcupacionid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
