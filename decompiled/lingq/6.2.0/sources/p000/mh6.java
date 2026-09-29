package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f51326a;

    public mh6(String str) {
        this.f51326a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh6) && fa4.m11650l(this.f51326a, ((mh6) obj).f51326a);
    }

    public final int hashCode() {
        String str = this.f51326a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToBannerClicked(offer=", this.f51326a, ")");
    }
}
