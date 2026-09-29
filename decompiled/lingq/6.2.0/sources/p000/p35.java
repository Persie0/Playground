package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class p35 implements r35 {

    /* JADX INFO: renamed from: a */
    public final String f55518a;

    public p35(String str) {
        str.getClass();
        this.f55518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p35) && fa4.m11650l(this.f55518a, ((p35) obj).f55518a);
    }

    public final int hashCode() {
        return this.f55518a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OpenUrl(url=", this.f55518a, ")");
    }
}
