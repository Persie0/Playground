package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cf6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f10003a;

    public cf6(String str) {
        str.getClass();
        this.f10003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf6) && fa4.m11650l(this.f10003a, ((cf6) obj).f10003a);
    }

    public final int hashCode() {
        return this.f10003a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ShowWebpage(url=", this.f10003a, ")");
    }
}
