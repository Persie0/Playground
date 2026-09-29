package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f52368c;

    /* JADX INFO: renamed from: d */
    public final float f52369d;

    /* JADX INFO: renamed from: e */
    public final float f52370e;

    /* JADX INFO: renamed from: f */
    public final float f52371f;

    /* JADX INFO: renamed from: g */
    public final float f52372g;

    /* JADX INFO: renamed from: h */
    public final float f52373h;

    public n57(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f52368c = f;
        this.f52369d = f2;
        this.f52370e = f3;
        this.f52371f = f4;
        this.f52372g = f5;
        this.f52373h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n57)) {
            return false;
        }
        n57 n57Var = (n57) obj;
        return Float.compare(this.f52368c, n57Var.f52368c) == 0 && Float.compare(this.f52369d, n57Var.f52369d) == 0 && Float.compare(this.f52370e, n57Var.f52370e) == 0 && Float.compare(this.f52371f, n57Var.f52371f) == 0 && Float.compare(this.f52372g, n57Var.f52372g) == 0 && Float.compare(this.f52373h, n57Var.f52373h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52373h) + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f52368c) * 31, this.f52369d, 31), this.f52370e, 31), this.f52371f, 31), this.f52372g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f52368c);
        sb.append(", y1=");
        sb.append(this.f52369d);
        sb.append(", x2=");
        sb.append(this.f52370e);
        sb.append(", y2=");
        sb.append(this.f52371f);
        sb.append(", x3=");
        sb.append(this.f52372g);
        sb.append(", y3=");
        return AbstractC3393o1.m17737l(sb, this.f52373h, ')');
    }
}
