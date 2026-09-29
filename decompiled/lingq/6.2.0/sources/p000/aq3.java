package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aq3 {

    /* JADX INFO: renamed from: a */
    public final long f7358a;

    public final boolean equals(Object obj) {
        if (obj instanceof aq3) {
            return this.f7358a == ((aq3) obj).f7358a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7358a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f7358a + ')';
    }
}
