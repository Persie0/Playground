package p000;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class uq6 {

    /* JADX INFO: renamed from: a */
    public int f64216a;

    /* JADX INFO: renamed from: b */
    public long f64217b;

    /* JADX INFO: renamed from: c */
    public int f64218c;

    /* JADX INFO: renamed from: d */
    public int f64219d;

    /* JADX INFO: renamed from: e */
    public int f64220e;

    /* JADX INFO: renamed from: f */
    public final int[] f64221f = new int[255];

    /* JADX INFO: renamed from: g */
    public final k47 f64222g = new k47(255);

    /* JADX INFO: renamed from: a */
    public final boolean m22856a(iy2 iy2Var, boolean z) throws ParserException, EOFException {
        boolean zMo13076d;
        boolean zMo13076d2;
        this.f64216a = 0;
        this.f64217b = 0L;
        this.f64218c = 0;
        this.f64219d = 0;
        this.f64220e = 0;
        k47 k47Var = this.f64222g;
        k47Var.m14815J(27);
        try {
            zMo13076d = iy2Var.mo13076d(k47Var.f46700a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo13076d = false;
        }
        if (zMo13076d && k47Var.m14807B() == 1332176723) {
            if (k47Var.m14842z() == 0) {
                this.f64216a = k47Var.m14842z();
                this.f64217b = k47Var.m14832p();
                k47Var.m14833q();
                k47Var.m14833q();
                k47Var.m14833q();
                int iM14842z = k47Var.m14842z();
                this.f64218c = iM14842z;
                this.f64219d = iM14842z + 27;
                k47Var.m14815J(iM14842z);
                try {
                    zMo13076d2 = iy2Var.mo13076d(k47Var.f46700a, 0, this.f64218c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo13076d2 = false;
                }
                if (zMo13076d2) {
                    for (int i = 0; i < this.f64218c; i++) {
                        int iM14842z2 = k47Var.m14842z();
                        this.f64221f[i] = iM14842z2;
                        this.f64220e += iM14842z2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.m2517b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22857b(iy2 iy2Var, long j) {
        boolean zMo13076d;
        bna.m3969q(iy2Var.getPosition() == iy2Var.mo13077e());
        k47 k47Var = this.f64222g;
        k47Var.m14815J(4);
        while (true) {
            if (j != -1 && iy2Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo13076d = iy2Var.mo13076d(k47Var.f46700a, 0, 4, true);
            } catch (EOFException unused) {
                zMo13076d = false;
            }
            if (!zMo13076d) {
                break;
            }
            k47Var.m14818M(0);
            if (k47Var.m14807B() == 1332176723) {
                iy2Var.mo13080i();
                return true;
            }
            iy2Var.mo13082k(1);
        }
        do {
            if (j != -1 && iy2Var.getPosition() >= j) {
                break;
            }
        } while (iy2Var.mo13086p() != -1);
        return false;
    }
}
