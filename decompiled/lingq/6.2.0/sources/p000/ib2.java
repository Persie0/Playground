package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 implements fb2 {

    /* JADX INFO: renamed from: a */
    public final float f43885a;

    /* JADX INFO: renamed from: b */
    public final float f43886b;

    public ib2(float f, float f2) {
        this.f43885a = f;
        this.f43886b = f2;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f43885a;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f43886b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return Float.compare(this.f43885a, ib2Var.f43885a) == 0 && Float.compare(this.f43886b, ib2Var.f43886b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43886b) + (Float.hashCode(this.f43885a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f43885a);
        sb.append(", fontScale=");
        return AbstractC3393o1.m17737l(sb, this.f43886b, ')');
    }
}
