package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c9d {
    /* JADX INFO: renamed from: a */
    public static final z21 m4432a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof ql1) {
            return ((ql1) serialDescriptor).f57894b;
        }
        if (serialDescriptor instanceof yx8) {
            return m4432a(((yx8) serialDescriptor).f70618a);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static long m4433b(k47 k47Var, int i, int i2) {
        k47Var.m14818M(i);
        if (k47Var.m14820a() < 5) {
            return -9223372036854775807L;
        }
        int iM14829m = k47Var.m14829m();
        if ((8388608 & iM14829m) != 0 || ((2096896 & iM14829m) >> 8) != i2 || (iM14829m & 32) == 0 || k47Var.m14842z() < 7 || k47Var.m14820a() < 7 || (k47Var.m14842z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        k47Var.m14827k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
