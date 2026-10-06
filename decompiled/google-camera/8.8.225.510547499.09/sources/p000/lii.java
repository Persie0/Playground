package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lii implements lic {

    /* JADX INFO: renamed from: a */
    private final int f38305a;

    /* JADX INFO: renamed from: b */
    private final lig f38306b;

    public lii() {
    }

    public lii(int i, lig ligVar) {
        this.f38305a = i;
        this.f38306b = ligVar;
    }

    /* JADX INFO: renamed from: c */
    public static final lih m15392c() {
        lih lihVar = new lih();
        lihVar.f38304b = lig.f38302a;
        lihVar.f38303a = 1;
        return lihVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38305a == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lii)) {
            return false;
        }
        lii liiVar = (lii) obj;
        int i = this.f38305a;
        int i2 = liiVar.f38305a;
        if (i != 0) {
            return i == i2 && this.f38306b.equals(liiVar.f38306b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38305a;
        lid.m15381b(i);
        return ((i ^ 1000003) * 1000003) ^ this.f38306b.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + lid.m15380a(this.f38305a) + ", metricExtensionProvider=" + String.valueOf(this.f38306b) + "}";
    }
}
