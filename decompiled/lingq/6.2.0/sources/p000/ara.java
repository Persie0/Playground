package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ara extends qra {

    /* JADX INFO: renamed from: a */
    public final int f7407a;

    public ara(int i) {
        this.f7407a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ara) && this.f7407a == ((ara) obj).f7407a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7407a);
    }

    public final String toString() {
        return ux5.m22989l("ProgressBarDragFinished(sentencePosition=", this.f7407a, ")");
    }
}
