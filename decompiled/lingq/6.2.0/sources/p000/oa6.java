package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class oa6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final ud6 f54101b;

    public oa6(ud6 ud6Var) {
        ud6Var.getClass();
        this.f54101b = ud6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa6) && fa4.m11650l(this.f54101b, ((oa6) obj).f54101b);
    }

    public final int hashCode() {
        return this.f54101b.hashCode();
    }

    public final String toString() {
        return "Statistics(navController=" + this.f54101b + ")";
    }
}
