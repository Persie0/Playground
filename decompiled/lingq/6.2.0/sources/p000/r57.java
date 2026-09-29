package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f58767c;

    /* JADX INFO: renamed from: d */
    public final float f58768d;

    /* JADX INFO: renamed from: e */
    public final float f58769e;

    /* JADX INFO: renamed from: f */
    public final float f58770f;

    public r57(float f, float f2, float f3, float f4) {
        super(1);
        this.f58767c = f;
        this.f58768d = f2;
        this.f58769e = f3;
        this.f58770f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r57)) {
            return false;
        }
        r57 r57Var = (r57) obj;
        return Float.compare(this.f58767c, r57Var.f58767c) == 0 && Float.compare(this.f58768d, r57Var.f58768d) == 0 && Float.compare(this.f58769e, r57Var.f58769e) == 0 && Float.compare(this.f58770f, r57Var.f58770f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58770f) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f58767c) * 31, this.f58768d, 31), this.f58769e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f58767c);
        sb.append(", y1=");
        sb.append(this.f58768d);
        sb.append(", x2=");
        sb.append(this.f58769e);
        sb.append(", y2=");
        return AbstractC3393o1.m17737l(sb, this.f58770f, ')');
    }
}
