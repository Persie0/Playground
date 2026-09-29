package com.google.common.hash;

import p000.C3386nv;
import p000.b34;

/* JADX INFO: renamed from: com.google.common.hash.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1107a {

    /* JADX INFO: renamed from: a */
    public static final char[] f13486a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public abstract byte[] mo6354a();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof AbstractC1107a) {
            byte[] bArr = ((HashCode$BytesHashCode) this).f13484b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((HashCode$BytesHashCode) ((AbstractC1107a) obj)).f13484b;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((HashCode$BytesHashCode) this).f13484b;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & 255;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            return i;
        }
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        C3386nv.m17633t(b34.m3207B("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((HashCode$BytesHashCode) this).f13484b;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f13486a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
