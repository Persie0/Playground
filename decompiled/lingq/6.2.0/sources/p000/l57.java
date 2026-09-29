package p000;

/* JADX INFO: loaded from: classes.dex */
public final class l57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f49085c;

    /* JADX INFO: renamed from: d */
    public final float f49086d;

    /* JADX INFO: renamed from: e */
    public final float f49087e;

    /* JADX INFO: renamed from: f */
    public final boolean f49088f;

    /* JADX INFO: renamed from: g */
    public final boolean f49089g;

    /* JADX INFO: renamed from: h */
    public final float f49090h;

    /* JADX INFO: renamed from: i */
    public final float f49091i;

    public l57(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f49085c = f;
        this.f49086d = f2;
        this.f49087e = f3;
        this.f49088f = z;
        this.f49089g = z2;
        this.f49090h = f4;
        this.f49091i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l57)) {
            return false;
        }
        l57 l57Var = (l57) obj;
        return Float.compare(this.f49085c, l57Var.f49085c) == 0 && Float.compare(this.f49086d, l57Var.f49086d) == 0 && Float.compare(this.f49087e, l57Var.f49087e) == 0 && this.f49088f == l57Var.f49088f && this.f49089g == l57Var.f49089g && Float.compare(this.f49090h, l57Var.f49090h) == 0 && Float.compare(this.f49091i, l57Var.f49091i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49091i) + wq1.m24105a(g9a.m12428e(g9a.m12428e(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f49085c) * 31, this.f49086d, 31), this.f49087e, 31), 31, this.f49088f), 31, this.f49089g), this.f49090h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f49085c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f49086d);
        sb.append(", theta=");
        sb.append(this.f49087e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f49088f);
        sb.append(", isPositiveArc=");
        sb.append(this.f49089g);
        sb.append(", arcStartX=");
        sb.append(this.f49090h);
        sb.append(", arcStartY=");
        return AbstractC3393o1.m17737l(sb, this.f49091i, ')');
    }
}
