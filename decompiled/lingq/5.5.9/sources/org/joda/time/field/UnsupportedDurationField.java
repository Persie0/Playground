package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedDurationField extends AbstractC6097d implements Serializable {

    /* JADX INFO: renamed from: a */
    public static HashMap<DurationFieldType, UnsupportedDurationField> f44105a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    public UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    private Object readResolve() {
        return m16091x(this.iType);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x */
    public static synchronized UnsupportedDurationField m16091x(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        HashMap<DurationFieldType, UnsupportedDurationField> map = f44105a;
        if (map == null) {
            f44105a = new HashMap<>(7);
            unsupportedDurationField = null;
        } else {
            unsupportedDurationField = map.get(durationFieldType);
        }
        if (unsupportedDurationField == null) {
            unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
            f44105a.put(durationFieldType, unsupportedDurationField);
        }
        return unsupportedDurationField;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: a */
    public final long mo12591a(int i10, long j10) {
        throw new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(AbstractC6097d abstractC6097d) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.m16092y() == null) {
            return m16092y() == null;
        }
        return unsupportedDurationField.m16092y().equals(m16092y());
    }

    public final int hashCode() {
        return m16092y().hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: l */
    public final long mo12592l(long j10, long j11) {
        throw new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: q */
    public final DurationFieldType mo12593q() {
        return this.iType;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: s */
    public final long mo12594s() {
        return 0L;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: t */
    public final boolean mo12595t() {
        return true;
    }

    public final String toString() {
        return "UnsupportedDurationField[" + m16092y() + ']';
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: w */
    public final boolean mo12596w() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final String m16092y() {
        return this.iType.m16033b();
    }
}
