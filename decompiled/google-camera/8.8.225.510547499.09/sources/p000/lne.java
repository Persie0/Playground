package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lne implements lic {

    /* JADX INFO: renamed from: a */
    private final int f38739a;

    /* JADX INFO: renamed from: b */
    private final mrm f38740b;

    /* JADX INFO: renamed from: c */
    private final boolean f38741c;

    /* JADX INFO: renamed from: d */
    private final int f38742d;

    /* JADX INFO: renamed from: e */
    private final lku f38743e;

    public lne() {
    }

    public lne(lku lkuVar, mrm mrmVar, byte[] bArr, byte[] bArr2) {
        this.f38742d = 2;
        this.f38739a = 10;
        this.f38743e = lkuVar;
        this.f38740b = mrmVar;
        this.f38741c = true;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final int mo15378a() {
        return this.f38739a;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lne)) {
            return false;
        }
        lne lneVar = (lne) obj;
        int i = this.f38742d;
        int i2 = lneVar.f38742d;
        if (i != 0) {
            return i == i2 && this.f38739a == lneVar.f38739a && this.f38743e.equals(lneVar.f38743e) && this.f38740b.equals(lneVar.f38740b) && this.f38741c == lneVar.f38741c;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38742d;
        lid.m15381b(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.f38739a) * 1000003) ^ this.f38743e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.f38741c ? 1237 : 1231);
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + lid.m15380a(this.f38742d) + ", rateLimitPerSecond=" + this.f38739a + ", dynamicSampler=" + String.valueOf(this.f38743e) + ", traceMetricExtensionProvider=" + String.valueOf(this.f38740b) + ", recordTimerDuration=" + this.f38741c + "}";
    }
}
