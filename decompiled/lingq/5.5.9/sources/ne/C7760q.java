package ne;

/* JADX INFO: renamed from: ne.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7760q extends AbstractC7743b0.e.d.a.b.c {

    /* JADX INFO: renamed from: a */
    public final String f42636a;

    /* JADX INFO: renamed from: b */
    public final String f42637b;

    /* JADX INFO: renamed from: c */
    public final long f42638c;

    public C7760q(String str, String str2, long j10) {
        this.f42636a = str;
        this.f42637b = str2;
        this.f42638c = j10;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.c
    /* JADX INFO: renamed from: a */
    public final long mo15422a() {
        return this.f42638c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.c
    /* JADX INFO: renamed from: b */
    public final String mo15423b() {
        return this.f42637b;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.c
    /* JADX INFO: renamed from: c */
    public final String mo15424c() {
        return this.f42636a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b.c)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b.c cVar = (AbstractC7743b0.e.d.a.b.c) obj;
        return this.f42636a.equals(cVar.mo15424c()) && this.f42637b.equals(cVar.mo15423b()) && this.f42638c == cVar.mo15422a();
    }

    public final int hashCode() {
        int iHashCode = (((this.f42636a.hashCode() ^ 1000003) * 1000003) ^ this.f42637b.hashCode()) * 1000003;
        long j10 = this.f42638c;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "Signal{name=" + this.f42636a + ", code=" + this.f42637b + ", address=" + this.f42638c + "}";
    }
}
