package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f63441c;

    /* JADX INFO: renamed from: d */
    public final float f63442d;

    /* JADX INFO: renamed from: e */
    public final float f63443e;

    /* JADX INFO: renamed from: f */
    public final boolean f63444f;

    /* JADX INFO: renamed from: g */
    public final boolean f63445g;

    /* JADX INFO: renamed from: h */
    public final float f63446h;

    /* JADX INFO: renamed from: i */
    public final float f63447i;

    public u57(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f63441c = f;
        this.f63442d = f2;
        this.f63443e = f3;
        this.f63444f = z;
        this.f63445g = z2;
        this.f63446h = f4;
        this.f63447i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u57)) {
            return false;
        }
        u57 u57Var = (u57) obj;
        return Float.compare(this.f63441c, u57Var.f63441c) == 0 && Float.compare(this.f63442d, u57Var.f63442d) == 0 && Float.compare(this.f63443e, u57Var.f63443e) == 0 && this.f63444f == u57Var.f63444f && this.f63445g == u57Var.f63445g && Float.compare(this.f63446h, u57Var.f63446h) == 0 && Float.compare(this.f63447i, u57Var.f63447i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f63447i) + wq1.m24105a(g9a.m12428e(g9a.m12428e(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f63441c) * 31, this.f63442d, 31), this.f63443e, 31), 31, this.f63444f), 31, this.f63445g), this.f63446h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f63441c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f63442d);
        sb.append(", theta=");
        sb.append(this.f63443e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f63444f);
        sb.append(", isPositiveArc=");
        sb.append(this.f63445g);
        sb.append(", arcStartDx=");
        sb.append(this.f63446h);
        sb.append(", arcStartDy=");
        return AbstractC3393o1.m17737l(sb, this.f63447i, ')');
    }
}
