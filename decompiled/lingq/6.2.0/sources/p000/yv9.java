package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yv9 {

    /* JADX INFO: renamed from: c */
    public static final yv9 f70559c = new yv9(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f70560a;

    /* JADX INFO: renamed from: b */
    public final float f70561b;

    public yv9(float f, float f2) {
        this.f70560a = f;
        this.f70561b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv9)) {
            return false;
        }
        yv9 yv9Var = (yv9) obj;
        return this.f70560a == yv9Var.f70560a && this.f70561b == yv9Var.f70561b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f70561b) + (Float.hashCode(this.f70560a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f70560a);
        sb.append(", skewX=");
        return AbstractC3393o1.m17737l(sb, this.f70561b, ')');
    }
}
