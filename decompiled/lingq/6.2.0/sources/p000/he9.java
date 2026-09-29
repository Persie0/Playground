package p000;

/* JADX INFO: loaded from: classes.dex */
public final class he9 implements InterfaceC3190kn {

    /* JADX INFO: renamed from: a */
    public final xv9 f42264a;

    /* JADX INFO: renamed from: b */
    public final long f42265b;

    /* JADX INFO: renamed from: c */
    public final bc3 f42266c;

    /* JADX INFO: renamed from: d */
    public final wb3 f42267d;

    /* JADX INFO: renamed from: e */
    public final xb3 f42268e;

    /* JADX INFO: renamed from: f */
    public final xa3 f42269f;

    /* JADX INFO: renamed from: g */
    public final String f42270g;

    /* JADX INFO: renamed from: h */
    public final long f42271h;

    /* JADX INFO: renamed from: i */
    public final oa0 f42272i;

    /* JADX INFO: renamed from: j */
    public final yv9 f42273j;

    /* JADX INFO: renamed from: k */
    public final xi5 f42274k;

    /* JADX INFO: renamed from: l */
    public final long f42275l;

    /* JADX INFO: renamed from: m */
    public final rt9 f42276m;

    /* JADX INFO: renamed from: n */
    public final l39 f42277n;

    /* JADX INFO: renamed from: o */
    public final g97 f42278o;

    /* JADX INFO: renamed from: p */
    public final ml2 f42279p;

    public he9(long j, long j2, bc3 bc3Var, wb3 wb3Var, xb3 xb3Var, xa3 xa3Var, String str, long j3, oa0 oa0Var, yv9 yv9Var, xi5 xi5Var, long j4, rt9 rt9Var, l39 l39Var, int i) {
        this((i & 1) != 0 ? aa1.f412k : j, (i & 2) != 0 ? zx9.f72359c : j2, (i & 4) != 0 ? null : bc3Var, (i & 8) != 0 ? null : wb3Var, (i & 16) != 0 ? null : xb3Var, (i & 32) != 0 ? null : xa3Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? zx9.f72359c : j3, (i & 256) != 0 ? null : oa0Var, (i & 512) != 0 ? null : yv9Var, (i & 1024) != 0 ? null : xi5Var, (i & 2048) != 0 ? aa1.f412k : j4, (i & 4096) != 0 ? null : rt9Var, (i & 8192) != 0 ? null : l39Var, (g97) null, (ml2) null);
    }

