package com.example.foodiehaven.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/foodiehaven/adapter/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodiehaven/adapter/HistoryAdapter$HistoryViewHolder;", "context", "Landroid/content/Context;", "history", "Ljava/util/ArrayList;", "Lcom/example/foodiehaven/database/Historydb;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "HistoryViewHolder", "app_debug"})
public final class HistoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodiehaven.adapter.HistoryAdapter.HistoryViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.foodiehaven.database.Historydb> history = null;
    
    public HistoryAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.foodiehaven.database.Historydb> history) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodiehaven.adapter.HistoryAdapter.HistoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.HistoryAdapter.HistoryViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodiehaven.database.Historydb> list) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/foodiehaven/adapter/HistoryAdapter$HistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "alamatPelanggan", "Landroid/widget/TextView;", "getAlamatPelanggan", "()Landroid/widget/TextView;", "namaPelanggan", "getNamaPelanggan", "noTelpPelanggan", "getNoTelpPelanggan", "tanggalPesan", "getTanggalPesan", "app_debug"})
    public static final class HistoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView namaPelanggan = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tanggalPesan = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView alamatPelanggan = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView noTelpPelanggan = null;
        
        public HistoryViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getNamaPelanggan() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTanggalPesan() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getAlamatPelanggan() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getNoTelpPelanggan() {
            return null;
        }
    }
}