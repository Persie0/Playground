package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a67 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f293c;

    /* JADX INFO: renamed from: d */
    public final float f294d;

    /* JADX INFO: renamed from: e */
    public final float f295e;

    /* JADX INFO: renamed from: f */
    public final float f296f;

    public a67(float f, float f2, float f3, float f4) {
        super(2);
        this.f293c = f;
        this.f294d = f2;
        this.f295e = f3;
        this.f296f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a67)) {
            return false;
        }
        a67 a67Var = (a67) obj;
        return Float.compare(this.f293c, a67Var.f293c) == 0 && Float.compare(this.f294d, a67Var.f294d) == 0 && Float.compare(this.f295e, a67Var.f295e) == 0 && Float.compare(this.f296f, a67Var.f296f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f296f) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f293c) * 31, this.f294d, 31), this.f295e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f293c);
        sb.append(", dy1=");
        sb.append(this.f294d);
        sb.append(", dx2=");
        sb.append(this.f295e);
        sb.append(", dy2=");
        return AbstractC3393o1.m17737l(sb, this.f296f, ')');
    }
}
