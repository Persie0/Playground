package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes2.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j10) {
        super(durationFieldType);
        this.iUnitMillis = j10;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: a */
    public final long mo12591a(int i10, long j10) {
        return C0062b.m317V1(j10, ((long) i10) * this.iUnitMillis);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        return mo12593q() == preciseDurationField.mo12593q() && this.iUnitMillis == preciseDurationField.iUnitMillis;
    }

    public final int hashCode() {
        long j10 = this.iUnitMillis;
        return mo12593q().hashCode() + ((int) (j10 ^ (j10 >>> 32)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[PHI: r2
      0x0068: PHI (r2v3 long) = (r2v2 long), (r2v5 long) binds: [B:9:0x0016, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r14 != (-1)) goto L28;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo12592l(long j10, long j11) {
        long j12 = this.iUnitMillis;
        if (j12 != 1) {
            if (j11 == 1) {
                j11 = j12;
            } else {
                long j13 = 0;
                if (j11 != 0) {
                    if (j12 != 0) {
                        j13 = j11 * j12;
                        if (j13 / j12 == j11 && (j11 != Long.MIN_VALUE || j12 != -1)) {
                            if (j12 == Long.MIN_VALUE) {
                            }
                        }
                        throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + j12);
                    }
                }
                j11 = j13;
            }
        }
        return C0062b.m317V1(j10, j11);
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: s */
    public final long mo12594s() {
        return this.iUnitMillis;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: t */
    public final boolean mo12595t() {
        return true;
    }
}
