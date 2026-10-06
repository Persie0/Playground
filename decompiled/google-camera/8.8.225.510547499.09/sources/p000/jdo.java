package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdo extends DialogInterfaceOnCancelListenerC0067bm {

    /* JADX INFO: renamed from: ad */
    public Dialog f33809ad;

    /* JADX INFO: renamed from: ae */
    public DialogInterface.OnCancelListener f33810ae;

    /* JADX INFO: renamed from: af */
    private Dialog f33811af;

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm
    /* JADX INFO: renamed from: d */
    public final Dialog mo1739d() {
        Dialog dialog = this.f33809ad;
        if (dialog != null) {
            return dialog;
        }
        ((DialogInterfaceOnCancelListenerC0067bm) this).f3749b = false;
        if (this.f33811af == null) {
            Context context = getContext();
            jib.m13205j(context);
            this.f33811af = new AlertDialog.Builder(context).create();
        }
        return this.f33811af;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f33810ae;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
