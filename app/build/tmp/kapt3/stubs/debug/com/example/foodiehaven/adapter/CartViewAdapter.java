package com.example.foodiehaven.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/foodiehaven/adapter/CartViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodiehaven/adapter/CartViewAdapter$CartlistViewHolder;", "context", "Landroid/content/Context;", "listmenu", "Ljava/util/ArrayList;", "Lcom/example/foodiehaven/database/Menu;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/example/foodiehaven/adapter/CartViewAdapter$OnAdapterListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/example/foodiehaven/adapter/CartViewAdapter$OnAdapterListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "CartlistViewHolder", "OnAdapterListener", "app_debug"})
public final class CartViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodiehaven.adapter.CartViewAdapter.CartlistViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.foodiehaven.database.Menu> listmenu = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.foodiehaven.adapter.CartViewAdapter.OnAdapterListener listener = null;
    
    public CartViewAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.foodiehaven.database.Menu> listmenu, @org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.CartViewAdapter.OnAdapterListener listener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodiehaven.adapter.CartViewAdapter.CartlistViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodiehaven.adapter.CartViewAdapter.CartlistViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodiehaven.database.Menu> list) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/foodiehaven/adapter/CartViewAdapter$CartlistViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "harga", "Landroid/widget/TextView;", "getHarga", "()Landroid/widget/TextView;", "icon_delete", "Landroid/widget/ImageView;", "getIcon_delete", "()Landroid/widget/ImageView;", "jumlah", "getJumlah", "menu", "getMenu", "app_debug"})
    public static final class CartlistViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView menu = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView harga = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView jumlah = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView icon_delete = null;
        
        public CartlistViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMenu() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getHarga() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getJumlah() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIcon_delete() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/foodiehaven/adapter/CartViewAdapter$OnAdapterListener;", "", "onDeletecart", "", "cartlist", "Lcom/example/foodiehaven/database/Menu;", "app_debug"})
    public static abstract interface OnAdapterListener {
        
        public abstract void onDeletecart(@org.jetbrains.annotations.NotNull
        com.example.foodiehaven.database.Menu cartlist);
    }
}