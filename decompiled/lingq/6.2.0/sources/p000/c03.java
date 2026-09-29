package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class c03 extends e03 {

    /* JADX INFO: renamed from: a */
    public final String f9248a;

    public c03(String str) {
        this.f9248a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c03) && this.f9248a.equals(((c03) obj).f9248a);
    }

    public final int hashCode() {
        return this.f9248a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Search(query=", this.f9248a, ")");
    }
}
