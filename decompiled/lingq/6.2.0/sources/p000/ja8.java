package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ja8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f45352a;

    public ja8(String str) {
        str.getClass();
        this.f45352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja8) && fa4.m11650l(this.f45352a, ((ja8) obj).f45352a);
    }

    public final int hashCode() {
        return this.f45352a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnMatchingWordTapped(word=", this.f45352a, ")");
    }
}
