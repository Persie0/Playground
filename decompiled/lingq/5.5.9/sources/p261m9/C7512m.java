package p261m9;

import androidx.datastore.preferences.PreferencesProto$Value;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7512m {

    /* JADX INFO: renamed from: m9.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f41491a;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x00c3, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static boolean m15011a(C10151t c10151t, C7515p c7515p, int i10, a aVar) {
        boolean z10;
        boolean z11;
        long jM19146u = c10151t.m19146u();
        long j10 = jM19146u >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z12 = (j10 & 1) == 1;
        int i11 = (int) ((jM19146u >> 12) & 15);
        int i12 = (int) ((jM19146u >> 8) & 15);
        int i13 = (int) (15 & (jM19146u >> 4));
        int i14 = (int) ((jM19146u >> 1) & 7);
        boolean z13 = (jM19146u & 1) == 1;
        if (i13 > 7 ? !(i13 > 10 || c7515p.f41500g != 2) : i13 == c7515p.f41500g - 1) {
            if ((i14 == 0 || i14 == c7515p.f41502i) && !z13) {
                try {
                    long jM19151z = c10151t.m19151z();
                    if (!z12) {
                        jM19151z *= (long) c7515p.f41495b;
                    }
                    aVar.f41491a = jM19151z;
                    z10 = true;
                } catch (NumberFormatException unused) {
                    z10 = false;
                }
                if (z10) {
                    int iM15012b = m15012b(i11, c10151t);
                    if (iM15012b != -1 && iM15012b <= c7515p.f41495b) {
                        int i15 = c7515p.f41498e;
                        if (i12 != 0) {
                            if (i12 <= 11) {
                                if (i12 == c7515p.f41499f) {
                                }
                            } else if (i12 != 12) {
                                if (i12 <= 14) {
                                    int iM19150y = c10151t.m19150y();
                                    if (i12 == 14) {
                                        iM19150y *= 10;
                                    }
                                    z11 = iM19150y == i15;
                                }
                            } else if (c10151t.m19145t() * 1000 == i15) {
                            }
                        }
                        if (z11) {
                            int iM19145t = c10151t.m19145t();
                            int i16 = c10151t.f51439b;
                            byte[] bArr = c10151t.f51438a;
                            int i17 = i16 - 1;
                            int i18 = C10134c0.f51354a;
                            int i19 = 0;
                            for (int i20 = c10151t.f51439b; i20 < i17; i20++) {
                                i19 = C10134c0.f51366m[i19 ^ (bArr[i20] & 255)];
                            }
                            if (iM19145t == i19) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m15012b(int i10, C10151t c10151t) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return c10151t.m19145t() + 1;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return c10151t.m19150y() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
