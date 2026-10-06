package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: bj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0064bj implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogInterfaceOnCancelListenerC0067bm f3471a;

    public DialogInterfaceOnDismissListenerC0064bj(DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm) {
        this.f3471a = dialogInterfaceOnCancelListenerC0067bm;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm = this.f3471a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0067bm.f3750c;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0067bm.onDismiss(dialog);
        }
    }
}
