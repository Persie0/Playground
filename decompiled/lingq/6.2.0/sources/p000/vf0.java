package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 {

    /* JADX INFO: renamed from: a */
    public final float f65300a;

    /* JADX INFO: renamed from: b */
    public final pd9 f65301b;

    public vf0(float f, pd9 pd9Var) {
        this.f65300a = f;
        this.f65301b = pd9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0)) {
            return false;
        }
        vf0 vf0Var = (vf0) obj;
        return xj2.m24560b(this.f65300a, vf0Var.f65300a) && this.f65301b.equals(vf0Var.f65301b);
    }

    public final int hashCode() {
        return this.f65301b.hashCode() + (Float.hashCode(this.f65300a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) xj2.m24561c(this.f65300a)) + ", brush=" + this.f65301b + ')';
    }
}
