package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljl implements lic {

    /* JADX INFO: renamed from: a */
    public final int f38397a;

    /* JADX INFO: renamed from: b */
    public final int f38398b;

    /* JADX INFO: renamed from: c */
    public final int f38399c;

    /* JADX INFO: renamed from: d */
    public final int f38400d;

    /* JADX INFO: renamed from: e */
    public final double f38401e;

    /* JADX INFO: renamed from: f */
    private final int f38402f;

    public ljl() {
    }

    public ljl(byte[] bArr) {
        this.f38402f = 1;
        this.f38397a = 2097152;
        this.f38398b = 30000;
        this.f38399c = 5000;
        this.f38400d = 1000;
        this.f38401e = 5.0d;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
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
        if (!(obj instanceof ljl)) {
            return false;
        }
        ljl ljlVar = (ljl) obj;
        int i = this.f38402f;
        int i2 = ljlVar.f38402f;
        if (i != 0) {
            return i2 == 1 && this.f38397a == ljlVar.f38397a && this.f38398b == ljlVar.f38398b && this.f38399c == ljlVar.f38399c && this.f38400d == ljlVar.f38400d && Double.doubleToLongBits(this.f38401e) == Double.doubleToLongBits(ljlVar.f38401e);
        }
        throw null;
    }

    public final int hashCode() {
        lid.m15381b(this.f38402f);
        return ((((((((this.f38397a ^ (-722379962)) * 1000003) ^ this.f38398b) * 1000003) ^ this.f38399c) * 1000003) ^ this.f38400d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f38401e) >>> 32) ^ Double.doubleToLongBits(this.f38401e)));
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + lid.m15380a(this.f38402f) + ", maxBufferSizeBytes=" + this.f38397a + ", sampleDurationMs=" + this.f38398b + ", sampleDurationSkewMs=" + this.f38399c + ", sampleFrequencyMicro=" + this.f38400d + ", samplesPerEpoch=" + this.f38401e + "}";
    }
}
