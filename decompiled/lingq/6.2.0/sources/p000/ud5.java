package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ud5 {

    /* JADX INFO: renamed from: a */
    public final int f63757a;

    /* JADX INFO: renamed from: b */
    public final int f63758b;

    public ud5(int i, int i2) {
        this.f63757a = i;
        this.f63758b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud5)) {
            return false;
        }
        ud5 ud5Var = (ud5) obj;
        return this.f63757a == ud5Var.f63757a && this.f63758b == ud5Var.f63758b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63758b) + (Integer.hashCode(this.f63757a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f63757a, this.f63758b, "LingQMethodInfo(title=", ", description=", ")");
    }
}
