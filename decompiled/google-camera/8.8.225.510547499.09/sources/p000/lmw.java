package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmw implements lic {

    /* JADX INFO: renamed from: a */
    public final mrm f38713a;

    /* JADX INFO: renamed from: b */
    private final int f38714b;

    public lmw() {
    }

    public lmw(int i, mrm mrmVar) {
        this.f38714b = i;
        this.f38713a = mrmVar;
    }

    /* JADX INFO: renamed from: c */
    public static final lmv m15745c() {
        lmv lmvVar = new lmv(null);
        lmvVar.f38710a = (byte) 1;
        lmvVar.f38712c = mqu.f41450a;
        lmvVar.f38711b = 1;
        return lmvVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38714b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmw)) {
            return false;
        }
        lmw lmwVar = (lmw) obj;
        int i = this.f38714b;
        int i2 = lmwVar.f38714b;
        if (i != 0) {
            return i == i2 && this.f38713a.equals(lmwVar.f38713a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38714b;
        lid.m15381b(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.f38713a.hashCode();
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + lid.m15380a(this.f38714b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.f38713a) + "}";
    }
}
