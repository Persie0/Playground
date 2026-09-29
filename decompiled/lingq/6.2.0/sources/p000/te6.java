package p000;

/* JADX INFO: loaded from: classes.dex */
public final class te6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f62194a;

    public te6(String str) {
        str.getClass();
        this.f62194a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te6) && fa4.m11650l(this.f62194a, ((te6) obj).f62194a);
    }

    public final int hashCode() {
        return this.f62194a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LoginRedirect(url=", this.f62194a, ")");
    }
}
