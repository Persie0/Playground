package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class v95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final String f65079a;

    public v95(String str) {
        str.getClass();
        this.f65079a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m23192a() {
        return this.f65079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v95) && fa4.m11650l(this.f65079a, ((v95) obj).f65079a);
    }

    public final int hashCode() {
        return this.f65079a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NavigateToYearInReview(url=", this.f65079a, ")");
    }
}
