package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class av0 {

    /* JADX INFO: renamed from: a */
    public final float f7544a;

    /* JADX INFO: renamed from: b */
    public final float f7545b;

    /* JADX INFO: renamed from: c */
    public final float f7546c;

    /* JADX INFO: renamed from: d */
    public final float f7547d;

    /* JADX INFO: renamed from: e */
    public final float f7548e;

    /* JADX INFO: renamed from: f */
    public final float f7549f;

    /* JADX INFO: renamed from: g */
    public final float f7550g;

    public av0(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f7544a = f;
        this.f7545b = f2;
        this.f7546c = f3;
        this.f7547d = f4;
        this.f7548e = f5;
        this.f7549f = f6;
        this.f7550g = f7;
    }

    /* JADX INFO: renamed from: a */
    public final float m3079a() {
        return (this.f7545b - this.f7548e) - this.f7549f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av0)) {
            return false;
        }
        av0 av0Var = (av0) obj;
        return Float.compare(this.f7544a, av0Var.f7544a) == 0 && Float.compare(this.f7545b, av0Var.f7545b) == 0 && Float.compare(this.f7546c, av0Var.f7546c) == 0 && Float.compare(this.f7547d, av0Var.f7547d) == 0 && Float.compare(this.f7548e, av0Var.f7548e) == 0 && Float.compare(this.f7549f, av0Var.f7549f) == 0 && Float.compare(this.f7550g, av0Var.f7550g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7550g) + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f7544a) * 31, this.f7545b, 31), this.f7546c, 31), this.f7547d, 31), this.f7548e, 31), this.f7549f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartGeometry(widthPx=");
        sb.append(this.f7544a);
        sb.append(", heightPx=");
        sb.append(this.f7545b);
        sb.append(", leftPaddingPx=");
        sb.append(this.f7546c);
        sb.append(", rightPaddingPx=");
        sb.append(this.f7547d);
        sb.append(", topPaddingPx=");
        sb.append(this.f7548e);
        sb.append(", bottomPaddingPx=");
        sb.append(this.f7549f);
        sb.append(", imageSizePx=");
        return wq1.m24121q(sb, this.f7550g, ")");
    }
}
