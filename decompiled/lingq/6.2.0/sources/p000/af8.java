package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class af8 {

    /* JADX INFO: renamed from: a */
    public final boolean f586a;

    /* JADX INFO: renamed from: b */
    public final boolean f587b;

    /* JADX INFO: renamed from: c */
    public final boolean f588c;

    /* JADX INFO: renamed from: d */
    public final boolean f589d;

    /* JADX INFO: renamed from: e */
    public final boolean f590e;

    /* JADX INFO: renamed from: f */
    public final boolean f591f;

    public af8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f586a = z;
        this.f587b = z2;
        this.f588c = z3;
        this.f589d = z4;
        this.f590e = z5;
        this.f591f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af8)) {
            return false;
        }
        af8 af8Var = (af8) obj;
        return this.f586a == af8Var.f586a && this.f587b == af8Var.f587b && this.f588c == af8Var.f588c && this.f589d == af8Var.f589d && this.f590e == af8Var.f590e && this.f591f == af8Var.f591f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f591f) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f586a) * 31, 31, this.f587b), 31, this.f588c), 31, this.f589d), 31, this.f590e);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("SingleWordActivityAvailability(flashcard=", ", flashcardReverse=", ", dictation=", this.f586a, this.f587b);
        wq1.m24101A(sbM13357g, this.f588c, ", multiChoice=", this.f589d, ", multiChoiceReverse=");
        return e65.m10875g(sbM13357g, this.f590e, ", cloze=", this.f591f, ")");
    }
}
