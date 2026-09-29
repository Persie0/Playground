package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q48 extends x3d {

    /* JADX INFO: renamed from: a */
    public final x3d f57265a;

    /* JADX INFO: renamed from: b */
    public final int f57266b;

    public q48(x3d x3dVar, int i) {
        this.f57265a = x3dVar;
        this.f57266b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q48)) {
            return false;
        }
        q48 q48Var = (q48) obj;
        return q48Var.f57265a.equals(this.f57265a) && q48Var.f57266b == this.f57266b;
    }

    public final int hashCode() {
        return this.f57265a.hashCode() + (this.f57266b * 31);
    }
}
