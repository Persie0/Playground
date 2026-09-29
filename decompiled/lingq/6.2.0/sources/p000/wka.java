package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wka extends yka {

    /* JADX INFO: renamed from: a */
    public final String f66982a;

    public wka(String str) {
        str.getClass();
        this.f66982a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wka) && fa4.m11650l(this.f66982a, ((wka) obj).f66982a);
    }

    public final int hashCode() {
        return this.f66982a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnItemSelected(filter=", this.f66982a, ")");
    }
}
