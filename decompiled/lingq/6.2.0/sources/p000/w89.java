package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w89 {

    /* JADX INFO: renamed from: c */
    public static final w89 f66530c;

    /* JADX INFO: renamed from: a */
    public final pvc f66531a;

    /* JADX INFO: renamed from: b */
    public final pvc f66532b;

    static {
        ng2 ng2Var = ng2.f52701n;
        f66530c = new w89(ng2Var, ng2Var);
    }

    public w89(pvc pvcVar, pvc pvcVar2) {
        this.f66531a = pvcVar;
        this.f66532b = pvcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w89)) {
            return false;
        }
        w89 w89Var = (w89) obj;
        return this.f66531a.equals(w89Var.f66531a) && this.f66532b.equals(w89Var.f66532b);
    }

    public final int hashCode() {
        return this.f66532b.hashCode() + (this.f66531a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f66531a + ", height=" + this.f66532b + ')';
    }
}
