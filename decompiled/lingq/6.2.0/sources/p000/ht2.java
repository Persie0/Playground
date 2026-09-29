package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ht2 extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public Dialog f42914a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnCancelListener f42915b;

    /* JADX INFO: renamed from: c */
    public AlertDialog f42916c;

    /* JADX INFO: renamed from: a */
    public static ht2 m13454a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ht2 ht2Var = new ht2();
        lda.m16131q(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        ht2Var.f42914a = dialog;
        if (onCancelListener != null) {
            ht2Var.f42915b = onCancelListener;
        }
        return ht2Var;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42915b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f42914a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f42916c == null) {
            Activity activity = getActivity();
            lda.m16130p(activity);
            this.f42916c = new AlertDialog.Builder(activity).create();
        }
        return this.f42916c;
    }
}
