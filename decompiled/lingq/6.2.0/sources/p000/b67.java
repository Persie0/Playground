package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b67 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f8016c;

    /* JADX INFO: renamed from: d */
    public final float f8017d;

    public b67(float f, float f2) {
        super(1);
        this.f8016c = f;
        this.f8017d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b67)) {
            return false;
        }
        b67 b67Var = (b67) obj;
        return Float.compare(this.f8016c, b67Var.f8016c) == 0 && Float.compare(this.f8017d, b67Var.f8017d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8017d) + (Float.hashCode(this.f8016c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f8016c);
        sb.append(", dy=");
        return AbstractC3393o1.m17737l(sb, this.f8017d, ')');
    }
}
