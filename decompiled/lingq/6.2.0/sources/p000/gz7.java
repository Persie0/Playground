package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gz7 extends jz7 {

    /* JADX INFO: renamed from: a */
    public final String f41553a;

    public gz7(String str) {
        this.f41553a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz7) && this.f41553a.equals(((gz7) obj).f41553a);
    }

    public final int hashCode() {
        return this.f41553a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnRemoveDictionaryLocale(locale=", this.f41553a, ")");
    }
}
