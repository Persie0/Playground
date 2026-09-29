package p195j9;

import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.ParserException;
import p357r6.C8739a;
import p479xa.C10145n;

/* JADX INFO: renamed from: j9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6424a {

    /* JADX INFO: renamed from: a */
    public static final int[] f36901a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f36902b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: j9.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f36903a;

        /* JADX INFO: renamed from: b */
        public final int f36904b;

        /* JADX INFO: renamed from: c */
        public final String f36905c;

        public a(int i10, int i11, String str) {
            this.f36903a = i10;
            this.f36904b = i11;
            this.f36905c = str;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static int m13045a(C8739a c8739a) throws ParserException {
        int iM16970g = c8739a.m16970g(4);
        if (iM16970g == 15) {
            if (c8739a.m16965b() >= 24) {
                return c8739a.m16970g(24);
            }
            throw ParserException.m6770a("AAC header insufficient data", null);
        }
        if (iM16970g < 13) {
            return f36901a[iM16970g];
        }
        throw ParserException.m6770a("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public static a m13046b(C8739a c8739a, boolean z10) throws ParserException {
        int iM16970g = c8739a.m16970g(5);
        if (iM16970g == 31) {
            iM16970g = c8739a.m16970g(6) + 32;
        }
        int iM13045a = m13045a(c8739a);
        int iM16970g2 = c8739a.m16970g(4);
        String strM761g = C0166e.m761g("mp4a.40.", iM16970g);
        if (iM16970g == 5 || iM16970g == 29) {
            iM13045a = m13045a(c8739a);
            int iM16970g3 = c8739a.m16970g(5);
            if (iM16970g3 == 31) {
                iM16970g3 = c8739a.m16970g(6) + 32;
            }
            iM16970g = iM16970g3;
            if (iM16970g == 22) {
                iM16970g2 = c8739a.m16970g(4);
            }
        }
        if (z10) {
            if (iM16970g != 1 && iM16970g != 2 && iM16970g != 3 && iM16970g != 4 && iM16970g != 6 && iM16970g != 7 && iM16970g != 17) {
                switch (iM16970g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.m6772c("Unsupported audio object type: " + iM16970g);
                }
            }
            if (c8739a.m16969f()) {
                C10145n.m19099g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c8739a.m16969f()) {
                c8739a.m16976m(14);
            }
            boolean zM16969f = c8739a.m16969f();
            if (iM16970g2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM16970g == 6 || iM16970g == 20) {
                c8739a.m16976m(3);
            }
            if (zM16969f) {
                if (iM16970g == 22) {
                    c8739a.m16976m(16);
                }
                if (iM16970g == 17 || iM16970g == 19 || iM16970g == 20 || iM16970g == 23) {
                    c8739a.m16976m(3);
                }
                c8739a.m16976m(1);
            }
            switch (iM16970g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM16970g4 = c8739a.m16970g(2);
                    if (iM16970g4 == 2 || iM16970g4 == 3) {
                        throw ParserException.m6772c("Unsupported epConfig: " + iM16970g4);
                    }
                    break;
                default:
                case 18:
                    break;
            }
        }
        int i10 = f36902b[iM16970g2];
        if (i10 != -1) {
            return new a(iM13045a, i10, strM761g);
        }
        throw ParserException.m6770a(null, null);
    }
}
