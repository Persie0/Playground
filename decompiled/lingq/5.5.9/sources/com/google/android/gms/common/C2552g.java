package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import androidx.fragment.app.FragmentManager;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.common.g */
/* JADX INFO: loaded from: classes.dex */
public class C2552g extends DialogInterfaceOnCancelListenerC0962l {

    /* JADX INFO: renamed from: L0 */
    public Dialog f13926L0;

    /* JADX INFO: renamed from: M0 */
    public DialogInterface.OnCancelListener f13927M0;

    /* JADX INFO: renamed from: N0 */
    public AlertDialog f13928N0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13927M0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public final Dialog mo3769p0(Bundle bundle) {
        Dialog dialog = this.f13926L0;
        if (dialog == null) {
            this.f6324C0 = false;
            if (this.f13928N0 == null) {
                Context contextMo471m = mo471m();
                C6272i.m12915i(contextMo471m);
                this.f13928N0 = new AlertDialog.Builder(contextMo471m).create();
            }
            dialog = this.f13928N0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: s0 */
    public final void mo3772s0(FragmentManager fragmentManager, String str) {
        super.mo3772s0(fragmentManager, str);
    }
}
