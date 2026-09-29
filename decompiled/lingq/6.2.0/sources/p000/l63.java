package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l63 {

    /* JADX INFO: renamed from: a */
    public final sc0 f49111a;

    /* JADX INFO: renamed from: b */
    public final wc0 f49112b;

    /* JADX INFO: renamed from: c */
    public tc0 f49113c;

    /* JADX INFO: renamed from: d */
    public final int f49114d;

    public l63(uc0 uc0Var, wc0 wc0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.f49112b = wc0Var;
        this.f49114d = i;
        this.f49111a = new sc0(uc0Var, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: a */
    public static int m15824a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static int m15825c(iy2 iy2Var, long j, n63 n63Var) {
        if (j == iy2Var.getPosition()) {
            return 0;
        }
        n63Var.f52394a = j;
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m15826b(iy2 iy2Var, n63 n63Var) {
        while (true) {
            tc0 tc0Var = this.f49113c;
            tc0Var.getClass();
            long j = tc0Var.f62127f;
            long j2 = tc0Var.f62128g;
            long j3 = tc0Var.f62129h;
            long j4 = j2 - j;
            long j5 = this.f49114d;
            wc0 wc0Var = this.f49112b;
            if (j4 <= j5) {
                this.f49113c = null;
                wc0Var.mo16222E();
                return m15825c(iy2Var, j, n63Var);
            }
            long position = j3 - iy2Var.getPosition();
            if (position < 0 || position > 262144) {
                return m15825c(iy2Var, j3, n63Var);
            }
            iy2Var.mo13082k((int) position);
            iy2Var.mo13080i();
            vc0 vc0VarMo14881g = wc0Var.mo14881g(iy2Var, tc0Var.f62123b);
            int i = vc0VarMo14881g.f65180c;
            long j6 = vc0VarMo14881g.f65178a;
            long j7 = vc0VarMo14881g.f65179b;
            if (i == -3) {
                this.f49113c = null;
                wc0Var.mo16222E();
                return m15825c(iy2Var, j3, n63Var);
            }
            if (i == -2) {
                tc0Var.f62125d = j6;
                tc0Var.f62127f = j7;
                tc0Var.f62129h = tc0.m21946a(tc0Var.f62123b, j6, tc0Var.f62126e, j7, tc0Var.f62128g, tc0Var.f62124c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        C3386nv.m17633t("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - iy2Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        iy2Var.mo13082k((int) position2);
                    }
                    this.f49113c = null;
                    wc0Var.mo16222E();
                    return m15825c(iy2Var, j7, n63Var);
                }
                tc0Var.f62126e = j6;
                tc0Var.f62128g = j7;
                tc0Var.f62129h = tc0.m21946a(tc0Var.f62123b, tc0Var.f62125d, j6, tc0Var.f62127f, j7, tc0Var.f62124c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15827d(long j) {
        tc0 tc0Var = this.f49113c;
        if (tc0Var == null || tc0Var.f62122a != j) {
            sc0 sc0Var = this.f49111a;
            this.f49113c = new tc0(j, sc0Var.f60651a.mo18569a(j), sc0Var.f60653c, sc0Var.f60654d, sc0Var.f60655e, sc0Var.f60656f);
        }
    }
}
