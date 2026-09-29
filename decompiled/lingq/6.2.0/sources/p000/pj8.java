package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pj8 {

    /* JADX INFO: renamed from: a */
    public float f56321a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f56322b = true;

    /* JADX INFO: renamed from: c */
    public d32 f56323c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj8)) {
            return false;
        }
        pj8 pj8Var = (pj8) obj;
        return Float.compare(this.f56321a, pj8Var.f56321a) == 0 && this.f56322b == pj8Var.f56322b && fa4.m11650l(this.f56323c, pj8Var.f56323c);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Float.hashCode(this.f56321a) * 31, 31, this.f56322b);
        d32 d32Var = this.f56323c;
        return (iM12428e + (d32Var == null ? 0 : d32Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f56321a + ", fill=" + this.f56322b + ", crossAxisAlignment=" + this.f56323c + ", flowLayoutData=null)";
    }
}
