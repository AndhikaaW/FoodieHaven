package com.example.foodiehaven.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/example/foodiehaven/database/Admin;", "", "adminid", "", "namaPelanggan", "", "noTelepon", "alamatRumah", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdminid", "()J", "setAdminid", "(J)V", "getAlamatRumah", "()Ljava/lang/String;", "setAlamatRumah", "(Ljava/lang/String;)V", "getNamaPelanggan", "setNamaPelanggan", "getNoTelepon", "setNoTelepon", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@androidx.room.Entity
public final class Admin {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long adminid;
    @androidx.room.ColumnInfo
    @org.jetbrains.annotations.NotNull
    private java.lang.String namaPelanggan;
    @androidx.room.ColumnInfo
    @org.jetbrains.annotations.NotNull
    private java.lang.String noTelepon;
    @androidx.room.ColumnInfo
    @org.jetbrains.annotations.NotNull
    private java.lang.String alamatRumah;
    
    public Admin(long adminid, @org.jetbrains.annotations.NotNull
    java.lang.String namaPelanggan, @org.jetbrains.annotations.NotNull
    java.lang.String noTelepon, @org.jetbrains.annotations.NotNull
    java.lang.String alamatRumah) {
        super();
    }
    
    public final long getAdminid() {
        return 0L;
    }
    
    public final void setAdminid(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNamaPelanggan() {
        return null;
    }
    
    public final void setNamaPelanggan(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoTelepon() {
        return null;
    }
    
    public final void setNoTelepon(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAlamatRumah() {
        return null;
    }
    
    public final void setAlamatRumah(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.database.Admin copy(long adminid, @org.jetbrains.annotations.NotNull
    java.lang.String namaPelanggan, @org.jetbrains.annotations.NotNull
    java.lang.String noTelepon, @org.jetbrains.annotations.NotNull
    java.lang.String alamatRumah) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}