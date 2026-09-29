package p214k5;

import dm.C5207g;

/* JADX INFO: renamed from: k5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6602d {

    /* JADX INFO: renamed from: a */
    public final String f37503a;

    /* JADX INFO: renamed from: b */
    public final Long f37504b;

    public C6602d(String str, Long l10) {
        this.f37503a = str;
        this.f37504b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6602d)) {
            return false;
        }
        C6602d c6602d = (C6602d) obj;
        return C5207g.m11106a(this.f37503a, c6602d.f37503a) && C5207g.m11106a(this.f37504b, c6602d.f37504b);
    }

    public final int hashCode() {
        int iHashCode = this.f37503a.hashCode() * 31;
        Long l10 = this.f37504b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f37503a + ", value=" + this.f37504b + ')';
    }
}
