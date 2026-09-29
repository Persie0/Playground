package fi;

import dm.C5207g;

/* JADX INFO: renamed from: fi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5538b {

    /* JADX INFO: renamed from: a */
    public final String f34249a;

    /* JADX INFO: renamed from: b */
    public final int f34250b;

    public C5538b() {
        this("", 0);
    }

    public C5538b(String str, int i10) {
        C5207g.m11111f(str, "code");
        this.f34249a = str;
        this.f34250b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5538b)) {
            return false;
        }
        C5538b c5538b = (C5538b) obj;
        if (C5207g.m11106a(this.f34249a, c5538b.f34249a) && this.f34250b == c5538b.f34250b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34250b) + (this.f34249a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeInfoStats(code=" + this.f34249a + ", value=" + this.f34250b + ")";
    }
}
