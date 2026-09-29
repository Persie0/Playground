package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f36215a;

    public dt7(int i) {
        this.f36215a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt7) && this.f36215a == ((dt7) obj).f36215a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36215a);
    }

    public final String toString() {
        return ux5.m22989l("ToggleSentenceNotes(sentenceIndex=", this.f36215a, ")");
    }
}
