package p040c4;

import dm.C5207g;

/* JADX INFO: renamed from: c4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1690o {

    /* JADX INFO: renamed from: a */
    public final boolean f9425a;

    /* JADX INFO: renamed from: b */
    public final boolean f9426b;

    /* JADX INFO: renamed from: c */
    public final int f9427c;

    /* JADX INFO: renamed from: d */
    public final boolean f9428d;

    /* JADX INFO: renamed from: e */
    public final boolean f9429e;

    /* JADX INFO: renamed from: f */
    public final int f9430f;

    /* JADX INFO: renamed from: g */
    public final int f9431g;

    /* JADX INFO: renamed from: h */
    public final int f9432h;

    /* JADX INFO: renamed from: i */
    public final int f9433i;

    /* JADX INFO: renamed from: c4.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f9434a = -1;

        /* JADX INFO: renamed from: b */
        public int f9435b = -1;

        /* JADX INFO: renamed from: c */
        public int f9436c = -1;

        /* JADX INFO: renamed from: d */
        public int f9437d = -1;
    }

    public C1690o(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f9425a = z10;
        this.f9426b = z11;
        this.f9427c = i10;
        this.f9428d = z12;
        this.f9429e = z13;
        this.f9430f = i11;
        this.f9431g = i12;
        this.f9432h = i13;
        this.f9433i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5207g.m11106a(C1690o.class, obj.getClass())) {
            C1690o c1690o = (C1690o) obj;
            if (this.f9425a == c1690o.f9425a && this.f9426b == c1690o.f9426b && this.f9427c == c1690o.f9427c) {
                c1690o.getClass();
                if (C5207g.m11106a(null, null) && this.f9428d == c1690o.f9428d && this.f9429e == c1690o.f9429e && this.f9430f == c1690o.f9430f && this.f9431g == c1690o.f9431g && this.f9432h == c1690o.f9432h && this.f9433i == c1690o.f9433i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f9425a ? 1 : 0) * 31) + (this.f9426b ? 1 : 0)) * 31) + this.f9427c) * 31) + 0) * 31) + (this.f9428d ? 1 : 0)) * 31) + (this.f9429e ? 1 : 0)) * 31) + this.f9430f) * 31) + this.f9431g) * 31) + this.f9432h) * 31) + this.f9433i;
    }
}
