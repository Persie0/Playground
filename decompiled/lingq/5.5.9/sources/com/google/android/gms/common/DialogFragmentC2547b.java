package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.common.b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogFragmentC2547b extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public Dialog f13916a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnCancelListener f13917b;

    /* JADX INFO: renamed from: c */
    public AlertDialog f13918c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13917b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13916a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13918c == null) {
                Activity activity = getActivity();
                C6272i.m12915i(activity);
                this.f13918c = new AlertDialog.Builder(activity).create();
            }
            dialog = this.f13918c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
