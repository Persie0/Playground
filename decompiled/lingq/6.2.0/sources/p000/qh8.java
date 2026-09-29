package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qh8 {

    /* JADX INFO: renamed from: a */
    public final dyc f57791a;

    /* JADX INFO: renamed from: b */
    public final vxc f57792b;

    /* JADX INFO: renamed from: c */
    public final zxc f57793c;

    /* JADX INFO: renamed from: d */
    public final qxc f57794d;

    public qh8(dyc dycVar, vxc vxcVar, zxc zxcVar, qxc qxcVar) {
        this.f57791a = dycVar;
        this.f57792b = vxcVar;
        this.f57793c = zxcVar;
        this.f57794d = qxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh8)) {
            return false;
        }
        qh8 qh8Var = (qh8) obj;
        return this.f57791a.equals(qh8Var.f57791a) && this.f57792b.equals(qh8Var.f57792b) && this.f57793c.equals(qh8Var.f57793c) && this.f57794d.equals(qh8Var.f57794d);
    }

    public final int hashCode() {
        return this.f57794d.hashCode() + ((this.f57793c.hashCode() + ((this.f57792b.hashCode() + (this.f57791a.hashCode() * 31)) * 31)) * 31);
    }
}
