package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcv extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public Dialog f33758a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnCancelListener f33759b;

    /* JADX INFO: renamed from: c */
    private Dialog f33760c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f33759b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f33758a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f33760c == null) {
            Activity activity = getActivity();
            jib.m13205j(activity);
            this.f33760c = new AlertDialog.Builder(activity).create();
        }
        return this.f33760c;
    }
}
