package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f62949a;

    public tv6(String str) {
        str.getClass();
        this.f62949a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22314a() {
        return this.f62949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv6) && fa4.m11650l(this.f62949a, ((tv6) obj).f62949a);
    }

    public final int hashCode() {
        return this.f62949a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("WhereSelected(whereUse=", this.f62949a, ")");
    }
}
