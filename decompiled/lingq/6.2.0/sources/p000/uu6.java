package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uu6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f64369a;

    public uu6(String str) {
        str.getClass();
        this.f64369a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22942a() {
        return this.f64369a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu6) && fa4.m11650l(this.f64369a, ((uu6) obj).f64369a);
    }

    public final int hashCode() {
        return this.f64369a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("AgeSelected(age=", this.f64369a, ")");
    }
}
