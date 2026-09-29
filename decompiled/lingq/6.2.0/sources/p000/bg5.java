package p000;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes2.dex */
public final class bg5 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dg5 f8501a;

    public bg5(dg5 dg5Var) {
        this.f8501a = dg5Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        dg5 dg5Var = this.f8501a;
        zf5 zf5Var = dg5Var.f35599M;
        C3120iq c3120iq = dg5Var.f35607U;
        if (i != 1 || c3120iq.getInputMethodMode() == 2 || c3120iq.getContentView() == null) {
            return;
        }
        dg5Var.f35603Q.removeCallbacks(zf5Var);
        zf5Var.run();
    }
}
