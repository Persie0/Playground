package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kj8 {

    /* JADX INFO: renamed from: a */
    public final lj8 f47398a;

    /* JADX INFO: renamed from: b */
    public final lj8 f47399b;

    /* JADX INFO: renamed from: c */
    public final Throwable f47400c;

    public kj8(lj8 lj8Var, fi1 fi1Var, Throwable th) {
        this.f47398a = lj8Var;
        this.f47399b = fi1Var;
        this.f47400c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj8)) {
            return false;
        }
        kj8 kj8Var = (kj8) obj;
        return fa4.m11650l(this.f47398a, kj8Var.f47398a) && fa4.m11650l(this.f47399b, kj8Var.f47399b) && fa4.m11650l(this.f47400c, kj8Var.f47400c);
    }

    public final int hashCode() {
        int iHashCode = this.f47398a.hashCode() * 31;
        lj8 lj8Var = this.f47399b;
        int iHashCode2 = (iHashCode + (lj8Var == null ? 0 : lj8Var.hashCode())) * 31;
        Throwable th = this.f47400c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f47398a + ", nextPlan=" + this.f47399b + ", throwable=" + this.f47400c + ')';
    }

    public /* synthetic */ kj8(lj8 lj8Var, Throwable th, int i) {
        this(lj8Var, (fi1) null, (i & 4) != 0 ? null : th);
    }
}
