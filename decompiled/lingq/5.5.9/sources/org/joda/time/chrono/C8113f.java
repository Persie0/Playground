package org.joda.time.chrono;

import ae.C0062b;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.AbstractC8118a;
import org.joda.time.field.UnsupportedDurationField;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8113f extends AbstractC8118a {

    /* JADX INFO: renamed from: b */
    public final BasicChronology f44081b;

    public C8113f(BasicChronology basicChronology) {
        super(DateTimeFieldType.f43936a);
        this.f44081b = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public final long mo12563C(long j10) {
        if (mo12572b(j10) == 0) {
            return this.f44081b.mo16058I0(1, 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        if (mo12572b(j10) == 1) {
            return this.f44081b.mo16058I0(1, 0L);
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: E */
    public final long mo12565E(long j10) {
        return mo12564D(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: G */
    public final long mo12566G(long j10) {
        return mo12564D(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: I */
    public final long mo12567I(long j10) {
        return mo12564D(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        C0062b.m419y2(this, i10, 0, 1);
        if (mo12572b(j10) == i10) {
            return j10;
        }
        BasicChronology basicChronology = this.f44081b;
        return basicChronology.mo16058I0(-basicChronology.m16053D0(j10), j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: M */
    public final long mo12569M(long j10, String str, Locale locale) {
        Integer num = C8114g.m16085b(locale).f44089g.get(str);
        if (num != null) {
            return mo12568J(num.intValue(), j10);
        }
        throw new IllegalFieldValueException(DateTimeFieldType.f43936a, str);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        return this.f44081b.m16053D0(j10) <= 0 ? 0 : 1;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: e */
    public final String mo12575e(int i10, Locale locale) {
        return C8114g.m16085b(locale).f44083a[i10];
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return UnsupportedDurationField.m16091x(DurationFieldType.f43956a);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: l */
    public final int mo12579l(Locale locale) {
        return C8114g.m16085b(locale).f44092j;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 0;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return null;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return false;
    }
}
