package com.example.foodiehaven.database;

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
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AdminDao_Impl implements AdminDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Admin> __insertionAdapterOfAdmin;

  private final EntityInsertionAdapter<Admin> __insertionAdapterOfAdmin_1;

  private final EntityDeletionOrUpdateAdapter<Admin> __deletionAdapterOfAdmin;

  private final EntityDeletionOrUpdateAdapter<Admin> __updateAdapterOfAdmin;

  public AdminDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdmin = new EntityInsertionAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Admin` (`id`,`namaPelanggan`,`alamatRumah`,`noTelepon`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getId());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getAlamatRumah() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAlamatRumah());
        }
        if (value.getNoTelepon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNoTelepon());
        }
      }
    };
    this.__insertionAdapterOfAdmin_1 = new EntityInsertionAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Admin` (`id`,`namaPelanggan`,`alamatRumah`,`noTelepon`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getId());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getAlamatRumah() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAlamatRumah());
        }
        if (value.getNoTelepon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNoTelepon());
        }
      }
    };
    this.__deletionAdapterOfAdmin = new EntityDeletionOrUpdateAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Admin` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAdmin = new EntityDeletionOrUpdateAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Admin` SET `id` = ?,`namaPelanggan` = ?,`alamatRumah` = ?,`noTelepon` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getId());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getAlamatRumah() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAlamatRumah());
        }
        if (value.getNoTelepon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNoTelepon());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object addAdmin(final Admin admin, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAdmin.insert(admin);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insert(final Admin admin, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAdmin_1.insert(admin);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAdmin(final Admin admin, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAdmin.handle(admin);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateAdmin(final Admin admin, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAdmin.handle(admin);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllAdmin(final Continuation<? super List<Admin>> $completion) {
    final String _sql = "SELECT * FROM Admin ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Admin>>() {
      @Override
      public List<Admin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNamaPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "namaPelanggan");
          final int _cursorIndexOfAlamatRumah = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatRumah");
          final int _cursorIndexOfNoTelepon = CursorUtil.getColumnIndexOrThrow(_cursor, "noTelepon");
          final List<Admin> _result = new ArrayList<Admin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Admin _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNamaPelanggan;
            if (_cursor.isNull(_cursorIndexOfNamaPelanggan)) {
              _tmpNamaPelanggan = null;
            } else {
              _tmpNamaPelanggan = _cursor.getString(_cursorIndexOfNamaPelanggan);
            }
            final String _tmpAlamatRumah;
            if (_cursor.isNull(_cursorIndexOfAlamatRumah)) {
              _tmpAlamatRumah = null;
            } else {
              _tmpAlamatRumah = _cursor.getString(_cursorIndexOfAlamatRumah);
            }
            final String _tmpNoTelepon;
            if (_cursor.isNull(_cursorIndexOfNoTelepon)) {
              _tmpNoTelepon = null;
            } else {
              _tmpNoTelepon = _cursor.getString(_cursorIndexOfNoTelepon);
            }
            _item = new Admin(_tmpId,_tmpNamaPelanggan,_tmpAlamatRumah,_tmpNoTelepon);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
