package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8796j {

    /* JADX INFO: renamed from: a */
    public final String f46648a;

    /* JADX INFO: renamed from: b */
    public final int f46649b;

    public C8796j(String str, int i10) {
        C5207g.m11111f(str, "code");
        this.f46648a = str;
        this.f46649b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8796j)) {
            return false;
        }
        C8796j c8796j = (C8796j) obj;
        return C5207g.m11106a(this.f46648a, c8796j.f46648a) && this.f46649b == c8796j.f46649b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46649b) + (this.f46648a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageAvailableDictionaryJoin(code=" + this.f46648a + ", id=" + this.f46649b + ")";
    }
}
