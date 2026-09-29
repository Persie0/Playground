package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 {

    /* JADX INFO: renamed from: a */
    public final float f68278a;

    /* JADX INFO: renamed from: b */
    public final float f68279b;

    public xj0(float f, float f2) {
        this.f68278a = f;
        this.f68279b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xj0)) {
            return false;
        }
        xj0 xj0Var = (xj0) obj;
        return xj2.m24560b(this.f68278a, xj0Var.f68278a) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(this.f68279b, xj0Var.f68279b) && xj2.m24560b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f68278a) * 31, 0.0f, 31), 0.0f, 31), this.f68279b, 31);
    }
}
