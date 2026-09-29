package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8800n {

    /* JADX INFO: renamed from: a */
    public final int f46658a;

    /* JADX INFO: renamed from: b */
    public final String f46659b;

    public C8800n(String str, int i10) {
        C5207g.m11111f(str, "termWithLanguage");
        this.f46658a = i10;
        this.f46659b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8800n)) {
            return false;
        }
        C8800n c8800n = (C8800n) obj;
        return this.f46658a == c8800n.f46658a && C5207g.m11106a(this.f46659b, c8800n.f46659b);
    }

    public final int hashCode() {
        return this.f46659b.hashCode() + (Integer.hashCode(this.f46658a) * 31);
    }

    public final String toString() {
        return "LessonsAndWordsJoin(contentId=" + this.f46658a + ", termWithLanguage=" + this.f46659b + ")";
    }
}
