package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y05 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f69051a;

    public y05(String str) {
        str.getClass();
        this.f69051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y05) && fa4.m11650l(this.f69051a, ((y05) obj).f69051a);
    }

    public final int hashCode() {
        return this.f69051a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnAddTranslation(localeCode=", this.f69051a, ")");
    }
}
