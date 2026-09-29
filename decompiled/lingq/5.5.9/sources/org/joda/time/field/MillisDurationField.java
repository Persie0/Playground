package org.joda.time.field;

import ae.C0062b;
import java.io.Serializable;
import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public final class MillisDurationField extends AbstractC6097d implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final MillisDurationField f44103a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return f44103a;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: a */
    public final long mo12591a(int i10, long j10) {
        return C0062b.m317V1(j10, i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC6097d abstractC6097d) {
        long jMo12594s = abstractC6097d.mo12594s();
        if (1 == jMo12594s) {
            return 0;
        }
        return 1 < jMo12594s ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MillisDurationField)) {
            return false;
        }
        ((MillisDurationField) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (int) 1;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: l */
    public final long mo12592l(long j10, long j11) {
        return C0062b.m317V1(j10, j11);
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: q */
    public final DurationFieldType mo12593q() {
        return DurationFieldType.f43967l;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: s */
    public final long mo12594s() {
        return 1L;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: t */
    public final boolean mo12595t() {
        return true;
    }

    public final String toString() {
        return "DurationField[millis]";
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: w */
    public final boolean mo12596w() {
        return true;
    }
}
