package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t45 {

    /* JADX INFO: renamed from: a */
    public final float f61851a;

    /* JADX INFO: renamed from: b */
    public final float f61852b;

    /* JADX INFO: renamed from: c */
    public final int f61853c;

    /* JADX INFO: renamed from: d */
    public final int f61854d;

    /* JADX INFO: renamed from: e */
    public final int f61855e;

    /* JADX INFO: renamed from: f */
    public final int f61856f;

    public t45(float f, float f2, int i, int i2, int i3, int i4) {
        this.f61851a = f;
        this.f61852b = f2;
        this.f61853c = i;
        this.f61854d = i2;
        this.f61855e = i3;
        this.f61856f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t45)) {
            return false;
        }
        t45 t45Var = (t45) obj;
        return Float.compare(this.f61851a, t45Var.f61851a) == 0 && Float.compare(this.f61852b, t45Var.f61852b) == 0 && this.f61853c == t45Var.f61853c && this.f61854d == t45Var.f61854d && this.f61855e == t45Var.f61855e && this.f61856f == t45Var.f61856f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61856f) + wq1.m24106b(this.f61855e, wq1.m24106b(this.f61854d, wq1.m24106b(this.f61853c, wq1.m24105a(Float.hashCode(this.f61851a) * 31, this.f61852b, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonLayoutProperties(containerWidth=");
        sb.append(this.f61851a);
        sb.append(", containerHeight=");
        sb.append(this.f61852b);
        sb.append(", firstPageHeaderHeight=");
        hn1.m13360j(this.f61853c, this.f61854d, ", lessonCompleteButtonHeight=", ", horizontalPadding=", sb);
        sb.append(this.f61855e);
        sb.append(", verticalPadding=");
        sb.append(this.f61856f);
        sb.append(")");
        return sb.toString();
    }
}
