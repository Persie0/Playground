package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: lf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0793lf implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0794lg f38101a;

    public C0793lf(C0794lg c0794lg) {
        this.f38101a = c0794lg;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.f38101a.m15309w() || this.f38101a.f38188q.getContentView() == null) {
            return;
        }
        C0794lg c0794lg = this.f38101a;
        c0794lg.f38186o.removeCallbacks(c0794lg.f38189r);
        this.f38101a.f38189r.run();
    }
}
