package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fl6 {

    /* JADX INFO: renamed from: a */
    public final String f39251a;

    /* JADX INFO: renamed from: b */
    public final int f39252b;

    /* JADX INFO: renamed from: c */
    public final int f39253c;

    /* JADX INFO: renamed from: d */
    public final int f39254d;

    /* JADX INFO: renamed from: e */
    public final String f39255e;

    /* JADX INFO: renamed from: f */
    public final String f39256f;

    /* JADX INFO: renamed from: g */
    public final String f39257g;

    public fl6(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        str3.getClass();
        this.f39251a = str;
        this.f39252b = i;
        this.f39253c = i2;
        this.f39254d = i3;
        this.f39255e = str2;
        this.f39256f = str3;
        this.f39257g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl6)) {
            return false;
        }
        fl6 fl6Var = (fl6) obj;
        return this.f39251a.equals(fl6Var.f39251a) && this.f39252b == fl6Var.f39252b && this.f39253c == fl6Var.f39253c && this.f39254d == fl6Var.f39254d && this.f39255e.equals(fl6Var.f39255e) && fa4.m11650l(this.f39256f, fl6Var.f39256f) && this.f39257g.equals(fl6Var.f39257g);
    }

    public final int hashCode() {
        return this.f39257g.hashCode() + ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f39254d, wq1.m24106b(this.f39253c, wq1.m24106b(this.f39252b, this.f39251a.hashCode() * 31, 31), 31), 31), this.f39255e, 31), this.f39256f, 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f39252b, "NextLessonCardState(lessonImage=", this.f39251a, ", newWordsCount=", ", lingqsCount=");
        hn1.m13360j(this.f39253c, this.f39254d, ", knownWordsCount=", ", audioDuration=", sbM17741p);
        AbstractC3393o1.m17725C(sbM17741p, this.f39255e, ", lessonTitle=", this.f39256f, ", courseTitle=");
        return AbstractC3393o1.m17738m(sbM17741p, this.f39257g, ")");
    }
}
