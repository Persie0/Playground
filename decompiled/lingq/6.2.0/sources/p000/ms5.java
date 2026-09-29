package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ms5 {

    /* JADX INFO: renamed from: a */
    public final pa1 f51799a;

    /* JADX INFO: renamed from: b */
    public final zda f51800b;

    /* JADX INFO: renamed from: c */
    public final v49 f51801c;

    /* JADX INFO: renamed from: d */
    public final q36 f51802d;

    public ms5(pa1 pa1Var, zda zdaVar, v49 v49Var, q36 q36Var) {
        this.f51799a = pa1Var;
        this.f51800b = zdaVar;
        this.f51801c = v49Var;
        this.f51802d = q36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ms5.class != obj.getClass()) {
            return false;
        }
        ms5 ms5Var = (ms5) obj;
        return fa4.m11650l(this.f51799a, ms5Var.f51799a) && fa4.m11650l(this.f51800b, ms5Var.f51800b) && fa4.m11650l(this.f51801c, ms5Var.f51801c) && fa4.m11650l(this.f51802d, ms5Var.f51802d);
    }

    public final int hashCode() {
        return this.f51802d.hashCode() + ((this.f51801c.hashCode() + ((this.f51800b.hashCode() + (this.f51799a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.f51799a + ", typography=" + this.f51800b + ", shapes=" + this.f51801c + ", motionScheme=" + this.f51802d + ')';
    }
}
