package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qz1 {

    /* JADX INFO: renamed from: a */
    public final String f58405a;

    /* JADX INFO: renamed from: b */
    public final Integer f58406b;

    /* JADX INFO: renamed from: c */
    public final boolean f58407c;

    /* JADX INFO: renamed from: d */
    public final nz1 f58408d;

    public qz1(String str, Integer num, boolean z, nz1 nz1Var) {
        this.f58405a = str;
        this.f58406b = num;
        this.f58407c = z;
        this.f58408d = nz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return fa4.m11650l(this.f58405a, qz1Var.f58405a) && fa4.m11650l(this.f58406b, qz1Var.f58406b) && this.f58407c == qz1Var.f58407c && fa4.m11650l(this.f58408d, qz1Var.f58408d);
    }

    public final int hashCode() {
        String str = this.f58405a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f58406b;
        int iM12428e = g9a.m12428e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f58407c);
        nz1 nz1Var = this.f58408d;
        return iM12428e + (nz1Var != null ? nz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "DailyStreakTargetSheetState(customCoinsInput=" + this.f58405a + ", estimatedMinutes=" + this.f58406b + ", isSaving=" + this.f58407c + ", errorMessage=" + this.f58408d + ")";
    }
}
