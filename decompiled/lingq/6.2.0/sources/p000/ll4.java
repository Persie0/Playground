package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ll4 {

    /* JADX INFO: renamed from: a */
    public final String f49795a;

    /* JADX INFO: renamed from: b */
    public final int f49796b;

    public ll4(String str, int i) {
        str.getClass();
        this.f49795a = str;
        this.f49796b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll4)) {
            return false;
        }
        ll4 ll4Var = (ll4) obj;
        return fa4.m11650l(this.f49795a, ll4Var.f49795a) && this.f49796b == ll4Var.f49796b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49796b) + (this.f49795a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageAvailableDictionaryJoin(code=" + this.f49795a + ", id=" + this.f49796b + ")";
    }
}
