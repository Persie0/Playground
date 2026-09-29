package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f60383c;

    /* JADX INFO: renamed from: d */
    public final float f60384d;

    /* JADX INFO: renamed from: e */
    public final float f60385e;

    /* JADX INFO: renamed from: f */
    public final float f60386f;

    public s57(float f, float f2, float f3, float f4) {
        super(2);
        this.f60383c = f;
        this.f60384d = f2;
        this.f60385e = f3;
        this.f60386f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s57)) {
            return false;
        }
        s57 s57Var = (s57) obj;
        return Float.compare(this.f60383c, s57Var.f60383c) == 0 && Float.compare(this.f60384d, s57Var.f60384d) == 0 && Float.compare(this.f60385e, s57Var.f60385e) == 0 && Float.compare(this.f60386f, s57Var.f60386f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f60386f) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f60383c) * 31, this.f60384d, 31), this.f60385e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f60383c);
        sb.append(", y1=");
        sb.append(this.f60384d);
        sb.append(", x2=");
        sb.append(this.f60385e);
        sb.append(", y2=");
        return AbstractC3393o1.m17737l(sb, this.f60386f, ')');
    }
}
