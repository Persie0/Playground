package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f47299a;

    public kh6(String str) {
        str.getClass();
        this.f47299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh6) && fa4.m11650l(this.f47299a, ((kh6) obj).f47299a);
    }

    public final int hashCode() {
        return this.f47299a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToCopy(link=", this.f47299a, ")");
    }
}
