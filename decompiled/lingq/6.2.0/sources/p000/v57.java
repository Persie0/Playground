package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f64887c;

    /* JADX INFO: renamed from: d */
    public final float f64888d;

    /* JADX INFO: renamed from: e */
    public final float f64889e;

    /* JADX INFO: renamed from: f */
    public final float f64890f;

    /* JADX INFO: renamed from: g */
    public final float f64891g;

    /* JADX INFO: renamed from: h */
    public final float f64892h;

    public v57(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f64887c = f;
        this.f64888d = f2;
        this.f64889e = f3;
        this.f64890f = f4;
        this.f64891g = f5;
        this.f64892h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v57)) {
            return false;
        }
        v57 v57Var = (v57) obj;
        return Float.compare(this.f64887c, v57Var.f64887c) == 0 && Float.compare(this.f64888d, v57Var.f64888d) == 0 && Float.compare(this.f64889e, v57Var.f64889e) == 0 && Float.compare(this.f64890f, v57Var.f64890f) == 0 && Float.compare(this.f64891g, v57Var.f64891g) == 0 && Float.compare(this.f64892h, v57Var.f64892h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64892h) + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f64887c) * 31, this.f64888d, 31), this.f64889e, 31), this.f64890f, 31), this.f64891g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f64887c);
        sb.append(", dy1=");
        sb.append(this.f64888d);
        sb.append(", dx2=");
        sb.append(this.f64889e);
        sb.append(", dy2=");
        sb.append(this.f64890f);
        sb.append(", dx3=");
        sb.append(this.f64891g);
        sb.append(", dy3=");
        return AbstractC3393o1.m17737l(sb, this.f64892h, ')');
    }
}
