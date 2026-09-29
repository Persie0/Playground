package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f55721a;

    /* JADX INFO: renamed from: b */
    public final boolean f55722b;

    public p81(h81 h81Var, boolean z) {
        h81Var.getClass();
        this.f55721a = h81Var;
        this.f55722b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p81)) {
            return false;
        }
        p81 p81Var = (p81) obj;
        return fa4.m11650l(this.f55721a, p81Var.f55721a) && this.f55722b == p81Var.f55722b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55722b) + (this.f55721a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOpenLesson(item=" + this.f55721a + ", forceOpen=" + this.f55722b + ")";
    }
}
