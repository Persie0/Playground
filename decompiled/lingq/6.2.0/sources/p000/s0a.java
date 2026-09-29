package p000;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s0a implements Comparable {
    /* JADX INFO: renamed from: a */
    public static final long m20999a(long j, long j2) {
        int i = u16.f63245b;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        durationUnit.getClass();
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j != j2) {
                return cn2.m4892j(j2 < 0 ? cn2.f10317d : cn2.f10316c);
            }
            iy5 iy5Var = cn2.f10315b;
            return 0L;
        }
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return j < 0 ? cn2.f10317d : cn2.f10316c;
        }
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return AbstractC3352my.m17119f0(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return cn2.m4892j(j3 < 0 ? cn2.f10317d : cn2.f10316c);
        }
        durationUnit2.getClass();
        long jConvert = durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        iy5 iy5Var2 = cn2.f10315b;
        return cn2.m4889g(AbstractC3352my.m17119f0(j4, durationUnit2), AbstractC3352my.m17119f0(j5, durationUnit));
    }
}
