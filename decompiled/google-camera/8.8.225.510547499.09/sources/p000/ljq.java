package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljq implements lic {

    /* JADX INFO: renamed from: a */
    public final float f38410a;

    /* JADX INFO: renamed from: b */
    public final int f38411b;

    /* JADX INFO: renamed from: c */
    public final mrm f38412c;

    /* JADX INFO: renamed from: d */
    private final int f38413d;

    public ljq() {
    }

    public ljq(int i, float f, int i2, mrm mrmVar) {
        this.f38413d = i;
        this.f38410a = f;
        this.f38411b = i2;
        this.f38412c = mrmVar;
    }

    /* JADX INFO: renamed from: c */
    public static final lna m15543c() {
        lna lnaVar = new lna(null);
        lnaVar.f38730b = 100.0f;
        lnaVar.f38729a = 1;
        lnaVar.f38733e = 100;
        lnaVar.f38732d = (byte) 3;
        return lnaVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        int i = this.f38413d;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ljq)) {
            return false;
        }
        ljq ljqVar = (ljq) obj;
        int i = this.f38413d;
        int i2 = ljqVar.f38413d;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.f38410a) == Float.floatToIntBits(ljqVar.f38410a) && this.f38411b == ljqVar.f38411b && this.f38412c.equals(ljqVar.f38412c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38413d;
        lid.m15381b(i);
        return ((((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f38410a)) * 1000003) ^ this.f38411b) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + lid.m15380a(this.f38413d) + ", startupSamplePercentage=" + this.f38410a + ", debugLogsSize=" + this.f38411b + ", metricExtensionProvider=null, crashLoopListener=" + String.valueOf(this.f38412c) + "}";
    }
}
