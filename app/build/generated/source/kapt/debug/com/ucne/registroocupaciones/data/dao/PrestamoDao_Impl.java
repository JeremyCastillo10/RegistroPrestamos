package com.ucne.registroocupaciones.data.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ucne.registroocupaciones.data.Prestamo;
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
public final class PrestamoDao_Impl implements PrestamoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Prestamo> __insertionAdapterOfPrestamo;

  private final EntityDeletionOrUpdateAdapter<Prestamo> __deletionAdapterOfPrestamo;

  private final EntityDeletionOrUpdateAdapter<Prestamo> __updateAdapterOfPrestamo;

  public PrestamoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPrestamo = new EntityInsertionAdapter<Prestamo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Prestamos` (`prestamoid`,`fecha`,`vence`,`personaid`,`concepto`,`monto`,`balance`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Prestamo value) {
        stmt.bindLong(1, value.getPrestamoid());
        if (value.getFecha() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFecha());
        }
        if (value.getVence() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVence());
        }
        if (value.getPersonaid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPersonaid());
        }
        if (value.getConcepto() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getConcepto());
        }
        stmt.bindDouble(6, value.getMonto());
        stmt.bindDouble(7, value.getBalance());
      }
    };
    this.__deletionAdapterOfPrestamo = new EntityDeletionOrUpdateAdapter<Prestamo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Prestamos` WHERE `prestamoid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Prestamo value) {
        stmt.bindLong(1, value.getPrestamoid());
      }
    };
    this.__updateAdapterOfPrestamo = new EntityDeletionOrUpdateAdapter<Prestamo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Prestamos` SET `prestamoid` = ?,`fecha` = ?,`vence` = ?,`personaid` = ?,`concepto` = ?,`monto` = ?,`balance` = ? WHERE `prestamoid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Prestamo value) {
        stmt.bindLong(1, value.getPrestamoid());
        if (value.getFecha() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFecha());
        }
        if (value.getVence() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVence());
        }
        if (value.getPersonaid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPersonaid());
        }
        if (value.getConcepto() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getConcepto());
        }
        stmt.bindDouble(6, value.getMonto());
        stmt.bindDouble(7, value.getBalance());
        stmt.bindLong(8, value.getPrestamoid());
      }
    };
  }

  @Override
  public Object insertPrestamo(final Prestamo prestamo,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPrestamo.insert(prestamo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deletePrestamo(final Prestamo prestamo,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPrestamo.handle(prestamo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePrestamo(final Prestamo prestamo,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPrestamo.handle(prestamo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object find(final int prestamoid, final Continuation<? super Prestamo> continuation) {
    final String _sql = "SELECT * FROM Prestamos WHERE prestamoid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, prestamoid);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Prestamo>() {
      @Override
      public Prestamo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrestamoid = CursorUtil.getColumnIndexOrThrow(_cursor, "prestamoid");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final int _cursorIndexOfVence = CursorUtil.getColumnIndexOrThrow(_cursor, "vence");
          final int _cursorIndexOfPersonaid = CursorUtil.getColumnIndexOrThrow(_cursor, "personaid");
          final int _cursorIndexOfConcepto = CursorUtil.getColumnIndexOrThrow(_cursor, "concepto");
          final int _cursorIndexOfMonto = CursorUtil.getColumnIndexOrThrow(_cursor, "monto");
          final int _cursorIndexOfBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "balance");
          final Prestamo _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPrestamoid;
            _tmpPrestamoid = _cursor.getInt(_cursorIndexOfPrestamoid);
            final String _tmpFecha;
            if (_cursor.isNull(_cursorIndexOfFecha)) {
              _tmpFecha = null;
            } else {
              _tmpFecha = _cursor.getString(_cursorIndexOfFecha);
            }
            final String _tmpVence;
            if (_cursor.isNull(_cursorIndexOfVence)) {
              _tmpVence = null;
            } else {
              _tmpVence = _cursor.getString(_cursorIndexOfVence);
            }
            final String _tmpPersonaid;
            if (_cursor.isNull(_cursorIndexOfPersonaid)) {
              _tmpPersonaid = null;
            } else {
              _tmpPersonaid = _cursor.getString(_cursorIndexOfPersonaid);
            }
            final String _tmpConcepto;
            if (_cursor.isNull(_cursorIndexOfConcepto)) {
              _tmpConcepto = null;
            } else {
              _tmpConcepto = _cursor.getString(_cursorIndexOfConcepto);
            }
            final double _tmpMonto;
            _tmpMonto = _cursor.getDouble(_cursorIndexOfMonto);
            final double _tmpBalance;
            _tmpBalance = _cursor.getDouble(_cursorIndexOfBalance);
            _result = new Prestamo(_tmpPrestamoid,_tmpFecha,_tmpVence,_tmpPersonaid,_tmpConcepto,_tmpMonto,_tmpBalance);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Prestamo>> getList() {
    final String _sql = "SELECT * FROM Prestamos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Prestamos"}, new Callable<List<Prestamo>>() {
      @Override
      public List<Prestamo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrestamoid = CursorUtil.getColumnIndexOrThrow(_cursor, "prestamoid");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final int _cursorIndexOfVence = CursorUtil.getColumnIndexOrThrow(_cursor, "vence");
          final int _cursorIndexOfPersonaid = CursorUtil.getColumnIndexOrThrow(_cursor, "personaid");
          final int _cursorIndexOfConcepto = CursorUtil.getColumnIndexOrThrow(_cursor, "concepto");
          final int _cursorIndexOfMonto = CursorUtil.getColumnIndexOrThrow(_cursor, "monto");
          final int _cursorIndexOfBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "balance");
          final List<Prestamo> _result = new ArrayList<Prestamo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Prestamo _item;
            final int _tmpPrestamoid;
            _tmpPrestamoid = _cursor.getInt(_cursorIndexOfPrestamoid);
            final String _tmpFecha;
            if (_cursor.isNull(_cursorIndexOfFecha)) {
              _tmpFecha = null;
            } else {
              _tmpFecha = _cursor.getString(_cursorIndexOfFecha);
            }
            final String _tmpVence;
            if (_cursor.isNull(_cursorIndexOfVence)) {
              _tmpVence = null;
            } else {
              _tmpVence = _cursor.getString(_cursorIndexOfVence);
            }
            final String _tmpPersonaid;
            if (_cursor.isNull(_cursorIndexOfPersonaid)) {
              _tmpPersonaid = null;
            } else {
              _tmpPersonaid = _cursor.getString(_cursorIndexOfPersonaid);
            }
            final String _tmpConcepto;
            if (_cursor.isNull(_cursorIndexOfConcepto)) {
              _tmpConcepto = null;
            } else {
              _tmpConcepto = _cursor.getString(_cursorIndexOfConcepto);
            }
            final double _tmpMonto;
            _tmpMonto = _cursor.getDouble(_cursorIndexOfMonto);
            final double _tmpBalance;
            _tmpBalance = _cursor.getDouble(_cursorIndexOfBalance);
            _item = new Prestamo(_tmpPrestamoid,_tmpFecha,_tmpVence,_tmpPersonaid,_tmpConcepto,_tmpMonto,_tmpBalance);
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
