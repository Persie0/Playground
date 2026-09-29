package org.joda.time.field;

import org.joda.time.DurationFieldType;
import p000.en2;

/* JADX INFO: loaded from: classes.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(en2 en2Var, DurationFieldType durationFieldType) {
        super(en2Var, durationFieldType);
        this.iScalar = 100;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: a */
    public final long mo11268a(int i, long j) {
        return m18447h().mo11269b(j, ((long) i) * ((long) this.iScalar));
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: b */
    public final long mo11269b(long j, long j2) {
        int i = this.iScalar;
        if (i != -1) {
            if (i == 0) {
                j2 = 0;
            } else if (i != 1) {
                long j3 = i;
                long j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i);
                }
                j2 = j4;
            }
        } else {
            if (j2 == Long.MIN_VALUE) {
                throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i);
            }
            j2 = -j2;
        }
        return m18447h().mo11269b(j, j2);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: d */
    public final long mo11271d() {
        return m18447h().mo11271d() * ((long) this.iScalar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScaledDurationField) {
            ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
            if (m18447h().equals(scaledDurationField.m18447h()) && mo11270c() == scaledDurationField.mo11270c() && this.iScalar == scaledDurationField.iScalar) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.iScalar;
        return m18447h().hashCode() + mo11270c().hashCode() + ((int) (j ^ (j >>> 32)));
    }
}
