package org.joda.time.field;

import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(AbstractC6097d abstractC6097d, DurationFieldType durationFieldType) {
        super(abstractC6097d, durationFieldType);
        this.iScalar = 100;
    }

    @Override // org.joda.time.field.DecoratedDurationField, p163hp.AbstractC6097d
    /* JADX INFO: renamed from: a */
    public final long mo12591a(int i10, long j10) {
        return m16088x().mo12592l(j10, ((long) i10) * ((long) this.iScalar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        return m16088x().equals(scaledDurationField.m16088x()) && mo12593q() == scaledDurationField.mo12593q() && this.iScalar == scaledDurationField.iScalar;
    }

    public final int hashCode() {
        long j10 = this.iScalar;
        return m16088x().hashCode() + mo12593q().hashCode() + ((int) (j10 ^ (j10 >>> 32)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.joda.time.field.DecoratedDurationField, p163hp.AbstractC6097d
    /* JADX INFO: renamed from: l */
    public final long mo12592l(long j10, long j11) {
        int i10 = this.iScalar;
        if (i10 != -1) {
            if (i10 == 0) {
                j11 = 0;
            } else if (i10 != 1) {
                long j12 = i10;
                long j13 = j11 * j12;
                if (j13 / j12 != j11) {
                    throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i10);
                }
                j11 = j13;
            }
        } else {
            if (j11 == Long.MIN_VALUE) {
                throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i10);
            }
            j11 = -j11;
        }
        return m16088x().mo12592l(j10, j11);
    }

    @Override // org.joda.time.field.DecoratedDurationField, p163hp.AbstractC6097d
    /* JADX INFO: renamed from: s */
    public final long mo12594s() {
        return m16088x().mo12594s() * ((long) this.iScalar);
    }
}
