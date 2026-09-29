package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h41 {

    /* JADX INFO: renamed from: a */
    public final float f41765a;

    /* JADX INFO: renamed from: b */
    public final float f41766b;

    public h41(float f, float f2) {
        this.f41765a = f;
        this.f41766b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13040a() {
        return this.f41765a > this.f41766b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m13041b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h41)) {
            return false;
        }
        if (m13040a() && ((h41) obj).m13040a()) {
            return true;
        }
        h41 h41Var = (h41) obj;
        return this.f41765a == h41Var.f41765a && this.f41766b == h41Var.f41766b;
    }

    public final int hashCode() {
        if (m13040a()) {
            return -1;
        }
        return Float.hashCode(this.f41766b) + (Float.hashCode(this.f41765a) * 31);
    }

    public final String toString() {
        return this.f41765a + ".." + this.f41766b;
    }
}
