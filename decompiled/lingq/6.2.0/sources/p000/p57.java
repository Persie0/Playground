package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f55599c;

    /* JADX INFO: renamed from: d */
    public final float f55600d;

    public p57(float f, float f2) {
        super(3);
        this.f55599c = f;
        this.f55600d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        p57 p57Var = (p57) obj;
        return Float.compare(this.f55599c, p57Var.f55599c) == 0 && Float.compare(this.f55600d, p57Var.f55600d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f55600d) + (Float.hashCode(this.f55599c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f55599c);
        sb.append(", y=");
        return AbstractC3393o1.m17737l(sb, this.f55600d, ')');
    }
}
