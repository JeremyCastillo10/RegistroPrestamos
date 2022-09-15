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
import com.ucne.registroocupaciones.model.Ocupation;
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
public final class OcupacionDao_Impl implements OcupacionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Ocupation> __insertionAdapterOfOcupation;

  private final EntityDeletionOrUpdateAdapter<Ocupation> __deletionAdapterOfOcupation;

  private final EntityDeletionOrUpdateAdapter<Ocupation> __updateAdapterOfOcupation;

  public OcupacionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOcupation = new EntityInsertionAdapter<Ocupation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Ocupaciones` (`id`,`descripcion`,`salario`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ocupation value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescripcion() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescripcion());
        }
        stmt.bindDouble(3, value.getSalario());
      }
    };
    this.__deletionAdapterOfOcupation = new EntityDeletionOrUpdateAdapter<Ocupation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Ocupaciones` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ocupation value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfOcupation = new EntityDeletionOrUpdateAdapter<Ocupation>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Ocupaciones` SET `id` = ?,`descripcion` = ?,`salario` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ocupation value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescripcion() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescripcion());
        }
        stmt.bindDouble(3, value.getSalario());
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object insertOcupacion(final Ocupation ocupation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOcupation.insert(ocupation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOcupacion(final Ocupation ocupation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOcupation.handle(ocupation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateOcupacion(final Ocupation ocupation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfOcupation.handle(ocupation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<Ocupation> getOcupacion(final int id) {
    final String _sql = "SELECT * FROM Ocupaciones WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Ocupaciones"}, new Callable<Ocupation>() {
      @Override
      public Ocupation call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfSalario = CursorUtil.getColumnIndexOrThrow(_cursor, "salario");
          final Ocupation _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final double _tmpSalario;
            _tmpSalario = _cursor.getDouble(_cursorIndexOfSalario);
            _result = new Ocupation(_tmpId,_tmpDescripcion,_tmpSalario);
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
  public Flow<List<Ocupation>> getAll() {
    final String _sql = "SELECT * FROM Ocupaciones";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Ocupaciones"}, new Callable<List<Ocupation>>() {
      @Override
      public List<Ocupation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfSalario = CursorUtil.getColumnIndexOrThrow(_cursor, "salario");
          final List<Ocupation> _result = new ArrayList<Ocupation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Ocupation _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final double _tmpSalario;
            _tmpSalario = _cursor.getDouble(_cursorIndexOfSalario);
            _item = new Ocupation(_tmpId,_tmpDescripcion,_tmpSalario);
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
