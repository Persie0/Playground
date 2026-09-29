package p000;

import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y90 implements yb7 {

    /* JADX INFO: renamed from: I */
    public boolean f69490I;

    /* JADX INFO: renamed from: J */
    public boolean f69491J;

    /* JADX INFO: renamed from: L */
    public jv5 f69493L;

    /* JADX INFO: renamed from: M */
    public i92 f69494M;

    /* JADX INFO: renamed from: b */
    public final int f69496b;

    /* JADX INFO: renamed from: d */
    public b68 f69498d;

    /* JADX INFO: renamed from: e */
    public int f69499e;

    /* JADX INFO: renamed from: f */
    public xb7 f69500f;

    /* JADX INFO: renamed from: g */
    public mp9 f69501g;

    /* JADX INFO: renamed from: h */
    public int f69502h;

    /* JADX INFO: renamed from: i */
    public zk8 f69503i;

    /* JADX INFO: renamed from: j */
    public C0713b[] f69504j;

    /* JADX INFO: renamed from: k */
    public long f69505k;

    /* JADX INFO: renamed from: l */
    public long f69506l;

    /* JADX INFO: renamed from: a */
    public final Object f69495a = new Object();

    /* JADX INFO: renamed from: c */
    public final p33 f69497c = new p33(2, false);

    /* JADX INFO: renamed from: H */
    public long f69489H = Long.MIN_VALUE;

    /* JADX INFO: renamed from: K */
    public z0a f69492K = z0a.f70734a;

    public y90(int i) {
        this.f69496b = i;
    }

    /* JADX INFO: renamed from: f */
    public static int m24988f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m24989n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final void m24990A(C0713b[] c0713bArr, zk8 zk8Var, long j, long j2, jv5 jv5Var) {
        bna.m3987z(!this.f69490I);
        this.f69503i = zk8Var;
        this.f69493L = jv5Var;
        if (this.f69489H == Long.MIN_VALUE) {
            this.f69489H = j;
        }
        this.f69504j = c0713bArr;
        this.f69505k = j2;
        mo4265w(c0713bArr, j, j2, jv5Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m24991B(long j, boolean z, boolean z2) {
        this.f69490I = false;
        this.f69506l = j;
        this.f69489H = j;
        if (!z2) {
            zk8 zk8Var = this.f69503i;
            zk8Var.getClass();
            z2 = zk8Var.mo4201d(j - this.f69505k) != 0;
        }
        mo4262r(j, z, z2);
    }

    /* JADX INFO: renamed from: C */
    public void mo12157C(float f, float f2) {
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo4251D(C0713b c0713b);

    /* JADX INFO: renamed from: E */
    public int mo24679E() {
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo12158F(long j) {
        return false;
    }

    @Override // p000.yb7
    /* JADX INFO: renamed from: d */
    public void mo4256d(int i, Object obj) {
    }

    /* JADX INFO: renamed from: g */
    public final ExoPlaybackException m24992g(Exception exc, C0713b c0713b, boolean z, int i) {
        int iMo4251D;
        if (c0713b == null || this.f69491J) {
            iMo4251D = 4;
        } else {
            this.f69491J = true;
            try {
                iMo4251D = mo4251D(c0713b) & 7;
                this.f69491J = false;
            } catch (ExoPlaybackException unused) {
                this.f69491J = false;
                iMo4251D = 4;
            } catch (Throwable th) {
                this.f69491J = false;
                throw th;
            }
        }
        return ExoPlaybackException.m2526c(exc, mo4257k(), this.f69499e, c0713b, iMo4251D, this.f69493L, z, i);
    }

    /* JADX INFO: renamed from: h */
    public void mo12186h() {
    }

    /* JADX INFO: renamed from: i */
    public long mo24692i(long j, long j2) {
        if (this.f69502h == 1) {
            return (mo4259o() || mo4258m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    /* JADX INFO: renamed from: j */
    public qt5 mo22304j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo4257k();

    /* JADX INFO: renamed from: l */
    public final boolean m24993l() {
        return this.f69489H == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo4258m();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo4259o();

    /* JADX INFO: renamed from: p */
    public abstract void mo4260p();

    /* JADX INFO: renamed from: q */
    public void mo4261q(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo4262r(long j, boolean z, boolean z2);

    /* JADX INFO: renamed from: s */
    public void mo4263s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo4264t() {
    }

    /* JADX INFO: renamed from: u */
    public void mo12193u() {
    }

    /* JADX INFO: renamed from: v */
    public void mo12194v() {
    }

    /* JADX INFO: renamed from: w */
    public void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
    }

    /* JADX INFO: renamed from: x */
    public void mo12197x() {
    }

    /* JADX INFO: renamed from: y */
    public final int m24994y(p33 p33Var, m32 m32Var, int i) {
        zk8 zk8Var = this.f69503i;
        zk8Var.getClass();
        int iMo4199b = zk8Var.mo4199b(p33Var, m32Var, i);
        if (iMo4199b == -4) {
            if (m32Var.m3751d(4)) {
                this.f69489H = Long.MIN_VALUE;
                return this.f69490I ? -4 : -3;
            }
            long j = m32Var.f50502g + this.f69505k;
            m32Var.f50502g = j;
            this.f69489H = Math.max(this.f69489H, j);
            return iMo4199b;
        }
        if (iMo4199b == -5) {
            C0713b c0713b = (C0713b) p33Var.f55514c;
            c0713b.getClass();
            long j2 = c0713b.f6411t;
            if (j2 != Long.MAX_VALUE) {
                lc3 lc3VarM2520a = c0713b.m2520a();
                lc3VarM2520a.m16086s(j2 + this.f69505k);
                p33Var.f55514c = lc3VarM2520a.m16068a();
            }
        }
        return iMo4199b;
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo4266z(long j, long j2);
}
