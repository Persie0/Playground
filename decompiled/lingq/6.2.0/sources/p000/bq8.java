package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bq8 extends dq8 {

    /* JADX INFO: renamed from: a */
    public final String f8873a;

    public bq8(String str) {
        str.getClass();
        this.f8873a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq8) && fa4.m11650l(this.f8873a, ((bq8) obj).f8873a);
    }

    public final int hashCode() {
        return this.f8873a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnItemSelected(filterKey=", this.f8873a, ")");
    }
}
