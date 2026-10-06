package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lli implements lic {

    /* JADX INFO: renamed from: a */
    public final mrm f38577a;

    /* JADX INFO: renamed from: b */
    public final boolean f38578b;

    /* JADX INFO: renamed from: c */
    private final int f38579c;

    /* JADX INFO: renamed from: d */
    private final int f38580d;

    public lli() {
    }

    public lli(int i, int i2, mrm mrmVar, boolean z) {
        this.f38580d = i;
        this.f38579c = i2;
        this.f38577a = mrmVar;
        this.f38578b = z;
    }

    /* JADX INFO: renamed from: c */
    public static llh m15707c() {
        llh llhVar = new llh(null);
        llhVar.f38572a = 3;
        llhVar.f38576e = mqu.f41450a;
        llhVar.f38573b = true;
        llhVar.f38574c = (byte) 31;
        llhVar.f38575d = 1;
        return llhVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final int mo15378a() {
        return this.f38579c;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38580d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lli)) {
            return false;
        }
        lli lliVar = (lli) obj;
        int i = this.f38580d;
        int i2 = lliVar.f38580d;
        if (i != 0) {
            return i == i2 && this.f38579c == lliVar.f38579c && this.f38577a.equals(lliVar.f38577a) && this.f38578b == lliVar.f38578b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38580d;
        lid.m15381b(i);
        return ((((((((((((i ^ 1000003) * 1000003) ^ this.f38579c) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.f38578b ? 1237 : 1231);
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + lid.m15380a(this.f38580d) + ", rateLimitPerSecond=" + this.f38579c + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.f38577a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.f38578b + "}";
    }
}
