package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedDateTimeField extends AbstractC6095b implements Serializable {

    /* JADX INFO: renamed from: a */
    public static HashMap<DateTimeFieldType, UnsupportedDateTimeField> f44104a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final AbstractC6097d iDurationField;
    private final DateTimeFieldType iType;

    public UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, AbstractC6097d abstractC6097d) {
        if (dateTimeFieldType == null || abstractC6097d == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = abstractC6097d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: R */
    public static synchronized UnsupportedDateTimeField m16089R(DateTimeFieldType dateTimeFieldType, AbstractC6097d abstractC6097d) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        HashMap<DateTimeFieldType, UnsupportedDateTimeField> map = f44104a;
        unsupportedDateTimeField = null;
        if (map == null) {
            f44104a = new HashMap<>(7);
        } else {
            UnsupportedDateTimeField unsupportedDateTimeField2 = map.get(dateTimeFieldType);
            if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.iDurationField == abstractC6097d) {
                unsupportedDateTimeField = unsupportedDateTimeField2;
            }
        }
        if (unsupportedDateTimeField == null) {
            unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, abstractC6097d);
            f44104a.put(dateTimeFieldType, unsupportedDateTimeField);
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return m16089R(this.iType, this.iDurationField);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public final long mo12563C(long j10) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: E */
    public final long mo12565E(long j10) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: G */
    public final long mo12566G(long j10) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: I */
    public final long mo12567I(long j10) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: M */
    public final long mo12569M(long j10, String str, Locale locale) {
        throw m16090T();
    }

    /* JADX INFO: renamed from: T */
    public final UnsupportedOperationException m16090T() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        return this.iDurationField.mo12591a(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: c */
    public final String mo12573c(int i10, Locale locale) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: d */
    public final String mo12574d(long j10, Locale locale) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: e */
    public final String mo12575e(int i10, Locale locale) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: h */
    public final String mo12576h(long j10, Locale locale) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return this.iDurationField;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return null;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: l */
    public final int mo12579l(Locale locale) {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        throw m16090T();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: s */
    public final String mo12583s() {
        return this.iType.m16011c();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return null;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: w */
    public final DateTimeFieldType mo12585w() {
        return this.iType;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        throw m16090T();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return false;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: z */
    public final boolean mo12588z() {
        return false;
    }
}
