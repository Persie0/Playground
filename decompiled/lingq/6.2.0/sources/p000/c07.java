package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c07 extends pk9 {

    /* JADX INFO: renamed from: A */
    public final mi8 f9272A;

    /* JADX INFO: renamed from: B */
    public final C3500qj f9273B;

    public c07(mi8 mi8Var) {
        C3500qj c3500qjM22757a;
        this.f9272A = mi8Var;
        if (omd.m18128R(mi8Var)) {
            c3500qjM22757a = null;
        } else {
            c3500qjM22757a = AbstractC3650uj.m22757a();
            C3500qj.m19986c(c3500qjM22757a, mi8Var);
        }
        this.f9273B = c3500qjM22757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c07) {
            return this.f9272A.equals(((c07) obj).f9272A);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9272A.hashCode();
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: o */
    public final e28 mo19o() {
        mi8 mi8Var = this.f9272A;
        return new e28(mi8Var.f51360a, mi8Var.f51361b, mi8Var.f51362c, mi8Var.f51363d);
    }
}
