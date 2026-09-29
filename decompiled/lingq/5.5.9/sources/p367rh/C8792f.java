package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8792f {

    /* JADX INFO: renamed from: a */
    public final int f46638a;

    /* JADX INFO: renamed from: b */
    public final String f46639b;

    public C8792f(String str, int i10) {
        C5207g.m11111f(str, "language");
        this.f46638a = i10;
        this.f46639b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8792f)) {
            return false;
        }
        C8792f c8792f = (C8792f) obj;
        return this.f46638a == c8792f.f46638a && C5207g.m11106a(this.f46639b, c8792f.f46639b);
    }

    public final int hashCode() {
        return this.f46639b.hashCode() + (Integer.hashCode(this.f46638a) * 31);
    }

    public final String toString() {
        return "CoursesAndLanguageJoin(pk=" + this.f46638a + ", language=" + this.f46639b + ")";
    }
}
