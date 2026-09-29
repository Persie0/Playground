package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y63 {

    /* JADX INFO: renamed from: a */
    public final float f69362a;

    /* JADX INFO: renamed from: b */
    public final float f69363b;

    /* JADX INFO: renamed from: c */
    public final long f69364c;

    public y63(float f, float f2, long j) {
        this.f69362a = f;
        this.f69363b = f2;
        this.f69364c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y63)) {
            return false;
        }
        y63 y63Var = (y63) obj;
        return Float.compare(this.f69362a, y63Var.f69362a) == 0 && Float.compare(this.f69363b, y63Var.f69363b) == 0 && this.f69364c == y63Var.f69364c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69364c) + wq1.m24105a(Float.hashCode(this.f69362a) * 31, this.f69363b, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f69362a + ", distance=" + this.f69363b + ", duration=" + this.f69364c + ')';
    }
}
