package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class c24 extends d24 {

    /* JADX INFO: renamed from: a */
    public final String f9350a;

    public c24(String str) {
        str.getClass();
        this.f9350a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c24) && fa4.m11650l(this.f9350a, ((c24) obj).f9350a);
    }

    public final int hashCode() {
        return this.f9350a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnTitleChanged(title=", this.f9350a, ")");
    }
}
