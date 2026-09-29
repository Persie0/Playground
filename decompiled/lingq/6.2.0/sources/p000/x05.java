package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class x05 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f67590a;

    public x05(String str) {
        str.getClass();
        this.f67590a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x05) && fa4.m11650l(this.f67590a, ((x05) obj).f67590a);
    }

    public final int hashCode() {
        return this.f67590a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnAddNote(localeCode=", this.f67590a, ")");
    }
}
