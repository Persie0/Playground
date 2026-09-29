package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jp4 {

    /* JADX INFO: renamed from: a */
    public final String f45956a;

    /* JADX INFO: renamed from: b */
    public final int f45957b;

    /* JADX INFO: renamed from: c */
    public final boolean f45958c;

    /* JADX INFO: renamed from: d */
    public final double f45959d;

    /* JADX INFO: renamed from: e */
    public final String f45960e;

    public jp4(String str, int i, boolean z, double d, String str2) {
        str.getClass();
        this.f45956a = str;
        this.f45957b = i;
        this.f45958c = z;
        this.f45959d = d;
        this.f45960e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp4)) {
            return false;
        }
        jp4 jp4Var = (jp4) obj;
        return fa4.m11650l(this.f45956a, jp4Var.f45956a) && this.f45957b == jp4Var.f45957b && this.f45958c == jp4Var.f45958c && Double.compare(this.f45959d, jp4Var.f45959d) == 0 && fa4.m11650l(this.f45960e, jp4Var.f45960e);
    }

    public final int hashCode() {
        int iM12424a = g9a.m12424a(this.f45959d, g9a.m12428e(wq1.m24106b(this.f45957b, this.f45956a.hashCode() * 31, 31), 31, this.f45958c), 31);
        String str = this.f45960e;
        return iM12424a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f45957b, "LanguageStreak(language=", this.f45956a, ", latestStreakDays=", ", isStreakBroken=");
        sbM17741p.append(this.f45958c);
        sbM17741p.append(", coins=");
        sbM17741p.append(this.f45959d);
        return AbstractC3393o1.m17739n(sbM17741p, ", brokenStreakDate=", this.f45960e, ")");
    }
}
