package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i4b {

    /* JADX INFO: renamed from: a */
    public final float f43526a;

    /* JADX INFO: renamed from: b */
    public final float f43527b;

    public i4b(float f, float f2) {
        this.f43526a = f;
        this.f43527b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m13658a() {
        float f = this.f43526a;
        float f2 = this.f43527b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4b)) {
            return false;
        }
        i4b i4bVar = (i4b) obj;
        return Float.compare(this.f43526a, i4bVar.f43526a) == 0 && Float.compare(this.f43527b, i4bVar.f43527b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43527b) + (Float.hashCode(this.f43526a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f43526a);
        sb.append(", y=");
        return AbstractC3393o1.m17737l(sb, this.f43527b, ')');
    }
}
