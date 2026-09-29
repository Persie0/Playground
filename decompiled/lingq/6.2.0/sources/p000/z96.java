package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class z96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final ud6 f71226b;

    public z96(ud6 ud6Var) {
        ud6Var.getClass();
        this.f71226b = ud6Var;
    }

    /* JADX INFO: renamed from: a */
    public final ud6 m25513a() {
        return this.f71226b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z96) && fa4.m11650l(this.f71226b, ((z96) obj).f71226b);
    }

    public final int hashCode() {
        return this.f71226b.hashCode();
    }

    public final String toString() {
        return "InviteFriends(navController=" + this.f71226b + ")";
    }
}
