package org.joda.time.chrono;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ImpreciseDateTimeField;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8111d extends ImpreciseDateTimeField {

    /* JADX INFO: renamed from: d */
    public final BasicChronology f44079d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8111d(BasicChronology basicChronology) {
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43945j;
        basicChronology.mo16062n0();
        super(dateTimeFieldType, 31556952000L);
        this.f44079d = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return j10 - mo12564D(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        BasicChronology basicChronology = this.f44079d;
        long jMo12564D = basicChronology.f43983V.mo12564D(j10);
        int iM16050A0 = basicChronology.m16050A0(basicChronology.m16053D0(jMo12564D), jMo12564D);
        if (iM16050A0 > 1) {
            jMo12564D -= ((long) (iM16050A0 - 1)) * 604800000;
        }
        return jMo12564D;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        int iAbs = Math.abs(i10);
        BasicChronology basicChronology = this.f44079d;
        basicChronology.mo16069w0();
        basicChronology.mo16068u0();
        C0062b.m419y2(this, iAbs, -292275054, 292278993);
        int iMo12572b = mo12572b(j10);
        if (iMo12572b == i10) {
            return j10;
        }
        int iM16048q0 = BasicChronology.m16048q0(j10);
        int iM16051B0 = basicChronology.m16051B0(iMo12572b);
        int iM16051B1 = basicChronology.m16051B0(i10);
        if (iM16051B1 < iM16051B0) {
            iM16051B0 = iM16051B1;
        }
        int iM16050A0 = basicChronology.m16050A0(basicChronology.m16053D0(j10), j10);
        if (iM16050A0 <= iM16051B0) {
            iM16051B0 = iM16050A0;
        }
        long jMo16058I0 = basicChronology.mo16058I0(i10, j10);
        int iMo12572b2 = mo12572b(jMo16058I0);
        if (iMo12572b2 < i10) {
            jMo16058I0 += 604800000;
        } else if (iMo12572b2 > i10) {
            jMo16058I0 -= 604800000;
        }
        return basicChronology.f43980S.mo12568J(iM16048q0, (((long) (iM16051B0 - basicChronology.m16050A0(basicChronology.m16053D0(jMo16058I0), jMo16058I0))) * 604800000) + jMo16058I0);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField
    /* JADX INFO: renamed from: U */
    public final long mo16083U(long j10, long j11) {
        return mo12571a(C0062b.m320W1(j11), j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        return i10 == 0 ? j10 : mo12568J(mo12572b(j10) + i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        return this.f44079d.m16052C0(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return this.f44079d.f43998g;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        this.f44079d.mo16068u0();
        return 292278993;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        this.f44079d.mo16069w0();
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
        BasicChronology basicChronology = this.f44079d;
        return basicChronology.m16051B0(basicChronology.m16052C0(j10)) > 52;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return false;
    }
}
