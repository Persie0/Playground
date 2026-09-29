package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final ud6 f66546b;

    public w96(ud6 ud6Var) {
        ud6Var.getClass();
        this.f66546b = ud6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w96) && fa4.m11650l(this.f66546b, ((w96) obj).f66546b);
    }

    public final int hashCode() {
        return this.f66546b.hashCode();
    }

    public final String toString() {
        return "FastSearch(navController=" + this.f66546b + ")";
    }
}
