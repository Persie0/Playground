package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f49013a;

    public l42(String str) {
        str.getClass();
        this.f49013a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l42) && fa4.m11650l(this.f49013a, ((l42) obj).f49013a);
    }

    public final int hashCode() {
        return this.f49013a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LoginRedirect(url=", this.f49013a, ")");
    }
}
