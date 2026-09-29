package kotlin.uuid;

import p000.mna;
import p000.qs3;

/* JADX INFO: renamed from: kotlin.uuid.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3207a {
    /* JADX INFO: renamed from: a */
    public static final void m15430a(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = qs3.f58130a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m15431b(Uuid uuid) {
        long j = uuid.f47742a;
        long j2 = uuid.f47743b;
        UuidSerialized uuidSerialized = new UuidSerialized();
        uuidSerialized.f47744a = j;
        uuidSerialized.f47745b = j2;
        return uuidSerialized;
    }

    /* JADX INFO: renamed from: c */
    public static final Uuid m15432c(String str) {
        int i = 0;
        long j = 0;
        while (true) {
            if (i < 16) {
                long j2 = j << 4;
                char cCharAt = str.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = qs3.f58131b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                mna.m16946f(str, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = str.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = qs3.f58131b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                mna.m16946f(str, i2, "a hexadecimal digit");
                throw null;
            }
            return (j == 0 && j4 == 0) ? Uuid.f47741c : new Uuid(j, j4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Uuid m15433d(String str) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = qs3.f58131b[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                }
            }
            mna.m16946f(str, i, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(8) != '-') {
            mna.m16946f(str, 8, "'-' (hyphen)");
            throw null;
        }
        long j4 = 0;
        for (int i2 = 9; i2 < 13; i2++) {
            long j5 = j4 << 4;
            char cCharAt2 = str.charAt(i2);
            if ((cCharAt2 >>> '\b') == 0) {
                long j6 = qs3.f58131b[cCharAt2];
                if (j6 >= 0) {
                    j4 = j5 | j6;
                }
            }
            mna.m16946f(str, i2, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(13) != '-') {
            mna.m16946f(str, 13, "'-' (hyphen)");
            throw null;
        }
        long j7 = 0;
        for (int i3 = 14; i3 < 18; i3++) {
            long j8 = j7 << 4;
            char cCharAt3 = str.charAt(i3);
            if ((cCharAt3 >>> '\b') == 0) {
                long j9 = qs3.f58131b[cCharAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                }
            }
            mna.m16946f(str, i3, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(18) != '-') {
            mna.m16946f(str, 18, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i4 = 19; i4 < 23; i4++) {
            long j11 = j10 << 4;
            char cCharAt4 = str.charAt(i4);
            if ((cCharAt4 >>> '\b') == 0) {
                long j12 = qs3.f58131b[cCharAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            mna.m16946f(str, i4, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(23) != '-') {
            mna.m16946f(str, 23, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i5 = 24; i5 < 36; i5++) {
            long j14 = j13 << 4;
            char cCharAt5 = str.charAt(i5);
            if ((cCharAt5 >>> '\b') == 0) {
                long j15 = qs3.f58131b[cCharAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            mna.m16946f(str, i5, "a hexadecimal digit");
            throw null;
        }
        long j16 = (j << 32) | (j4 << 16) | j7;
        long j17 = (j10 << 48) | j13;
        return (j16 == 0 && j17 == 0) ? Uuid.f47741c : new Uuid(j16, j17);
    }
}
