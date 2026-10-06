package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: bi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0063bi implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogInterfaceOnCancelListenerC0067bm f3398a;

    public DialogInterfaceOnCancelListenerC0063bi(DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm) {
        this.f3398a = dialogInterfaceOnCancelListenerC0067bm;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm = this.f3398a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0067bm.f3750c;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0067bm.onCancel(dialog);
        }
    }
}
