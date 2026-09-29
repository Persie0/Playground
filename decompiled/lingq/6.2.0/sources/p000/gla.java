package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gla extends ila {

    /* JADX INFO: renamed from: a */
    public final String f40978a;

    public gla(String str) {
        str.getClass();
        this.f40978a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gla) && fa4.m11650l(this.f40978a, ((gla) obj).f40978a);
    }

    public final int hashCode() {
        return this.f40978a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Search(query=", this.f40978a, ")");
    }
}
