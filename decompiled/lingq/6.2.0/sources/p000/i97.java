package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i97 {

    /* JADX INFO: renamed from: a */
    public final g97 f43742a;

    /* JADX INFO: renamed from: b */
    public final a97 f43743b;

    public i97(g97 g97Var, a97 a97Var) {
        this.f43742a = g97Var;
        this.f43743b = a97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i97)) {
            return false;
        }
        i97 i97Var = (i97) obj;
        return fa4.m11650l(this.f43743b, i97Var.f43743b) && fa4.m11650l(this.f43742a, i97Var.f43742a);
    }

    public final int hashCode() {
        g97 g97Var = this.f43742a;
        int iHashCode = (g97Var != null ? g97Var.hashCode() : 0) * 31;
        a97 a97Var = this.f43743b;
        return iHashCode + (a97Var != null ? a97Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f43742a + ", paragraphSyle=" + this.f43743b + ')';
    }
}
