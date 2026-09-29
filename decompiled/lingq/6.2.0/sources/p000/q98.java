package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class q98 implements fb2 {

    /* JADX INFO: renamed from: H */
    public float f57457H;

    /* JADX INFO: renamed from: I */
    public long f57458I;

    /* JADX INFO: renamed from: J */
    public o39 f57459J;

    /* JADX INFO: renamed from: K */
    public boolean f57460K;

    /* JADX INFO: renamed from: L */
    public int f57461L;

    /* JADX INFO: renamed from: M */
    public long f57462M;

    /* JADX INFO: renamed from: N */
    public up4 f57463N;

    /* JADX INFO: renamed from: O */
    public fb2 f57464O;

    /* JADX INFO: renamed from: P */
    public LayoutDirection f57465P;

    /* JADX INFO: renamed from: Q */
    public yd0 f57466Q;

    /* JADX INFO: renamed from: R */
    public fa1 f57467R;

    /* JADX INFO: renamed from: S */
    public int f57468S;

    /* JADX INFO: renamed from: T */
    public pk9 f57469T;

    /* JADX INFO: renamed from: a */
    public int f57470a;

    /* JADX INFO: renamed from: b */
    public float f57471b = 1.0f;

    /* JADX INFO: renamed from: c */
    public float f57472c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f57473d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f57474e;

    /* JADX INFO: renamed from: f */
    public float f57475f;

    /* JADX INFO: renamed from: g */
    public float f57476g;

    /* JADX INFO: renamed from: h */
    public long f57477h;

    /* JADX INFO: renamed from: i */
    public long f57478i;

    /* JADX INFO: renamed from: j */
    public float f57479j;

    /* JADX INFO: renamed from: k */
    public float f57480k;

    /* JADX INFO: renamed from: l */
    public float f57481l;

    public q98() {
        long j = rp3.f59679a;
        this.f57477h = j;
        this.f57478i = j;
        this.f57457H = 8.0f;
        this.f57458I = k9a.f46915b;
        this.f57459J = ss5.f61356d;
        this.f57461L = 0;
        this.f57462M = 9205357640488583168L;
        this.f57463N = up4.f64170a;
        this.f57464O = vz1.m23621b();
        this.f57465P = LayoutDirection.Ltr;
        this.f57468S = 3;
    }

    /* JADX INFO: renamed from: A */
    public final void m19810A(float f) {
        if (this.f57474e == f) {
            return;
        }
        this.f57470a |= 8;
        this.f57474e = f;
    }

    /* JADX INFO: renamed from: D */
    public final void m19811D(float f) {
        if (this.f57475f == f) {
            return;
        }
        this.f57470a |= 16;
        this.f57475f = f;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f57464O.mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final void m19812b() {
        m19823p(1.0f);
        m19824q(1.0f);
        m19813c(1.0f);
        m19810A(0.0f);
        m19811D(0.0f);
        m19825r(0.0f);
        long j = rp3.f59679a;
        m19814d(j);
        m19827t(j);
        m19820l(0.0f);
        m19821m(0.0f);
        m19822n(0.0f);
        m19815e(8.0f);
        m19828x(k9a.f46915b);
        m19826s(ss5.f61356d);
        m19816f(false);
        m19819j(null);
        m19817g(null);
        if (this.f57468S != 3) {
            this.f57470a |= 524288;
            this.f57468S = 3;
        }
        m19818i(0);
        up4 up4Var = up4.f64170a;
        if (!fa4.m11650l(this.f57463N, up4Var)) {
            this.f57470a |= 1048576;
            this.f57463N = up4Var;
        }
        this.f57462M = 9205357640488583168L;
        this.f57469T = null;
        this.f57470a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m19813c(float f) {
        if (this.f57473d == f) {
            return;
        }
        this.f57470a |= 4;
        this.f57473d = f;
    }

    /* JADX INFO: renamed from: d */
    public final void m19814d(long j) {
        if (aa1.m199c(this.f57477h, j)) {
            return;
        }
        this.f57470a |= 64;
        this.f57477h = j;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f57464O.mo597d0();
    }

    /* JADX INFO: renamed from: e */
    public final void m19815e(float f) {
        if (this.f57457H == f) {
            return;
        }
        this.f57470a |= 2048;
        this.f57457H = f;
    }

    /* JADX INFO: renamed from: f */
    public final void m19816f(boolean z) {
        if (this.f57460K != z) {
            this.f57470a |= 16384;
            this.f57460K = z;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19817g(fa1 fa1Var) {
        if (fa4.m11650l(this.f57467R, fa1Var)) {
            return;
        }
        this.f57470a |= 262144;
        this.f57467R = fa1Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m19818i(int i) {
        if (this.f57461L == i) {
            return;
        }
        this.f57470a |= 32768;
        this.f57461L = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m19819j(yd0 yd0Var) {
        if (fa4.m11650l(this.f57466Q, yd0Var)) {
            return;
        }
        this.f57470a |= 131072;
        this.f57466Q = yd0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m19820l(float f) {
        if (this.f57479j == f) {
            return;
        }
        this.f57470a |= 256;
        this.f57479j = f;
    }

    /* JADX INFO: renamed from: m */
    public final void m19821m(float f) {
        if (this.f57480k == f) {
            return;
        }
        this.f57470a |= 512;
        this.f57480k = f;
    }

    /* JADX INFO: renamed from: n */
    public final void m19822n(float f) {
        if (this.f57481l == f) {
            return;
        }
        this.f57470a |= 1024;
        this.f57481l = f;
    }

    /* JADX INFO: renamed from: p */
    public final void m19823p(float f) {
        if (this.f57471b == f) {
            return;
        }
        this.f57470a |= 1;
        this.f57471b = f;
    }

    /* JADX INFO: renamed from: q */
    public final void m19824q(float f) {
        if (this.f57472c == f) {
            return;
        }
        this.f57470a |= 2;
        this.f57472c = f;
    }

    /* JADX INFO: renamed from: r */
    public final void m19825r(float f) {
        if (this.f57476g == f) {
            return;
        }
        this.f57470a |= 32;
        this.f57476g = f;
    }

    /* JADX INFO: renamed from: s */
    public final void m19826s(o39 o39Var) {
        if (fa4.m11650l(this.f57459J, o39Var)) {
            return;
        }
        this.f57470a |= 8192;
        this.f57459J = o39Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m19827t(long j) {
        if (aa1.m199c(this.f57478i, j)) {
            return;
        }
        this.f57470a |= 128;
        this.f57478i = j;
    }

    /* JADX INFO: renamed from: x */
    public final void m19828x(long j) {
        if (k9a.m15025a(this.f57458I, j)) {
            return;
        }
        this.f57470a |= 4096;
        this.f57458I = j;
    }
}
