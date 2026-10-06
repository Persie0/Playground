package p000;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgm {

    /* JADX INFO: renamed from: a */
    public int f40444a;

    /* JADX INFO: renamed from: b */
    public int f40445b;

    /* JADX INFO: renamed from: c */
    private final View f40446c;

    /* JADX INFO: renamed from: d */
    private int f40447d;

    public mgm(View view) {
        this.f40446c = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m16357a() {
        View view = this.f40446c;
        int top = this.f40445b - (view.getTop() - this.f40444a);
        int[] iArr = afq.f274a;
        view.offsetTopAndBottom(top);
        View view2 = this.f40446c;
        view2.offsetLeftAndRight(-(view2.getLeft() - this.f40447d));
    }

    /* JADX INFO: renamed from: b */
    public final void m16358b() {
        this.f40444a = this.f40446c.getTop();
        this.f40447d = this.f40446c.getLeft();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16359c(int i) {
        if (this.f40445b == i) {
            return false;
        }
        this.f40445b = i;
        m16357a();
        return true;
    }
}
