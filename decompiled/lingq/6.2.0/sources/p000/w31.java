package p000;

import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes2.dex */
public final class w31 implements xu5, wu5 {

    /* JADX INFO: renamed from: a */
    public final xu5 f66317a;

    /* JADX INFO: renamed from: b */
    public wu5 f66318b;

    /* JADX INFO: renamed from: c */
    public v31[] f66319c = new v31[0];

    /* JADX INFO: renamed from: d */
    public long f66320d;

    /* JADX INFO: renamed from: e */
    public long f66321e;

    /* JADX INFO: renamed from: f */
    public long f66322f;

    /* JADX INFO: renamed from: g */
    public long f66323g;

    /* JADX INFO: renamed from: h */
    public ClippingMediaSource$IllegalClippingException f66324h;

    public w31(xu5 xu5Var, boolean z, long j, long j2) {
        this.f66317a = xu5Var;
        this.f66320d = z ? j : -9223372036854775807L;
        this.f66321e = -9223372036854775807L;
        this.f66322f = j;
        this.f66323g = j2;
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: a */
    public final void mo17593a(xu5 xu5Var) {
        wu5 wu5Var = this.f66318b;
        wu5Var.getClass();
        wu5Var.mo17593a(this);
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: b */
    public final void mo17594b(xu5 xu5Var) {
        if (this.f66324h != null) {
            return;
        }
        wu5 wu5Var = this.f66318b;
        wu5Var.getClass();
        wu5Var.mo17594b(this);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: c */
    public final long mo2544c(C3565s8[] c3565s8Arr, boolean[] zArr, zk8[] zk8VarArr, boolean[] zArr2, long j) {
        long j2;
        this.f66319c = new v31[zk8VarArr.length];
        zk8[] zk8VarArr2 = new zk8[zk8VarArr.length];
        for (int i = 0; i < zk8VarArr.length; i++) {
            v31[] v31VarArr = this.f66319c;
            v31 v31Var = (v31) zk8VarArr[i];
            v31VarArr[i] = v31Var;
            zk8VarArr2[i] = v31Var != null ? v31Var.f64778a : null;
        }
        long jMo2544c = this.f66317a.mo2544c(c3565s8Arr, zArr, zk8VarArr2, zArr2, j);
        long j3 = this.f66323g;
        long jMax = Math.max(jMo2544c, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (m23698j()) {
            if (jMo2544c >= j) {
                if (jMo2544c != 0) {
                    int length = c3565s8Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            C3565s8 c3565s8 = c3565s8Arr[i2];
                            if (c3565s8 != null) {
                                C0713b c0713b = c3565s8.f60501d[0];
                                if (!ez5.m11391a(c0713b.f6406o, c0713b.f6402k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f66320d = j2;
        for (int i3 = 0; i3 < zk8VarArr.length; i3++) {
            zk8 zk8Var = zk8VarArr2[i3];
            v31[] v31VarArr2 = this.f66319c;
            if (zk8Var == null) {
                v31VarArr2[i3] = null;
            } else {
                v31 v31Var2 = v31VarArr2[i3];
                if (v31Var2 == null || v31Var2.f64778a != zk8Var) {
                    v31VarArr2[i3] = new v31(this, zk8Var);
                }
            }
            zk8VarArr[i3] = v31VarArr2[i3];
        }
        return jMax;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: d */
    public final long mo2545d() {
        long jMo2545d = this.f66317a.mo2545d();
        if (jMo2545d != Long.MIN_VALUE) {
            long j = this.f66323g;
            if (j == Long.MIN_VALUE || jMo2545d < j) {
                return jMo2545d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: e */
    public final long mo2546e(long j, tt8 tt8Var) {
        long j2 = this.f66322f;
        if (j == j2) {
            return j2;
        }
        long jM22813h = uma.m22813h(tt8Var.f62868a, 0L, j - j2);
        long j3 = tt8Var.f62869b;
        long j4 = this.f66323g;
        long jM22813h2 = uma.m22813h(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jM22813h != tt8Var.f62868a || jM22813h2 != tt8Var.f62869b) {
            tt8Var = new tt8(jM22813h, jM22813h2);
        }
        return this.f66317a.mo2546e(j, tt8Var);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: f */
    public final void mo2547f() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f66324h;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f66317a.mo2547f();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: g */
    public final long mo2548g(long j) {
        this.f66320d = -9223372036854775807L;
        for (v31 v31Var : this.f66319c) {
            if (v31Var != null) {
                v31Var.f64779b = false;
            }
        }
        long jMo2548g = this.f66317a.mo2548g(j);
        long j2 = this.f66322f;
        long j3 = this.f66323g;
        long jMax = Math.max(jMo2548g, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: h */
    public final void mo2549h(long j) {
        this.f66317a.mo2549h(j);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: i */
    public final boolean mo2550i() {
        return this.f66317a.mo2550i();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m23698j() {
        return this.f66320d != -9223372036854775807L;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: k */
    public final long mo2552k() {
        if (m23698j()) {
            long j = this.f66320d;
            this.f66320d = -9223372036854775807L;
            this.f66321e = j;
            long jMo2552k = mo2552k();
            return jMo2552k != -9223372036854775807L ? jMo2552k : j;
        }
        long jMo2552k2 = this.f66317a.mo2552k();
        if (jMo2552k2 != -9223372036854775807L) {
            long j2 = this.f66322f;
            long j3 = this.f66323g;
            long jMax = Math.max(jMo2552k2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.f66321e) {
                this.f66321e = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: l */
    public final void mo2553l(wu5 wu5Var, long j) {
        this.f66318b = wu5Var;
        this.f66317a.mo2553l(this, j);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: m */
    public final k8a mo2554m() {
        return this.f66317a.mo2554m();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: o */
    public final boolean mo2556o(oh5 oh5Var) {
        return this.f66317a.mo2556o(oh5Var);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: p */
    public final long mo2557p() {
        long jMo2557p = this.f66317a.mo2557p();
        if (jMo2557p != Long.MIN_VALUE) {
            long j = this.f66323g;
            if (j == Long.MIN_VALUE || jMo2557p < j) {
                return jMo2557p;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: r */
    public final void mo2559r(long j) {
        this.f66317a.mo2559r(j);
    }
}
