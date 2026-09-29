package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sqa extends qra {

    /* JADX INFO: renamed from: a */
    public final int f61270a;

    public sqa(int i) {
        this.f61270a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqa) && this.f61270a == ((sqa) obj).f61270a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61270a);
    }

    public final String toString() {
        return ux5.m22989l("JumpToSentence(sentenceIndex=", this.f61270a, ")");
    }
}
