package p433v9;

import java.io.EOFException;
import java.io.IOException;
import p261m9.C7504e;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9681d {

    /* JADX INFO: renamed from: a */
    public final C9682e f49564a = new C9682e();

    /* JADX INFO: renamed from: b */
    public final C10151t f49565b = new C10151t(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f49566c = -1;

    /* JADX INFO: renamed from: d */
    public int f49567d;

    /* JADX INFO: renamed from: e */
    public boolean f49568e;

    /* JADX INFO: renamed from: a */
    public final boolean m18192a(C7504e c7504e) throws IOException {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        boolean z12 = this.f49568e;
        C10151t c10151t = this.f49565b;
        if (z12) {
            this.f49568e = false;
            c10151t.m19121B(0);
        }
        while (true) {
            boolean z13 = true;
            if (this.f49568e) {
                return true;
            }
            int i13 = this.f49566c;
            C9682e c9682e = this.f49564a;
            if (i13 < 0) {
                if (c9682e.m18194b(c7504e, -1L) && c9682e.m18193a(c7504e, true)) {
                    int i14 = c9682e.f49572d;
                    if ((c9682e.f49569a & 1) == 1 && c10151t.f51440c == 0) {
                        this.f49567d = 0;
                        int i15 = 0;
                        do {
                            int i16 = this.f49567d;
                            int i17 = 0 + i16;
                            if (i17 >= c9682e.f49571c) {
                                break;
                            }
                            this.f49567d = i16 + 1;
                            i12 = c9682e.f49574f[i17];
                            i15 += i12;
                        } while (i12 == 255);
                        i14 += i15;
                        i11 = this.f49567d + 0;
                    } else {
                        i11 = 0;
                    }
                    try {
                        c7504e.mo14998j(i14);
                        z11 = true;
                    } catch (EOFException unused) {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                    this.f49566c = i11;
                }
                return false;
            }
            int i18 = this.f49566c;
            this.f49567d = 0;
            int i19 = 0;
            do {
                int i20 = this.f49567d;
                int i21 = i18 + i20;
                if (i21 >= c9682e.f49571c) {
                    break;
                }
                this.f49567d = i20 + 1;
                i10 = c9682e.f49574f[i21];
                i19 += i10;
            } while (i10 == 255);
            int i22 = this.f49566c + this.f49567d;
            if (i19 > 0) {
                c10151t.m19126a(c10151t.f51440c + i19);
                try {
                    c7504e.mo14993b(c10151t.f51438a, c10151t.f51440c, i19, false);
                    z10 = true;
                } catch (EOFException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                c10151t.m19123D(c10151t.f51440c + i19);
                if (c9682e.f49574f[i22 - 1] == 255) {
                    z13 = false;
                }
                this.f49568e = z13;
            }
            if (i22 == c9682e.f49571c) {
                i22 = -1;
            }
            this.f49566c = i22;
        }
    }
}
