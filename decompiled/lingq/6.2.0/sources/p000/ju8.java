package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ju8 {

    /* JADX INFO: renamed from: a */
    public final float f46167a;

    /* JADX INFO: renamed from: b */
    public final float f46168b;

    public ju8(float f, float f2) {
        this.f46167a = f;
        this.f46168b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ju8)) {
            return false;
        }
        return xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(this.f46167a, ((ju8) obj).f46167a) && xj2.m24560b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31), this.f46167a, 31);
    }
}
