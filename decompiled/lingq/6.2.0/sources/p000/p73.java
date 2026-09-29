package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p73 {

    /* JADX INFO: renamed from: a */
    public final float f55689a;

    /* JADX INFO: renamed from: b */
    public final float f55690b;

    /* JADX INFO: renamed from: c */
    public final float f55691c;

    /* JADX INFO: renamed from: d */
    public final float f55692d;

    public p73(float f, float f2, float f3, float f4) {
        this.f55689a = f;
        this.f55690b = f2;
        this.f55691c = f3;
        this.f55692d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p73)) {
            return false;
        }
        p73 p73Var = (p73) obj;
        if (xj2.m24560b(this.f55689a, p73Var.f55689a) && xj2.m24560b(this.f55690b, p73Var.f55690b) && xj2.m24560b(this.f55691c, p73Var.f55691c)) {
            return xj2.m24560b(this.f55692d, p73Var.f55692d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f55692d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f55689a) * 31, this.f55690b, 31), this.f55691c, 31);
    }
}
