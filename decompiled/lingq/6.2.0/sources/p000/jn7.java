package p000;

import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.C0717b;

/* JADX INFO: loaded from: classes2.dex */
public final class jn7 implements zk8 {

    /* JADX INFO: renamed from: a */
    public final int f45870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0717b f45871b;

    public jn7(C0717b c0717b, int i) {
        this.f45871b = c0717b;
        this.f45870a = i;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: a */
    public final boolean mo4198a() {
        C0717b c0717b = this.f45871b;
        return !c0717b.m2541C() && c0717b.f6474O[this.f45870a].m25175n(c0717b.f6505j0);
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: b */
    public final int mo4199b(p33 p33Var, m32 m32Var, int i) {
        int i2;
        C0717b c0717b = this.f45871b;
        int i3 = this.f45870a;
        if (c0717b.m2541C()) {
            return -3;
        }
        c0717b.m2563v(i3);
        yk8 yk8Var = c0717b.f6474O[i3];
        boolean z = c0717b.f6505j0;
        yk8Var.getClass();
        boolean z2 = (i & 2) != 0;
        b04 b04Var = yk8Var.f69941b;
        synchronized (yk8Var) {
            m32Var.f50501f = false;
            int i4 = yk8Var.f69956q;
            int i5 = yk8Var.f69958s;
            int i6 = i4 + i5;
            int i7 = yk8Var.f69963x;
            boolean z3 = i7 != -1 && i6 >= i7;
            if (!(i5 != yk8Var.f69955p) || z3) {
                if (!z && !yk8Var.f69964y && !z3) {
                    C0713b c0713b = yk8Var.f69937B;
                    if (c0713b == null || (!z2 && c0713b == yk8Var.f69946g)) {
                        i2 = -3;
                    } else {
                        yk8Var.m25177p(c0713b, p33Var);
                        i2 = -5;
                    }
                }
                m32Var.f8576b = 4;
                m32Var.f50502g = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C0713b c0713b2 = ((xk8) yk8Var.f69942c.m16225c(i6)).f68318a;
                if (!z2 && c0713b2 == yk8Var.f69946g) {
                    int iM25173l = yk8Var.m25173l(yk8Var.f69958s);
                    if (yk8Var.m25176o(iM25173l)) {
                        int i8 = yk8Var.f69952m[iM25173l];
                        m32Var.f8576b = i8;
                        if (yk8Var.f69958s == yk8Var.f69955p - 1 && (z || yk8Var.f69964y)) {
                            m32Var.f8576b = 536870912 | i8;
                        }
                        m32Var.f50502g = yk8Var.f69953n[iM25173l];
                        b04Var.f7720a = yk8Var.f69951l[iM25173l];
                        b04Var.f7721b = yk8Var.f69950k[iM25173l];
                        b04Var.f7722c = yk8Var.f69954o[iM25173l];
                        i2 = -4;
                    } else {
                        m32Var.f50501f = true;
                        i2 = -3;
                    }
                }
                yk8Var.m25177p(c0713b2, p33Var);
                i2 = -5;
            }
        }
        if (i2 == -4 && !m32Var.m3751d(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                wk8 wk8Var = yk8Var.f69940a;
                b04 b04Var2 = yk8Var.f69941b;
                if (z4) {
                    wk8.m24025e(wk8Var.f66979e, m32Var, b04Var2, wk8Var.f66977c);
                } else {
                    wk8Var.f66979e = wk8.m24025e(wk8Var.f66979e, m32Var, b04Var2, wk8Var.f66977c);
                }
            }
            if (!z4) {
                yk8Var.f69958s++;
            }
        }
        if (i2 == -3) {
            c0717b.m2564w(i3);
        }
        return i2;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: c */
    public final void mo4200c() throws DrmSession$DrmSessionException {
        int i = this.f45870a;
        C0717b c0717b = this.f45871b;
        yk8 yk8Var = c0717b.f6474O[i];
        web webVar = yk8Var.f69947h;
        if (webVar == null || webVar.m23867D() != 1) {
            c0717b.m2565x();
        } else {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionM23882r = yk8Var.f69947h.m23882r();
            drmSession$DrmSessionExceptionM23882r.getClass();
            throw drmSession$DrmSessionExceptionM23882r;
        }
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: d */
    public final int mo4201d(long j) {
        int iM25172k;
        C0717b c0717b = this.f45871b;
        int i = this.f45870a;
        boolean z = false;
        if (c0717b.m2541C()) {
            return 0;
        }
        c0717b.m2563v(i);
        yk8 yk8Var = c0717b.f6474O[i];
        boolean z2 = c0717b.f6505j0;
        synchronized (yk8Var) {
            int iM25173l = yk8Var.m25173l(yk8Var.f69958s);
            int i2 = yk8Var.f69958s;
            int i3 = yk8Var.f69955p;
            if ((i2 != i3) && j >= yk8Var.f69953n[iM25173l]) {
                if (j <= yk8Var.f69962w || !z2) {
                    iM25172k = yk8Var.m25172k(iM25173l, i3 - i2, j, true);
                    if (iM25172k == -1) {
                    }
                } else {
                    iM25172k = i3 - i2;
                }
            }
            iM25172k = 0;
        }
        synchronized (yk8Var) {
            if (iM25172k >= 0) {
                try {
                    if (yk8Var.f69958s + iM25172k <= yk8Var.f69955p) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bna.m3969q(z);
            yk8Var.f69958s += iM25172k;
        }
        if (iM25172k == 0) {
            c0717b.m2564w(i);
        }
        return iM25172k;
    }
}
