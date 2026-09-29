package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f69925a;

    public yk0(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f69925a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public static yk0 m25164a(byte[] bArr) {
        if (bArr != null) {
            return new yk0(bArr.length, bArr);
        }
        C3386nv.m17635v("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yk0) {
            return Arrays.equals(((yk0) obj).f69925a, this.f69925a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69925a);
    }

    public final String toString() {
        return "Bytes(" + AbstractC3423or.m18272p(this.f69925a) + ")";
    }
}
