package p000;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: nc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0844nc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f41970a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f41971b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f41972c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f41973d = 0;

    /* JADX INFO: renamed from: e */
    public final int f41974e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f41975f;

    public C0844nc(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f41975f = staggeredGridLayoutManager;
        this.f41974e = i;
    }

    /* JADX INFO: renamed from: n */
    public static final C0840mz m17313n(View view) {
        return (C0840mz) view.getLayoutParams();
    }

    /* JADX INFO: renamed from: a */
    public final int m17314a() {
        return this.f41975f.f1148d ? m17326m(this.f41970a.size() - 1, -1) : m17326m(0, this.f41970a.size());
    }

    /* JADX INFO: renamed from: b */
    public final int m17315b() {
        return this.f41975f.f1148d ? m17326m(0, this.f41970a.size()) : m17326m(this.f41970a.size() - 1, -1);
    }

    /* JADX INFO: renamed from: c */
    public final int m17316c() {
        int i = this.f41972c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        m17321h();
        return this.f41972c;
    }

    /* JADX INFO: renamed from: d */
    public final int m17317d(int i) {
        int i2 = this.f41972c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f41970a.size() == 0) {
            return i;
        }
        m17321h();
        return this.f41972c;
    }

    /* JADX INFO: renamed from: e */
    public final int m17318e() {
        int i = this.f41971b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        m17322i();
        return this.f41971b;
    }

    /* JADX INFO: renamed from: f */
    public final int m17319f(int i) {
        int i2 = this.f41971b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f41970a.size() == 0) {
            return i;
        }
        m17322i();
        return this.f41971b;
    }

    /* JADX INFO: renamed from: g */
    public final View m17320g(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.f41970a.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.f41970a.get(size);
                if ((this.f41975f.f1148d && StaggeredGridLayoutManager.m16136be(view2) >= i) || ((!this.f41975f.f1148d && StaggeredGridLayoutManager.m16136be(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.f41970a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.f41970a.get(i3);
                if ((this.f41975f.f1148d && StaggeredGridLayoutManager.m16136be(view3) <= i) || ((!this.f41975f.f1148d && StaggeredGridLayoutManager.m16136be(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    final void m17321h() {
        ArrayList arrayList = this.f41970a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C0840mz c0840mzM17313n = m17313n(view);
        this.f41972c = this.f41975f.f1146b.mo15746a(view);
        boolean z = c0840mzM17313n.f41827b;
    }

    /* JADX INFO: renamed from: i */
    final void m17322i() {
        View view = (View) this.f41970a.get(0);
        C0840mz c0840mzM17313n = m17313n(view);
        this.f41971b = this.f41975f.f1146b.mo15749d(view);
        boolean z = c0840mzM17313n.f41827b;
    }

    /* JADX INFO: renamed from: j */
    public final void m17323j() {
        this.f41970a.clear();
        this.f41971b = Integer.MIN_VALUE;
        this.f41972c = Integer.MIN_VALUE;
        this.f41973d = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m17324k(int i) {
        int i2 = this.f41971b;
        if (i2 != Integer.MIN_VALUE) {
            this.f41971b = i2 + i;
        }
        int i3 = this.f41972c;
        if (i3 != Integer.MIN_VALUE) {
            this.f41972c = i3 + i;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m17325l(int i) {
        this.f41971b = i;
        this.f41972c = i;
    }

    /* JADX INFO: renamed from: m */
    final int m17326m(int i, int i2) {
        int iMo15755j = this.f41975f.f1146b.mo15755j();
        int iMo15751f = this.f41975f.f1146b.mo15751f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            View view = (View) this.f41970a.get(i3);
            int iMo15749d = this.f41975f.f1146b.mo15749d(view);
            int iMo15746a = this.f41975f.f1146b.mo15746a(view);
            boolean z = iMo15749d <= iMo15751f;
            boolean z2 = iMo15746a >= iMo15755j;
            if (z && z2 && (iMo15749d < iMo15755j || iMo15746a > iMo15751f)) {
                return StaggeredGridLayoutManager.m16136be(view);
            }
            if (i2 > i) {
                i4 = 1;
            }
            i3 += i4;
        }
    }
}
