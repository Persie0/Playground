package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cs8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final String f34495a;

    public cs8(String str) {
        str.getClass();
        this.f34495a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs8) && fa4.m11650l(this.f34495a, ((cs8) obj).f34495a);
    }

    public final int hashCode() {
        return this.f34495a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSearch(query=", this.f34495a, ")");
    }
}
