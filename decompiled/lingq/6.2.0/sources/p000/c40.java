package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c40 extends oq1 {

    /* JADX INFO: renamed from: a */
    public final String f9433a;

    /* JADX INFO: renamed from: b */
    public final String f9434b;

    public c40(String str, String str2) {
        this.f9433a = str;
        this.f9434b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oq1) {
            c40 c40Var = (c40) ((oq1) obj);
            if (this.f9433a.equals(c40Var.f9433a) && this.f9434b.equals(c40Var.f9434b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9434b.hashCode() ^ ((this.f9433a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f9433a);
        sb.append(", variantId=");
        return AbstractC3393o1.m17738m(sb, this.f9434b, "}");
    }
}
