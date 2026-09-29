package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class et0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37787a;

    /* JADX INFO: renamed from: b */
    public final boolean f37788b;

    /* JADX INFO: renamed from: c */
    public final boolean f37789c;

    /* JADX INFO: renamed from: d */
    public final List f37790d;

    /* JADX INFO: renamed from: e */
    public final ws1 f37791e;

    /* JADX INFO: renamed from: f */
    public final List f37792f;

    public et0(boolean z, boolean z2, boolean z3, List list, ws1 ws1Var, List list2) {
        list.getClass();
        this.f37787a = z;
        this.f37788b = z2;
        this.f37789c = z3;
        this.f37790d = list;
        this.f37791e = ws1Var;
        this.f37792f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et0)) {
            return false;
        }
        et0 et0Var = (et0) obj;
        return this.f37787a == et0Var.f37787a && this.f37788b == et0Var.f37788b && this.f37789c == et0Var.f37789c && fa4.m11650l(this.f37790d, et0Var.f37790d) && fa4.m11650l(this.f37791e, et0Var.f37791e) && fa4.m11650l(this.f37792f, et0Var.f37792f);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f37787a) * 31, 31, this.f37788b), 31, this.f37789c), 31, this.f37790d);
        ws1 ws1Var = this.f37791e;
        return this.f37792f.hashCode() + ((iM22979b + (ws1Var == null ? 0 : ws1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ChallengesUiState(isLoading=", ", scrollToTop=", ", isRefreshing=", this.f37787a, this.f37788b);
        sbM13357g.append(this.f37789c);
        sbM13357g.append(", challenges=");
        sbM13357g.append(this.f37790d);
        sbM13357g.append(", cupHero=");
        sbM13357g.append(this.f37791e);
        sbM13357g.append(", items=");
        sbM13357g.append(this.f37792f);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
