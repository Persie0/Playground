package p367rh;

import dm.C5207g;

/* JADX INFO: renamed from: rh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8794h {

    /* JADX INFO: renamed from: a */
    public final String f46643a;

    /* JADX INFO: renamed from: b */
    public final int f46644b;

    public C8794h(String str, int i10) {
        C5207g.m11111f(str, "code");
        this.f46643a = str;
        this.f46644b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8794h)) {
            return false;
        }
        C8794h c8794h = (C8794h) obj;
        return C5207g.m11106a(this.f46643a, c8794h.f46643a) && this.f46644b == c8794h.f46644b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46644b) + (this.f46643a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageActiveDictionaryJoin(code=" + this.f46643a + ", id=" + this.f46644b + ")";
    }
}
