// Generated by view binder compiler. Do not edit!
package com.example.foodiehaven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodiehaven.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterListMenuBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView listHarga;

  @NonNull
  public final ImageView listIcon;

  @NonNull
  public final TextView listMenu;

  private AdapterListMenuBinding(@NonNull CardView rootView, @NonNull TextView listHarga,
      @NonNull ImageView listIcon, @NonNull TextView listMenu) {
    this.rootView = rootView;
    this.listHarga = listHarga;
    this.listIcon = listIcon;
    this.listMenu = listMenu;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterListMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterListMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_list_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterListMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.listHarga;
      TextView listHarga = ViewBindings.findChildViewById(rootView, id);
      if (listHarga == null) {
        break missingId;
      }

      id = R.id.listIcon;
      ImageView listIcon = ViewBindings.findChildViewById(rootView, id);
      if (listIcon == null) {
        break missingId;
      }

      id = R.id.listMenu;
      TextView listMenu = ViewBindings.findChildViewById(rootView, id);
      if (listMenu == null) {
        break missingId;
      }

      return new AdapterListMenuBinding((CardView) rootView, listHarga, listIcon, listMenu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
