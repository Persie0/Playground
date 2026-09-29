package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2825r8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m8240a(byte[] bArr, int i10, int i11) {
        int iM8261a;
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            iM8261a = 0;
        } else {
            while (true) {
                if (i10 >= i11) {
                    iM8261a = 0;
                } else {
                    int i12 = i10 + 1;
                    iM8261a = bArr[i10];
                    if (iM8261a < 0) {
                        if (iM8261a >= -32) {
                            if (iM8261a < -16) {
                                if (i12 >= i11 - 1) {
                                    iM8261a = C2851t8.m8261a(bArr, i12, i11);
                                } else {
                                    int i13 = i12 + 1;
                                    char c10 = bArr[i12];
                                    if (c10 <= -65 && ((iM8261a != -32 || c10 >= -96) && (iM8261a != -19 || c10 < -96))) {
                                        i10 = i13 + 1;
                                        if (bArr[i13] > -65) {
                                        }
                                    }
                                }
                            } else if (i12 >= i11 - 2) {
                                iM8261a = C2851t8.m8261a(bArr, i12, i11);
                            } else {
                                int i14 = i12 + 1;
                                int i15 = bArr[i12];
                                if (i15 <= -65) {
                                    if ((((i15 + 112) + (iM8261a << 28)) >> 30) == 0) {
                                        int i16 = i14 + 1;
                                        if (bArr[i14] <= -65) {
                                            i12 = i16 + 1;
                                            if (bArr[i16] > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                            iM8261a = -1;
                        } else if (i12 < i11) {
                            if (iM8261a >= -62) {
                                i10 = i12 + 1;
                                if (bArr[i12] > -65) {
                                }
                            }
                            iM8261a = -1;
                        }
                    }
                    i10 = i12;
                }
            }
        }
        return iM8261a == 0;
    }
}
