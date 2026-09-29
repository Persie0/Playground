package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vr2 {

    /* JADX INFO: renamed from: a */
    public final bs2 f65823a;

    /* JADX INFO: renamed from: b */
    public final byte[] f65824b;

    public vr2(bs2 bs2Var, byte[] bArr) {
        if (bs2Var == null) {
            C3386nv.m17635v("encoding is null");
            throw null;
        }
        if (bArr == null) {
            C3386nv.m17635v("bytes is null");
            throw null;
        }
        this.f65823a = bs2Var;
        this.f65824b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr2)) {
            return false;
        }
        vr2 vr2Var = (vr2) obj;
        if (this.f65823a.equals(vr2Var.f65823a)) {
            return Arrays.equals(this.f65824b, vr2Var.f65824b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f65824b) ^ ((this.f65823a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f65823a + ", bytes=[...]}";
    }
}
