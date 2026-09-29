package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class aza extends cza {

    /* JADX INFO: renamed from: a */
    public final String f7700a;

    public aza(String str) {
        str.getClass();
        this.f7700a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aza) && fa4.m11650l(this.f7700a, ((aza) obj).f7700a);
    }

    public final int hashCode() {
        return this.f7700a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnItemSelected(filter=", this.f7700a, ")");
    }
}
