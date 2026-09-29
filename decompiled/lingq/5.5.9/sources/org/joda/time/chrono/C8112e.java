package org.joda.time.chrono;

import ae.C0062b;
import androidx.activity.result.C0204c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ImpreciseDateTimeField;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8112e extends ImpreciseDateTimeField {

    /* JADX INFO: renamed from: d */
    public final BasicChronology f44080d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8112e(BasicChronology basicChronology) {
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43940e;
        basicChronology.mo16062n0();
        super(dateTimeFieldType, 31556952000L);
        this.f44080d = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return j10 - mo12564D(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public final long mo12563C(long j10) {
        int iMo12572b = mo12572b(j10);
        BasicChronology basicChronology = this.f44080d;
        if (j10 != basicChronology.m16054E0(iMo12572b)) {
            j10 = basicChronology.m16054E0(iMo12572b + 1);
        }
        return j10;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        return this.f44080d.m16054E0(mo12572b(j10));
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        BasicChronology basicChronology = this.f44080d;
        basicChronology.mo16069w0();
        basicChronology.mo16068u0();
        C0062b.m419y2(this, i10, -292275054, 292278993);
        return basicChronology.mo16058I0(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: Q */
    public final long mo12570Q(int i10, long j10) {
        BasicChronology basicChronology = this.f44080d;
        basicChronology.mo16069w0();
        basicChronology.mo16068u0();
        C0062b.m419y2(this, i10, -292275055, 292278994);
        return basicChronology.mo16058I0(i10, j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField
    /* JADX INFO: renamed from: U */
    public final long mo16083U(long j10, long j11) {
        return mo12571a(C0062b.m320W1(j11), j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        if (i10 == 0) {
            return j10;
        }
        int iMo12572b = mo12572b(j10);
        int i11 = iMo12572b + i10;
        if ((iMo12572b ^ i11) < 0 && (iMo12572b ^ i10) >= 0) {
            throw new ArithmeticException(C0204c.m851j("The calculation caused an overflow: ", iMo12572b, " + ", i10));
        }
        return mo12568J(i11, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        return this.f44080d.m16053D0(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return this.f44080d.f43997f;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        this.f44080d.mo16068u0();
        return 292278993;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        this.f44080d.mo16069w0();
        return -292275054;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return null;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        return this.f44080d.mo16057H0(mo12572b(j10));
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return false;
    }
}
