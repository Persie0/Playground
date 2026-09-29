package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jp2 {

    /* JADX INFO: renamed from: a */
    public final ym5 f45952a;

    /* JADX INFO: renamed from: b */
    public final boolean f45953b;

    public jp2(ym5 ym5Var, boolean z) {
        ym5Var.getClass();
        this.f45952a = ym5Var;
        this.f45953b = z;
    }

    /* JADX INFO: renamed from: a */
    public static jp2 m14578a(jp2 jp2Var, ym5 ym5Var, boolean z, int i) {
        if ((i & 1) != 0) {
            ym5Var = jp2Var.f45952a;
        }
        if ((i & 2) != 0) {
            z = jp2Var.f45953b;
        }
        jp2Var.getClass();
        ym5Var.getClass();
        return new jp2(ym5Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp2)) {
            return false;
        }
        jp2 jp2Var = (jp2) obj;
        return fa4.m11650l(this.f45952a, jp2Var.f45952a) && this.f45953b == jp2Var.f45953b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45953b) + (this.f45952a.hashCode() * 31);
    }

    public final String toString() {
        return "EmailLoginUiState(emailSentResult=" + this.f45952a + ", isLoading=" + this.f45953b + ")";
    }
}
