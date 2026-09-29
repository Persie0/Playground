package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bk5 {

    /* JADX INFO: renamed from: a */
    public final boolean f8635a;

    /* JADX INFO: renamed from: b */
    public final int f8636b;

    /* JADX INFO: renamed from: c */
    public final ym5 f8637c;

    /* JADX INFO: renamed from: d */
    public final ym5 f8638d;

    /* JADX INFO: renamed from: e */
    public final String f8639e;

    /* JADX INFO: renamed from: f */
    public final vg6 f8640f;

    public bk5(boolean z, int i, ym5 ym5Var, ym5 ym5Var2, String str, vg6 vg6Var) {
        ym5Var.getClass();
        ym5Var2.getClass();
        str.getClass();
        this.f8635a = z;
        this.f8636b = i;
        this.f8637c = ym5Var;
        this.f8638d = ym5Var2;
        this.f8639e = str;
        this.f8640f = vg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk5)) {
            return false;
        }
        bk5 bk5Var = (bk5) obj;
        return this.f8635a == bk5Var.f8635a && this.f8636b == bk5Var.f8636b && fa4.m11650l(this.f8637c, bk5Var.f8637c) && fa4.m11650l(this.f8638d, bk5Var.f8638d) && fa4.m11650l(this.f8639e, bk5Var.f8639e) && fa4.m11650l(this.f8640f, bk5Var.f8640f);
    }

    public final int hashCode() {
        return this.f8640f.hashCode() + ux5.m22980c((this.f8638d.hashCode() + ((this.f8637c.hashCode() + wq1.m24106b(this.f8636b, Boolean.hashCode(this.f8635a) * 31, 31)) * 31)) * 31, this.f8639e, 31);
    }

    public final String toString() {
        return "LoginUiState(isLoading=" + this.f8635a + ", recoverPasswordResult=" + this.f8636b + ", loginResult=" + this.f8637c + ", userDataResult=" + this.f8638d + ", prefilledEmail=" + this.f8639e + ", registrationStartNavigation=" + this.f8640f + ")";
    }
}
