package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmg {

    /* JADX INFO: renamed from: a */
    public final int f25591a;

    /* JADX INFO: renamed from: b */
    public final mws f25592b;

    public gmg(int i, mws mwsVar) {
        this.f25591a = i;
        if (mwsVar == null) {
            throw new NullPointerException("Null manualWhiteBalanceFactors");
        }
        this.f25592b = mwsVar;
    }

    /* JADX INFO: renamed from: a */
    public static gmg m9511a(int i, mws mwsVar) {
        return new gmg(i, mwsVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gmg) {
            gmg gmgVar = (gmg) obj;
            if (this.f25591a == gmgVar.f25591a && mkv.m16505M(this.f25592b, gmgVar.f25592b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25591a ^ 1000003) * 1000003) ^ this.f25592b.hashCode();
    }

    public final String toString() {
        return "ManualWhiteBalanceSettings{manualWhiteBalanceMode=" + this.f25591a + ", manualWhiteBalanceFactors=" + this.f25592b.toString() + "}";
    }

    public gmg() {
    }
}
