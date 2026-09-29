package p470x1;

import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8944f;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC10015c {
    /* JADX INFO: renamed from: A0 */
    default float mo1459A0(long j10) {
        if (!C10024l.m18634a(C10023k.m18631b(j10), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return getDensity() * mo1462c0() * C10023k.m18632c(j10);
    }

    /* JADX INFO: renamed from: W */
    default float mo1460W(int i10) {
        return i10 / getDensity();
    }

    /* JADX INFO: renamed from: c0 */
    float mo1462c0();

    float getDensity();

    /* JADX INFO: renamed from: i0 */
    default float mo1463i0(float f3) {
        return getDensity() * f3;
    }

    /* JADX INFO: renamed from: s0 */
    default int mo1464s0(float f3) {
        float fMo1463i0 = mo1463i0(f3);
        if (Float.isInfinite(fMo1463i0)) {
            return Integer.MAX_VALUE;
        }
        return C8573r0.m16710Y0(fMo1463i0);
    }

    /* JADX INFO: renamed from: z0 */
    default long mo1466z0(long j10) {
        return (j10 > C10019g.f50971b ? 1 : (j10 == C10019g.f50971b ? 0 : -1)) != 0 ? C8584v.m16788m(mo1463i0(C10019g.m18624b(j10)), mo1463i0(C10019g.m18623a(j10))) : C8944f.f46907c;
    }
}
