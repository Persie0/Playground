package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f9053a;

    public bv6(String str) {
        str.getClass();
        this.f9053a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4194a() {
        return this.f9053a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv6) && fa4.m11650l(this.f9053a, ((bv6) obj).f9053a);
    }

    public final int hashCode() {
        return this.f9053a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LanguageSelected(language=", this.f9053a, ")");
    }
}
