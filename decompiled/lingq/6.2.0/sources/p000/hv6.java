package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f42993a;

    public hv6(String str) {
        str.getClass();
        this.f42993a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m13487a() {
        return this.f42993a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv6) && fa4.m11650l(this.f42993a, ((hv6) obj).f42993a);
    }

    public final int hashCode() {
        return this.f42993a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("MotivationSelected(motivation=", this.f42993a, ")");
    }
}
