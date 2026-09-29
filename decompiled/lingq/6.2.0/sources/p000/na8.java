package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class na8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f52540a;

    public na8(String str) {
        str.getClass();
        this.f52540a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na8) && fa4.m11650l(this.f52540a, ((na8) obj).f52540a);
    }

    public final int hashCode() {
        return this.f52540a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSessionItemTtsClicked(term=", this.f52540a, ")");
    }
}
