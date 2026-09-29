package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3132j2 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final C3097i2 f44917a = new C3097i2(null, 0, "audio/ac4", 1);

    /* JADX INFO: renamed from: b */
    public final k47 f44918b = new k47(16384);

    /* JADX INFO: renamed from: c */
    public boolean f44919c;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        k47 k47Var = this.f44918b;
        int i = iy2Var.read(k47Var.f46700a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        k47Var.m14818M(0);
        k47Var.m14817L(i);
        boolean z = this.f44919c;
        C3097i2 c3097i2 = this.f44917a;
        if (!z) {
            c3097i2.f43373o = 0L;
            this.f44919c = true;
        }
        c3097i2.mo609b(k47Var);
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        h62 h62Var;
        int i;
        k47 k47Var = new k47(10);
        int i2 = 0;
        while (true) {
            h62Var = (h62) iy2Var;
            h62Var.mo13076d(k47Var.f46700a, 0, 10, false);
            k47Var.m14818M(0);
            if (k47Var.m14808C() != 4801587) {
                break;
            }
            k47Var.m14819N(3);
            int iM14841y = k47Var.m14841y();
            i2 += iM14841y + 10;
            h62Var.m13081j(iM14841y, false);
        }
        h62Var.f41835f = 0;
        h62Var.m13081j(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            h62Var.mo13076d(k47Var.f46700a, 0, 7, false);
            k47Var.m14818M(0);
            int iM14812G = k47Var.m14812G();
            if (iM14812G == 44096 || iM14812G == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = k47Var.f46700a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM14812G == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                h62Var.m13081j(i - 7, false);
            } else {
                h62Var.f41835f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                h62Var.m13081j(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f44919c = false;
        this.f44917a.mo611d();
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f44917a.mo614g(jy2Var, new mca(0, 1));
        jy2Var.mo2551j();
        jy2Var.mo2558q(new h60(-9223372036854775807L));
    }
}
