package com.example.foodiehaven.database;

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
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AdminApp_Impl extends AdminApp {
  private volatile AdminDao _adminDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Admin` (`adminid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `namaPelanggan` TEXT NOT NULL, `noTelepon` TEXT NOT NULL, `alamatRumah` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Menu` (`id` INTEGER NOT NULL, `menuid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `namamenu` TEXT NOT NULL, `hargamenu` TEXT NOT NULL, `count` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db4bd30365de7952bb461530410fac3d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Admin`");
        _db.execSQL("DROP TABLE IF EXISTS `Menu`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
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
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAdmin = new HashMap<String, TableInfo.Column>(4);
        _columnsAdmin.put("adminid", new TableInfo.Column("adminid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdmin.put("namaPelanggan", new TableInfo.Column("namaPelanggan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdmin.put("noTelepon", new TableInfo.Column("noTelepon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdmin.put("alamatRumah", new TableInfo.Column("alamatRumah", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAdmin = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAdmin = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAdmin = new TableInfo("Admin", _columnsAdmin, _foreignKeysAdmin, _indicesAdmin);
        final TableInfo _existingAdmin = TableInfo.read(_db, "Admin");
        if (! _infoAdmin.equals(_existingAdmin)) {
          return new RoomOpenHelper.ValidationResult(false, "Admin(com.example.foodiehaven.database.Admin).\n"
                  + " Expected:\n" + _infoAdmin + "\n"
                  + " Found:\n" + _existingAdmin);
        }
        final HashMap<String, TableInfo.Column> _columnsMenu = new HashMap<String, TableInfo.Column>(5);
        _columnsMenu.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMenu.put("menuid", new TableInfo.Column("menuid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMenu.put("namamenu", new TableInfo.Column("namamenu", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMenu.put("hargamenu", new TableInfo.Column("hargamenu", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMenu.put("count", new TableInfo.Column("count", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMenu = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMenu = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMenu = new TableInfo("Menu", _columnsMenu, _foreignKeysMenu, _indicesMenu);
        final TableInfo _existingMenu = TableInfo.read(_db, "Menu");
        if (! _infoMenu.equals(_existingMenu)) {
          return new RoomOpenHelper.ValidationResult(false, "Menu(com.example.foodiehaven.database.Menu).\n"
                  + " Expected:\n" + _infoMenu + "\n"
                  + " Found:\n" + _existingMenu);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "db4bd30365de7952bb461530410fac3d", "a1ef31e4f9b4bec6845c44d77279a524");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Admin","Menu");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Admin`");
      _db.execSQL("DELETE FROM `Menu`");
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
    _typeConvertersMap.put(AdminDao.class, AdminDao_Impl.getRequiredConverters());
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
  public AdminDao getAdminDao() {
    if (_adminDao != null) {
      return _adminDao;
    } else {
      synchronized(this) {
        if(_adminDao == null) {
          _adminDao = new AdminDao_Impl(this);
        }
        return _adminDao;
      }
    }
  }
}
