package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ob8 {

    /* JADX INFO: renamed from: a */
    public final boolean f54133a;

    /* JADX INFO: renamed from: b */
    public final boolean f54134b;

    /* JADX INFO: renamed from: c */
    public final boolean f54135c;

    /* JADX INFO: renamed from: d */
    public final boolean f54136d;

    /* JADX INFO: renamed from: e */
    public final boolean f54137e;

    /* JADX INFO: renamed from: f */
    public final boolean f54138f;

    /* JADX INFO: renamed from: g */
    public final boolean f54139g;

    /* JADX INFO: renamed from: h */
    public final boolean f54140h;

    public ob8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f54133a = z;
        this.f54134b = z2;
        this.f54135c = z3;
        this.f54136d = z4;
        this.f54137e = z5;
        this.f54138f = z6;
        this.f54139g = z7;
        this.f54140h = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob8)) {
            return false;
        }
        ob8 ob8Var = (ob8) obj;
        return this.f54133a == ob8Var.f54133a && this.f54134b == ob8Var.f54134b && this.f54135c == ob8Var.f54135c && this.f54136d == ob8Var.f54136d && this.f54137e == ob8Var.f54137e && this.f54138f == ob8Var.f54138f && this.f54139g == ob8Var.f54139g && this.f54140h == ob8Var.f54140h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54140h) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f54133a) * 31, 31, this.f54134b), 31, this.f54135c), 31, this.f54136d), 31, this.f54137e), 31, this.f54138f), 31, this.f54139g);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ReviewActivityAvailability(flashcard=", ", flashcardReverse=", ", dictation=", this.f54133a, this.f54134b);
        wq1.m24101A(sbM13357g, this.f54135c, ", multiChoice=", this.f54136d, ", cloze=");
        wq1.m24101A(sbM13357g, this.f54137e, ", matching=", this.f54138f, ", speaking=");
        return e65.m10875g(sbM13357g, this.f54139g, ", unscramble=", this.f54140h, ")");
    }
}
