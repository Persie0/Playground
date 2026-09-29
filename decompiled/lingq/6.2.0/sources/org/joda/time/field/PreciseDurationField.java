package org.joda.time.field;

import org.joda.time.DurationFieldType;
import p000.ux5;
import p000.xwc;

/* JADX INFO: loaded from: classes.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.iUnitMillis = j;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: a */
    public final long mo11268a(int i, long j) {
        return xwc.m24757b0(j, ((long) i) * this.iUnitMillis);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: b */
    public final long mo11269b(long j, long j2) {
        long j3 = this.iUnitMillis;
        if (j3 != 1) {
            if (j2 == 1) {
                j2 = j3;
            } else {
                long j4 = 0;
                if (j2 != 0 && j3 != 0) {
                    j4 = j2 * j3;
                    if (j4 / j3 != j2 || ((j2 == Long.MIN_VALUE && j3 == -1) || (j3 == Long.MIN_VALUE && j2 == -1))) {
                        StringBuilder sbM22996s = ux5.m22996s(j2, "Multiplication overflows a long: ", " * ");
                        sbM22996s.append(j3);
                        throw new ArithmeticException(sbM22996s.toString());
                    }
                }
                j2 = j4;
            }
        }
        return xwc.m24757b0(j, j2);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: d */
    public final long mo11271d() {
        return this.iUnitMillis;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: e */
    public final boolean mo11272e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
            if (mo11270c() == preciseDurationField.mo11270c() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.iUnitMillis;
        return mo11270c().hashCode() + ((int) (j ^ (j >>> 32)));
    }
}
