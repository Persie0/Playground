package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dw1 {

    /* JADX INFO: renamed from: a */
    public final ew1 f36289a;

    /* JADX INFO: renamed from: b */
    public final boolean f36290b;

    public dw1(ew1 ew1Var, boolean z) {
        ew1Var.getClass();
        this.f36289a = ew1Var;
        this.f36290b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return fa4.m11650l(this.f36289a, dw1Var.f36289a) && this.f36290b == dw1Var.f36290b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36290b) + (this.f36289a.hashCode() * 31);
    }

    public final String toString() {
        return "PreCup(summary=" + this.f36289a + ", signupOpen=" + this.f36290b + ")";
    }
}
