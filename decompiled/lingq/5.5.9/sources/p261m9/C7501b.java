package p261m9;

import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7501b {
    /* JADX INFO: renamed from: a */
    public static void m14990a(long j10, C10151t c10151t, InterfaceC7522w[] interfaceC7522wArr) {
        int i10;
        int iM19145t;
        while (true) {
            boolean z10 = true;
            if (c10151t.f51440c - c10151t.f51439b <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (c10151t.f51440c - c10151t.f51439b == 0) {
                    i10 = -1;
                    break;
                }
                int iM19145t2 = c10151t.m19145t();
                i11 += iM19145t2;
                if (iM19145t2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (c10151t.f51440c - c10151t.f51439b == 0) {
                    i12 = -1;
                    break;
                } else {
                    iM19145t = c10151t.m19145t();
                    i12 += iM19145t;
                }
            } while (iM19145t == 255);
            int i13 = c10151t.f51439b;
            int i14 = i13 + i12;
            if (i12 == -1 || i12 > c10151t.f51440c - i13) {
                C10145n.m19099g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i14 = c10151t.f51440c;
            } else {
                if (i10 == 4 && i12 >= 8) {
                    int iM19145t3 = c10151t.m19145t();
                    int iM19150y = c10151t.m19150y();
                    int iM19129d = iM19150y == 49 ? c10151t.m19129d() : 0;
                    int iM19145t4 = c10151t.m19145t();
                    if (iM19150y == 47) {
                        c10151t.m19125F(1);
                    }
                    boolean z11 = iM19145t3 == 181 && (iM19150y == 49 || iM19150y == 47) && iM19145t4 == 3;
                    if (iM19150y == 49) {
                        if (iM19129d != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        m14991b(j10, c10151t, interfaceC7522wArr);
                    }
                }
                c10151t.m19124E(i14);
            }
            c10151t.m19124E(i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14991b(long j10, C10151t c10151t, InterfaceC7522w[] interfaceC7522wArr) {
        int iM19145t = c10151t.m19145t();
        if ((iM19145t & 64) != 0) {
            c10151t.m19125F(1);
            int i10 = (iM19145t & 31) * 3;
            int i11 = c10151t.f51439b;
            for (InterfaceC7522w interfaceC7522w : interfaceC7522wArr) {
                c10151t.m19124E(i11);
                interfaceC7522w.m15021c(i10, c10151t);
                if (j10 != -9223372036854775807L) {
                    interfaceC7522w.mo7387e(j10, 1, i10, 0, null);
                }
            }
        }
    }
}
