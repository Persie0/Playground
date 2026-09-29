package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f70953c;

    /* JADX INFO: renamed from: d */
    public final float f70954d;

    /* JADX INFO: renamed from: e */
    public final float f70955e;

    /* JADX INFO: renamed from: f */
    public final float f70956f;

    public z57(float f, float f2, float f3, float f4) {
        super(1);
        this.f70953c = f;
        this.f70954d = f2;
        this.f70955e = f3;
        this.f70956f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z57)) {
            return false;
        }
        z57 z57Var = (z57) obj;
        return Float.compare(this.f70953c, z57Var.f70953c) == 0 && Float.compare(this.f70954d, z57Var.f70954d) == 0 && Float.compare(this.f70955e, z57Var.f70955e) == 0 && Float.compare(this.f70956f, z57Var.f70956f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f70956f) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f70953c) * 31, this.f70954d, 31), this.f70955e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f70953c);
        sb.append(", dy1=");
        sb.append(this.f70954d);
        sb.append(", dx2=");
        sb.append(this.f70955e);
        sb.append(", dy2=");
        return AbstractC3393o1.m17737l(sb, this.f70956f, ')');
    }
}
