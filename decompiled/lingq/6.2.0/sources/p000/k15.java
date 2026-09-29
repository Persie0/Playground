package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final int f46551a;

    public k15(int i) {
        this.f46551a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k15) && this.f46551a == ((k15) obj).f46551a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46551a);
    }

    public final String toString() {
        return ux5.m22989l("OnSentenceTapped(sentenceIndex=", this.f46551a, ")");
    }
}
