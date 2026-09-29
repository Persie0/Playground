package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class j1b extends k1b {

    /* JADX INFO: renamed from: a */
    public final String f44914a;

    public j1b(String str) {
        str.getClass();
        this.f44914a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1b) && fa4.m11650l(this.f44914a, ((j1b) obj).f44914a);
    }

    public final int hashCode() {
        return this.f44914a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Search(query=", this.f44914a, ")");
    }
}
