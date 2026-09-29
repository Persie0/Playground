package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ya8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f69553a;

    public ya8(String str) {
        str.getClass();
        this.f69553a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya8) && fa4.m11650l(this.f69553a, ((ya8) obj).f69553a);
    }

    public final int hashCode() {
        return this.f69553a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnUnscrambleSentenceUpdated(answer=", this.f69553a, ")");
    }
}
