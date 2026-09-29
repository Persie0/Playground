package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gs5 {

    /* JADX INFO: renamed from: a */
    public final long f41265a;

    /* JADX INFO: renamed from: b */
    public final en1 f41266b;

    public gs5(long j, en1 en1Var) {
        this.f41265a = j;
        this.f41266b = en1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs5)) {
            return false;
        }
        gs5 gs5Var = (gs5) obj;
        return gq6.m12821b(this.f41265a, gs5Var.f41265a) && fa4.m11650l(this.f41266b, gs5Var.f41266b);
    }

    public final int hashCode() {
        return this.f41266b.hashCode() + (Long.hashCode(this.f41265a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) gq6.m12827h(this.f41265a)) + ", r=" + this.f41266b + ')';
    }
}
