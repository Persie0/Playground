package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kra extends qra {

    /* JADX INFO: renamed from: a */
    public final int f48371a;

    public kra(int i) {
        this.f48371a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kra) && this.f48371a == ((kra) obj).f48371a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48371a);
    }

    public final String toString() {
        return ux5.m22989l("ToggleSentenceTranslation(sentenceIndex=", this.f48371a, ")");
    }
}
