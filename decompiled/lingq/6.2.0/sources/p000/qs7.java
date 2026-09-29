package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f58145a;

    public qs7(int i) {
        this.f58145a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs7) && this.f58145a == ((qs7) obj).f58145a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58145a);
    }

    public final String toString() {
        return ux5.m22989l("RefreshSentenceTranslation(sentenceIndex=", this.f58145a, ")");
    }
}
