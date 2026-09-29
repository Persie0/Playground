package p000;

/* JADX INFO: loaded from: classes.dex */
public final class iu2 extends ju2 {

    /* JADX INFO: renamed from: a */
    public final long f44571a;

    public iu2(long j) {
        this.f44571a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu2) && this.f44571a == ((iu2) obj).f44571a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44571a);
    }

    public final String toString() {
        return "ExitForeground(timestamp=" + this.f44571a + ')';
    }
}
