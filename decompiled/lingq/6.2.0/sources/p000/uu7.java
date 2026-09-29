package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uu7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final String f64370a;

    public uu7(String str) {
        str.getClass();
        this.f64370a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu7) && fa4.m11650l(this.f64370a, ((uu7) obj).f64370a);
    }

    public final int hashCode() {
        return this.f64370a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OpenUrl(url=", this.f64370a, ")");
    }
}
