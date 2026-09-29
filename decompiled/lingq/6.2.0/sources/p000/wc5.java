package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wc5 implements sb3 {

    /* JADX INFO: renamed from: a */
    public final float f66617a;

    public wc5(float f) {
        this.f66617a = f;
    }

    @Override // p000.sb3
    /* JADX INFO: renamed from: a */
    public final float mo21205a(float f) {
        return f / this.f66617a;
    }

    @Override // p000.sb3
    /* JADX INFO: renamed from: b */
    public final float mo21206b(float f) {
        return f * this.f66617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc5) && Float.compare(this.f66617a, ((wc5) obj).f66617a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66617a);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f66617a, ')');
    }
}
