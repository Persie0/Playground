package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e30 extends zp1 {

    /* JADX INFO: renamed from: a */
    public final String f36633a;

    /* JADX INFO: renamed from: b */
    public final byte[] f36634b;

    public e30(String str, byte[] bArr) {
        this.f36633a = str;
        this.f36634b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zp1) {
            zp1 zp1Var = (zp1) obj;
            e30 e30Var = (e30) zp1Var;
            if (this.f36633a.equals(e30Var.f36633a)) {
                if (Arrays.equals(this.f36634b, zp1Var instanceof e30 ? ((e30) zp1Var).f36634b : e30Var.f36634b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36634b) ^ ((this.f36633a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f36633a + ", contents=" + Arrays.toString(this.f36634b) + "}";
    }
}
