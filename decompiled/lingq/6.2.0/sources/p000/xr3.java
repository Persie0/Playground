package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class xr3 implements hy2 {

    /* JADX INFO: renamed from: b */
    public jy2 f68571b;

    /* JADX INFO: renamed from: c */
    public iy2 f68572c;

    /* JADX INFO: renamed from: d */
    public rr3 f68573d;

    /* JADX INFO: renamed from: e */
    public i46 f68574e;

    /* JADX INFO: renamed from: g */
    public int f68576g;

    /* JADX INFO: renamed from: h */
    public long f68577h;

    /* JADX INFO: renamed from: i */
    public int f68578i;

    /* JADX INFO: renamed from: a */
    public final k47 f68570a = new k47(16);

    /* JADX INFO: renamed from: j */
    public long f68579j = -1;

    /* JADX INFO: renamed from: f */
    public int f68575f = 0;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        i46 i46Var = this.f68574e;
        if (i46Var != null) {
            i46Var.getClass();
            this.f68574e = null;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        while (true) {
            int i = this.f68575f;
            if (i == 0) {
                int i2 = this.f68578i;
                k47 k47Var = this.f68570a;
                if (i2 == 0) {
                    if (!iy2Var.mo13074a(k47Var.f46700a, 0, 8, true)) {
                        jy2 jy2Var = this.f68571b;
                        jy2Var.getClass();
                        jy2Var.mo2551j();
                        this.f68571b.mo2558q(new h60(-9223372036854775807L));
                        this.f68575f = 4;
                        return -1;
                    }
                    this.f68578i = 8;
                    k47Var.m14818M(0);
                    this.f68577h = k47Var.m14807B();
                    this.f68576g = k47Var.m14829m();
                }
                if (this.f68577h == 1) {
                    iy2Var.readFully(k47Var.f46700a, 8, 8);
                    this.f68578i += 8;
                    this.f68577h = k47Var.m14811F();
                }
                if (this.f68576g == 1836086884) {
                    long position = iy2Var.getPosition();
                    this.f68579j = position;
                    long j = this.f68578i;
                    k36 k36Var = new k36(0L, position - j, -9223372036854775807L, position, this.f68577h - j);
                    jy2 jy2Var2 = this.f68571b;
                    jy2Var2.getClass();
                    n8a n8aVarMo2555n = jy2Var2.mo2555n(1024, 4);
                    lc3 lc3Var = new lc3();
                    lc3Var.f49452m = ez5.m11402l("image/heic");
                    lc3Var.f49450k = new ey5(k36Var);
                    n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
                    this.f68575f = 2;
                } else {
                    this.f68575f = 1;
                }
            } else if (i == 1) {
                iy2Var.mo13082k((int) (this.f68577h - ((long) this.f68578i)));
                this.f68578i = 0;
                this.f68575f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        uk9.m22770c();
                        return 0;
                    }
                    if (this.f68573d == null || iy2Var != this.f68572c) {
                        this.f68572c = iy2Var;
                        this.f68573d = new rr3(iy2Var, this.f68579j);
                    }
                    i46 i46Var = this.f68574e;
                    i46Var.getClass();
                    int iMo110b = i46Var.mo110b(this.f68573d, n63Var);
                    if (iMo110b == 1) {
                        n63Var.f52394a += this.f68579j;
                    }
                    return iMo110b;
                }
                if (this.f68574e == null) {
                    this.f68574e = new i46(bn9.f8727w, 8);
                }
                rr3 rr3Var = new rr3(iy2Var, this.f68579j);
                this.f68573d = rr3Var;
                if (this.f68574e.mo111c(rr3Var)) {
                    i46 i46Var2 = this.f68574e;
                    long j2 = this.f68579j;
                    jy2 jy2Var3 = this.f68571b;
                    jy2Var3.getClass();
                    i46Var2.mo113f(new rr3(j2, jy2Var3, 3));
                    this.f68575f = 3;
                } else {
                    jy2 jy2Var4 = this.f68571b;
                    jy2Var4.getClass();
                    jy2Var4.mo2551j();
                    this.f68571b.mo2558q(new h60(-9223372036854775807L));
                    this.f68575f = 4;
                }
            }
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        return yed.m25107a((h62) iy2Var, true);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        if (j != 0) {
            if (this.f68575f == 3) {
                i46 i46Var = this.f68574e;
                i46Var.getClass();
                i46Var.mo112d(j, j2);
                return;
            }
            return;
        }
        this.f68575f = 0;
        this.f68578i = 0;
        this.f68579j = -1L;
        if (this.f68574e != null) {
            this.f68574e = null;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f68571b = jy2Var;
    }
}
