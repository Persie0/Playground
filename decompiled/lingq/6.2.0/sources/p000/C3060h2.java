package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: h2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3060h2 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final C3097i2 f41669a = new C3097i2("audio/ac3");

    /* JADX INFO: renamed from: b */
    public final k47 f41670b = new k47(2786);

    /* JADX INFO: renamed from: c */
    public boolean f41671c;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        k47 k47Var = this.f41670b;
        int i = iy2Var.read(k47Var.f46700a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        k47Var.m14818M(0);
        k47Var.m14817L(i);
        boolean z = this.f41671c;
        C3097i2 c3097i2 = this.f41669a;
        if (!z) {
            c3097i2.f43373o = 0L;
            this.f41671c = true;
        }
        c3097i2.mo609b(k47Var);
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        h62 h62Var;
        int iM14736b;
        k47 k47Var = new k47(10);
        int i = 0;
        while (true) {
            h62Var = (h62) iy2Var;
            h62Var.mo13076d(k47Var.f46700a, 0, 10, false);
            k47Var.m14818M(0);
            if (k47Var.m14808C() != 4801587) {
                break;
            }
            k47Var.m14819N(3);
            int iM14841y = k47Var.m14841y();
            i += iM14841y + 10;
            h62Var.m13081j(iM14841y, false);
        }
        h62Var.f41835f = 0;
        h62Var.m13081j(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            h62Var.mo13076d(k47Var.f46700a, 0, 6, false);
            k47Var.m14818M(0);
            if (k47Var.m14812G() != 2935) {
                h62Var.f41835f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                h62Var.m13081j(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = k47Var.f46700a;
                if (bArr.length < 6) {
                    iM14736b = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM14736b = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM14736b = jx1.m14736b((b & 192) >> 6, b & 63);
                }
                if (iM14736b == -1) {
                    break;
                }
                h62Var.m13081j(iM14736b - 6, false);
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f41671c = false;
        this.f41669a.mo611d();
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f41669a.mo614g(jy2Var, new mca(0, 1));
        jy2Var.mo2551j();
        jy2Var.mo2558q(new h60(-9223372036854775807L));
    }
}
