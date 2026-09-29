package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final String f55454a;

    /* JADX INFO: renamed from: b */
    public final boolean f55455b;

    /* JADX INFO: renamed from: c */
    public final nz1 f55456c;

    public p19(String str, boolean z, nz1 nz1Var) {
        this.f55454a = str;
        this.f55455b = z;
        this.f55456c = nz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p19)) {
            return false;
        }
        p19 p19Var = (p19) obj;
        return this.f55454a.equals(p19Var.f55454a) && this.f55455b == p19Var.f55455b && fa4.m11650l(this.f55456c, p19Var.f55456c);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(this.f55454a.hashCode() * 31, 31, this.f55455b);
        nz1 nz1Var = this.f55456c;
        return iM12428e + (nz1Var == null ? 0 : nz1Var.hashCode());
    }

    public final String toString() {
        return "DailyStreakTarget(selectionDescription=" + this.f55454a + ", isSaving=" + this.f55455b + ", errorMessage=" + this.f55456c + ")";
    }
}
