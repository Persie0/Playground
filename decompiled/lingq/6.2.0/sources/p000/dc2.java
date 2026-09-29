package p000;

/* JADX INFO: loaded from: classes.dex */
public final class dc2 {

    /* JADX INFO: renamed from: c */
    public static final dc2 f35376c = new dc2(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f35377a;

    /* JADX INFO: renamed from: b */
    public final long f35378b;

    public dc2(long j, long j2) {
        this.f35377a = j;
        this.f35378b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dc2) {
            dc2 dc2Var = (dc2) obj;
            return n84.m17279a(this.f35377a, dc2Var.f35377a) && this.f35378b == dc2Var.f35378b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35378b) + (Long.hashCode(this.f35377a) * 31);
    }
}
