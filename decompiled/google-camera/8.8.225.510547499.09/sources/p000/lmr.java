package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmr implements lic {

    /* JADX INFO: renamed from: a */
    public final int f38704a;

    /* JADX INFO: renamed from: b */
    public final mws f38705b;

    /* JADX INFO: renamed from: c */
    private final int f38706c;

    public lmr() {
    }

    public lmr(int i, int i2, mws mwsVar) {
        this.f38706c = 3;
        this.f38704a = 5;
        this.f38705b = mwsVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38706c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmr)) {
            return false;
        }
        lmr lmrVar = (lmr) obj;
        int i = this.f38706c;
        int i2 = lmrVar.f38706c;
        if (i != 0) {
            return i == i2 && this.f38704a == lmrVar.f38704a && mkv.m16505M(this.f38705b, lmrVar.f38705b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38706c;
        lid.m15381b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.f38704a) * 1000003) ^ this.f38705b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "DirStatsConfigurations{enablement=" + lid.m15380a(this.f38706c) + ", maxFolderDepth=" + this.f38704a + ", listPathMatchers=" + String.valueOf(this.f38705b) + ", includeDeviceEncryptedStorage=false}";
    }
}
