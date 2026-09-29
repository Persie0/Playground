package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import p000.AbstractC3393o1;
import p000.C3309ls;
import p000.an0;
import p000.fa1;
import p000.qn3;
import p000.s46;
import p000.t66;
import p000.ui3;
import p000.x89;
import p000.xc9;
import p000.xfa;
import p000.y27;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0316d extends y27 {

    /* JADX INFO: renamed from: e */
    public final t66 f4059e = AbstractC0278f.m1260j(new x89(0));

    /* JADX INFO: renamed from: f */
    public final t66 f4060f = AbstractC0278f.m1260j(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final C0315c f4061g;

    /* JADX INFO: renamed from: h */
    public final t66 f4062h;

    /* JADX INFO: renamed from: i */
    public float f4063i;

    /* JADX INFO: renamed from: j */
    public fa1 f4064j;

    public C0316d(C0313a c0313a) {
        C0315c c0315c = new C0315c(c0313a);
        c0315c.f4051f = new ui3() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                xc9 xc9Var = (xc9) this.f4008b.f4062h;
                xfa xfaVar = xfa.f68157a;
                xc9Var.setValue(xfaVar);
                return xfaVar;
            }
        };
        this.f4061g = c0315c;
        this.f4062h = AbstractC0278f.m1259i(xfa.f68157a, s46.f60289d);
        this.f4063i = 1.0f;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f4063i = f;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
        this.f4064j = fa1Var;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        return ((x89) ((xc9) this.f4059e).getValue()).f67935a;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        an0 an0Var = c0358h.f4358a;
        fa1 fa1Var = this.f4064j;
        C0315c c0315c = this.f4061g;
        if (fa1Var == null) {
            fa1Var = (fa1) ((xc9) c0315c.f4052g).getValue();
        }
        if (((Boolean) ((xc9) this.f4060f).getValue()).booleanValue() && c0358h.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo1423z0 = an0Var.mo1423z0();
            C3309ls c3309ls = an0Var.f853b;
            long jM16483A = c3309ls.m16483A();
            c3309ls.m16515r().mo17016h();
            try {
                ((qn3) c3309ls.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                c0315c.m1442e(c0358h, this.f4063i, fa1Var);
                AbstractC3393o1.m17751z(c3309ls, jM16483A);
            } catch (Throwable th) {
                AbstractC3393o1.m17751z(c3309ls, jM16483A);
                throw th;
            }
        } else {
            c0315c.m1442e(c0358h, this.f4063i, fa1Var);
        }
        ((xc9) this.f4062h).getValue();
    }
}
