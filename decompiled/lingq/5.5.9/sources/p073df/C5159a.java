package p073df;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5159a extends AbstractC5165g {

    /* JADX INFO: renamed from: a */
    public final String f33156a;

    /* JADX INFO: renamed from: b */
    public final long f33157b;

    /* JADX INFO: renamed from: c */
    public final long f33158c;

    public C5159a(String str, long j10, long j11) {
        this.f33156a = str;
        this.f33157b = j10;
        this.f33158c = j11;
    }

    @Override // p073df.AbstractC5165g
    /* JADX INFO: renamed from: a */
    public final String mo10938a() {
        return this.f33156a;
    }

    @Override // p073df.AbstractC5165g
    /* JADX INFO: renamed from: b */
    public final long mo10939b() {
        return this.f33158c;
    }

    @Override // p073df.AbstractC5165g
    /* JADX INFO: renamed from: c */
    public final long mo10940c() {
        return this.f33157b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5165g)) {
            return false;
        }
        AbstractC5165g abstractC5165g = (AbstractC5165g) obj;
        return this.f33156a.equals(abstractC5165g.mo10938a()) && this.f33157b == abstractC5165g.mo10940c() && this.f33158c == abstractC5165g.mo10939b();
    }

    public final int hashCode() {
        int iHashCode = (this.f33156a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f33157b;
        long j11 = this.f33158c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f33156a + ", tokenExpirationTimestamp=" + this.f33157b + ", tokenCreationTimestamp=" + this.f33158c + "}";
    }
}
