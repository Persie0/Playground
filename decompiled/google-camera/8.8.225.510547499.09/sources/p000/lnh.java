package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnh implements lic {

    /* JADX INFO: renamed from: a */
    public final float f38747a;

    /* JADX INFO: renamed from: b */
    private final int f38748b;

    public lnh() {
    }

    public lnh(int i, float f) {
        this.f38748b = i;
        this.f38747a = f;
    }

    /* JADX INFO: renamed from: c */
    public static final lng m15767c() {
        lng lngVar = new lng();
        lngVar.f38744a = 0.5f;
        lngVar.f38745b = (byte) 1;
        lngVar.f38746c = 1;
        return lngVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38748b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lnh)) {
            return false;
        }
        lnh lnhVar = (lnh) obj;
        int i = this.f38748b;
        int i2 = lnhVar.f38748b;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.f38747a) == Float.floatToIntBits(lnhVar.f38747a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38748b;
        lid.m15381b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f38747a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + lid.m15380a(this.f38748b) + ", samplingProbability=" + this.f38747a + "}";
    }
}
