package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wp8 extends zp8 {

    /* JADX INFO: renamed from: a */
    public final int f67156a;

    /* JADX INFO: renamed from: b */
    public final String f67157b;

    public wp8(int i, String str) {
        str.getClass();
        this.f67156a = i;
        this.f67157b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp8)) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        return this.f67156a == wp8Var.f67156a && fa4.m11650l(this.f67157b, wp8Var.f67157b);
    }

    public final int hashCode() {
        return this.f67157b.hashCode() + (Integer.hashCode(this.f67156a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f67156a, "Search(placeholder=", ", query=", this.f67157b, ")");
    }
}
