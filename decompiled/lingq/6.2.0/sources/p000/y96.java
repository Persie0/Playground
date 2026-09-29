package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final ud6 f69512b;

    public y96(ud6 ud6Var) {
        ud6Var.getClass();
        this.f69512b = ud6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y96) && fa4.m11650l(this.f69512b, ((y96) obj).f69512b);
    }

    public final int hashCode() {
        return this.f69512b.hashCode();
    }

    public final String toString() {
        return "ImportLesson(navController=" + this.f69512b + ")";
    }
}
