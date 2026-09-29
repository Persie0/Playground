package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import com.iterable.iterableapi.C1209e;

/* JADX INFO: loaded from: classes2.dex */
public final class xd2 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ be2 f68092b;

    public /* synthetic */ xd2(be2 be2Var, int i) {
        this.f68091a = i;
        this.f68092b = be2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p33 p33Var;
        int i = this.f68091a;
        be2 be2Var = this.f68092b;
        switch (i) {
            case 0:
                Dialog dialog = be2Var.f8417H0;
                if (dialog != null) {
                    be2Var.onCancel(dialog);
                }
                break;
            default:
                if (((C1209e) be2Var).f14004P0 && (p33Var = C1209e.f13999a1) != null) {
                    p33Var.m18869K(null);
                    break;
                }
                break;
        }
    }
}
