package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class rn9 extends be2 {

    /* JADX INFO: renamed from: M0 */
    public Dialog f59594M0;

    /* JADX INFO: renamed from: N0 */
    public DialogInterface.OnCancelListener f59595N0;

    /* JADX INFO: renamed from: O0 */
    public AlertDialog f59596O0;

    /* JADX INFO: renamed from: l0 */
    public static rn9 m20719l0(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        rn9 rn9Var = new rn9();
        lda.m16131q(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        rn9Var.f59594M0 = dialog;
        if (onCancelListener != null) {
            rn9Var.f59595N0 = onCancelListener;
        }
        return rn9Var;
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        Dialog dialog = this.f59594M0;
        if (dialog != null) {
            return dialog;
        }
        this.f8413D0 = false;
        if (this.f59596O0 == null) {
            Context contextMo2107i = mo2107i();
            lda.m16130p(contextMo2107i);
            this.f59596O0 = new AlertDialog.Builder(contextMo2107i).create();
        }
        return this.f59596O0;
    }

    @Override // p000.be2, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f59595N0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
