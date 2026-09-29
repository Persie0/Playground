package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u15 extends sid {

    /* JADX INFO: renamed from: a */
    public final int f63243a;

    public u15(int i) {
        this.f63243a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u15) && this.f63243a == ((u15) obj).f63243a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63243a);
    }

    public final String toString() {
        return ux5.m22989l("SentencePager(initialPage=", this.f63243a, ")");
    }
}
