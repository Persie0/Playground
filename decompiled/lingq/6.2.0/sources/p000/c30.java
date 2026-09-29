package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c30 extends yp1 {

    /* JADX INFO: renamed from: a */
    public final String f9383a;

    /* JADX INFO: renamed from: b */
    public final String f9384b;

    public c30(String str, String str2) {
        this.f9383a = str;
        this.f9384b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yp1)) {
            return false;
        }
        c30 c30Var = (c30) ((yp1) obj);
        return this.f9383a.equals(c30Var.f9383a) && this.f9384b.equals(c30Var.f9384b);
    }

    public final int hashCode() {
        return this.f9384b.hashCode() ^ ((this.f9383a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f9383a);
        sb.append(", value=");
        return AbstractC3393o1.m17738m(sb, this.f9384b, "}");
    }
}
