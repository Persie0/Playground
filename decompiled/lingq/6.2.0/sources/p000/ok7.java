package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ok7 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f54496b;

    /* JADX INFO: renamed from: c */
    public final byte[] f54497c;

    public ok7(String str, byte[] bArr) {
        super("PRIV");
        this.f54496b = str;
        this.f54497c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ok7.class != obj.getClass()) {
            return false;
        }
        ok7 ok7Var = (ok7) obj;
        return this.f54496b.equals(ok7Var.f54496b) && Arrays.equals(this.f54497c, ok7Var.f54497c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54497c) + ux5.m22980c(527, this.f54496b, 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": owner=" + this.f54496b;
    }
}
