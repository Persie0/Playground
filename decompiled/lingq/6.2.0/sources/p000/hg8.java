package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hg8 {

    /* JADX INFO: renamed from: a */
    public final pg8 f42326a;

    /* JADX INFO: renamed from: b */
    public final be8 f42327b;

    /* JADX INFO: renamed from: c */
    public final cd8 f42328c;

    /* JADX INFO: renamed from: d */
    public final ad8 f42329d;

    /* JADX INFO: renamed from: e */
    public final boolean f42330e;

    /* JADX INFO: renamed from: f */
    public final gd8 f42331f;

    /* JADX INFO: renamed from: g */
    public final xd8 f42332g;

    /* JADX INFO: renamed from: h */
    public final ce8 f42333h;

    /* JADX INFO: renamed from: i */
    public final rg8 f42334i;

    public hg8(pg8 pg8Var, be8 be8Var, cd8 cd8Var, ad8 ad8Var, boolean z, gd8 gd8Var, xd8 xd8Var, ce8 ce8Var, rg8 rg8Var) {
        ad8Var.getClass();
        this.f42326a = pg8Var;
        this.f42327b = be8Var;
        this.f42328c = cd8Var;
        this.f42329d = ad8Var;
        this.f42330e = z;
        this.f42331f = gd8Var;
        this.f42332g = xd8Var;
        this.f42333h = ce8Var;
        this.f42334i = rg8Var;
    }

    /* JADX INFO: renamed from: a */
    public static hg8 m13232a(hg8 hg8Var, be8 be8Var, cd8 cd8Var, ad8 ad8Var, boolean z, gd8 gd8Var, xd8 xd8Var, ce8 ce8Var, rg8 rg8Var, int i) {
        be8 be8Var2 = be8Var;
        pg8 pg8Var = hg8Var.f42326a;
        if ((i & 2) != 0) {
            be8Var2 = hg8Var.f42327b;
        }
        if ((i & 4) != 0) {
            cd8Var = hg8Var.f42328c;
        }
        if ((i & 8) != 0) {
            ad8Var = hg8Var.f42329d;
        }
        if ((i & 16) != 0) {
            z = hg8Var.f42330e;
        }
        if ((i & 32) != 0) {
            gd8Var = hg8Var.f42331f;
        }
        if ((i & 64) != 0) {
            xd8Var = hg8Var.f42332g;
        }
        if ((i & 128) != 0) {
            ce8Var = hg8Var.f42333h;
        }
        if ((i & 256) != 0) {
            rg8Var = hg8Var.f42334i;
        }
        rg8 rg8Var2 = rg8Var;
        hg8Var.getClass();
        cd8Var.getClass();
        ad8Var.getClass();
        ce8 ce8Var2 = ce8Var;
        xd8 xd8Var2 = xd8Var;
        gd8 gd8Var2 = gd8Var;
        boolean z2 = z;
        ad8 ad8Var2 = ad8Var;
        return new hg8(pg8Var, be8Var2, cd8Var, ad8Var2, z2, gd8Var2, xd8Var2, ce8Var2, rg8Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg8)) {
            return false;
        }
        hg8 hg8Var = (hg8) obj;
        return this.f42326a.equals(hg8Var.f42326a) && this.f42327b.equals(hg8Var.f42327b) && this.f42328c.equals(hg8Var.f42328c) && fa4.m11650l(this.f42329d, hg8Var.f42329d) && this.f42330e == hg8Var.f42330e && fa4.m11650l(this.f42331f, hg8Var.f42331f) && fa4.m11650l(this.f42332g, hg8Var.f42332g) && fa4.m11650l(this.f42333h, hg8Var.f42333h) && fa4.m11650l(this.f42334i, hg8Var.f42334i);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f42329d.hashCode() + ((this.f42328c.hashCode() + ((this.f42327b.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31)) * 31, 31, this.f42330e);
        gd8 gd8Var = this.f42331f;
        int iHashCode = (iM12428e + (gd8Var == null ? 0 : gd8Var.hashCode())) * 31;
        xd8 xd8Var = this.f42332g;
        int iHashCode2 = (iHashCode + (xd8Var == null ? 0 : xd8Var.hashCode())) * 31;
        ce8 ce8Var = this.f42333h;
        int iHashCode3 = (iHashCode2 + (ce8Var == null ? 0 : ce8Var.hashCode())) * 31;
        rg8 rg8Var = this.f42334i;
        return iHashCode3 + (rg8Var != null ? rg8Var.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewState(toolbar=" + this.f42326a + ", progress=" + this.f42327b + ", controls=" + this.f42328c + ", content=" + this.f42329d + ", isContentLoading=" + this.f42330e + ", dialog=" + this.f42331f + ", navigation=" + this.f42332g + ", resultOverlay=" + this.f42333h + ", unscrambleOverlay=" + this.f42334i + ")";
    }
}
