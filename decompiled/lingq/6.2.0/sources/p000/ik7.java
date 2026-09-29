package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ik7 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte[] f44223a;

    public ik7(byte[] bArr) {
        this.f44223a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ik7 ik7Var = (ik7) obj;
        byte[] bArr = this.f44223a;
        int length = bArr.length;
        byte[] bArr2 = ik7Var.f44223a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = ik7Var.f44223a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ik7) {
            return Arrays.equals(this.f44223a, ((ik7) obj).f44223a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44223a);
    }

    public final String toString() {
        return AbstractC3423or.m18272p(this.f44223a);
    }
}
