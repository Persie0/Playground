package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f69322c;

    /* JADX INFO: renamed from: d */
    public final float f69323d;

    public y57(float f, float f2) {
        super(3);
        this.f69322c = f;
        this.f69323d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y57)) {
            return false;
        }
        y57 y57Var = (y57) obj;
        return Float.compare(this.f69322c, y57Var.f69322c) == 0 && Float.compare(this.f69323d, y57Var.f69323d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f69323d) + (Float.hashCode(this.f69322c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f69322c);
        sb.append(", dy=");
        return AbstractC3393o1.m17737l(sb, this.f69323d, ')');
    }
}
