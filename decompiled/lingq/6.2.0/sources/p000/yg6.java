package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class yg6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f69815a;

    public yg6(String str) {
        str.getClass();
        this.f69815a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg6) && fa4.m11650l(this.f69815a, ((yg6) obj).f69815a);
    }

    public final int hashCode() {
        return this.f69815a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToContributors(languageCode=", this.f69815a, ")");
    }
}
