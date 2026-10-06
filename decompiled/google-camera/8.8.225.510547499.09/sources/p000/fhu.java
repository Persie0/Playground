package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhu implements kba {

    /* JADX INFO: renamed from: a */
    public final long f22075a;

    /* JADX INFO: renamed from: b */
    public final nqf f22076b;

    /* JADX INFO: renamed from: c */
    public final nqf f22077c;

    public fhu() {
    }

    public fhu(long j, nqf nqfVar, nqf nqfVar2) {
        this.f22075a = j;
        this.f22076b = nqfVar;
        this.f22077c = nqfVar2;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f22076b.cancel(true);
        this.f22077c.cancel(true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhu) {
            fhu fhuVar = (fhu) obj;
            if (this.f22075a == fhuVar.f22075a && this.f22076b.equals(fhuVar.f22076b) && this.f22077c.equals(fhuVar.f22077c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22075a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22076b.hashCode()) * 1000003) ^ this.f22077c.hashCode();
    }

    public final String toString() {
        return "EncoderFrameInfo{timestampNs=" + this.f22075a + ", stabilizationTransforms=" + this.f22076b.toString() + ", encodeDecision=" + this.f22077c.toString() + "}";
    }
}
