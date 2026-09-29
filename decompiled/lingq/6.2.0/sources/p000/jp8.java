package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jp8 {

    /* JADX INFO: renamed from: a */
    public final ij7 f45966a;

    /* JADX INFO: renamed from: b */
    public final fm6 f45967b;

    /* JADX INFO: renamed from: c */
    public final boolean f45968c;

    /* JADX INFO: renamed from: d */
    public final boolean f45969d;

    /* JADX INFO: renamed from: e */
    public final String f45970e;

    /* JADX INFO: renamed from: f */
    public final boolean f45971f;

    public jp8(ij7 ij7Var, fm6 fm6Var, boolean z, boolean z2, String str, boolean z3) {
        this.f45966a = ij7Var;
        this.f45967b = fm6Var;
        this.f45968c = z;
        this.f45969d = z2;
        this.f45970e = str;
        this.f45971f = z3;
    }

    /* JADX INFO: renamed from: a */
    public static jp8 m14581a(jp8 jp8Var, ij7 ij7Var, fm6 fm6Var, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            ij7Var = jp8Var.f45966a;
        }
        ij7 ij7Var2 = ij7Var;
        if ((i & 2) != 0) {
            fm6Var = jp8Var.f45967b;
        }
        fm6 fm6Var2 = fm6Var;
        if ((i & 4) != 0) {
            z = jp8Var.f45968c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = jp8Var.f45969d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            str = jp8Var.f45970e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z3 = jp8Var.f45971f;
        }
        jp8Var.getClass();
        return new jp8(ij7Var2, fm6Var2, z4, z5, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp8)) {
            return false;
        }
        jp8 jp8Var = (jp8) obj;
        return fa4.m11650l(this.f45966a, jp8Var.f45966a) && fa4.m11650l(this.f45967b, jp8Var.f45967b) && this.f45968c == jp8Var.f45968c && this.f45969d == jp8Var.f45969d && fa4.m11650l(this.f45970e, jp8Var.f45970e) && this.f45971f == jp8Var.f45971f;
    }

    public final int hashCode() {
        ij7 ij7Var = this.f45966a;
        int iHashCode = (ij7Var == null ? 0 : ij7Var.hashCode()) * 31;
        fm6 fm6Var = this.f45967b;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode + (fm6Var == null ? 0 : fm6Var.hashCode())) * 31, 31, this.f45968c), 31, this.f45969d);
        String str = this.f45970e;
        return Boolean.hashCode(this.f45971f) + ((iM12428e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchCollectionsState(premiumLessonDialogState=");
        sb.append(this.f45966a);
        sb.append(", notEnoughBalanceDialogState=");
        sb.append(this.f45967b);
        sb.append(", showRemovePaidContentWarning=");
        wq1.m24101A(sb, this.f45968c, ", showDownloadCourseDialog=", this.f45969d, ", buyPointsUrl=");
        sb.append(this.f45970e);
        sb.append(", shouldRefreshUserOnResume=");
        sb.append(this.f45971f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ jp8() {
        this(null, null, false, false, null, false);
    }
}
