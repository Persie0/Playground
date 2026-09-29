package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8791e {

    /* JADX INFO: renamed from: a */
    public final int f46636a;

    /* JADX INFO: renamed from: b */
    public final String f46637b;

    public C8791e(String str, int i10) {
        C5207g.m11111f(str, "termWithLanguage");
        this.f46636a = i10;
        this.f46637b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8791e)) {
            return false;
        }
        C8791e c8791e = (C8791e) obj;
        return this.f46636a == c8791e.f46636a && C5207g.m11106a(this.f46637b, c8791e.f46637b);
    }

    public final int hashCode() {
        return this.f46637b.hashCode() + (Integer.hashCode(this.f46636a) * 31);
    }

    public final String toString() {
        return "CourseAndCardsJoin(pk=" + this.f46636a + ", termWithLanguage=" + this.f46637b + ")";
    }
}
