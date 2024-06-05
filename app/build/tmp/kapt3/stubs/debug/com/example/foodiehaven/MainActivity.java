package com.example.foodiehaven;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020-J\u0012\u0010/\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020-H\u0014J\u0006\u00103\u001a\u00020-R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u00064"}, d2 = {"Lcom/example/foodiehaven/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/foodiehaven/adapter/MenuAdapter;", "getAdapter", "()Lcom/example/foodiehaven/adapter/MenuAdapter;", "setAdapter", "(Lcom/example/foodiehaven/adapter/MenuAdapter;)V", "binding", "Lcom/example/foodiehaven/databinding/ActivityMainBinding;", "btnHistory", "Landroidx/cardview/widget/CardView;", "getBtnHistory", "()Landroidx/cardview/widget/CardView;", "setBtnHistory", "(Landroidx/cardview/widget/CardView;)V", "btnOnProcess", "getBtnOnProcess", "setBtnOnProcess", "btnlogout", "Landroid/widget/ImageView;", "getBtnlogout", "()Landroid/widget/ImageView;", "setBtnlogout", "(Landroid/widget/ImageView;)V", "cartAdapter", "Lcom/example/foodiehaven/adapter/CartAdapter;", "getCartAdapter", "()Lcom/example/foodiehaven/adapter/CartAdapter;", "setCartAdapter", "(Lcom/example/foodiehaven/adapter/CartAdapter;)V", "dao", "Lcom/example/foodiehaven/database/AdminDao;", "getDao", "()Lcom/example/foodiehaven/database/AdminDao;", "setDao", "(Lcom/example/foodiehaven/database/AdminDao;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "init", "", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setupRecycleView", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.foodiehaven.databinding.ActivityMainBinding binding;
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    public com.example.foodiehaven.adapter.MenuAdapter adapter;
    public com.example.foodiehaven.database.AdminDao dao;
    public com.example.foodiehaven.adapter.CartAdapter cartAdapter;
    public android.widget.ImageView btnlogout;
    public androidx.cardview.widget.CardView btnHistory;
    public androidx.cardview.widget.CardView btnOnProcess;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.adapter.MenuAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.MenuAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.database.AdminDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.AdminDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.adapter.CartAdapter getCartAdapter() {
        return null;
    }
    
    public final void setCartAdapter(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.CartAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getBtnlogout() {
        return null;
    }
    
    public final void setBtnlogout(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.cardview.widget.CardView getBtnHistory() {
        return null;
    }
    
    public final void setBtnHistory(@org.jetbrains.annotations.NotNull
    androidx.cardview.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.cardview.widget.CardView getBtnOnProcess() {
        return null;
    }
    
    public final void setBtnOnProcess(@org.jetbrains.annotations.NotNull
    androidx.cardview.widget.CardView p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    public final void loadData() {
    }
    
    private final void init() {
    }
    
    public final void setupRecycleView() {
    }
}