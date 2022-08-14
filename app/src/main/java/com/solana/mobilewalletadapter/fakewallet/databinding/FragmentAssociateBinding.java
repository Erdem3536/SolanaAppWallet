// Generated by view binder compiler. Do not edit!
package com.solana.mobilewalletadapter.fakewallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.econet.app.solwallet.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentAssociateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout associate;

  private FragmentAssociateBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout associate) {
    this.rootView = rootView;
    this.associate = associate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAssociateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAssociateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_associate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAssociateBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout associate = (ConstraintLayout) rootView;

    return new FragmentAssociateBinding((ConstraintLayout) rootView, associate);
  }
}