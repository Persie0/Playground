package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class iv8 {

    /* JADX INFO: renamed from: a */
    public final String f44680a;

    /* JADX INFO: renamed from: b */
    public final String f44681b;

    /* JADX INFO: renamed from: c */
    public final boolean f44682c;

    /* JADX INFO: renamed from: d */
    public final String f44683d;

    /* JADX INFO: renamed from: e */
    public final String f44684e;

    public iv8(String str, String str2, boolean z, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f44680a = str;
        this.f44681b = str2;
        this.f44682c = z;
        this.f44683d = str3;
        this.f44684e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv8)) {
            return false;
        }
        iv8 iv8Var = (iv8) obj;
        return fa4.m11650l(this.f44680a, iv8Var.f44680a) && fa4.m11650l(this.f44681b, iv8Var.f44681b) && this.f44682c == iv8Var.f44682c && fa4.m11650l(this.f44683d, iv8Var.f44683d) && fa4.m11650l(this.f44684e, iv8Var.f44684e);
    }

    public final int hashCode() {
        int iHashCode = this.f44680a.hashCode() * 31;
        String str = this.f44681b;
        int iM22980c = ux5.m22980c(g9a.m12428e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44682c), this.f44683d, 31);
        String str2 = this.f44684e;
        return iM22980c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("SelectionUser(name=", this.f44680a, ", photo=", this.f44681b, ", isSelected=");
        hn1.m13367q(", key=", this.f44683d, ", role=", sbM23000w, this.f44682c);
        return AbstractC3393o1.m17738m(sbM23000w, this.f44684e, ")");
    }
}
