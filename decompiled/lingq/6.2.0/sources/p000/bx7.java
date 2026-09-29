package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bx7 {

    /* JADX INFO: renamed from: a */
    public final xz7 f9137a;

    /* JADX INFO: renamed from: b */
    public final iy7 f9138b;

    /* JADX INFO: renamed from: c */
    public final d87 f9139c;

    /* JADX INFO: renamed from: d */
    public final boolean f9140d;

    /* JADX INFO: renamed from: e */
    public final boolean f9141e;

    /* JADX INFO: renamed from: f */
    public final ia4 f9142f;

    /* JADX INFO: renamed from: g */
    public final boolean f9143g;

    public bx7(xz7 xz7Var, iy7 iy7Var, d87 d87Var, boolean z, boolean z2, ia4 ia4Var, boolean z3) {
        this.f9137a = xz7Var;
        this.f9138b = iy7Var;
        this.f9139c = d87Var;
        this.f9140d = z;
        this.f9141e = z2;
        this.f9142f = ia4Var;
        this.f9143g = z3;
    }

    /* JADX INFO: renamed from: a */
    public static bx7 m4221a(bx7 bx7Var, xz7 xz7Var, iy7 iy7Var, d87 d87Var, boolean z, boolean z2, ia4 ia4Var, boolean z3, int i) {
        if ((i & 1) != 0) {
            xz7Var = bx7Var.f9137a;
        }
        xz7 xz7Var2 = xz7Var;
        if ((i & 2) != 0) {
            iy7Var = bx7Var.f9138b;
        }
        iy7 iy7Var2 = iy7Var;
        if ((i & 4) != 0) {
            d87Var = bx7Var.f9139c;
        }
        d87 d87Var2 = d87Var;
        if ((i & 8) != 0) {
            z = bx7Var.f9140d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = bx7Var.f9141e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            ia4Var = bx7Var.f9142f;
        }
        ia4 ia4Var2 = ia4Var;
        if ((i & 64) != 0) {
            z3 = bx7Var.f9143g;
        }
        bx7Var.getClass();
        return new bx7(xz7Var2, iy7Var2, d87Var2, z4, z5, ia4Var2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx7)) {
            return false;
        }
        bx7 bx7Var = (bx7) obj;
        return fa4.m11650l(this.f9137a, bx7Var.f9137a) && fa4.m11650l(this.f9138b, bx7Var.f9138b) && fa4.m11650l(this.f9139c, bx7Var.f9139c) && this.f9140d == bx7Var.f9140d && this.f9141e == bx7Var.f9141e && fa4.m11650l(this.f9142f, bx7Var.f9142f) && this.f9143g == bx7Var.f9143g;
    }

    public final int hashCode() {
        xz7 xz7Var = this.f9137a;
        int iHashCode = (xz7Var == null ? 0 : xz7Var.hashCode()) * 31;
        iy7 iy7Var = this.f9138b;
        int iHashCode2 = (iHashCode + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31;
        d87 d87Var = this.f9139c;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode2 + (d87Var == null ? 0 : d87Var.hashCode())) * 31, 31, this.f9140d), 31, this.f9141e);
        ia4 ia4Var = this.f9142f;
        return Boolean.hashCode(this.f9143g) + ((iM12428e + (ia4Var != null ? ia4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderInteractionState(activeTappedToken=");
        sb.append(this.f9137a);
        sb.append(", activeTappedPhrase=");
        sb.append(this.f9138b);
        sb.append(", relatedPhraseSpan=");
        sb.append(this.f9139c);
        sb.append(", isRelatedPhraseSelected=");
        sb.append(this.f9140d);
        sb.append(", shouldResetSelection=");
        sb.append(this.f9141e);
        sb.append(", invalidSelection=");
        sb.append(this.f9142f);
        sb.append(", wasPlayingBeforeTap=");
        return AbstractC3393o1.m17740o(sb, this.f9143g, ")");
    }

    public /* synthetic */ bx7() {
        this(null, null, null, false, false, null, false);
    }
}
