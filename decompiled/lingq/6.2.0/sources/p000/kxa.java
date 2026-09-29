package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kxa {

    /* JADX INFO: renamed from: a */
    public final String f48567a;

    /* JADX INFO: renamed from: b */
    public final boolean f48568b;

    public kxa(String str) {
        str.getClass();
        this.f48567a = str;
        this.f48568b = !vk9.m23391n0(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxa) && fa4.m11650l(this.f48567a, ((kxa) obj).f48567a);
    }

    public final int hashCode() {
        return this.f48567a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("VocabularyAddSheetState(term=", this.f48567a, ")");
    }
}
