package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f55429a;

    public p15(String str) {
        str.getClass();
        this.f55429a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p15) && fa4.m11650l(this.f55429a, ((p15) obj).f55429a);
    }

    public final int hashCode() {
        return this.f55429a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnTranslationFocused(language=", this.f55429a, ")");
    }
}
