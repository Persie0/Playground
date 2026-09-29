package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class eh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f37256a;

    public eh6(String str) {
        this.f37256a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh6) && this.f37256a.equals(((eh6) obj).f37256a);
    }

    public final int hashCode() {
        return this.f37256a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToWeb(url=", this.f37256a, ")");
    }
}
