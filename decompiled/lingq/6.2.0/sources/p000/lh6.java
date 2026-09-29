package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f49668a;

    public lh6(String str) {
        str.getClass();
        this.f49668a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh6) && fa4.m11650l(this.f49668a, ((lh6) obj).f49668a);
    }

    public final int hashCode() {
        return this.f49668a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToInvite(link=", this.f49668a, ")");
    }
}
