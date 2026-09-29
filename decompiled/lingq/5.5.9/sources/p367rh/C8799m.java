package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8799m {

    /* JADX INFO: renamed from: a */
    public final int f46656a;

    /* JADX INFO: renamed from: b */
    public final String f46657b;

    public C8799m(String str, int i10) {
        C5207g.m11111f(str, "termWithLanguage");
        this.f46656a = i10;
        this.f46657b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8799m)) {
            return false;
        }
        C8799m c8799m = (C8799m) obj;
        return this.f46656a == c8799m.f46656a && C5207g.m11106a(this.f46657b, c8799m.f46657b);
    }

    public final int hashCode() {
        return this.f46657b.hashCode() + (Integer.hashCode(this.f46656a) * 31);
    }

    public final String toString() {
        return "LessonsAndCardsJoin(contentId=" + this.f46656a + ", termWithLanguage=" + this.f46657b + ")";
    }
}
