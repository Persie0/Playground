package p000;

import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class w54 extends y27 {

    /* JADX INFO: renamed from: e */
    public final o39 f66406e;

    /* JADX INFO: renamed from: f */
    public final C3156jq f66407f;

    /* JADX INFO: renamed from: g */
    public float f66408g = 1.0f;

    public w54(o39 o39Var, k39 k39Var, C3156jq c3156jq) {
        this.f66406e = o39Var;
        this.f66407f = c3156jq;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f66408g = f;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: c */
    public final void mo5262c(LayoutDirection layoutDirection) {
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        return 9205357640488583168L;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        C3156jq c3156jq = this.f66407f;
        o39 o39Var = this.f66406e;
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
            n66 n66Var = (n66) c3156jq.f45990a;
            if (n66Var == null) {
                n66Var = new n66();
                c3156jq.f45990a = n66Var;
            }
            if (((x54) n66Var.m17255g(c3338mk)) == null) {
                o39Var.mo12726b(jMo1422h, layoutDirection, c0358h);
                x54 x54Var = new x54();
                int i = aa1.f413l;
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                eh0.m11125e();
                n66 n66Var2 = (n66) c3156jq.f45990a;
                if (n66Var2 == null) {
                    n66Var2 = new n66();
                    c3156jq.f45990a = n66Var2;
                }
                n66Var2.m17261m(new C3338mk(c3338mk.f51426a, c3338mk.f51427b, c3338mk.f51428c, c3338mk.f51429d, null), x54Var);
            }
        }
        c0358h.mo1422h();
        throw null;
    }
}
