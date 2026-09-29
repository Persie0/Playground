package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mu0 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f51843b;

    /* JADX INFO: renamed from: c */
    public final boolean f51844c;

    /* JADX INFO: renamed from: d */
    public final boolean f51845d;

    /* JADX INFO: renamed from: e */
    public final String[] f51846e;

    /* JADX INFO: renamed from: f */
    public final az3[] f51847f;

    public mu0(String str, boolean z, boolean z2, String[] strArr, az3[] az3VarArr) {
        super("CTOC");
        this.f51843b = str;
        this.f51844c = z;
        this.f51845d = z2;
        this.f51846e = strArr;
        this.f51847f = az3VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mu0.class != obj.getClass()) {
            return false;
        }
        mu0 mu0Var = (mu0) obj;
        return this.f51844c == mu0Var.f51844c && this.f51845d == mu0Var.f51845d && this.f51843b.equals(mu0Var.f51843b) && Arrays.equals(this.f51846e, mu0Var.f51846e) && Arrays.equals(this.f51847f, mu0Var.f51847f);
    }

    public final int hashCode() {
        return this.f51843b.hashCode() + ((((527 + (this.f51844c ? 1 : 0)) * 31) + (this.f51845d ? 1 : 0)) * 31);
    }
}
