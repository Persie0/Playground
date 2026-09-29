package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a */
    public final rp7 f72331a;

    /* JADX INFO: renamed from: b */
    public final boolean f72332b;

    public zx1(rp7 rp7Var, boolean z) {
        this.f72331a = rp7Var;
        this.f72332b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zx1) {
            zx1 zx1Var = (zx1) obj;
            if (zx1Var.f72331a.equals(this.f72331a) && zx1Var.f72332b == this.f72332b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f72332b).hashCode() ^ ((this.f72331a.hashCode() ^ 1000003) * 1000003);
    }
}
