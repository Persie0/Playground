package p000;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class tq6 {

    /* JADX INFO: renamed from: a */
    public final uq6 f62729a = new uq6();

    /* JADX INFO: renamed from: b */
    public final k47 f62730b = new k47(0, new byte[65025]);

    /* JADX INFO: renamed from: c */
    public int f62731c = -1;

    /* JADX INFO: renamed from: d */
    public int f62732d;

    /* JADX INFO: renamed from: e */
    public boolean f62733e;

    /* JADX INFO: renamed from: a */
    public final int m22265a(int i) {
        int i2;
        int i3 = 0;
        this.f62732d = 0;
        do {
            int i4 = this.f62732d;
            int i5 = i + i4;
            uq6 uq6Var = this.f62729a;
            if (i5 >= uq6Var.f64218c) {
                break;
            }
            int[] iArr = uq6Var.f64221f;
            this.f62732d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22266b(iy2 iy2Var) {
        int i;
        bna.m3987z(iy2Var != null);
        boolean z = this.f62733e;
        k47 k47Var = this.f62730b;
        if (z) {
            this.f62733e = false;
            k47Var.m14815J(0);
        }
        while (!this.f62733e) {
            int i2 = this.f62731c;
            uq6 uq6Var = this.f62729a;
            if (i2 < 0) {
                if (uq6Var.m22857b(iy2Var, -1L) && uq6Var.m22856a(iy2Var, true)) {
                    int iM22265a = uq6Var.f64219d;
                    if ((uq6Var.f64216a & 1) == 1 && k47Var.f46702c == 0) {
                        iM22265a += m22265a(0);
                        i = this.f62732d;
                    } else {
                        i = 0;
                    }
                    try {
                        iy2Var.mo13082k(iM22265a);
                        this.f62731c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM22265a2 = m22265a(this.f62731c);
            int i3 = this.f62731c + this.f62732d;
            if (iM22265a2 > 0) {
                k47Var.m14821c(k47Var.f46702c + iM22265a2);
                try {
                    iy2Var.readFully(k47Var.f46700a, k47Var.f46702c, iM22265a2);
                    k47Var.m14817L(k47Var.f46702c + iM22265a2);
                    this.f62733e = uq6Var.f64221f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == uq6Var.f64218c) {
                i3 = -1;
            }
            this.f62731c = i3;
        }
        return true;
    }
}
