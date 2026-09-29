package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nr7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final long f53171a;

    public nr7(long j) {
        this.f53171a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr7) && n84.m17279a(this.f53171a, ((nr7) obj).f53171a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f53171a);
    }

    public final String toString() {
        return wq1.m24118n("ContentSizeChanged(size=", n84.m17280b(this.f53171a), ")");
    }
}
