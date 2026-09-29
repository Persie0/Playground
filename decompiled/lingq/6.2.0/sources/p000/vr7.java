package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vr7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final e28 f65827a;

    /* JADX INFO: renamed from: b */
    public final xz7 f65828b;

    public vr7(e28 e28Var, xz7 xz7Var) {
        this.f65827a = e28Var;
        this.f65828b = xz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr7)) {
            return false;
        }
        vr7 vr7Var = (vr7) obj;
        return fa4.m11650l(this.f65827a, vr7Var.f65827a) && fa4.m11650l(this.f65828b, vr7Var.f65828b);
    }

    public final int hashCode() {
        e28 e28Var = this.f65827a;
        int iHashCode = (e28Var == null ? 0 : e28Var.hashCode()) * 31;
        xz7 xz7Var = this.f65828b;
        return iHashCode + (xz7Var != null ? xz7Var.hashCode() : 0);
    }

    public final String toString() {
        return "FirstBlueWordPositioned(bounds=" + this.f65827a + ", token=" + this.f65828b + ")";
    }
}
