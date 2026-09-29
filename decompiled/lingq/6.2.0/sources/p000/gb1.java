package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gb1 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f40483b;

    /* JADX INFO: renamed from: c */
    public final String f40484c;

    /* JADX INFO: renamed from: d */
    public final String f40485d;

    public gb1(String str, String str2, String str3) {
        super("COMM");
        this.f40483b = str;
        this.f40484c = str2;
        this.f40485d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gb1.class != obj.getClass()) {
            return false;
        }
        gb1 gb1Var = (gb1) obj;
        return this.f40484c.equals(gb1Var.f40484c) && this.f40483b.equals(gb1Var.f40483b) && Objects.equals(this.f40485d, gb1Var.f40485d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(527, this.f40483b, 31), this.f40484c, 31);
        String str = this.f40485d;
        return iM22980c + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": language=" + this.f40483b + ", description=" + this.f40484c + ", text=" + this.f40485d;
    }
}
