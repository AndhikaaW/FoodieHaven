// Generated by view binder compiler. Do not edit!
package com.example.foodiehaven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodiehaven.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final EditText inputUsername;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull Button btnLogin,
      @NonNull EditText inputPassword, @NonNull EditText inputUsername) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.inputPassword = inputPassword;
    this.inputUsername = inputUsername;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.input_password;
      EditText inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.input_username;
      EditText inputUsername = ViewBindings.findChildViewById(rootView, id);
      if (inputUsername == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, btnLogin, inputPassword,
          inputUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
