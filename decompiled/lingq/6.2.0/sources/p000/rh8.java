package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rh8 implements w34 {

    /* JADX INFO: renamed from: a */
    public final boolean f59314a;

    /* JADX INFO: renamed from: b */
    public final float f59315b;

    /* JADX INFO: renamed from: c */
    public final long f59316c;

    /* JADX INFO: renamed from: d */
    public final o39 f59317d;

    /* JADX INFO: renamed from: e */
    public final boolean f59318e;

    /* JADX INFO: renamed from: f */
    public final boolean f59319f;

    /* JADX INFO: renamed from: g */
    public final boolean f59320g;

    /* JADX INFO: renamed from: h */
    public final boolean f59321h;

    public rh8(boolean z, float f, long j, o39 o39Var, boolean z2) {
        if (o39Var == null) {
            xj2 xj2Var = xj2.m24560b(f, Float.NaN) ? null : new xj2(f);
            o39Var = xj2Var != null ? ui8.m22753b(xj2Var.f68285a) : null;
            if (o39Var == null) {
                o39Var = ss5.f61356d;
            }
        }
        this.f59314a = z;
        this.f59315b = f;
        this.f59316c = j;
        this.f59317d = o39Var;
        this.f59318e = true;
        this.f59319f = z2;
        this.f59320g = true;
        this.f59321h = true;
    }

    @Override // p000.w34
    /* JADX INFO: renamed from: a */
    public final ea2 mo20662a(v56 v56Var) {
        return new ta2(v56Var, this.f59314a, this.f59315b, new or3(this), this.f59317d, this.f59318e, this.f59319f, this.f59320g, this.f59321h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh8)) {
            return false;
        }
        rh8 rh8Var = (rh8) obj;
        return this.f59314a == rh8Var.f59314a && xj2.m24560b(this.f59315b, rh8Var.f59315b) && aa1.m199c(this.f59316c, rh8Var.f59316c) && fa4.m11650l(this.f59317d, rh8Var.f59317d) && this.f59318e == rh8Var.f59318e && this.f59319f == rh8Var.f59319f && this.f59320g == rh8Var.f59320g && this.f59321h == rh8Var.f59321h;
    }

    @Override // p000.w34
    public final int hashCode() {
        int iM24105a = wq1.m24105a(Boolean.hashCode(this.f59314a) * 31, this.f59315b, 961);
        int i = aa1.f413l;
        return Boolean.hashCode(this.f59321h) + g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f59317d.hashCode() + ux5.m22981d(this.f59316c, iM24105a, 31)) * 31, 31, this.f59318e), 31, this.f59319f), 31, this.f59320g);
    }
}
