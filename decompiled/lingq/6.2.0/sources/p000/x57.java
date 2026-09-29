package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f67782c;

    /* JADX INFO: renamed from: d */
    public final float f67783d;

    public x57(float f, float f2) {
        super(3);
        this.f67782c = f;
        this.f67783d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x57)) {
            return false;
        }
        x57 x57Var = (x57) obj;
        return Float.compare(this.f67782c, x57Var.f67782c) == 0 && Float.compare(this.f67783d, x57Var.f67783d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f67783d) + (Float.hashCode(this.f67782c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f67782c);
        sb.append(", dy=");
        return AbstractC3393o1.m17737l(sb, this.f67783d, ')');
    }
}
