package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jm8 {

    /* JADX INFO: renamed from: a */
    public final float f45835a;

    /* JADX INFO: renamed from: b */
    public final long f45836b;

    /* JADX INFO: renamed from: c */
    public final l43 f45837c;

    public jm8(float f, long j, l43 l43Var) {
        this.f45835a = f;
        this.f45836b = j;
        this.f45837c = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm8)) {
            return false;
        }
        jm8 jm8Var = (jm8) obj;
        return Float.compare(this.f45835a, jm8Var.f45835a) == 0 && k9a.m15025a(this.f45836b, jm8Var.f45836b) && fa4.m11650l(this.f45837c, jm8Var.f45837c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f45835a) * 31;
        int i = k9a.f46916c;
        return this.f45837c.hashCode() + ux5.m22981d(this.f45836b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f45835a + ", transformOrigin=" + ((Object) k9a.m15026b(this.f45836b)) + ", animationSpec=" + this.f45837c + ')';
    }
}
