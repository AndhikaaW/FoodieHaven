package com.example.foodiehaven;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0016\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dJ\u0006\u0010*\u001a\u00020#J\u0012\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020#H\u0014J\u0006\u0010/\u001a\u00020#R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lcom/example/foodiehaven/Cart;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnKirim", "Landroid/widget/Button;", "getBtnKirim", "()Landroid/widget/Button;", "setBtnKirim", "(Landroid/widget/Button;)V", "btnTanggal", "Landroid/widget/ImageView;", "getBtnTanggal", "()Landroid/widget/ImageView;", "setBtnTanggal", "(Landroid/widget/ImageView;)V", "cartViewAdapter", "Lcom/example/foodiehaven/adapter/CartViewAdapter;", "getCartViewAdapter", "()Lcom/example/foodiehaven/adapter/CartViewAdapter;", "setCartViewAdapter", "(Lcom/example/foodiehaven/adapter/CartViewAdapter;)V", "dao", "Lcom/example/foodiehaven/database/AdminDao;", "getDao", "()Lcom/example/foodiehaven/database/AdminDao;", "setDao", "(Lcom/example/foodiehaven/database/AdminDao;)V", "listbarang", "", "Lcom/example/foodiehaven/database/Menu;", "getListbarang", "()Ljava/util/List;", "setListbarang", "(Ljava/util/List;)V", "deleteMenu", "", "getLast", "inputData", "inputItem", "id", "", "menuId", "loadDatamenu", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setupRecycleView", "app_debug"})
public final class Cart extends androidx.appcompat.app.AppCompatActivity {
    public com.example.foodiehaven.adapter.CartViewAdapter cartViewAdapter;
    public com.example.foodiehaven.database.AdminDao dao;
    public android.widget.Button btnKirim;
    public android.widget.ImageView btnTanggal;
    public java.util.List<com.example.foodiehaven.database.Menu> listbarang;
    
    public Cart() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.adapter.CartViewAdapter getCartViewAdapter() {
        return null;
    }
    
    public final void setCartViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.CartViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.database.AdminDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.AdminDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnKirim() {
        return null;
    }
    
    public final void setBtnKirim(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getBtnTanggal() {
        return null;
    }
    
    public final void setBtnTanggal(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.foodiehaven.database.Menu> getListbarang() {
        return null;
    }
    
    public final void setListbarang(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodiehaven.database.Menu> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    public final void loadDatamenu() {
    }
    
    public final void inputItem(long id, @org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.Menu menuId) {
    }
    
    public final void getLast() {
    }
    
    public final void deleteMenu() {
    }
    
    public final void inputData() {
    }
    
    public final void setupRecycleView() {
    }
}