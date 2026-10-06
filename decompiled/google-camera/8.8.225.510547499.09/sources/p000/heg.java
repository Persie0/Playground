package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class heg {

    /* JADX INFO: renamed from: a */
    public final int f27455a;

    /* JADX INFO: renamed from: b */
    public final int f27456b;

    /* JADX INFO: renamed from: c */
    public final hev f27457c;

    /* JADX INFO: renamed from: d */
    public final ikw f27458d;

    public heg() {
    }

    public heg(int i, int i2, hev hevVar, ikw ikwVar) {
        this.f27455a = i;
        this.f27456b = i2;
        this.f27457c = hevVar;
        this.f27458d = ikwVar;
    }

    /* JADX INFO: renamed from: a */
    public static kyu m10151a() {
        kyu kyuVar = new kyu();
        kyuVar.m15070f(1);
        kyuVar.m15071g(1);
        return kyuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof heg) {
            heg hegVar = (heg) obj;
            if (this.f27455a == hegVar.f27455a && this.f27456b == hegVar.f27456b && this.f27457c.equals(hegVar.f27457c) && this.f27458d.equals(hegVar.f27458d) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f27455a ^ 1000003) * 1000003) ^ this.f27456b) * 1000003) ^ this.f27457c.hashCode()) * 1000003) ^ this.f27458d.hashCode()) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "Options{numFramesPerSample=" + this.f27455a + ", numSuccessiveSamplesRequired=" + this.f27456b + ", suggestion=" + String.valueOf(this.f27457c) + ", applicationMode=" + String.valueOf(this.f27458d) + ", scoreThreshold=0.0" + VCYBIzY.QAlhRMVIkEI;
    }
}
