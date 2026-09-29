package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class s91 {

    /* JADX INFO: renamed from: a */
    public final int f60552a;

    /* JADX INFO: renamed from: b */
    public final String f60553b;

    public s91(int i, String str) {
        str.getClass();
        this.f60552a = i;
        this.f60553b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m21163a() {
        return this.f60552a;
    }

    /* JADX INFO: renamed from: b */
    public final String m21164b() {
        return this.f60553b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91Var = (s91) obj;
        return this.f60552a == s91Var.f60552a && fa4.m11650l(this.f60553b, s91Var.f60553b);
    }

    public final int hashCode() {
        return this.f60553b.hashCode() + (Integer.hashCode(this.f60552a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f60552a, "CollectionSubscriptionEntity(id=", ", language=", this.f60553b, ")");
    }
}
