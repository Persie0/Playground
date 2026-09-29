package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f61878c;

    /* JADX INFO: renamed from: d */
    public final float f61879d;

    public t57(float f, float f2) {
        super(1);
        this.f61878c = f;
        this.f61879d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t57)) {
            return false;
        }
        t57 t57Var = (t57) obj;
        return Float.compare(this.f61878c, t57Var.f61878c) == 0 && Float.compare(this.f61879d, t57Var.f61879d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61879d) + (Float.hashCode(this.f61878c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f61878c);
        sb.append(", y=");
        return AbstractC3393o1.m17737l(sb, this.f61879d, ')');
    }
}
