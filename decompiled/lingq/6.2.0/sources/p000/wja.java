package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wja {

    /* JADX INFO: renamed from: a */
    public final String f66948a;

    public wja(String str) {
        str.getClass();
        this.f66948a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wja) && fa4.m11650l(this.f66948a, ((wja) obj).f66948a);
    }

    public final int hashCode() {
        return this.f66948a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnDone(courseName=", this.f66948a, ")");
    }
}