    /* JADX INFO: renamed from: a */
    public static he9 m13209a(he9 he9Var, bc3 bc3Var, int i) {
        long jMo24173a = he9Var.f42264a.mo24173a();
        long j = he9Var.f42265b;
        bc3 bc3Var2 = (i & 4) != 0 ? he9Var.f42266c : bc3Var;
        wb3 wb3Var = he9Var.f42267d;
        xb3 xb3Var = he9Var.f42268e;
        xa3 xa3Var = (i & 32) != 0 ? he9Var.f42269f : null;
        String str = he9Var.f42270g;
        long j2 = he9Var.f42271h;
        oa0 oa0Var = he9Var.f42272i;
        yv9 yv9Var = he9Var.f42273j;
        xi5 xi5Var = he9Var.f42274k;
        long j3 = he9Var.f42275l;
        rt9 rt9Var = he9Var.f42276m;
        l39 l39Var = he9Var.f42277n;
        g97 g97Var = he9Var.f42278o;
        ml2 ml2Var = he9Var.f42279p;
        xv9 xa1Var = he9Var.f42264a;
        if (!aa1.m199c(jMo24173a, xa1Var.mo24173a())) {
            xa1Var = jMo24173a != 16 ? new xa1(jMo24173a) : wv9.f67395a;
        }
        return new he9(xa1Var, j, bc3Var2, wb3Var, xb3Var, xa3Var, str, j2, oa0Var, yv9Var, xi5Var, j3, rt9Var, l39Var, g97Var, ml2Var);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13210b(he9 he9Var) {
        if (this == he9Var) {
            return true;
        }
        return zx9.m25846a(this.f42265b, he9Var.f42265b) && fa4.m11650l(this.f42266c, he9Var.f42266c) && fa4.m11650l(this.f42267d, he9Var.f42267d) && fa4.m11650l(this.f42268e, he9Var.f42268e) && fa4.m11650l(this.f42269f, he9Var.f42269f) && fa4.m11650l(this.f42270g, he9Var.f42270g) && zx9.m25846a(this.f42271h, he9Var.f42271h) && fa4.m11650l(this.f42272i, he9Var.f42272i) && fa4.m11650l(this.f42273j, he9Var.f42273j) && fa4.m11650l(this.f42274k, he9Var.f42274k) && aa1.m199c(this.f42275l, he9Var.f42275l) && fa4.m11650l(this.f42278o, he9Var.f42278o);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13211c(he9 he9Var) {
        return fa4.m11650l(this.f42264a, he9Var.f42264a) && fa4.m11650l(this.f42276m, he9Var.f42276m) && fa4.m11650l(this.f42277n, he9Var.f42277n) && fa4.m11650l(this.f42279p, he9Var.f42279p);
    }

    /* JADX INFO: renamed from: d */
    public final he9 m13212d(he9 he9Var) {
        if (he9Var == null) {
            return this;
        }
        xv9 xv9Var = he9Var.f42264a;
        return ie9.m13812a(this, xv9Var.mo24173a(), xv9Var.mo24174b(), xv9Var.mo24175c(), he9Var.f42265b, he9Var.f42266c, he9Var.f42267d, he9Var.f42268e, he9Var.f42269f, he9Var.f42270g, he9Var.f42271h, he9Var.f42272i, he9Var.f42273j, he9Var.f42274k, he9Var.f42275l, he9Var.f42276m, he9Var.f42277n, he9Var.f42278o, he9Var.f42279p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he9)) {
            return false;
        }
        he9 he9Var = (he9) obj;
        return m13210b(he9Var) && m13211c(he9Var);
    }

    public final int hashCode() {
        xv9 xv9Var = this.f42264a;
        long jMo24173a = xv9Var.mo24173a();
        int i = aa1.f413l;
        int iHashCode = Long.hashCode(jMo24173a) * 31;
        vi0 vi0VarMo24174b = xv9Var.mo24174b();
        int iHashCode2 = (Float.hashCode(xv9Var.mo24175c()) + ((iHashCode + (vi0VarMo24174b != null ? vi0VarMo24174b.hashCode() : 0)) * 31)) * 31;
        ay9[] ay9VarArr = zx9.f72358b;
        int iM22981d = ux5.m22981d(this.f42265b, iHashCode2, 31);
        bc3 bc3Var = this.f42266c;
        int i2 = (iM22981d + (bc3Var != null ? bc3Var.f8327a : 0)) * 31;
        wb3 wb3Var = this.f42267d;
        int iHashCode3 = (i2 + (wb3Var != null ? Integer.hashCode(wb3Var.f66583a) : 0)) * 31;
        xb3 xb3Var = this.f42268e;
        int iHashCode4 = (iHashCode3 + (xb3Var != null ? Integer.hashCode(xb3Var.f68021a) : 0)) * 31;
        xa3 xa3Var = this.f42269f;
        int iHashCode5 = (iHashCode4 + (xa3Var != null ? xa3Var.hashCode() : 0)) * 31;
        String str = this.f42270g;
        int iM22981d2 = ux5.m22981d(this.f42271h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        oa0 oa0Var = this.f42272i;
        int iHashCode6 = (iM22981d2 + (oa0Var != null ? Float.hashCode(oa0Var.f54096a) : 0)) * 31;
        yv9 yv9Var = this.f42273j;
        int iHashCode7 = (iHashCode6 + (yv9Var != null ? yv9Var.hashCode() : 0)) * 31;
        xi5 xi5Var = this.f42274k;
        int iM22981d3 = ux5.m22981d(this.f42275l, (iHashCode7 + (xi5Var != null ? xi5Var.f68251a.hashCode() : 0)) * 31, 31);
        rt9 rt9Var = this.f42276m;
        int i3 = (iM22981d3 + (rt9Var != null ? rt9Var.f59804a : 0)) * 31;
        l39 l39Var = this.f42277n;
        int iHashCode8 = (i3 + (l39Var != null ? l39Var.hashCode() : 0)) * 31;
        g97 g97Var = this.f42278o;
        int iHashCode9 = (iHashCode8 + (g97Var != null ? g97Var.hashCode() : 0)) * 31;
        ml2 ml2Var = this.f42279p;
        return iHashCode9 + (ml2Var != null ? ml2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        xv9 xv9Var = this.f42264a;
        sb.append((Object) aa1.m205i(xv9Var.mo24173a()));
        sb.append(", brush=");
        sb.append(xv9Var.mo24174b());
        sb.append(", alpha=");
        sb.append(xv9Var.mo24175c());
        sb.append(", fontSize=");
        sb.append((Object) zx9.m25850e(this.f42265b));
        sb.append(", fontWeight=");
        sb.append(this.f42266c);
        sb.append(", fontStyle=");
        sb.append(this.f42267d);
        sb.append(", fontSynthesis=");
        sb.append(this.f42268e);
        sb.append(", fontFamily=");
        sb.append(this.f42269f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f42270g);
        sb.append(", letterSpacing=");
        sb.append((Object) zx9.m25850e(this.f42271h));
        sb.append(", baselineShift=");
        sb.append(this.f42272i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f42273j);
        sb.append(", localeList=");
        sb.append(this.f42274k);
        sb.append(", background=");
        ux5.m23002y(this.f42275l, ", textDecoration=", sb);
        sb.append(this.f42276m);
        sb.append(", shadow=");
        sb.append(this.f42277n);
        sb.append(", platformStyle=");
        sb.append(this.f42278o);
        sb.append(", drawStyle=");
        sb.append(this.f42279p);
        sb.append(')');
        return sb.toString();
    }

    public he9(xv9 xv9Var, long j, bc3 bc3Var, wb3 wb3Var, xb3 xb3Var, xa3 xa3Var, String str, long j2, oa0 oa0Var, yv9 yv9Var, xi5 xi5Var, long j3, rt9 rt9Var, l39 l39Var, g97 g97Var, ml2 ml2Var) {
        this.f42264a = xv9Var;
        this.f42265b = j;
        this.f42266c = bc3Var;
        this.f42267d = wb3Var;
        this.f42268e = xb3Var;
        this.f42269f = xa3Var;
        this.f42270g = str;
        this.f42271h = j2;
        this.f42272i = oa0Var;
        this.f42273j = yv9Var;
        this.f42274k = xi5Var;
        this.f42275l = j3;
        this.f42276m = rt9Var;
        this.f42277n = l39Var;
        this.f42278o = g97Var;
        this.f42279p = ml2Var;
    }

    public he9(long j, long j2, bc3 bc3Var, wb3 wb3Var, xb3 xb3Var, xa3 xa3Var, String str, long j3, oa0 oa0Var, yv9 yv9Var, xi5 xi5Var, long j4, rt9 rt9Var, l39 l39Var, g97 g97Var, ml2 ml2Var) {
        this(j != 16 ? new xa1(j) : wv9.f67395a, j2, bc3Var, wb3Var, xb3Var, xa3Var, str, j3, oa0Var, yv9Var, xi5Var, j4, rt9Var, l39Var, g97Var, ml2Var);
    }
}
