package p195j9;

import p357r6.C8739a;
import p479xa.C10151t;

/* JADX INFO: renamed from: j9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6426c {

    /* JADX INFO: renamed from: a */
    public static final int[] f36912a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j9.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f36913a;

        /* JADX INFO: renamed from: b */
        public final int f36914b;

        /* JADX INFO: renamed from: c */
        public final int f36915c;

        public a(int i10, int i11, int i12) {
            this.f36913a = i10;
            this.f36914b = i11;
            this.f36915c = i12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13048a(int i10, C10151t c10151t) {
        c10151t.m19121B(7);
        byte[] bArr = c10151t.f51438a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        if (r12 != 8) goto L53;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m13049b(C8739a c8739a) {
        int i10;
        int i11;
        int iM16970g = c8739a.m16970g(16);
        int iM16970g2 = c8739a.m16970g(16);
        if (iM16970g2 == 65535) {
            iM16970g2 = c8739a.m16970g(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iM16970g2 + i10;
        if (iM16970g == 44097) {
            i12 += 2;
        }
        if (c8739a.m16970g(2) == 3) {
            do {
                c8739a.m16970g(2);
            } while (c8739a.m16969f());
        }
        int iM16970g3 = c8739a.m16970g(10);
        if (c8739a.m16969f() && c8739a.m16970g(3) > 0) {
            c8739a.m16976m(2);
        }
        int i13 = c8739a.m16969f() ? 48000 : 44100;
        int iM16970g4 = c8739a.m16970g(4);
        int[] iArr = f36912a;
        if (i13 == 44100 && iM16970g4 == 13) {
            i11 = iArr[iM16970g4];
        } else if (i13 != 48000 || iM16970g4 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[iM16970g4];
            int i15 = iM16970g3 % 5;
            if (i15 == 1) {
                if (iM16970g4 != 3) {
                }
                i14++;
            } else if (i15 == 2) {
                if (iM16970g4 != 8) {
                    if (iM16970g4 == 11) {
                    }
                }
                i14++;
            } else if (i15 == 3) {
                if (iM16970g4 != 3) {
                }
                i14++;
            } else if (i15 == 4) {
                if (iM16970g4 == 3 || iM16970g4 == 8 || iM16970g4 == 11) {
                    i14++;
                }
            }
            i11 = i14;
        }
        return new a(i13, i12, i11);
    }
}
