package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class e55 {

    /* JADX INFO: renamed from: a */
    public final int f36725a;

    /* JADX INFO: renamed from: b */
    public final int f36726b;

    public e55(int i, int i2) {
        this.f36725a = i;
        this.f36726b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e55)) {
            return false;
        }
        e55 e55Var = (e55) obj;
        return this.f36725a == e55Var.f36725a && this.f36726b == e55Var.f36726b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36726b) + (Integer.hashCode(this.f36725a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f36725a, this.f36726b, "Insertion(originalIndex=", ", delta=", ")");
    }
}
