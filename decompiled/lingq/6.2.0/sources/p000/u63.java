package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u63 {

    /* JADX INFO: renamed from: a */
    public final boolean f63480a;

    /* JADX INFO: renamed from: b */
    public final boolean f63481b;

    /* JADX INFO: renamed from: c */
    public final boolean f63482c;

    /* JADX INFO: renamed from: d */
    public final boolean f63483d;

    /* JADX INFO: renamed from: e */
    public final boolean f63484e;

    /* JADX INFO: renamed from: f */
    public final boolean f63485f;

    /* JADX INFO: renamed from: g */
    public final boolean f63486g;

    public u63(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f63480a = z;
        this.f63481b = z2;
        this.f63482c = z3;
        this.f63483d = z4;
        this.f63484e = z5;
        this.f63485f = z6;
        this.f63486g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u63)) {
            return false;
        }
        u63 u63Var = (u63) obj;
        return this.f63480a == u63Var.f63480a && this.f63481b == u63Var.f63481b && this.f63482c == u63Var.f63482c && this.f63483d == u63Var.f63483d && this.f63484e == u63Var.f63484e && this.f63485f == u63Var.f63485f && this.f63486g == u63Var.f63486g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63486g) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f63480a) * 31, 31, this.f63481b), 31, this.f63482c), 31, this.f63483d), 31, this.f63484e), 31, this.f63485f);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("FlashcardSideSettings(showTerm=", ", showTranslation=", ", showPhrase=", this.f63480a, this.f63481b);
        wq1.m24101A(sbM13357g, this.f63482c, ", showStatus=", this.f63483d, ", showTags=");
        wq1.m24101A(sbM13357g, this.f63484e, ", showNote=", this.f63485f, ", showEdit=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f63486g, ")");
    }

    public /* synthetic */ u63(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, z4, z5, false, false);
    }
}
