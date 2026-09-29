package p000;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class ag5 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dg5 f602a;

    public ag5(dg5 dg5Var) {
        this.f602a = dg5Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        dg5 dg5Var = this.f602a;
        if (dg5Var.f35607U.isShowing()) {
            dg5Var.mo10360f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f602a.dismiss();
    }
}
