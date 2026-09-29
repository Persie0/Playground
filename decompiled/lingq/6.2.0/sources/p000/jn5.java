package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jn5 {

    /* JADX INFO: renamed from: a */
    public final boolean f45865a;

    /* JADX INFO: renamed from: b */
    public final boolean f45866b;

    /* JADX INFO: renamed from: c */
    public final String f45867c;

    /* JADX INFO: renamed from: d */
    public final boolean f45868d;

    public jn5(String str, boolean z, boolean z2, boolean z3) {
        this.f45865a = z;
        this.f45866b = z2;
        this.f45867c = str;
        this.f45868d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn5)) {
            return false;
        }
        jn5 jn5Var = (jn5) obj;
        return this.f45865a == jn5Var.f45865a && this.f45866b == jn5Var.f45866b && fa4.m11650l(this.f45867c, jn5Var.f45867c) && this.f45868d == jn5Var.f45868d;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Boolean.hashCode(this.f45865a) * 31, 31, this.f45866b);
        String str = this.f45867c;
        return Boolean.hashCode(this.f45868d) + ((iM12428e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LynxCoachStatus(failed=", ", outOfCredits=", ", streamingMessage=", this.f45865a, this.f45866b);
        sbM13357g.append(this.f45867c);
        sbM13357g.append(", isTranslationLoading=");
        sbM13357g.append(this.f45868d);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
