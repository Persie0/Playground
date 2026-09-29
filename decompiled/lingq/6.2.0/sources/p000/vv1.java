package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vv1 {

    /* JADX INFO: renamed from: a */
    public final String f65962a;

    /* JADX INFO: renamed from: b */
    public final int f65963b;

    /* JADX INFO: renamed from: c */
    public final boolean f65964c;

    /* JADX INFO: renamed from: d */
    public final boolean f65965d;

    /* JADX INFO: renamed from: e */
    public final boolean f65966e;

    /* JADX INFO: renamed from: f */
    public final boolean f65967f;

    /* JADX INFO: renamed from: g */
    public final boolean f65968g;

    /* JADX INFO: renamed from: h */
    public final List f65969h;

    /* JADX INFO: renamed from: i */
    public final boolean f65970i;

    /* JADX INFO: renamed from: j */
    public final int f65971j;

    public vv1(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, boolean z6, int i2) {
        str.getClass();
        this.f65962a = str;
        this.f65963b = i;
        this.f65964c = z;
        this.f65965d = z2;
        this.f65966e = z3;
        this.f65967f = z4;
        this.f65968g = z5;
        this.f65969h = list;
        this.f65970i = z6;
        this.f65971j = i2;
    }

    /* JADX INFO: renamed from: a */
    public static vv1 m23553a(vv1 vv1Var, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            str = vv1Var.f65962a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i = vv1Var.f65963b;
        }
        int i3 = i;
        boolean z5 = (i2 & 4) != 0 ? vv1Var.f65964c : z;
        boolean z6 = (i2 & 8) != 0 ? vv1Var.f65965d : z2;
        boolean z7 = vv1Var.f65966e;
        boolean z8 = vv1Var.f65967f;
        boolean z9 = (i2 & 64) != 0 ? vv1Var.f65968g : z3;
        List list = vv1Var.f65969h;
        boolean z10 = (i2 & 256) != 0 ? vv1Var.f65970i : z4;
        int i4 = vv1Var.f65971j;
        str2.getClass();
        return new vv1(str2, i3, z5, z6, z7, z8, z9, list, z10, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1Var = (vv1) obj;
        return fa4.m11650l(this.f65962a, vv1Var.f65962a) && this.f65963b == vv1Var.f65963b && this.f65964c == vv1Var.f65964c && this.f65965d == vv1Var.f65965d && this.f65966e == vv1Var.f65966e && this.f65967f == vv1Var.f65967f && this.f65968g == vv1Var.f65968g && this.f65969h.equals(vv1Var.f65969h) && this.f65970i == vv1Var.f65970i && this.f65971j == vv1Var.f65971j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65971j) + g9a.m12428e(ux5.m22979b(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f65963b, this.f65962a.hashCode() * 31, 31), 31, this.f65964c), 31, this.f65965d), 31, this.f65966e), 31, this.f65967f), 31, this.f65968g), 31, this.f65969h), 31, this.f65970i);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f65963b, "CupSignupState(teamCode=", this.f65962a, ", participants=", ", notificationsChecked=");
        wq1.m24101A(sbM17741p, this.f65964c, ", isChangingTeam=", this.f65965d, ", canChangeTeam=");
        wq1.m24101A(sbM17741p, this.f65966e, ", showLanguageWarning=", this.f65967f, ", isConfirmingJoin=");
        sbM17741p.append(this.f65968g);
        sbM17741p.append(", availableTeams=");
        sbM17741p.append(this.f65969h);
        sbM17741p.append(", isJoining=");
        sbM17741p.append(this.f65970i);
        sbM17741p.append(", durationDays=");
        sbM17741p.append(this.f65971j);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
