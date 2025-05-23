package com.example.foodiehaven.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/example/foodiehaven/database/Admin;", "", "adminid", "", "namaPelanggan", "", "noTelepon", "alamatRumah", "tanggalPesan", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdminid", "()J", "setAdminid", "(J)V", "getAlamatRumah", "()Ljava/lang/String;", "setAlamatRumah", "(Ljava/lang/String;)V", "getNamaPelanggan", "setNamaPelanggan", "getNoTelepon", "setNoTelepon", "getTanggalPesan", "setTanggalPesan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
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
    @androidx.room.ColumnInfo
    @org.jetbrains.annotations.NotNull
    private java.lang.String tanggalPesan;
    
    public Admin(long adminid, @org.jetbrains.annotations.NotNull
    java.lang.String namaPelanggan, @org.jetbrains.annotations.NotNull
    java.lang.String noTelepon, @org.jetbrains.annotations.NotNull
    java.lang.String alamatRumah, @org.jetbrains.annotations.NotNull
    java.lang.String tanggalPesan) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTanggalPesan() {
        return null;
    }
    
    public final void setTanggalPesan(@org.jetbrains.annotations.NotNull
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
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.database.Admin copy(long adminid, @org.jetbrains.annotations.NotNull
    java.lang.String namaPelanggan, @org.jetbrains.annotations.NotNull
    java.lang.String noTelepon, @org.jetbrains.annotations.NotNull
    java.lang.String alamatRumah, @org.jetbrains.annotations.NotNull
    java.lang.String tanggalPesan) {
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