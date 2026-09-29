package p000;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class e1a {

    /* JADX INFO: renamed from: a */
    public final long f36578a;

    /* JADX INFO: renamed from: b */
    public final long f36579b;

    /* JADX INFO: renamed from: c */
    public final long f36580c;

    /* JADX INFO: renamed from: d */
    public final fg2 f36581d;

    public e1a() {
        iy5 iy5Var = cn2.f10315b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jM17117e0 = AbstractC3352my.m17117e0(45, durationUnit);
        long jM17117e1 = AbstractC3352my.m17117e0(5, durationUnit);
        long jM17117e2 = AbstractC3352my.m17117e0(5, durationUnit);
        fg2 fg2Var = wkd.f66985c;
        this.f36578a = jM17117e0;
        this.f36579b = jM17117e1;
        this.f36580c = jM17117e2;
        this.f36581d = fg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1a) {
            e1a e1aVar = (e1a) obj;
            long j = e1aVar.f36578a;
            iy5 iy5Var = cn2.f10315b;
            if (this.f36578a == j && this.f36579b == e1aVar.f36579b && this.f36580c == e1aVar.f36580c && fa4.m11650l(this.f36581d, e1aVar.f36581d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        iy5 iy5Var = cn2.f10315b;
        return this.f36581d.hashCode() + ux5.m22981d(this.f36580c, ux5.m22981d(this.f36579b, Long.hashCode(this.f36578a) * 31, 31), 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) cn2.m4891i(this.f36578a)) + ", additionalTime=" + ((Object) cn2.m4891i(this.f36579b)) + ", idleTimeout=" + ((Object) cn2.m4891i(this.f36580c)) + ", timeSource=" + this.f36581d + ')';
    }
}
