package com.example.foodiehaven.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u001a\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010 \u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010$\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0015H\'J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\'J\b\u0010&\u001a\u00020\u0015H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/foodiehaven/database/AdminDao;", "", "addAdmin", "", "admin", "Lcom/example/foodiehaven/database/Admin;", "(Lcom/example/foodiehaven/database/Admin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addHistory", "historydb", "Lcom/example/foodiehaven/database/Historydb;", "(Lcom/example/foodiehaven/database/Historydb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addItem", "itemCart", "Lcom/example/foodiehaven/database/ItemCart;", "(Lcom/example/foodiehaven/database/ItemCart;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMenu", "menu", "Lcom/example/foodiehaven/database/Menu;", "(Lcom/example/foodiehaven/database/Menu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delItem", "adminid", "", "delete", "namaPelanggan", "", "deleteAdmin", "deleteAllMenu", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMenu", "getAllAdmin", "", "getAllById", "idBarang", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistory", "getAllMenu", "getAllMenuById", "getHistory", "getLastTransaksi", "app_debug"})
@androidx.room.Dao
public abstract interface AdminDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addAdmin(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Admin admin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Admin ORDER BY adminid DESC")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllAdmin(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodiehaven.database.Admin>> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAdmin(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Admin admin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Admin WHERE namaPelanggan = :namaPelanggan")
    public abstract void delete(@org.jetbrains.annotations.NotNull
    java.lang.String namaPelanggan);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addMenu(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Menu menu, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Menu ORDER BY menuid DESC")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllMenu(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodiehaven.database.Menu>> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteMenu(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Menu menu, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Menu")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllMenu(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addItem(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.ItemCart itemCart, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ItemCart WHERE adminid = :idBarang ")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllById(long idBarang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodiehaven.database.ItemCart>> $completion);
    
    @androidx.room.Query(value = "SELECT adminid FROM Admin ORDER BY adminid DESC LIMIT 1")
    public abstract long getLastTransaksi();
    
    @androidx.room.Query(value = "SELECT * FROM Menu WHERE menuid = :idBarang ")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.foodiehaven.database.Menu getAllMenuById(long idBarang);
    
    @androidx.room.Query(value = "DELETE FROM ItemCart WHERE adminid = :adminid")
    public abstract void delItem(long adminid);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addHistory(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Historydb historydb, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Historydb ORDER BY id DESC")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodiehaven.database.Historydb>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Historydb ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.foodiehaven.database.Historydb> getHistory();
}