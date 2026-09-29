package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mb8 extends nb8 implements sd8 {

    /* JADX INFO: renamed from: a */
    public final int f50881a;

    public mb8(int i) {
        this.f50881a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb8) && this.f50881a == ((mb8) obj).f50881a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50881a);
    }

    public final String toString() {
        return ux5.m22989l("UnscrambleActivity(sentenceIndex=", this.f50881a, ")");
    }
}
