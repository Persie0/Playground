package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class j03 extends n03 {

    /* JADX INFO: renamed from: a */
    public final String f44836a;

    public j03(String str) {
        str.getClass();
        this.f44836a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j03) && fa4.m11650l(this.f44836a, ((j03) obj).f44836a);
    }

    public final int hashCode() {
        return this.f44836a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnQueryChanged(query=", this.f44836a, ")");
    }
}
