package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class l1b {

    /* JADX INFO: renamed from: a */
    public final String f48905a;

    public l1b(String str) {
        str.getClass();
        this.f48905a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1b) && fa4.m11650l(this.f48905a, ((l1b) obj).f48905a);
    }

    public final int hashCode() {
        return this.f48905a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("VocabularySelectionSearchState(query=", this.f48905a, ")");
    }
}
