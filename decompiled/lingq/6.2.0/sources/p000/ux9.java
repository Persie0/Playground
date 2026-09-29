package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ux9 {

    /* JADX INFO: renamed from: a */
    public final oa1 f64490a;

    /* JADX INFO: renamed from: b */
    public final zx9 f64491b;

    /* JADX INFO: renamed from: c */
    public final ac3 f64492c;

    public ux9(oa1 oa1Var, zx9 zx9Var, ac3 ac3Var, int i) {
        zx9Var = (i & 2) != 0 ? null : zx9Var;
        ac3Var = (i & 4) != 0 ? null : ac3Var;
        this.f64490a = oa1Var;
        this.f64491b = zx9Var;
        this.f64492c = ac3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux9)) {
            return false;
        }
        ux9 ux9Var = (ux9) obj;
        return fa4.m11650l(this.f64490a, ux9Var.f64490a) && fa4.m11650l(this.f64491b, ux9Var.f64491b) && fa4.m11650l(this.f64492c, ux9Var.f64492c);
    }

    public final int hashCode() {
        int iHashCode = this.f64490a.hashCode() * 31;
        zx9 zx9Var = this.f64491b;
        int iHashCode2 = (iHashCode + (zx9Var != null ? zx9Var.hashCode() : 0)) * 31;
        ac3 ac3Var = this.f64492c;
        return (iHashCode2 + (ac3Var != null ? ac3Var.hashCode() : 0)) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f64490a + ", fontSize=" + this.f64491b + ", fontWeight=" + this.f64492c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
