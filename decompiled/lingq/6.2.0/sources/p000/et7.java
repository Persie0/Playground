package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class et7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f37829a;

    public et7(int i) {
        this.f37829a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et7) && this.f37829a == ((et7) obj).f37829a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37829a);
    }

    public final String toString() {
        return ux5.m22989l("ToggleSentenceTranslation(sentenceIndex=", this.f37829a, ")");
    }
}
