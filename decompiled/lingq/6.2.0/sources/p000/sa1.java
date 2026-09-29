package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class sa1 {

    /* JADX INFO: renamed from: a */
    public final String f60574a;

    /* JADX INFO: renamed from: b */
    public final long f60575b;

    /* JADX INFO: renamed from: c */
    public final int f60576c;

    public sa1(String str, int i, long j) {
        this.f60574a = str;
        this.f60575b = j;
        this.f60576c = i;
        if (str.length() == 0) {
            C3386nv.m17626m("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C3386nv.m17626m("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo1400a(int i);

    /* JADX INFO: renamed from: b */
    public abstract float mo1401b(int i);

    /* JADX INFO: renamed from: c */
    public boolean mo1402c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo1403d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    public abstract float mo1404e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sa1 sa1Var = (sa1) obj;
        if (this.f60576c == sa1Var.f60576c && this.f60574a.equals(sa1Var.f60574a)) {
            return b34.m3243i(this.f60575b, sa1Var.f60575b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo1405f(float f, float f2, float f3, float f4, sa1 sa1Var);

    public int hashCode() {
        return ux5.m22981d(this.f60575b, this.f60574a.hashCode() * 31, 31) + this.f60576c;
    }

    public final String toString() {
        return this.f60574a + " (id=" + this.f60576c + ", model=" + ((Object) b34.m3229Z(this.f60575b)) + ')';
    }
}
