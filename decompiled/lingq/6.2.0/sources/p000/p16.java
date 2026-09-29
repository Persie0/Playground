package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p16 {

    /* JADX INFO: renamed from: a */
    public final si4 f55430a;

    /* JADX INFO: renamed from: b */
    public final int f55431b;

    /* JADX INFO: renamed from: c */
    public final String f55432c;

    /* JADX INFO: renamed from: d */
    public final String f55433d;

    public p16(si4 si4Var, int i, String str, String str2) {
        this.f55430a = si4Var;
        this.f55431b = i;
        this.f55432c = str;
        this.f55433d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p16)) {
            return false;
        }
        p16 p16Var = (p16) obj;
        return this.f55430a == p16Var.f55430a && this.f55431b == p16Var.f55431b && this.f55432c.equals(p16Var.f55432c) && this.f55433d.equals(p16Var.f55433d);
    }

    public final int hashCode() {
        return Objects.hash(this.f55430a, Integer.valueOf(this.f55431b), this.f55432c, this.f55433d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.f55430a);
        sb.append(", keyId=");
        sb.append(this.f55431b);
        sb.append(", keyType='");
        return wq1.m24125u(sb, this.f55432c, "', keyPrefix='", this.f55433d, "')");
    }
}
