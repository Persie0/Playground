package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgy {

    /* JADX INFO: renamed from: a */
    public final npv f38245a;

    /* JADX INFO: renamed from: b */
    public final int f38246b;

    /* JADX INFO: renamed from: c */
    public final int f38247c;

    /* JADX INFO: renamed from: d */
    public final boolean f38248d;

    public lgy() {
    }

    public lgy(npv npvVar, int i, int i2, boolean z) {
        this.f38245a = npvVar;
        this.f38246b = i;
        this.f38247c = i2;
        this.f38248d = z;
    }

    /* JADX INFO: renamed from: a */
    public static llh m15327a() {
        llh llhVar = new llh();
        llhVar.f38572a = 11;
        llhVar.f38575d = 2;
        llhVar.f38573b = true;
        llhVar.f38574c = (byte) 7;
        return llhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lgy)) {
            return false;
        }
        lgy lgyVar = (lgy) obj;
        npv npvVar = this.f38245a;
        if (npvVar != null ? npvVar.equals(lgyVar.f38245a) : lgyVar.f38245a == null) {
            if (this.f38246b == lgyVar.f38246b && this.f38247c == lgyVar.f38247c && this.f38248d == lgyVar.f38248d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        npv npvVar = this.f38245a;
        return (((((((npvVar == null ? 0 : npvVar.hashCode()) ^ 1000003) * 1000003) ^ this.f38246b) * 1000003) ^ this.f38247c) * 1000003) ^ (true != this.f38248d ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.f38245a) + ", primesMetricExecutorPriority=" + this.f38246b + ", primesMetricExecutorPoolSize=" + this.f38247c + ", enableDeferredTasks=" + this.f38248d + "}";
    }
}
