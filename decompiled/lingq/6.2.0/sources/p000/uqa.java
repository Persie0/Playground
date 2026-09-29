package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uqa extends qra {

    /* JADX INFO: renamed from: a */
    public final int f64233a;

    public uqa(int i) {
        this.f64233a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqa) && this.f64233a == ((uqa) obj).f64233a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64233a);
    }

    public final String toString() {
        return ux5.m22989l("MarkSentenceKnown(sentenceIndex=", this.f64233a, ")");
    }
}
