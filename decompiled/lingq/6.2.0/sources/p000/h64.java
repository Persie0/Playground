package p000;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h64 extends n41 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f41837c;

    public h64(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.f41837c = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f52311b = kp0.m15633c(bArr);
        this.f52310a = i;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: c */
    public final int[] mo13088c(int[] iArr, int i) {
        switch (this.f41837c) {
            case 0:
                if (iArr.length != 3) {
                    uk9.m22783r("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    return null;
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f52311b;
                int[] iArr4 = kp0.f48272a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    uk9.m22783r("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    return null;
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = (int[]) this.f52311b;
                int[] iArr7 = new int[16];
                int[] iArr8 = kp0.f48272a;
                System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
                System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
                iArr7[12] = iArr[0];
                iArr7[13] = iArr[1];
                iArr7[14] = iArr[2];
                iArr7[15] = iArr[3];
                kp0.m15632b(iArr7);
                iArr7[4] = iArr7[12];
                iArr7[5] = iArr7[13];
                iArr7[6] = iArr7[14];
                iArr7[7] = iArr7[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: h */
    public final int mo13089h() {
        switch (this.f41837c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
