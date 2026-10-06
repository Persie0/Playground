package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hek {

    /* JADX INFO: renamed from: a */
    public final int f27468a;

    /* JADX INFO: renamed from: b */
    public final int f27469b;

    /* JADX INFO: renamed from: c */
    public final hev f27470c;

    public hek() {
    }

    public hek(int i, int i2, hev hevVar) {
        this.f27468a = i;
        this.f27469b = i2;
        this.f27470c = hevVar;
    }

    /* JADX INFO: renamed from: a */
    public static hej m10157a() {
        hej hejVar = new hej();
        hejVar.m10155b(3);
        hejVar.m10156c(10);
        return hejVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hek) {
            hek hekVar = (hek) obj;
            if (this.f27468a == hekVar.f27468a && this.f27469b == hekVar.f27469b && this.f27470c.equals(hekVar.f27470c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27468a ^ 1000003) * 1000003) ^ this.f27469b) * 1000003) ^ this.f27470c.hashCode();
    }

    public final String toString() {
        return "Options{samplingPeriod=" + this.f27468a + ", successiveSamplesRequired=" + this.f27469b + ", suggestion=" + String.valueOf(this.f27470c) + "}";
    }
}
