package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f57247a;

    /* JADX INFO: renamed from: b */
    public final boolean f57248b;

    /* JADX INFO: renamed from: c */
    public final String f57249c;

    public q42(String str, String str2, boolean z) {
        str2.getClass();
        this.f57247a = str;
        this.f57248b = z;
        this.f57249c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q42)) {
            return false;
        }
        q42 q42Var = (q42) obj;
        return fa4.m11650l(this.f57247a, q42Var.f57247a) && this.f57248b == q42Var.f57248b && fa4.m11650l(this.f57249c, q42Var.f57249c);
    }

    public final int hashCode() {
        String str = this.f57247a;
        return this.f57249c.hashCode() + g9a.m12428e((str == null ? 0 : str.hashCode()) * 31, 31, this.f57248b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upgrade(offer=");
        sb.append(this.f57247a);
        sb.append(", useWebView=");
        sb.append(this.f57248b);
        sb.append(", url=");
        return AbstractC3393o1.m17738m(sb, this.f57249c, ")");
    }
}
