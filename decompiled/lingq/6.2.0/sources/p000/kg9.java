package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kg9 {

    /* JADX INFO: renamed from: a */
    public final float f47255a;

    public kg9(float f) {
        this.f47255a = f;
        if (xj2.m24559a(f, 0.0f) > 0) {
            return;
        }
        l54.m15814a("invalid minSize");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kg9) {
            return xj2.m24560b(this.f47255a, ((kg9) obj).f47255a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47255a);
    }
}
