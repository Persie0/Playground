package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ixa extends jxa {

    /* JADX INFO: renamed from: a */
    public final String f44748a;

    public ixa(String str) {
        str.getClass();
        this.f44748a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixa) && fa4.m11650l(this.f44748a, ((ixa) obj).f44748a);
    }

    public final int hashCode() {
        return this.f44748a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnTermChanged(term=", this.f44748a, ")");
    }
}
