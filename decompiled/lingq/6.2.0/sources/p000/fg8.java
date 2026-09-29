package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fg8 {

    /* JADX INFO: renamed from: a */
    public final xe9 f39077a;

    /* JADX INFO: renamed from: b */
    public final boolean f39078b;

    /* JADX INFO: renamed from: c */
    public final String f39079c;

    public fg8(xe9 xe9Var, boolean z, String str) {
        xe9Var.getClass();
        this.f39077a = xe9Var;
        this.f39078b = z;
        this.f39079c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg8)) {
            return false;
        }
        fg8 fg8Var = (fg8) obj;
        return fa4.m11650l(this.f39077a, fg8Var.f39077a) && this.f39078b == fg8Var.f39078b && this.f39079c.equals(fg8Var.f39079c);
    }

    public final int hashCode() {
        return this.f39079c.hashCode() + g9a.m12428e(this.f39077a.hashCode() * 31, 31, this.f39078b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewSpeakingState(state=");
        sb.append(this.f39077a);
        sb.append(", isRtl=");
        sb.append(this.f39078b);
        sb.append(", locale=");
        return AbstractC3393o1.m17738m(sb, this.f39079c, ")");
    }
}
