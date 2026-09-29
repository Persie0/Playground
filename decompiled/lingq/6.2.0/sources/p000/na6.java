package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class na6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final ud6 f52538b;

    public na6(ud6 ud6Var) {
        ud6Var.getClass();
        this.f52538b = ud6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na6) && fa4.m11650l(this.f52538b, ((na6) obj).f52538b);
    }

    public final int hashCode() {
        return this.f52538b.hashCode();
    }

    public final String toString() {
        return "Settings(navController=" + this.f52538b + ")";
    }
}
