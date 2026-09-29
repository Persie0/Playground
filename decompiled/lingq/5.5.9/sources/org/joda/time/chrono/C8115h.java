package org.joda.time.chrono;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.ImpreciseDateTimeField;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C8115h extends ImpreciseDateTimeField {

    /* JADX INFO: renamed from: d */
    public final BasicChronology f44096d;

    /* JADX INFO: renamed from: e */
    public final int f44097e;

    /* JADX INFO: renamed from: f */
    public final int f44098f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8115h(BasicChronology basicChronology) {
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43942g;
        basicChronology.mo16061m0();
        super(dateTimeFieldType, 2629746000L);
        this.f44096d = basicChronology;
        this.f44097e = 12;
        this.f44098f = 2;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return j10 - mo12564D(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        BasicChronology basicChronology = this.f44096d;
        int iM16053D0 = basicChronology.m16053D0(j10);
        return basicChronology.m16054E0(iM16053D0) + basicChronology.mo16072z0(iM16053D0, basicChronology.mo16071y0(iM16053D0, j10));
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        C0062b.m419y2(this, i10, 1, this.f44097e);
        BasicChronology basicChronology = this.f44096d;
        int iM16053D0 = basicChronology.m16053D0(j10);
        int iM16064p0 = basicChronology.m16064p0(iM16053D0, basicChronology.mo16071y0(iM16053D0, j10), j10);
        int iMo16066s0 = basicChronology.mo16066s0(iM16053D0, i10);
        if (iM16064p0 > iMo16066s0) {
            iM16064p0 = iMo16066s0;
        }
        return basicChronology.m16055F0(iM16053D0, i10, iM16064p0) + ((long) BasicChronology.m16049v0(j10));
    }

    @Override // org.joda.time.field.AbstractC8118a
    /* JADX INFO: renamed from: R */
    public final int mo16082R(String str, Locale locale) {
        Integer num = C8114g.m16085b(locale).f44091i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.f43942g, str);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField
    /* JADX INFO: renamed from: U */
    public final long mo16083U(long j10, long j11) {
        long j12;
        long j13;
        int i10 = (int) j11;
        if (i10 == j11) {
            return mo12571a(i10, j10);
        }
        BasicChronology basicChronology = this.f44096d;
        basicChronology.getClass();
        long jM16049v0 = BasicChronology.m16049v0(j10);
        int iM16053D0 = basicChronology.m16053D0(j10);
        int iMo16071y0 = basicChronology.mo16071y0(iM16053D0, j10);
        long j14 = ((long) (iMo16071y0 - 1)) + j11;
        int i11 = this.f44097e;
        if (j14 >= 0) {
            long j15 = i11;
            j12 = (j14 / j15) + ((long) iM16053D0);
            j13 = (j14 % j15) + 1;
        } else {
            long j16 = i11;
            j12 = ((j14 / j16) + ((long) iM16053D0)) - 1;
            int iAbs = (int) (Math.abs(j14) % j16);
            if (iAbs == 0) {
                iAbs = i11;
            }
            j13 = (i11 - iAbs) + 1;
            if (j13 == 1) {
                j12++;
            }
        }
        long j17 = j12;
        basicChronology.mo16069w0();
        if (j17 >= -292275054) {
            basicChronology.mo16068u0();
            if (j17 <= 292278993) {
                int i12 = (int) j17;
                int i13 = (int) j13;
                int iM16064p0 = basicChronology.m16064p0(iM16053D0, iMo16071y0, j10);
                int iMo16066s0 = basicChronology.mo16066s0(i12, i13);
                if (iM16064p0 > iMo16066s0) {
                    iM16064p0 = iMo16066s0;
                }
                return basicChronology.m16055F0(i12, i13, iM16064p0) + jM16049v0;
            }
        }
        throw new IllegalArgumentException(C0166e.m763i("Magnitude of add amount is too large: ", j11));
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            return j10;
        }
        BasicChronology basicChronology = this.f44096d;
        basicChronology.getClass();
        long jM16049v0 = BasicChronology.m16049v0(j10);
        int iM16053D0 = basicChronology.m16053D0(j10);
        int iMo16071y0 = basicChronology.mo16071y0(iM16053D0, j10);
        int i14 = iMo16071y0 - 1;
        int i15 = i14 + i10;
        int i16 = this.f44097e;
        if (iMo16071y0 <= 0 || i15 >= 0) {
            i11 = iM16053D0;
        } else {
            int i17 = i10 + i16;
            if (Math.signum(i17) == Math.signum(i10)) {
                i11 = iM16053D0 - 1;
            } else {
                i17 = i10 - i16;
                i11 = iM16053D0 + 1;
            }
            i15 = i17 + i14;
        }
        if (i15 >= 0) {
            i12 = (i15 / i16) + i11;
            i13 = (i15 % i16) + 1;
        } else {
            i12 = ((i15 / i16) + i11) - 1;
            int iAbs = Math.abs(i15) % i16;
            if (iAbs == 0) {
                iAbs = i16;
            }
            i13 = (i16 - iAbs) + 1;
            if (i13 == 1) {
                i12++;
            }
        }
        int iM16064p0 = basicChronology.m16064p0(iM16053D0, iMo16071y0, j10);
        int iMo16066s0 = basicChronology.mo16066s0(i12, i13);
        if (iM16064p0 > iMo16066s0) {
            iM16064p0 = iMo16066s0;
        }
        return basicChronology.m16055F0(i12, i13, iM16064p0) + jM16049v0;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        BasicChronology basicChronology = this.f44096d;
        return basicChronology.mo16071y0(basicChronology.m16053D0(j10), j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: c */
    public final String mo12573c(int i10, Locale locale) {
        return C8114g.m16085b(locale).f44087e[i10];
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: e */
    public final String mo12575e(int i10, Locale locale) {
        return C8114g.m16085b(locale).f44086d[i10];
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return this.f44096d.f43997f;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: l */
    public final int mo12579l(Locale locale) {
        return C8114g.m16085b(locale).f44094l;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44097e;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ int mo12582r() {
        return 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44096d.f44001j;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        BasicChronology basicChronology = this.f44096d;
        int iM16053D0 = basicChronology.m16053D0(j10);
        return basicChronology.mo16057H0(iM16053D0) && basicChronology.mo16071y0(iM16053D0, j10) == this.f44098f;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ boolean mo12587y() {
        return false;
    }
}
