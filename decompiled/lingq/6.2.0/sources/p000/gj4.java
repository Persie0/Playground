package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gj4 {

    /* JADX INFO: renamed from: c */
    public static final gj4 f40872c = new gj4(null, null, 63);

    /* JADX INFO: renamed from: a */
    public final vi3 f40873a;

    /* JADX INFO: renamed from: b */
    public final vi3 f40874b;

    public gj4(vi3 vi3Var, vi3 vi3Var2, int i) {
        vi3Var = (i & 1) != 0 ? null : vi3Var;
        vi3Var2 = (i & 16) != 0 ? null : vi3Var2;
        this.f40873a = vi3Var;
        this.f40874b = vi3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj4)) {
            return false;
        }
        gj4 gj4Var = (gj4) obj;
        return this.f40873a == gj4Var.f40873a && this.f40874b == gj4Var.f40874b;
    }

    public final int hashCode() {
        vi3 vi3Var = this.f40873a;
        int iHashCode = (vi3Var != null ? vi3Var.hashCode() : 0) * 923521;
        vi3 vi3Var2 = this.f40874b;
        return (iHashCode + (vi3Var2 != null ? vi3Var2.hashCode() : 0)) * 31;
    }
}
