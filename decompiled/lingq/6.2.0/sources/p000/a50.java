package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a50 {

    /* JADX INFO: renamed from: a */
    public final long f247a;

    /* JADX INFO: renamed from: b */
    public final q50 f248b;

    /* JADX INFO: renamed from: c */
    public final l40 f249c;

    public a50(long j, q50 q50Var, l40 l40Var) {
        this.f247a = j;
        this.f248b = q50Var;
        this.f249c = l40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return this.f247a == a50Var.f247a && this.f248b.equals(a50Var.f248b) && this.f249c.equals(a50Var.f249c);
    }

    public final int hashCode() {
        long j = this.f247a;
        return this.f249c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f248b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f247a + ", transportContext=" + this.f248b + ", event=" + this.f249c + "}";
    }
}
