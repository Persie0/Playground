package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qx8 {

    /* JADX INFO: renamed from: a */
    public final boolean f58340a;

    /* JADX INFO: renamed from: b */
    public final boolean f58341b;

    /* JADX INFO: renamed from: c */
    public final String f58342c;

    /* JADX INFO: renamed from: d */
    public final String f58343d;

    /* JADX INFO: renamed from: e */
    public final String f58344e;

    /* JADX INFO: renamed from: f */
    public final boolean f58345f;

    public qx8(boolean z, boolean z2, String str, String str2, String str3, boolean z3) {
        this.f58340a = z;
        this.f58341b = z2;
        this.f58342c = str;
        this.f58343d = str2;
        this.f58344e = str3;
        this.f58345f = z3;
    }

    /* JADX INFO: renamed from: a */
    public static qx8 m20194a(qx8 qx8Var, boolean z, boolean z2, String str, String str2, String str3, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = qx8Var.f58340a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = qx8Var.f58341b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = qx8Var.f58342c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = qx8Var.f58343d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = qx8Var.f58344e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z3 = qx8Var.f58345f;
        }
        qx8Var.getClass();
        str6.getClass();
        return new qx8(z4, z5, str4, str5, str6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx8)) {
            return false;
        }
        qx8 qx8Var = (qx8) obj;
        return this.f58340a == qx8Var.f58340a && this.f58341b == qx8Var.f58341b && fa4.m11650l(this.f58342c, qx8Var.f58342c) && fa4.m11650l(this.f58343d, qx8Var.f58343d) && fa4.m11650l(this.f58344e, qx8Var.f58344e) && this.f58345f == qx8Var.f58345f;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Boolean.hashCode(this.f58340a) * 31, 31, this.f58341b);
        String str = this.f58342c;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58343d;
        return Boolean.hashCode(this.f58345f) + ux5.m22980c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.f58344e, 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("SentenceTranslationState(isVisible=", ", isLoading=", ", translation=", this.f58340a, this.f58341b);
        AbstractC3393o1.m17725C(sbM13357g, this.f58342c, ", error=", this.f58343d, ", notes=");
        sbM13357g.append(this.f58344e);
        sbM13357g.append(", notesVisible=");
        sbM13357g.append(this.f58345f);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    public /* synthetic */ qx8() {
        this(false, false, null, null, "", false);
    }
}
