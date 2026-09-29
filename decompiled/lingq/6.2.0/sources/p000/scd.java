package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class scd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static long[] m21242a(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21243b(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static int m21244c(int i) {
        if (i == -1) {
            return -1;
        }
        return i / DescriptorProtos.Edition.EDITION_2023_VALUE;
    }
}
