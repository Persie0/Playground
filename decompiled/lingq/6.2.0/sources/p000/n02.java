package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class n02 {

    /* JADX INFO: renamed from: a */
    public final String f52106a;

    /* JADX INFO: renamed from: b */
    public final String f52107b;

    /* JADX INFO: renamed from: c */
    public final String f52108c;

    public n02(String str, String str2, String str3) {
        this.f52106a = str;
        this.f52107b = str2;
        this.f52108c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n02)) {
            return false;
        }
        n02 n02Var = (n02) obj;
        return this.f52106a.equals(n02Var.f52106a) && this.f52107b.equals(n02Var.f52107b) && this.f52108c.equals(n02Var.f52108c);
    }

    public final int hashCode() {
        return this.f52108c.hashCode() + ux5.m22980c(this.f52106a.hashCode() * 31, this.f52107b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("DataToImport(title=", this.f52106a, ", url=", this.f52107b, ", fileUri="), this.f52108c, ")");
    }
}
