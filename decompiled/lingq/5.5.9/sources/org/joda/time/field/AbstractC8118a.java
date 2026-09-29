package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8118a extends AbstractC6095b {

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f44106a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC8118a(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f44106a = dateTimeFieldType;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public long mo12562A(long j10) {
        return j10 - mo12564D(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public long mo12563C(long j10) {
        long jMo12564D = mo12564D(j10);
        return jMo12564D != j10 ? mo12571a(1, jMo12564D) : j10;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: E */
    public long mo12565E(long j10) {
        long jMo12564D = mo12564D(j10);
        long jMo12563C = mo12563C(j10);
        return jMo12563C - j10 <= j10 - jMo12564D ? jMo12563C : jMo12564D;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: G */
    public long mo12566G(long j10) {
        long jMo12564D = mo12564D(j10);
        long jMo12563C = mo12563C(j10);
        long j11 = j10 - jMo12564D;
        long j12 = jMo12563C - j10;
        if (j11 < j12) {
            return jMo12564D;
        }
        if (j12 >= j11 && (mo12572b(jMo12563C) & 1) != 0) {
            return jMo12564D;
        }
        return jMo12563C;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: I */
    public long mo12567I(long j10) {
        long jMo12564D = mo12564D(j10);
        long jMo12563C = mo12563C(j10);
        return j10 - jMo12564D <= jMo12563C - j10 ? jMo12564D : jMo12563C;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: M */
    public long mo12569M(long j10, String str, Locale locale) {
        return mo12568J(mo16082R(str, locale), j10);
    }

    /* JADX INFO: renamed from: R */
    public int mo16082R(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.f44106a, str);
        }
    }

    /* JADX INFO: renamed from: T */
    public int mo16081T(long j10, int i10) {
        return mo12581q(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public long mo12571a(int i10, long j10) {
        return mo12577j().mo12591a(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: c */
    public String mo12573c(int i10, Locale locale) {
        return mo12575e(i10, locale);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: d */
    public String mo12574d(long j10, Locale locale) {
        return mo12573c(mo12572b(j10), locale);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: e */
    public String mo12575e(int i10, Locale locale) {
        return Integer.toString(i10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: h */
    public String mo12576h(long j10, Locale locale) {
        return mo12575e(mo12572b(j10), locale);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public AbstractC6097d mo12578k() {
        return null;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: l */
    public int mo12579l(Locale locale) {
        int iMo12580n = mo12580n();
        if (iMo12580n >= 0) {
            if (iMo12580n < 10) {
                return 1;
            }
            if (iMo12580n < 100) {
                return 2;
            }
            if (iMo12580n < 1000) {
                return 3;
            }
        }
        return Integer.toString(iMo12580n).length();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: s */
    public final String mo12583s() {
        return this.f44106a.m16011c();
    }

    public final String toString() {
        return "DateTimeField[" + mo12583s() + ']';
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: w */
    public final DateTimeFieldType mo12585w() {
        return this.f44106a;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public boolean mo12586x(long j10) {
        return false;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: z */
    public final boolean mo12588z() {
        return true;
    }
}
