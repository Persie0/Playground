package p000;

import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class um2 extends y27 {

    /* JADX INFO: renamed from: e */
    public final o39 f64065e;

    /* JADX INFO: renamed from: f */
    public final C3156jq f64066f;

    public um2(o39 o39Var, k39 k39Var, C3156jq c3156jq) {
        this.f64065e = o39Var;
        this.f64066f = c3156jq;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        return 9205357640488583168L;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        C3156jq c3156jq = this.f64066f;
        o39 o39Var = this.f64065e;
        long jMo1422h = c0358h.f4358a.mo1422h();
        LayoutDirection layoutDirection = c0358h.getLayoutDirection();
        synchronized (c3156jq) {
            C3338mk c3338mk = (C3338mk) c3156jq.f45991b;
            if (c3338mk == null) {
                C3338mk c3338mk2 = new C3338mk(ss5.f61356d, 0L, LayoutDirection.Ltr, 1.0f, null);
                c3156jq.f45991b = c3338mk2;
                c3338mk = c3338mk2;
            }
            c3338mk.f51426a = o39Var;
            c3338mk.f51427b = jMo1422h;
            c3338mk.f51428c = layoutDirection;
            c3338mk.f51429d = c0358h.f4358a.mo594a();
            throw null;
        }
    }
}
