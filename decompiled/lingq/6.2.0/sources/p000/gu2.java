package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gu2 extends ju2 {

    /* JADX INFO: renamed from: a */
    public final long f41322a;

    public gu2(long j) {
        this.f41322a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu2) && this.f41322a == ((gu2) obj).f41322a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41322a);
    }

    public final String toString() {
        return "EnterForeground(timestamp=" + this.f41322a + ')';
    }
}
