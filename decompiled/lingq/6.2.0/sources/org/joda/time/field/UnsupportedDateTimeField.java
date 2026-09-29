package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;
import p000.en2;
import p000.f12;
import p000.ij6;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedDateTimeField extends f12 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static HashMap f54921a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final en2 iDurationField;
    private final DateTimeFieldType iType;

    public UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, en2 en2Var) {
        if (dateTimeFieldType == null || en2Var == null) {
            ij6.m13959q();
            throw null;
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = en2Var;
    }

    /* JADX INFO: renamed from: E */
    public static synchronized UnsupportedDateTimeField m18448E(DateTimeFieldType dateTimeFieldType, en2 en2Var) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        try {
            HashMap map = f54921a;
            unsupportedDateTimeField = null;
            if (map == null) {
                f54921a = new HashMap(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = (UnsupportedDateTimeField) map.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.iDurationField == en2Var) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, en2Var);
                f54921a.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        } catch (Throwable th) {
            throw th;
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return m18448E(this.iType, this.iDurationField);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: A */
    public final long mo11484A(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: C */
    public final long mo11029C(long j, String str, Locale locale) {
        throw m18449F();
    }

    /* JADX INFO: renamed from: F */
    public final UnsupportedOperationException m18449F() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        return this.iDurationField.mo11268a(i, j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: c */
    public final String mo11032c(int i, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: d */
    public final String mo11033d(long j, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: e */
    public final String mo11486e(LocalDateTime localDateTime, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: f */
    public final String mo11034f(int i, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: g */
    public final String mo11035g(long j, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: h */
    public final String mo11487h(LocalDateTime localDateTime, Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.iDurationField;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: j */
    public final en2 mo11036j() {
        return null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: k */
    public final int mo11037k(Locale locale) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: p */
    public final String mo11490p() {
        return this.iType.m18336c();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: r */
    public final DateTimeFieldType mo11491r() {
        return this.iType;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: s */
    public final boolean mo11038s(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return false;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: u */
    public final boolean mo11492u() {
        return false;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: w */
    public final long mo4686w(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: y */
    public final long mo11493y(long j) {
        throw m18449F();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: z */
    public final long mo11494z(long j) {
        throw m18449F();
    }
}
