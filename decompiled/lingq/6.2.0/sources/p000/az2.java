package p000;

/* JADX INFO: loaded from: classes.dex */
public final class az2 {

    /* JADX INFO: renamed from: a */
    public final float f7685a;

    /* JADX INFO: renamed from: b */
    public final l43 f7686b;

    public az2(float f, l43 l43Var) {
        this.f7685a = f;
        this.f7686b = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        return Float.compare(this.f7685a, az2Var.f7685a) == 0 && fa4.m11650l(this.f7686b, az2Var.f7686b);
    }

    public final int hashCode() {
        return this.f7686b.hashCode() + (Float.hashCode(this.f7685a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f7685a + ", animationSpec=" + this.f7686b + ')';
    }
}
