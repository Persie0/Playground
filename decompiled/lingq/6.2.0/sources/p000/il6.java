package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class il6 implements jl6 {

    /* JADX INFO: renamed from: a */
    public final el6 f44261a;

    /* JADX INFO: renamed from: b */
    public final boolean f44262b;

    /* JADX INFO: renamed from: c */
    public final int f44263c;

    /* JADX INFO: renamed from: d */
    public final int f44264d;

    /* JADX INFO: renamed from: e */
    public final int f44265e;

    public il6(el6 el6Var, boolean z, int i, int i2, int i3) {
        this.f44261a = el6Var;
        this.f44262b = z;
        this.f44263c = i;
        this.f44264d = i2;
        this.f44265e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return this.f44261a.equals(il6Var.f44261a) && this.f44262b == il6Var.f44262b && this.f44263c == il6Var.f44263c && this.f44264d == il6Var.f44264d && this.f44265e == il6Var.f44265e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44265e) + wq1.m24106b(this.f44264d, wq1.m24106b(this.f44263c, g9a.m12428e(g9a.m12428e(this.f44261a.hashCode() * 31, 31, false), 31, this.f44262b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(lessonInfo=");
        sb.append(this.f44261a);
        sb.append(", isNextLessonPremium=false, shouldShowLessonTile=");
        sb.append(this.f44262b);
        sb.append(", newWordsCount=");
        hn1.m13360j(this.f44263c, this.f44264d, ", lingqsCount=", ", knownWordsCount=", sb);
        return wq1.m24123s(sb, this.f44265e, ")");
    }
}
