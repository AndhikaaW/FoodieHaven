package com.example.foodiehaven;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\u0006\u0010\u001b\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/foodiehaven/History;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "dao", "Lcom/example/foodiehaven/database/AdminDao;", "getDao", "()Lcom/example/foodiehaven/database/AdminDao;", "setDao", "(Lcom/example/foodiehaven/database/AdminDao;)V", "historyAdapter", "Lcom/example/foodiehaven/adapter/HistoryAdapter;", "getHistoryAdapter", "()Lcom/example/foodiehaven/adapter/HistoryAdapter;", "setHistoryAdapter", "(Lcom/example/foodiehaven/adapter/HistoryAdapter;)V", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "checkAndRequestPermissions", "", "exportData", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setupRecycleView", "Companion", "app_debug"})
public final class History extends androidx.appcompat.app.AppCompatActivity {
    public com.example.foodiehaven.adapter.HistoryAdapter historyAdapter;
    public com.example.foodiehaven.database.AdminDao dao;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.foodiehaven.History.Companion Companion = null;
    
    public History() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.adapter.HistoryAdapter getHistoryAdapter() {
        return null;
    }
    
    public final void setHistoryAdapter(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.HistoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodiehaven.database.AdminDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.database.AdminDao p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkAndRequestPermissions() {
    }
    
    private final void exportData() {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    public final void loadData() {
    }
    
    public final void setupRecycleView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/foodiehaven/History$Companion;", "", "()V", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}