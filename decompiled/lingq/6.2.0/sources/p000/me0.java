package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class me0 implements oe0 {

    /* JADX INFO: renamed from: a */
    public final String f51192a;

    public me0(String str) {
        str.getClass();
        this.f51192a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me0) && fa4.m11650l(this.f51192a, ((me0) obj).f51192a);
    }

    public final int hashCode() {
        return this.f51192a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("SearchChanged(query=", this.f51192a, ")");
    }
}
