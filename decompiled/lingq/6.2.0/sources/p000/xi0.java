package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements xv9 {

    /* JADX INFO: renamed from: a */
    public final i39 f68231a;

    /* JADX INFO: renamed from: b */
    public final float f68232b;

    public xi0(i39 i39Var, float f) {
        this.f68231a = i39Var;
        this.f68232b = f;
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: a */
    public final long mo24173a() {
        int i = aa1.f413l;
        return aa1.f412k;
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: b */
    public final vi0 mo24174b() {
        return this.f68231a;
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: c */
    public final float mo24175c() {
        return this.f68232b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        return fa4.m11650l(this.f68231a, xi0Var.f68231a) && Float.compare(this.f68232b, xi0Var.f68232b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f68232b) + (this.f68231a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f68231a);
        sb.append(", alpha=");
        return AbstractC3393o1.m17737l(sb, this.f68232b, ')');
    }
}
