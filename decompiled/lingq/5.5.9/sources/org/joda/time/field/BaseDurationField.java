package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDurationField extends AbstractC6097d implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = durationFieldType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC6097d abstractC6097d) {
        long jMo12594s = abstractC6097d.mo12594s();
        long jMo12594s2 = mo12594s();
        if (jMo12594s2 == jMo12594s) {
            return 0;
        }
        return jMo12594s2 < jMo12594s ? -1 : 1;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: q */
    public final DurationFieldType mo12593q() {
        return this.iType;
    }

    public final String toString() {
        return "DurationField[" + this.iType.m16033b() + ']';
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: w */
    public final boolean mo12596w() {
        return true;
    }
}
