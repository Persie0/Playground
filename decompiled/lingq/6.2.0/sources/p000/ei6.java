package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ei6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f37287a;

    /* JADX INFO: renamed from: b */
    public final String f37288b;

    /* JADX INFO: renamed from: c */
    public final boolean f37289c;

    public ei6(String str, String str2, boolean z) {
        this.f37287a = str;
        this.f37288b = str2;
        this.f37289c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei6)) {
            return false;
        }
        ei6 ei6Var = (ei6) obj;
        return this.f37287a.equals(ei6Var.f37287a) && this.f37288b.equals(ei6Var.f37288b) && this.f37289c == ei6Var.f37289c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37289c) + ux5.m22980c(this.f37287a.hashCode() * 31, this.f37288b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("ToEnd(username=", this.f37287a, ", password=", this.f37288b, ", isSocial="), this.f37289c, ")");
    }
}
