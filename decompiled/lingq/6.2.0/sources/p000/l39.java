package p000;

/* JADX INFO: loaded from: classes.dex */
public final class l39 {

    /* JADX INFO: renamed from: d */
    public static final l39 f48992d = new l39(d32.m10037f(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f48993a;

    /* JADX INFO: renamed from: b */
    public final long f48994b;

    /* JADX INFO: renamed from: c */
    public final float f48995c;

    public l39(long j, long j2, float f) {
        this.f48993a = j;
        this.f48994b = j2;
        this.f48995c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l39)) {
            return false;
        }
        l39 l39Var = (l39) obj;
        return aa1.m199c(this.f48993a, l39Var.f48993a) && gq6.m12821b(this.f48994b, l39Var.f48994b) && this.f48995c == l39Var.f48995c;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Float.hashCode(this.f48995c) + ux5.m22981d(this.f48994b, Long.hashCode(this.f48993a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        ux5.m23002y(this.f48993a, ", offset=", sb);
        sb.append((Object) gq6.m12827h(this.f48994b));
        sb.append(", blurRadius=");
        return AbstractC3393o1.m17737l(sb, this.f48995c, ')');
    }
}
