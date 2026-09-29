package p000;

import android.os.SystemClock;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends y27 {

    /* JADX INFO: renamed from: e */
    public y27 f64238e;

    /* JADX INFO: renamed from: f */
    public final y27 f64239f;

    /* JADX INFO: renamed from: g */
    public final jl1 f64240g;

    /* JADX INFO: renamed from: h */
    public final int f64241h;

    /* JADX INFO: renamed from: i */
    public final boolean f64242i;

    /* JADX INFO: renamed from: l */
    public boolean f64245l;

    /* JADX INFO: renamed from: j */
    public final sc9 f64243j = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: k */
    public long f64244k = -1;

    /* JADX INFO: renamed from: H */
    public final qc9 f64236H = AbstractC0278f.m1256f(1.0f);

    /* JADX INFO: renamed from: I */
    public final t66 f64237I = AbstractC0278f.m1260j(null);

    public ur1(y27 y27Var, y27 y27Var2, jl1 jl1Var, int i, boolean z) {
        this.f64238e = y27Var;
        this.f64239f = y27Var2;
        this.f64240g = jl1Var;
        this.f64241h = i;
        this.f64242i = z;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f64236H.m19862i(f);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
        ((xc9) this.f64237I).setValue(fa1Var);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        y27 y27Var = this.f64238e;
        long jMo1445i = y27Var != null ? y27Var.mo1445i() : 0L;
        y27 y27Var2 = this.f64239f;
        long jMo1445i2 = y27Var2 != null ? y27Var2.mo1445i() : 0L;
        boolean z = jMo1445i != 9205357640488583168L;
        boolean z2 = jMo1445i2 != 9205357640488583168L;
        if (z && z2) {
            return do7.m10528d(Math.max(x89.m24407d(jMo1445i), x89.m24407d(jMo1445i2)), Math.max(x89.m24405b(jMo1445i), x89.m24405b(jMo1445i2)));
        }
        return 9205357640488583168L;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        boolean z = this.f64245l;
        y27 y27Var = this.f64239f;
        qc9 qc9Var = this.f64236H;
        if (z) {
            m22873k(c0358h, y27Var, qc9Var.m19861h());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f64244k == -1) {
            this.f64244k = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.f64244k) / this.f64241h;
        float fM19861h = qc9Var.m19861h() * l70.m15944g(f, 0.0f, 1.0f);
        float fM19861h2 = this.f64242i ? qc9Var.m19861h() - fM19861h : qc9Var.m19861h();
        this.f64245l = f >= 1.0f;
        m22873k(c0358h, this.f64238e, fM19861h2);
        m22873k(c0358h, y27Var, fM19861h);
        if (this.f64245l) {
            this.f64238e = null;
        } else {
            sc9 sc9Var = this.f64243j;
            sc9Var.m21223i(sc9Var.m21222h() + 1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m22873k(C0358h c0358h, y27 y27Var, float f) {
        an0 an0Var = c0358h.f4358a;
        if (y27Var == null || f <= 0.0f) {
            return;
        }
        long jMo1422h = an0Var.mo1422h();
        long jMo1445i = y27Var.mo1445i();
        long jM24342I = (jMo1445i == 9205357640488583168L || x89.m24408e(jMo1445i) || jMo1422h == 9205357640488583168L || x89.m24408e(jMo1422h)) ? jMo1422h : x74.m24342I(jMo1445i, this.f64240g.mo10837b(jMo1445i, jMo1422h));
        t66 t66Var = this.f64237I;
        if (jMo1422h == 9205357640488583168L || x89.m24408e(jMo1422h)) {
            y27Var.m24872e(c0358h, jM24342I, f, (fa1) ((xc9) t66Var).getValue());
            return;
        }
        float fM24407d = (x89.m24407d(jMo1422h) - x89.m24407d(jM24342I)) / 2.0f;
        float fM24405b = (x89.m24405b(jMo1422h) - x89.m24405b(jM24342I)) / 2.0f;
        ((qn3) an0Var.f853b.f50064b).m20076v(fM24407d, fM24405b, fM24407d, fM24405b);
        y27Var.m24872e(c0358h, jM24342I, f, (fa1) ((xc9) t66Var).getValue());
        float f2 = -fM24407d;
        float f3 = -fM24405b;
        ((qn3) an0Var.f853b.f50064b).m20076v(f2, f3, f2, f3);
    }
}
