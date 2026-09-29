package p445w1;

import dm.C5207g;

/* JADX INFO: renamed from: w1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9802l {

    /* JADX INFO: renamed from: c */
    public static final C9802l f49922c = new C9802l(2, false);

    /* JADX INFO: renamed from: d */
    public static final C9802l f49923d = new C9802l(1, true);

    /* JADX INFO: renamed from: a */
    public final int f49924a;

    /* JADX INFO: renamed from: b */
    public final boolean f49925b;

    public C9802l(int i10, boolean z10) {
        this.f49924a = i10;
        this.f49925b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9802l)) {
            return false;
        }
        C9802l c9802l = (C9802l) obj;
        return (this.f49924a == c9802l.f49924a) && this.f49925b == c9802l.f49925b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49925b) + (Integer.hashCode(this.f49924a) * 31);
    }

    public final String toString() {
        if (C5207g.m11106a(this, f49922c)) {
            return "TextMotion.Static";
        }
        return C5207g.m11106a(this, f49923d) ? "TextMotion.Animated" : "Invalid";
    }
}
