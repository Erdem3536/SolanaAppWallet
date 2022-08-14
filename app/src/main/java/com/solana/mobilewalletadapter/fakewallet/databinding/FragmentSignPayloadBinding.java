// Generated by view binder compiler. Do not edit!
package com.solana.mobilewalletadapter.fakewallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.econet.app.solwallet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignPayloadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnAuthorize;

  @NonNull
  public final AppCompatButton btnDecline;

  @NonNull
  public final AppCompatButton btnSimulateAuthorizationFailed;

  @NonNull
  public final AppCompatButton btnSimulateInvalidPayloads;

  @NonNull
  public final AppCompatButton btnSimulateTooManyPayloads;

  @NonNull
  public final AppCompatTextView labelNumTransactions;

  @NonNull
  public final AppCompatTextView textNumTransactions;

  @NonNull
  public final AppCompatTextView textSignPayloads;

  private FragmentSignPayloadBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnAuthorize, @NonNull AppCompatButton btnDecline,
      @NonNull AppCompatButton btnSimulateAuthorizationFailed,
      @NonNull AppCompatButton btnSimulateInvalidPayloads,
      @NonNull AppCompatButton btnSimulateTooManyPayloads,
      @NonNull AppCompatTextView labelNumTransactions,
      @NonNull AppCompatTextView textNumTransactions, @NonNull AppCompatTextView textSignPayloads) {
    this.rootView = rootView;
    this.btnAuthorize = btnAuthorize;
    this.btnDecline = btnDecline;
    this.btnSimulateAuthorizationFailed = btnSimulateAuthorizationFailed;
    this.btnSimulateInvalidPayloads = btnSimulateInvalidPayloads;
    this.btnSimulateTooManyPayloads = btnSimulateTooManyPayloads;
    this.labelNumTransactions = labelNumTransactions;
    this.textNumTransactions = textNumTransactions;
    this.textSignPayloads = textSignPayloads;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignPayloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignPayloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_payload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignPayloadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_authorize;
      AppCompatButton btnAuthorize = ViewBindings.findChildViewById(rootView, id);
      if (btnAuthorize == null) {
        break missingId;
      }

      id = R.id.btn_decline;
      AppCompatButton btnDecline = ViewBindings.findChildViewById(rootView, id);
      if (btnDecline == null) {
        break missingId;
      }

      id = R.id.btn_simulate_authorization_failed;
      AppCompatButton btnSimulateAuthorizationFailed = ViewBindings.findChildViewById(rootView, id);
      if (btnSimulateAuthorizationFailed == null) {
        break missingId;
      }

      id = R.id.btn_simulate_invalid_payloads;
      AppCompatButton btnSimulateInvalidPayloads = ViewBindings.findChildViewById(rootView, id);
      if (btnSimulateInvalidPayloads == null) {
        break missingId;
      }

      id = R.id.btn_simulate_too_many_payloads;
      AppCompatButton btnSimulateTooManyPayloads = ViewBindings.findChildViewById(rootView, id);
      if (btnSimulateTooManyPayloads == null) {
        break missingId;
      }

      id = R.id.label_num_transactions;
      AppCompatTextView labelNumTransactions = ViewBindings.findChildViewById(rootView, id);
      if (labelNumTransactions == null) {
        break missingId;
      }

      id = R.id.text_num_transactions;
      AppCompatTextView textNumTransactions = ViewBindings.findChildViewById(rootView, id);
      if (textNumTransactions == null) {
        break missingId;
      }

      id = R.id.text_sign_payloads;
      AppCompatTextView textSignPayloads = ViewBindings.findChildViewById(rootView, id);
      if (textSignPayloads == null) {
        break missingId;
      }

      return new FragmentSignPayloadBinding((ConstraintLayout) rootView, btnAuthorize, btnDecline,
          btnSimulateAuthorizationFailed, btnSimulateInvalidPayloads, btnSimulateTooManyPayloads,
          labelNumTransactions, textNumTransactions, textSignPayloads);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
