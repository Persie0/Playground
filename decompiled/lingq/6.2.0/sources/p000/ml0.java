package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 {

    /* JADX INFO: renamed from: a */
    public final qw9 f51464a;

    public ml0(qw9 qw9Var) {
        this.f51464a = qw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        qw9 qw9Var = this.f51464a;
        C3419on c3419on = qw9Var.f58295a;
        qw9 qw9Var2 = ((ml0) obj).f51464a;
        return fa4.m11650l(c3419on, qw9Var2.f58295a) && qw9Var.f58296b.m23587d(qw9Var2.f58296b) && fa4.m11650l(qw9Var.f58297c, qw9Var2.f58297c) && qw9Var.f58298d == qw9Var2.f58298d && qw9Var.f58299e == qw9Var2.f58299e && qw9Var.f58300f == qw9Var2.f58300f && fa4.m11650l(qw9Var.f58301g, qw9Var2.f58301g) && qw9Var.f58302h == qw9Var2.f58302h && qw9Var.f58303i == qw9Var2.f58303i && bk1.m3795c(qw9Var.f58304j, qw9Var2.f58304j);
    }

    public final int hashCode() {
        qw9 qw9Var = this.f51464a;
        int iHashCode = qw9Var.f58295a.hashCode() * 31;
        vx9 vx9Var = qw9Var.f58296b;
        he9 he9Var = vx9Var.f66065a;
        long j = he9Var.f42265b;
        ay9[] ay9VarArr = zx9.f72358b;
        int iHashCode2 = Long.hashCode(j) * 31;
        bc3 bc3Var = he9Var.f42266c;
        int i = (iHashCode2 + (bc3Var != null ? bc3Var.f8327a : 0)) * 31;
        wb3 wb3Var = he9Var.f42267d;
        int iHashCode3 = (i + (wb3Var != null ? Integer.hashCode(wb3Var.f66583a) : 0)) * 31;
        xb3 xb3Var = he9Var.f42268e;
        int iHashCode4 = (iHashCode3 + (xb3Var != null ? Integer.hashCode(xb3Var.f68021a) : 0)) * 31;
        xa3 xa3Var = he9Var.f42269f;
        int iHashCode5 = (iHashCode4 + (xa3Var != null ? xa3Var.hashCode() : 0)) * 31;
        String str = he9Var.f42270g;
        int iM22981d = ux5.m22981d(he9Var.f42271h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        oa0 oa0Var = he9Var.f42272i;
        int iHashCode6 = (iM22981d + (oa0Var != null ? Float.hashCode(oa0Var.f54096a) : 0)) * 31;
        yv9 yv9Var = he9Var.f42273j;
        int iHashCode7 = (iHashCode6 + (yv9Var != null ? yv9Var.hashCode() : 0)) * 31;
        xi5 xi5Var = he9Var.f42274k;
        int iHashCode8 = (iHashCode7 + (xi5Var != null ? xi5Var.f68251a.hashCode() : 0)) * 31;
        long j2 = he9Var.f42275l;
        int i2 = aa1.f413l;
        int iM22981d2 = ux5.m22981d(j2, iHashCode8, 31);
        g97 g97Var = he9Var.f42278o;
        int iHashCode9 = (vx9Var.f66066b.hashCode() + ((iM22981d2 + (g97Var != null ? g97Var.hashCode() : 0)) * 31)) * 31;
        i97 i97Var = vx9Var.f66067c;
        return Long.hashCode(qw9Var.f58304j) + ((qw9Var.f58303i.hashCode() + ((qw9Var.f58302h.hashCode() + ((qw9Var.f58301g.hashCode() + wq1.m24106b(qw9Var.f58300f, g9a.m12428e((ux5.m22979b((iHashCode9 + (i97Var != null ? i97Var.hashCode() : 0) + iHashCode) * 31, 31, qw9Var.f58297c) + qw9Var.f58298d) * 31, 31, qw9Var.f58299e), 31)) * 31)) * 31)) * 31);
    }
}
