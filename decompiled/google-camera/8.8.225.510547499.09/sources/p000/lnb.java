package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnb implements lic {

    /* JADX INFO: renamed from: a */
    public final float f38734a;

    /* JADX INFO: renamed from: b */
    private final int f38735b;

    /* JADX INFO: renamed from: c */
    private final mrm f38736c;

    /* JADX INFO: renamed from: d */
    private final int f38737d;

    public lnb() {
    }

    public lnb(int i, int i2, float f, mrm mrmVar) {
        this.f38737d = i;
        this.f38735b = i2;
        this.f38734a = f;
        this.f38736c = mrmVar;
    }

    /* JADX INFO: renamed from: c */
    public static final lna m15764c() {
        lna lnaVar = new lna(null);
        lnaVar.f38729a = 10;
        lnaVar.f38730b = 1.0f;
        lnaVar.f38732d = (byte) 3;
        lnaVar.f38731c = mqu.f41450a;
        lnaVar.f38733e = 1;
        return lnaVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final int mo15378a() {
        return this.f38735b;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38737d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lnb)) {
            return false;
        }
        lnb lnbVar = (lnb) obj;
        int i = this.f38737d;
        int i2 = lnbVar.f38737d;
        if (i != 0) {
            return i == i2 && this.f38735b == lnbVar.f38735b && Float.floatToIntBits(this.f38734a) == Float.floatToIntBits(lnbVar.f38734a) && this.f38736c.equals(lnbVar.f38736c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38737d;
        lid.m15381b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.f38735b) * 1000003) ^ Float.floatToIntBits(this.f38734a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + lid.m15380a(this.f38737d) + BEeWZPor.VIWuhrGK + this.f38735b + ", samplingProbability=" + this.f38734a + ", perEventConfigurationFlags=" + String.valueOf(this.f38736c) + "}";
    }
}
