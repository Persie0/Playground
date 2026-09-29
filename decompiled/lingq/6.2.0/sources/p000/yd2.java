package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class yd2 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ be2 f69677a;

    public yd2(be2 be2Var) {
        this.f69677a = be2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        be2 be2Var = this.f69677a;
        Dialog dialog = be2Var.f8417H0;
        if (dialog != null) {
            be2Var.onDismiss(dialog);
        }
    }
}
