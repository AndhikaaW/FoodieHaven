// Generated by view binder compiler. Do not edit!
package com.example.foodiehaven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodiehaven.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterCustomerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView hargaPesanan;

  @NonNull
  public final TextView jumlahPesanan;

  @NonNull
  public final TextView menuPesanan;

  private AdapterCustomerBinding(@NonNull ConstraintLayout rootView, @NonNull TextView hargaPesanan,
      @NonNull TextView jumlahPesanan, @NonNull TextView menuPesanan) {
    this.rootView = rootView;
    this.hargaPesanan = hargaPesanan;
    this.jumlahPesanan = jumlahPesanan;
    this.menuPesanan = menuPesanan;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterCustomerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterCustomerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_customer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterCustomerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hargaPesanan;
      TextView hargaPesanan = ViewBindings.findChildViewById(rootView, id);
      if (hargaPesanan == null) {
        break missingId;
      }

      id = R.id.jumlahPesanan;
      TextView jumlahPesanan = ViewBindings.findChildViewById(rootView, id);
      if (jumlahPesanan == null) {
        break missingId;
      }

      id = R.id.menuPesanan;
      TextView menuPesanan = ViewBindings.findChildViewById(rootView, id);
      if (menuPesanan == null) {
        break missingId;
      }

      return new AdapterCustomerBinding((ConstraintLayout) rootView, hargaPesanan, jumlahPesanan,
          menuPesanan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
