package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tra extends csa {

    /* JADX INFO: renamed from: a */
    public final String f62788a;

    public tra(String str) {
        str.getClass();
        this.f62788a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tra) && fa4.m11650l(this.f62788a, ((tra) obj).f62788a);
    }

    public final int hashCode() {
        return this.f62788a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("GrammarGuide(url=", this.f62788a, ")");
    }
}
