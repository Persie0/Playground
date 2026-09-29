package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tu6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f62913a;

    public tu6(String str) {
        str.getClass();
        this.f62913a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22308a() {
        return this.f62913a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu6) && fa4.m11650l(this.f62913a, ((tu6) obj).f62913a);
    }

    public final int hashCode() {
        return this.f62913a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("AccentSelected(accent=", this.f62913a, ")");
    }
}
