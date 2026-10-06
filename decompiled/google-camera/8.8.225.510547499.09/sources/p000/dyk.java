package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyk {

    /* JADX INFO: renamed from: a */
    public final long f12918a;

    /* JADX INFO: renamed from: b */
    public final float f12919b;

    /* JADX INFO: renamed from: c */
    public final mrm f12920c;

    /* JADX INFO: renamed from: d */
    public final float f12921d;

    /* JADX INFO: renamed from: e */
    private final mrm f12922e;

    public dyk() {
    }

    public dyk(long j, mrm mrmVar, float f, mrm mrmVar2, float f2) {
        this.f12918a = j;
        this.f12922e = mrmVar;
        this.f12919b = f;
        this.f12920c = mrmVar2;
        this.f12921d = f2;
    }

    /* JADX INFO: renamed from: a */
    public static dyj m6933a() {
        dyj dyjVar = new dyj(null);
        dyjVar.m6932d(-1L);
        dyjVar.f12912a = mqu.f41450a;
        dyjVar.m6931c(0.0f);
        dyjVar.f12913b = mqu.f41450a;
        dyjVar.m6930b(0.0f);
        return dyjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyk) {
            dyk dykVar = (dyk) obj;
            if (this.f12918a == dykVar.f12918a && this.f12922e.equals(dykVar.f12922e) && Float.floatToIntBits(this.f12919b) == Float.floatToIntBits(dykVar.f12919b) && this.f12920c.equals(dykVar.f12920c) && Float.floatToIntBits(this.f12921d) == Float.floatToIntBits(dykVar.f12921d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12918a;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12922e.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f12919b)) * 1000003) ^ this.f12920c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f12921d);
    }

    public final String toString() {
        return "FrequentFace{trackId=" + this.f12918a + ", identityId=" + String.valueOf(this.f12922e) + ", score=" + this.f12919b + ", aggregatedToneProbabilities=" + String.valueOf(this.f12920c) + ", aggregatedToneConfidence=" + this.f12921d + "}";
    }
}
