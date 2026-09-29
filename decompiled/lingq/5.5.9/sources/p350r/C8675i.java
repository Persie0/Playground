package p350r;

import androidx.activity.result.C0204c;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8675i {

    /* JADX INFO: renamed from: a */
    public final float f46261a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10015c f46262b;

    /* JADX INFO: renamed from: c */
    public final float f46263c;

    /* JADX INFO: renamed from: r.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f46264a;

        /* JADX INFO: renamed from: b */
        public final float f46265b;

        /* JADX INFO: renamed from: c */
        public final long f46266c;

        public a(float f3, float f10, long j10) {
            this.f46264a = f3;
            this.f46265b = f10;
            this.f46266c = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f46264a, aVar.f46264a) == 0 && Float.compare(this.f46265b, aVar.f46265b) == 0 && this.f46266c == aVar.f46266c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f46266c) + C0204c.m846e(this.f46265b, Float.hashCode(this.f46264a) * 31, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f46264a + ", distance=" + this.f46265b + ", duration=" + this.f46266c + ')';
        }
    }

    public C8675i(float f3, InterfaceC10015c interfaceC10015c) {
        this.f46261a = f3;
        this.f46262b = interfaceC10015c;
        float density = interfaceC10015c.getDensity();
        float f10 = C8676j.f46267a;
        this.f46263c = density * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX INFO: renamed from: a */
    public final a m16929a(float f3) {
        double dM16930b = m16930b(f3);
        double d10 = C8676j.f46267a;
        double d11 = d10 - 1.0d;
        return new a(f3, (float) (Math.exp((d10 / d11) * dM16930b) * ((double) (this.f46261a * this.f46263c))), (long) (Math.exp(dM16930b / d11) * 1000.0d));
    }

    /* JADX INFO: renamed from: b */
    public final double m16930b(float f3) {
        float[] fArr = C8667a.f46246a;
        return Math.log(((double) (Math.abs(f3) * 0.35f)) / ((double) (this.f46261a * this.f46263c)));
    }
}
