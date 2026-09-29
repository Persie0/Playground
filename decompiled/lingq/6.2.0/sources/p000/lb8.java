package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lb8 extends nb8 implements sd8 {

    /* JADX INFO: renamed from: a */
    public final int f49415a;

    public lb8(int i) {
        this.f49415a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lb8) && this.f49415a == ((lb8) obj).f49415a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49415a);
    }

    public final String toString() {
        return ux5.m22989l("SpeakingActivity(sentenceIndex=", this.f49415a, ")");
    }
}
