package p000;

/* JADX INFO: loaded from: classes.dex */
public interface fb2 {
    /* JADX INFO: renamed from: B */
    default float mo901B(long j) {
        if (!ay9.m3127a(zx9.m25847b(j), 4294967296L)) {
            k54.m14853b("Only Sp can convert to Px");
        }
        float[] fArr = tb3.f62095a;
        if (mo597d0() < 1.03f) {
            return mo597d0() * zx9.m25848c(j);
        }
        sb3 sb3VarM21931a = tb3.m21931a(mo597d0());
        if (sb3VarM21931a != null) {
            return sb3VarM21931a.mo21206b(zx9.m25848c(j));
        }
        return mo597d0() * zx9.m25848c(j);
    }

    /* JADX INFO: renamed from: D0 */
    default long mo902D0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo912g0 = mo912g0(bk2.m3806b(j));
        float fMo912g1 = mo912g0(bk2.m3805a(j));
        return (((long) Float.floatToRawIntBits(fMo912g0)) << 32) | (((long) Float.floatToRawIntBits(fMo912g1)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F0 */
    default float mo903F0(long j) {
        if (!ay9.m3127a(zx9.m25847b(j), 4294967296L)) {
            k54.m14853b("Only Sp can convert to Px");
        }
        return mo912g0(mo901B(j));
    }

    /* JADX INFO: renamed from: N */
    default long mo904N(float f) {
        return mo914u(mo906W(f));
    }

    /* JADX INFO: renamed from: T */
    default float mo905T(int i) {
        return i / mo594a();
    }

    /* JADX INFO: renamed from: W */
    default float mo906W(float f) {
        return f / mo594a();
    }

    /* JADX INFO: renamed from: a */
    float mo594a();

    /* JADX INFO: renamed from: d0 */
    float mo597d0();

    /* JADX INFO: renamed from: g0 */
    default float mo912g0(float f) {
        return mo594a() * f;
    }

    /* JADX INFO: renamed from: q0 */
    default int mo913q0(long j) {
        return Math.round(mo903F0(j));
    }

    /* JADX INFO: renamed from: u */
    default long mo914u(float f) {
        float[] fArr = tb3.f62095a;
        if (mo597d0() < 1.03f) {
            return d32.m10032c0(f / mo597d0(), 4294967296L);
        }
        sb3 sb3VarM21931a = tb3.m21931a(mo597d0());
        return d32.m10032c0(sb3VarM21931a != null ? sb3VarM21931a.mo21205a(f) : f / mo597d0(), 4294967296L);
    }

    /* JADX INFO: renamed from: v */
    default long mo915v(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC3584sr.m21614a(mo906W(Float.intBitsToFloat((int) (j >> 32))), mo906W(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: w0 */
    default int mo916w0(float f) {
        float fMo912g0 = mo912g0(f);
        if (Float.isInfinite(fMo912g0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo912g0);
    }
}
