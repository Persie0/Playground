package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ki6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final int f47346a;

    /* JADX INFO: renamed from: b */
    public final int f47347b;

    /* JADX INFO: renamed from: c */
    public final String f47348c;

    public ki6(int i, String str, int i2) {
        this.f47346a = i;
        this.f47347b = i2;
        this.f47348c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki6)) {
            return false;
        }
        ki6 ki6Var = (ki6) obj;
        return this.f47346a == ki6Var.f47346a && this.f47347b == ki6Var.f47347b && this.f47348c.equals(ki6Var.f47348c);
    }

    public final int hashCode() {
        return this.f47348c.hashCode() + wq1.m24106b(this.f47347b, Integer.hashCode(this.f47346a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f47346a, this.f47347b, "Reader(contentId=", ", collectionId=", ", collectionTitle="), this.f47348c, ")");
    }
}
