package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ff6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f38999a;

    public ff6(String str) {
        this.f38999a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff6) && this.f38999a.equals(((ff6) obj).f38999a);
    }

    public final int hashCode() {
        return this.f38999a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("VocabularyFilter(filter=", this.f38999a, ")");
    }
}
