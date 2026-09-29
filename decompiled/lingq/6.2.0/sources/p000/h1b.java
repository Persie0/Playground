package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h1b {

    /* JADX INFO: renamed from: a */
    public final String f41665a;

    public h1b(String str) {
        str.getClass();
        this.f41665a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1b) && fa4.m11650l(this.f41665a, ((h1b) obj).f41665a);
    }

    public final int hashCode() {
        return this.f41665a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("VocabularySearchState(query=", this.f41665a, ")");
    }
}
