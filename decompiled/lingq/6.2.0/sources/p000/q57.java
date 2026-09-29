package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f57294c;

    /* JADX INFO: renamed from: d */
    public final float f57295d;

    public q57(float f, float f2) {
        super(3);
        this.f57294c = f;
        this.f57295d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q57)) {
            return false;
        }
        q57 q57Var = (q57) obj;
        return Float.compare(this.f57294c, q57Var.f57294c) == 0 && Float.compare(this.f57295d, q57Var.f57295d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57295d) + (Float.hashCode(this.f57294c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f57294c);
        sb.append(", y=");
        return AbstractC3393o1.m17737l(sb, this.f57295d, ')');
    }
}
