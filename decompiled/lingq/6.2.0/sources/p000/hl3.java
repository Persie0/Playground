package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hl3 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f42571b;

    /* JADX INFO: renamed from: c */
    public final String f42572c;

    /* JADX INFO: renamed from: d */
    public final String f42573d;

    /* JADX INFO: renamed from: e */
    public final byte[] f42574e;

    public hl3(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f42571b = str;
        this.f42572c = str2;
        this.f42573d = str3;
        this.f42574e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hl3.class != obj.getClass()) {
            return false;
        }
        hl3 hl3Var = (hl3) obj;
        return Objects.equals(this.f42571b, hl3Var.f42571b) && this.f42572c.equals(hl3Var.f42572c) && this.f42573d.equals(hl3Var.f42573d) && Arrays.equals(this.f42574e, hl3Var.f42574e);
    }

    public final int hashCode() {
        String str = this.f42571b;
        return Arrays.hashCode(this.f42574e) + ux5.m22980c(ux5.m22980c((527 + (str != null ? str.hashCode() : 0)) * 31, this.f42572c, 31), this.f42573d, 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": mimeType=" + this.f42571b + ", filename=" + this.f42572c + ", description=" + this.f42573d;
    }
}
