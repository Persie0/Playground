package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f40821a;

    public gh6(String str) {
        str.getClass();
        this.f40821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh6) && fa4.m11650l(this.f40821a, ((gh6) obj).f40821a);
    }

    public final int hashCode() {
        return this.f40821a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnOpenUrl(url=", this.f40821a, ")");
    }
}
