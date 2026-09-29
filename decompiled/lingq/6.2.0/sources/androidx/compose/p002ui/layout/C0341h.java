package androidx.compose.p002ui.layout;

import p000.d16;
import p000.ea2;
import p000.omd;
import p000.pg9;
import p000.qp6;
import p000.r48;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.xz9;

/* JADX INFO: renamed from: androidx.compose.ui.layout.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0341h extends d16 implements qp6, ea2 {

    /* JADX INFO: renamed from: J */
    public vi3 f4208J;

    /* JADX INFO: renamed from: K */
    public xz9 f4209K;

    /* JADX INFO: renamed from: L */
    public pg9 f4210L;

    /* JADX INFO: renamed from: M */
    public boolean f4211M;

    /* JADX INFO: renamed from: N */
    public boolean f4212N;

    /* JADX INFO: renamed from: O */
    public r48 f4213O;

    /* JADX INFO: renamed from: P */
    public final vi3 f4214P = new vi3() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode$rectChanged$1
        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            this.f4159b.m1515Z0((r48) obj);
            return xfa.f68157a;
        }
    };

    public C0341h(vi3 vi3Var) {
        this.f4208J = vi3Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        xz9 xz9Var = this.f4209K;
        if (xz9Var != null) {
            xz9Var.m24800b();
        }
        this.f4209K = omd.m18140b0(this, 0L, this.f4214P);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        xz9 xz9Var = this.f4209K;
        if (xz9Var != null) {
            xz9Var.m24800b();
        }
        m1516a1();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        m1516a1();
        pg9 pg9Var = this.f4210L;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f4210L = null;
        this.f4211M = false;
        this.f4213O = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1515Z0(r48 r48Var) {
        this.f4213O = r48Var;
        long j = r48Var.f58700e;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = r48Var.f58696a;
        int i3 = (int) (j2 >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j2;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j3 = r48Var.f58697b;
        int i5 = (int) (j3 >> 32);
        int iMax = Math.max(Math.min(i5, i), 0);
        int i6 = (int) j3;
        float fMax = Math.max((Math.max(Math.min(i6, i2), 0) - iMin2) * (iMax - iMin), 0) / Math.min((i2 - 0) * (i - 0), (i6 - i4) * (i5 - i3));
        boolean z = fMax > 0.3f || fMax == 1.0f;
        if (z != this.f4211M) {
            this.f4211M = z;
            pg9 pg9Var = this.f4210L;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            this.f4210L = null;
            if (z != this.f4212N) {
                if (z) {
                    this.f4210L = wfb.m23926u(m9971N0(), null, null, new OnVisibilityChangedNode$checkVisibility$1(this, null), 3);
                } else {
                    m1517b1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1516a1() {
        pg9 pg9Var = this.f4210L;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f4210L = null;
        this.f4211M = false;
        if (this.f4212N) {
            m1517b1();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m1517b1() {
        pg9 pg9Var = this.f4210L;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f4210L = null;
        this.f4208J.invoke(Boolean.valueOf(this.f4211M));
        this.f4212N = this.f4211M;
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
    }
}
