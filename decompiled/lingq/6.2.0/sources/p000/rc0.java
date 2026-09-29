package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rc0 extends az3 {

    /* JADX INFO: renamed from: b */
    public final byte[] f59056b;

    public rc0(String str, byte[] bArr) {
        super(str);
        this.f59056b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc0.class != obj.getClass()) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return this.f7687a.equals(rc0Var.f7687a) && Arrays.equals(this.f59056b, rc0Var.f59056b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59056b) + ux5.m22980c(527, this.f7687a, 31);
    }
}
