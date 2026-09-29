package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final boolean f69302a;

    public y51(boolean z) {
        this.f69302a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y51) && this.f69302a == ((y51) obj).f69302a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69302a);
    }

    public final String toString() {
        return hn1.m13355e("OnSetExpanded(isExpanded=", ")", this.f69302a);
    }
}
