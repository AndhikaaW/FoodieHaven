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

  private final EntityInsertionAdapter<Menu> __insertionAdapterOfMenu;

  private final EntityInsertionAdapter<Menu> __insertionAdapterOfMenu_1;

  private final EntityDeletionOrUpdateAdapter<Admin> __deletionAdapterOfAdmin;

  private final EntityDeletionOrUpdateAdapter<Menu> __deletionAdapterOfMenu;

  public AdminDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdmin = new EntityInsertionAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Admin` (`adminid`,`namaPelanggan`,`noTelepon`,`alamatRumah`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getAdminid());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getNoTelepon() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoTelepon());
        }
        if (value.getAlamatRumah() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAlamatRumah());
        }
      }
    };
    this.__insertionAdapterOfAdmin_1 = new EntityInsertionAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Admin` (`adminid`,`namaPelanggan`,`noTelepon`,`alamatRumah`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getAdminid());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getNoTelepon() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoTelepon());
        }
        if (value.getAlamatRumah() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAlamatRumah());
        }
      }
    };
    this.__insertionAdapterOfMenu = new EntityInsertionAdapter<Menu>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Menu` (`id`,`menuid`,`namamenu`,`hargamenu`,`count`) VALUES (?,nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Menu value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getMenuid());
        if (value.getNamamenu() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNamamenu());
        }
        if (value.getHargamenu() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHargamenu());
        }
        if (value.getCount() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCount());
        }
      }
    };
    this.__insertionAdapterOfMenu_1 = new EntityInsertionAdapter<Menu>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Menu` (`id`,`menuid`,`namamenu`,`hargamenu`,`count`) VALUES (?,nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Menu value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getMenuid());
        if (value.getNamamenu() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNamamenu());
        }
        if (value.getHargamenu() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHargamenu());
        }
        if (value.getCount() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCount());
        }
      }
    };
    this.__deletionAdapterOfAdmin = new EntityDeletionOrUpdateAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Admin` WHERE `adminid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Admin value) {
        stmt.bindLong(1, value.getAdminid());
      }
    };
    this.__deletionAdapterOfMenu = new EntityDeletionOrUpdateAdapter<Menu>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Menu` WHERE `menuid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Menu value) {
        stmt.bindLong(1, value.getMenuid());
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
  public Object insert(final Menu menu, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMenu.insert(menu);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addMenu(final Menu menu, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMenu_1.insert(menu);
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
  public Object deleteMenu(final Menu menu, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMenu.handle(menu);
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
    final String _sql = "SELECT * FROM Admin ORDER BY adminid DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Admin>>() {
      @Override
      public List<Admin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdminid = CursorUtil.getColumnIndexOrThrow(_cursor, "adminid");
          final int _cursorIndexOfNamaPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "namaPelanggan");
          final int _cursorIndexOfNoTelepon = CursorUtil.getColumnIndexOrThrow(_cursor, "noTelepon");
          final int _cursorIndexOfAlamatRumah = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatRumah");
          final List<Admin> _result = new ArrayList<Admin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Admin _item;
            final long _tmpAdminid;
            _tmpAdminid = _cursor.getLong(_cursorIndexOfAdminid);
            final String _tmpNamaPelanggan;
            if (_cursor.isNull(_cursorIndexOfNamaPelanggan)) {
              _tmpNamaPelanggan = null;
            } else {
              _tmpNamaPelanggan = _cursor.getString(_cursorIndexOfNamaPelanggan);
            }
            final String _tmpNoTelepon;
            if (_cursor.isNull(_cursorIndexOfNoTelepon)) {
              _tmpNoTelepon = null;
            } else {
              _tmpNoTelepon = _cursor.getString(_cursorIndexOfNoTelepon);
            }
            final String _tmpAlamatRumah;
            if (_cursor.isNull(_cursorIndexOfAlamatRumah)) {
              _tmpAlamatRumah = null;
            } else {
              _tmpAlamatRumah = _cursor.getString(_cursorIndexOfAlamatRumah);
            }
            _item = new Admin(_tmpAdminid,_tmpNamaPelanggan,_tmpNoTelepon,_tmpAlamatRumah);
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

  @Override
  public Object getAllMenu(final Continuation<? super List<Menu>> $completion) {
    final String _sql = "SELECT * FROM Menu ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Menu>>() {
      @Override
      public List<Menu> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMenuid = CursorUtil.getColumnIndexOrThrow(_cursor, "menuid");
          final int _cursorIndexOfNamamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "namamenu");
          final int _cursorIndexOfHargamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "hargamenu");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final List<Menu> _result = new ArrayList<Menu>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Menu _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpMenuid;
            _tmpMenuid = _cursor.getInt(_cursorIndexOfMenuid);
            final String _tmpNamamenu;
            if (_cursor.isNull(_cursorIndexOfNamamenu)) {
              _tmpNamamenu = null;
            } else {
              _tmpNamamenu = _cursor.getString(_cursorIndexOfNamamenu);
            }
            final String _tmpHargamenu;
            if (_cursor.isNull(_cursorIndexOfHargamenu)) {
              _tmpHargamenu = null;
            } else {
              _tmpHargamenu = _cursor.getString(_cursorIndexOfHargamenu);
            }
            final String _tmpCount;
            if (_cursor.isNull(_cursorIndexOfCount)) {
              _tmpCount = null;
            } else {
              _tmpCount = _cursor.getString(_cursorIndexOfCount);
            }
            _item = new Menu(_tmpId,_tmpMenuid,_tmpNamamenu,_tmpHargamenu,_tmpCount);
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
