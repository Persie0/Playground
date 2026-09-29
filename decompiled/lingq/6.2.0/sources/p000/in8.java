package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class in8 {

    /* JADX INFO: renamed from: a */
    public final int f44322a;

    /* JADX INFO: renamed from: b */
    public final int f44323b;

    /* JADX INFO: renamed from: c */
    public final String f44324c;

    /* JADX INFO: renamed from: d */
    public final String f44325d;

    /* JADX INFO: renamed from: e */
    public final boolean f44326e;

    public in8(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f44322a = i;
        this.f44323b = i2;
        this.f44324c = str;
        this.f44325d = str2;
        this.f44326e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in8)) {
            return false;
        }
        in8 in8Var = (in8) obj;
        return this.f44322a == in8Var.f44322a && this.f44323b == in8Var.f44323b && fa4.m11650l(this.f44324c, in8Var.f44324c) && fa4.m11650l(this.f44325d, in8Var.f44325d) && this.f44326e == in8Var.f44326e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44326e) + ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f44323b, Integer.hashCode(this.f44322a) * 31, 31), this.f44324c, 31), this.f44325d, 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f44322a, this.f44323b, "ScriptMeasureKey(tokenIndex=", ", startIndex=", ", tokenText=");
        AbstractC3393o1.m17725C(sbM22994q, this.f44324c, ", scriptToUse=", this.f44325d, ", scriptRestricted=");
        return AbstractC3393o1.m17740o(sbM22994q, this.f44326e, ")");
    }
}
