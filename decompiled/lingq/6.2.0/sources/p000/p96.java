package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class p96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final String f55803b;

    /* JADX INFO: renamed from: c */
    public final String f55804c;

    public p96(String str, String str2) {
        str.getClass();
        this.f55803b = str;
        this.f55804c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m18993a() {
        return this.f55803b;
    }

    /* JADX INFO: renamed from: b */
    public final String m18994b() {
        return this.f55804c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p96)) {
            return false;
        }
        p96 p96Var = (p96) obj;
        return fa4.m11650l(this.f55803b, p96Var.f55803b) && this.f55804c.equals(p96Var.f55804c);
    }

    public final int hashCode() {
        return this.f55804c.hashCode() + (this.f55803b.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ChallengeDetails(code=", this.f55803b, ", type=", this.f55804c, ")");
    }
}
