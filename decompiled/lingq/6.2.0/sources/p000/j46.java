package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j46 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final float f45042a;

    /* JADX INFO: renamed from: b */
    public final float f45043b;

    public j46(float f, float f2) {
        bna.m3967p("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f45042a = f;
        this.f45043b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j46.class == obj.getClass()) {
            j46 j46Var = (j46) obj;
            if (this.f45042a == j46Var.f45042a && this.f45043b == j46Var.f45043b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f45043b).hashCode() + ((Float.valueOf(this.f45042a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f45042a + ", longitude=" + this.f45043b;
    }
}
