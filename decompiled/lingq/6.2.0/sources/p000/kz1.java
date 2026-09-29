package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kz1 {

    /* JADX INFO: renamed from: a */
    public final jz1 f48789a;

    /* JADX INFO: renamed from: b */
    public final String f48790b;

    /* JADX INFO: renamed from: c */
    public final boolean f48791c;

    /* JADX INFO: renamed from: d */
    public final nz1 f48792d;

    public kz1(jz1 jz1Var, String str, boolean z, nz1 nz1Var) {
        this.f48789a = jz1Var;
        this.f48790b = str;
        this.f48791c = z;
        this.f48792d = nz1Var;
    }

    /* JADX INFO: renamed from: a */
    public static kz1 m15733a(kz1 kz1Var, jz1 jz1Var, String str, boolean z, nz1 nz1Var, int i) {
        if ((i & 1) != 0) {
            jz1Var = kz1Var.f48789a;
        }
        if ((i & 2) != 0) {
            str = kz1Var.f48790b;
        }
        if ((i & 4) != 0) {
            z = kz1Var.f48791c;
        }
        if ((i & 8) != 0) {
            nz1Var = kz1Var.f48792d;
        }
        kz1Var.getClass();
        return new kz1(jz1Var, str, z, nz1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz1)) {
            return false;
        }
        kz1 kz1Var = (kz1) obj;
        return fa4.m11650l(this.f48789a, kz1Var.f48789a) && fa4.m11650l(this.f48790b, kz1Var.f48790b) && this.f48791c == kz1Var.f48791c && fa4.m11650l(this.f48792d, kz1Var.f48792d);
    }

    public final int hashCode() {
        jz1 jz1Var = this.f48789a;
        int iHashCode = (jz1Var == null ? 0 : jz1Var.hashCode()) * 31;
        String str = this.f48790b;
        int iM12428e = g9a.m12428e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f48791c);
        nz1 nz1Var = this.f48792d;
        return iM12428e + (nz1Var != null ? nz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "DailyStreakTargetEditState(pendingTarget=" + this.f48789a + ", customGoalInput=" + this.f48790b + ", isSaving=" + this.f48791c + ", errorMessage=" + this.f48792d + ")";
    }
}
