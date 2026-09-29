package p000;

import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class y27 {

    /* JADX INFO: renamed from: a */
    public u8a f69167a;

    /* JADX INFO: renamed from: b */
    public fa1 f69168b;

    /* JADX INFO: renamed from: c */
    public float f69169c = 1.0f;

    /* JADX INFO: renamed from: d */
    public LayoutDirection f69170d = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: a */
    public abstract void mo1443a(float f);

    /* JADX INFO: renamed from: b */
    public abstract void mo1444b(fa1 fa1Var);

    /* JADX INFO: renamed from: c */
    public void mo5262c(LayoutDirection layoutDirection) {
    }

    /* JADX INFO: renamed from: e */
    public final void m24872e(C0358h c0358h, long j, float f, fa1 fa1Var) {
        an0 an0Var = c0358h.f4358a;
        if (this.f69169c != f) {
            mo1443a(f);
            this.f69169c = f;
        }
        if (!fa4.m11650l(this.f69168b, fa1Var)) {
            mo1444b(fa1Var);
            this.f69168b = fa1Var;
        }
        LayoutDirection layoutDirection = c0358h.getLayoutDirection();
        if (this.f69170d != layoutDirection) {
            mo5262c(layoutDirection);
            this.f69170d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((qn3) an0Var.f853b.f50064b).m20076v(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo1446j(c0358h);
                }
            } finally {
                ((qn3) an0Var.f853b.f50064b).m20076v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract long mo1445i();

    /* JADX INFO: renamed from: j */
    public abstract void mo1446j(C0358h c0358h);
}
