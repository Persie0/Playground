package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n40 extends uw2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f52308a;

    /* JADX INFO: renamed from: b */
    public final byte[] f52309b;

    public n40(byte[] bArr, byte[] bArr2) {
        this.f52308a = bArr;
        this.f52309b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uw2) {
            uw2 uw2Var = (uw2) obj;
            boolean z = uw2Var instanceof n40;
            n40 n40Var = (n40) uw2Var;
            if (Arrays.equals(this.f52308a, z ? n40Var.f52308a : n40Var.f52308a)) {
                n40 n40Var2 = (n40) uw2Var;
                if (Arrays.equals(this.f52309b, z ? n40Var2.f52309b : n40Var2.f52309b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f52309b) ^ ((Arrays.hashCode(this.f52308a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f52308a) + ", encryptedBlob=" + Arrays.toString(this.f52309b) + "}";
    }
}
