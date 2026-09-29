package ae;

/* JADX INFO: renamed from: ae.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0061a extends AbstractC0067g {

    /* JADX INFO: renamed from: a */
    public final long f143a;

    /* JADX INFO: renamed from: b */
    public final long f144b;

    /* JADX INFO: renamed from: c */
    public final long f145c;

    public C0061a(long j10, long j11, long j12) {
        this.f143a = j10;
        this.f144b = j11;
        this.f145c = j12;
    }

    @Override // ae.AbstractC0067g
    /* JADX INFO: renamed from: a */
    public final long mo241a() {
        return this.f144b;
    }

    @Override // ae.AbstractC0067g
    /* JADX INFO: renamed from: b */
    public final long mo242b() {
        return this.f143a;
    }

    @Override // ae.AbstractC0067g
    /* JADX INFO: renamed from: c */
    public final long mo243c() {
        return this.f145c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0067g)) {
            return false;
        }
        AbstractC0067g abstractC0067g = (AbstractC0067g) obj;
        return this.f143a == abstractC0067g.mo242b() && this.f144b == abstractC0067g.mo241a() && this.f145c == abstractC0067g.mo243c();
    }

    public final int hashCode() {
        long j10 = this.f143a;
        long j11 = this.f144b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f145c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f143a + ", elapsedRealtime=" + this.f144b + ", uptimeMillis=" + this.f145c + "}";
    }
}
