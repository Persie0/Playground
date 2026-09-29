package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rq6 implements hy2 {

    /* JADX INFO: renamed from: a */
    public jy2 f59720a;

    /* JADX INFO: renamed from: b */
    public ik9 f59721b;

    /* JADX INFO: renamed from: c */
    public boolean f59722c;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        byte[] bArr;
        this.f59720a.getClass();
        if (this.f59721b == null) {
            if (!m20745g(iy2Var)) {
                throw ParserException.m2516a(null, "Failed to determine bitstream type");
            }
            iy2Var.mo13080i();
        }
        if (!this.f59722c) {
            n8a n8aVarMo2555n = this.f59720a.mo2555n(0, 1);
            this.f59720a.mo2551j();
            ik9 ik9Var = this.f59721b;
            ik9Var.f44226c = this.f59720a;
            ik9Var.f44225b = n8aVarMo2555n;
            ik9Var.mo13998d(true);
            this.f59722c = true;
        }
        ik9 ik9Var2 = this.f59721b;
        tq6 tq6Var = ik9Var2.f44224a;
        ik9Var2.f44225b.getClass();
        String str = uma.f64080a;
        int i = ik9Var2.f44231h;
        if (i != 0) {
            if (i == 1) {
                iy2Var.mo13082k((int) ik9Var2.f44229f);
                ik9Var2.f44231h = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                uk9.m22770c();
                return 0;
            }
            long jMo81a = ik9Var2.f44227d.mo81a(iy2Var);
            if (jMo81a >= 0) {
                n63Var.f52394a = jMo81a;
                return 1;
            }
            if (jMo81a < -1) {
                ik9Var2.mo13995a(-(jMo81a + 2));
            }
            if (!ik9Var2.f44235l) {
                st8 st8VarMo84d = ik9Var2.f44227d.mo84d();
                st8VarMo84d.getClass();
                ik9Var2.f44226c.mo2558q(st8VarMo84d);
                ik9Var2.f44225b.mo2534d(st8VarMo84d.mo3545h());
                ik9Var2.f44235l = true;
            }
            if (ik9Var2.f44234k <= 0 && !tq6Var.m22266b(iy2Var)) {
                ik9Var2.f44231h = 3;
                return -1;
            }
            ik9Var2.f44234k = 0L;
            k47 k47Var = tq6Var.f62730b;
            long jMo13996b = ik9Var2.mo13996b(k47Var);
            if (jMo13996b >= 0) {
                long j = ik9Var2.f44230g;
                if (j + jMo13996b >= ik9Var2.f44228e) {
                    long j2 = (j * 1000000) / ((long) ik9Var2.f44232i);
                    ik9Var2.f44225b.mo2535e(k47Var.f46702c, k47Var);
                    ik9Var2.f44225b.mo2531a(j2, 1, k47Var.f46702c, 0, null);
                    ik9Var2.f44228e = -1L;
                }
            }
            ik9Var2.f44230g += jMo13996b;
            return 0;
        }
        while (true) {
            boolean zM22266b = tq6Var.m22266b(iy2Var);
            k47 k47Var2 = tq6Var.f62730b;
            if (!zM22266b) {
                ik9Var2.f44231h = 3;
                return -1;
            }
            long position = iy2Var.getPosition();
            long j3 = ik9Var2.f44229f;
            ik9Var2.f44234k = position - j3;
            if (!ik9Var2.mo13997c(k47Var2, j3, ik9Var2.f44233j)) {
                C0713b c0713b = (C0713b) ik9Var2.f44233j.f55513b;
                ik9Var2.f44232i = c0713b.f6382H;
                if (!ik9Var2.f44236m) {
                    ik9Var2.f44225b.mo2537g(c0713b);
                    ik9Var2.f44236m = true;
                }
                vh0 vh0Var = (vh0) ik9Var2.f44233j.f55514c;
                if (vh0Var == null) {
                    if (iy2Var.getLength() == -1) {
                        ik9Var2.f44227d = new a3d();
                    } else {
                        uq6 uq6Var = tq6Var.f62729a;
                        ik9Var2.f44227d = new m72(ik9Var2, ik9Var2.f44229f, iy2Var.getLength(), uq6Var.f64219d + uq6Var.f64220e, uq6Var.f64217b, (uq6Var.f64216a & 4) != 0);
                    }
                    ik9Var2.f44231h = 2;
                    bArr = k47Var2.f46700a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    k47Var2.m14816K(k47Var2.f46702c, Arrays.copyOf(bArr, Math.max(65025, k47Var2.f46702c)));
                    return 0;
                }
                ik9Var2.f44227d = vh0Var;
                ik9Var2.f44231h = 2;
                bArr = k47Var2.f46700a;
                if (bArr.length == 65025) {
                    return 0;
                }
                k47Var2.m14816K(k47Var2.f46702c, Arrays.copyOf(bArr, Math.max(65025, k47Var2.f46702c)));
                return 0;
            }
            ik9Var2.f44229f = iy2Var.getPosition();
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        try {
            return m20745g(iy2Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        ik9 ik9Var = this.f59721b;
        if (ik9Var != null) {
            tq6 tq6Var = ik9Var.f44224a;
            uq6 uq6Var = tq6Var.f62729a;
            uq6Var.f64216a = 0;
            uq6Var.f64217b = 0L;
            uq6Var.f64218c = 0;
            uq6Var.f64219d = 0;
            uq6Var.f64220e = 0;
            tq6Var.f62730b.m14815J(0);
            tq6Var.f62731c = -1;
            tq6Var.f62733e = false;
            if (j == 0) {
                ik9Var.mo13998d(!ik9Var.f44235l);
                return;
            }
            if (ik9Var.f44231h != 0) {
                long j3 = (((long) ik9Var.f44232i) * j2) / 1000000;
                ik9Var.f44228e = j3;
                vq6 vq6Var = ik9Var.f44227d;
                String str = uma.f64080a;
                vq6Var.mo86f(j3);
                ik9Var.f44231h = 2;
            }
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f59720a = jy2Var;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20745g(iy2 iy2Var) {
        boolean zM16065e;
        uq6 uq6Var = new uq6();
        if (uq6Var.m22856a(iy2Var, true) && (uq6Var.f64216a & 2) == 2) {
            int iMin = Math.min(uq6Var.f64220e, 8);
            k47 k47Var = new k47(iMin);
            iy2Var.mo13085o(k47Var.f46700a, 0, iMin);
            k47Var.m14818M(0);
            if (k47Var.m14820a() >= 5 && k47Var.m14842z() == 127 && k47Var.m14807B() == 1179402563) {
                this.f59721b = new o63();
                return true;
            }
            k47Var.m14818M(0);
            try {
                zM16065e = lbd.m16065e(1, k47Var, true);
            } catch (ParserException unused) {
                zM16065e = false;
            }
            if (zM16065e) {
                this.f59721b = new y1b();
            } else {
                k47Var.m14818M(0);
                if (tz6.m22356e(k47Var, tz6.f63144o)) {
                    this.f59721b = new tz6();
                }
            }
            return true;
        }
        return false;
    }
}
