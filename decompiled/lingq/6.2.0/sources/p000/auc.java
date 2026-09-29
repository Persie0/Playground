package p000;

import com.lingq.core.database.entity.SharedByUserEntity;
import com.lingq.core.network.api.result.ResultSharedByUser;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class auc {

    /* JADX INFO: renamed from: a */
    public static final int[] f7531a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f7532b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f7533c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d */
    public static final int[] f7534d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e */
    public static final int[] f7535e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f */
    public static final int[] f7536f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g */
    public static final int[] f7537g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h */
    public static final int[] f7538h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i */
    public static final int[] f7539i = {5, 8, 10, 12};

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m3073a(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m3074b(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static so0 m3075c(byte[] bArr) {
        byte[] bArr2;
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new so0(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        so0 so0Var = new so0(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            so0 so0Var2 = new so0(bArrCopyOf.length, bArrCopyOf);
            while (so0Var2.m21498b() >= 16) {
                so0Var2.m21511o(2);
                int iM21503g = so0Var2.m21503g(14) & 16383;
                int iMin = Math.min(8 - so0Var.f61085d, 14);
                int i3 = so0Var.f61085d;
                int i4 = (8 - i3) - iMin;
                byte[] bArr3 = so0Var.f61083b;
                int i5 = so0Var.f61084c;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr3[i5]);
                bArr3[i5] = b4;
                int i6 = 14 - iMin;
                bArr3[i5] = (byte) (b4 | ((iM21503g >>> i6) << i4));
                int i7 = i5 + 1;
                while (true) {
                    bArr2 = so0Var.f61083b;
                    if (i6 > 8) {
                        bArr2[i7] = (byte) (iM21503g >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                }
                int i8 = 8 - i6;
                byte b5 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b5;
                bArr2[i7] = (byte) (((iM21503g & ((1 << i6) - 1)) << i8) | b5);
                so0Var.m21511o(14);
                so0Var.m21497a();
            }
        }
        so0Var.m21507k(bArrCopyOf.length, bArrCopyOf);
        return so0Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m3076d(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX INFO: renamed from: e */
    public static int m3077e(so0 so0Var, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && so0Var.m21502f(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return so0Var.m21503g(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: f */
    public static final SharedByUserEntity m3078f(ResultSharedByUser resultSharedByUser, String str) {
        resultSharedByUser.getClass();
        str.getClass();
        return new SharedByUserEntity(resultSharedByUser.f21496a, str, resultSharedByUser.f21497b, resultSharedByUser.f21498c, resultSharedByUser.f21499d, resultSharedByUser.f21500e, resultSharedByUser.f21501f);
    }
}
