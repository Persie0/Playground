package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f48895a;

    public l15(String str) {
        str.getClass();
        this.f48895a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l15) && fa4.m11650l(this.f48895a, ((l15) obj).f48895a);
    }

    public final int hashCode() {
        return this.f48895a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSentenceTextChanged(text=", this.f48895a, ")");
    }
}
