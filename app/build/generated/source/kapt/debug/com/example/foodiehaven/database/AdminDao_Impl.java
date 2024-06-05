package com.example.foodiehaven.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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

  private final EntityInsertionAdapter<Menu> __insertionAdapterOfMenu;

  private final EntityInsertionAdapter<ItemCart> __insertionAdapterOfItemCart;

  private final EntityInsertionAdapter<Historydb> __insertionAdapterOfHistorydb;

  private final EntityDeletionOrUpdateAdapter<Admin> __deletionAdapterOfAdmin;

  private final EntityDeletionOrUpdateAdapter<Menu> __deletionAdapterOfMenu;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllMenu;

  private final SharedSQLiteStatement __preparedStmtOfDelItem;

  public AdminDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdmin = new EntityInsertionAdapter<Admin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Admin` (`adminid`,`namaPelanggan`,`noTelepon`,`alamatRumah`,`tanggalPesan`) VALUES (nullif(?, 0),?,?,?,?)";
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
        if (value.getTanggalPesan() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTanggalPesan());
        }
      }
    };
    this.__insertionAdapterOfMenu = new EntityInsertionAdapter<Menu>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Menu` (`menuid`,`namamenu`,`hargamenu`,`count`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Menu value) {
        stmt.bindLong(1, value.getMenuid());
        if (value.getNamamenu() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamamenu());
        }
        if (value.getHargamenu() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHargamenu());
        }
        if (value.getCount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCount());
        }
      }
    };
    this.__insertionAdapterOfItemCart = new EntityInsertionAdapter<ItemCart>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ItemCart` (`itemcart`,`adminid`,`namamenu`,`hargamenu`,`count`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemCart value) {
        stmt.bindLong(1, value.getItemcart());
        stmt.bindLong(2, value.getAdminid());
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
    this.__insertionAdapterOfHistorydb = new EntityInsertionAdapter<Historydb>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Historydb` (`id`,`namaPelanggan`,`tanggalPesan`,`alamatPelanggan`,`noTelpPelanggan`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Historydb value) {
        stmt.bindLong(1, value.getId());
        if (value.getNamaPelanggan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaPelanggan());
        }
        if (value.getTanggalPesan() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTanggalPesan());
        }
        if (value.getAlamatPelanggan() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAlamatPelanggan());
        }
        if (value.getNoTelpPelanggan() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNoTelpPelanggan());
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
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Admin WHERE namaPelanggan = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllMenu = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Menu";
        return _query;
      }
    };
    this.__preparedStmtOfDelItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ItemCart WHERE adminid = ?";
        return _query;
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
  public Object addMenu(final Menu menu, final Continuation<? super Unit> $completion) {
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
  public Object addItem(final ItemCart itemCart, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemCart.insert(itemCart);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addHistory(final Historydb historydb,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHistorydb.insert(historydb);
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
  public void delete(final String namaPelanggan) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (namaPelanggan == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, namaPelanggan);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public Object deleteAllMenu(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllMenu.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllMenu.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public void delItem(final long adminid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelItem.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, adminid);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelItem.release(_stmt);
    }
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
          final int _cursorIndexOfTanggalPesan = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggalPesan");
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
            final String _tmpTanggalPesan;
            if (_cursor.isNull(_cursorIndexOfTanggalPesan)) {
              _tmpTanggalPesan = null;
            } else {
              _tmpTanggalPesan = _cursor.getString(_cursorIndexOfTanggalPesan);
            }
            _item = new Admin(_tmpAdminid,_tmpNamaPelanggan,_tmpNoTelepon,_tmpAlamatRumah,_tmpTanggalPesan);
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
    final String _sql = "SELECT * FROM Menu ORDER BY menuid DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Menu>>() {
      @Override
      public List<Menu> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMenuid = CursorUtil.getColumnIndexOrThrow(_cursor, "menuid");
          final int _cursorIndexOfNamamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "namamenu");
          final int _cursorIndexOfHargamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "hargamenu");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final List<Menu> _result = new ArrayList<Menu>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Menu _item;
            final long _tmpMenuid;
            _tmpMenuid = _cursor.getLong(_cursorIndexOfMenuid);
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
            _item = new Menu(_tmpMenuid,_tmpNamamenu,_tmpHargamenu,_tmpCount);
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
  public Object getAllById(final long idBarang,
      final Continuation<? super List<ItemCart>> $completion) {
    final String _sql = "SELECT * FROM ItemCart WHERE adminid = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idBarang);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemCart>>() {
      @Override
      public List<ItemCart> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemcart = CursorUtil.getColumnIndexOrThrow(_cursor, "itemcart");
          final int _cursorIndexOfAdminid = CursorUtil.getColumnIndexOrThrow(_cursor, "adminid");
          final int _cursorIndexOfNamamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "namamenu");
          final int _cursorIndexOfHargamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "hargamenu");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final List<ItemCart> _result = new ArrayList<ItemCart>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemCart _item;
            final long _tmpItemcart;
            _tmpItemcart = _cursor.getLong(_cursorIndexOfItemcart);
            final long _tmpAdminid;
            _tmpAdminid = _cursor.getLong(_cursorIndexOfAdminid);
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
            _item = new ItemCart(_tmpItemcart,_tmpAdminid,_tmpNamamenu,_tmpHargamenu,_tmpCount);
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
  public long getLastTransaksi() {
    final String _sql = "SELECT adminid FROM Admin ORDER BY adminid DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Menu getAllMenuById(final long idBarang) {
    final String _sql = "SELECT * FROM Menu WHERE menuid = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idBarang);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMenuid = CursorUtil.getColumnIndexOrThrow(_cursor, "menuid");
      final int _cursorIndexOfNamamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "namamenu");
      final int _cursorIndexOfHargamenu = CursorUtil.getColumnIndexOrThrow(_cursor, "hargamenu");
      final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
      final Menu _result;
      if(_cursor.moveToFirst()) {
        final long _tmpMenuid;
        _tmpMenuid = _cursor.getLong(_cursorIndexOfMenuid);
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
        _result = new Menu(_tmpMenuid,_tmpNamamenu,_tmpHargamenu,_tmpCount);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getAllHistory(final Continuation<? super List<Historydb>> $completion) {
    final String _sql = "SELECT * FROM Historydb ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Historydb>>() {
      @Override
      public List<Historydb> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNamaPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "namaPelanggan");
          final int _cursorIndexOfTanggalPesan = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggalPesan");
          final int _cursorIndexOfAlamatPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatPelanggan");
          final int _cursorIndexOfNoTelpPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "noTelpPelanggan");
          final List<Historydb> _result = new ArrayList<Historydb>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Historydb _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNamaPelanggan;
            if (_cursor.isNull(_cursorIndexOfNamaPelanggan)) {
              _tmpNamaPelanggan = null;
            } else {
              _tmpNamaPelanggan = _cursor.getString(_cursorIndexOfNamaPelanggan);
            }
            final String _tmpTanggalPesan;
            if (_cursor.isNull(_cursorIndexOfTanggalPesan)) {
              _tmpTanggalPesan = null;
            } else {
              _tmpTanggalPesan = _cursor.getString(_cursorIndexOfTanggalPesan);
            }
            final String _tmpAlamatPelanggan;
            if (_cursor.isNull(_cursorIndexOfAlamatPelanggan)) {
              _tmpAlamatPelanggan = null;
            } else {
              _tmpAlamatPelanggan = _cursor.getString(_cursorIndexOfAlamatPelanggan);
            }
            final String _tmpNoTelpPelanggan;
            if (_cursor.isNull(_cursorIndexOfNoTelpPelanggan)) {
              _tmpNoTelpPelanggan = null;
            } else {
              _tmpNoTelpPelanggan = _cursor.getString(_cursorIndexOfNoTelpPelanggan);
            }
            _item = new Historydb(_tmpId,_tmpNamaPelanggan,_tmpTanggalPesan,_tmpAlamatPelanggan,_tmpNoTelpPelanggan);
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
  public List<Historydb> getHistory() {
    final String _sql = "SELECT * FROM Historydb ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNamaPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "namaPelanggan");
      final int _cursorIndexOfTanggalPesan = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggalPesan");
      final int _cursorIndexOfAlamatPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatPelanggan");
      final int _cursorIndexOfNoTelpPelanggan = CursorUtil.getColumnIndexOrThrow(_cursor, "noTelpPelanggan");
      final List<Historydb> _result = new ArrayList<Historydb>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Historydb _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpNamaPelanggan;
        if (_cursor.isNull(_cursorIndexOfNamaPelanggan)) {
          _tmpNamaPelanggan = null;
        } else {
          _tmpNamaPelanggan = _cursor.getString(_cursorIndexOfNamaPelanggan);
        }
        final String _tmpTanggalPesan;
        if (_cursor.isNull(_cursorIndexOfTanggalPesan)) {
          _tmpTanggalPesan = null;
        } else {
          _tmpTanggalPesan = _cursor.getString(_cursorIndexOfTanggalPesan);
        }
        final String _tmpAlamatPelanggan;
        if (_cursor.isNull(_cursorIndexOfAlamatPelanggan)) {
          _tmpAlamatPelanggan = null;
        } else {
          _tmpAlamatPelanggan = _cursor.getString(_cursorIndexOfAlamatPelanggan);
        }
        final String _tmpNoTelpPelanggan;
        if (_cursor.isNull(_cursorIndexOfNoTelpPelanggan)) {
          _tmpNoTelpPelanggan = null;
        } else {
          _tmpNoTelpPelanggan = _cursor.getString(_cursorIndexOfNoTelpPelanggan);
        }
        _item = new Historydb(_tmpId,_tmpNamaPelanggan,_tmpTanggalPesan,_tmpAlamatPelanggan,_tmpNoTelpPelanggan);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
