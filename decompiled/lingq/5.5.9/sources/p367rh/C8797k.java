package p367rh;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8797k {

    /* JADX INFO: renamed from: a */
    public final String f46650a;

    /* JADX INFO: renamed from: b */
    public final String f46651b;

    public C8797k(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "code");
        this.f46650a = str;
        this.f46651b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8797k)) {
            return false;
        }
        C8797k c8797k = (C8797k) obj;
        return C5207g.m11106a(this.f46650a, c8797k.f46650a) && C5207g.m11106a(this.f46651b, c8797k.f46651b);
    }

    public final int hashCode() {
        return this.f46651b.hashCode() + (this.f46650a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageDictionaryLocaleJoin(language=");
        sb2.append(this.f46650a);
        sb2.append(", code=");
        return C0009a.m23l(sb2, this.f46651b, ")");
    }
}
