package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC3431a;
import p000.en2;
import p000.wq1;
import p000.xwc;

/* JADX INFO: renamed from: org.joda.time.chrono.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3427c extends AbstractC3431a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f54913d;

    /* JADX INFO: renamed from: e */
    public final GregorianChronology f54914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3427c(GregorianChronology gregorianChronology, int i) {
        super(DateTimeFieldType.f54825j, 31556952000L);
        this.f54913d = i;
        switch (i) {
            case 1:
                super(DateTimeFieldType.f54820e, 31556952000L);
                this.f54914e = gregorianChronology;
                break;
            default:
                this.f54914e = gregorianChronology;
                break;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        int i2 = this.f54913d;
        GregorianChronology gregorianChronology = this.f54914e;
        switch (i2) {
            case 0:
                int iAbs = Math.abs(i);
                gregorianChronology.getClass();
                xwc.m24769h0(this, iAbs, -292275054, 292278993);
                int iM18427Y = gregorianChronology.m18427Y(j);
                if (iM18427Y == i) {
                    return j;
                }
                int iM18419R = BasicChronology.m18419R(j);
                int iM18426X = gregorianChronology.m18426X(iM18427Y);
                int iM18426X2 = gregorianChronology.m18426X(i);
                if (iM18426X2 < iM18426X) {
                    iM18426X = iM18426X2;
                }
                int iM18425W = gregorianChronology.m18425W(gregorianChronology.m18428Z(j), j);
                if (iM18425W <= iM18426X) {
                    iM18426X = iM18425W;
                }
                long jM18435g0 = gregorianChronology.m18435g0(i, j);
                int iM18427Y2 = gregorianChronology.m18427Y(jM18435g0);
                if (iM18427Y2 < i) {
                    jM18435g0 += 604800000;
                } else if (iM18427Y2 > i) {
                    jM18435g0 -= 604800000;
                }
                return gregorianChronology.f54860S.mo3733B(iM18419R, (((long) (iM18426X - gregorianChronology.m18425W(gregorianChronology.m18428Z(jM18435g0), jM18435g0))) * 604800000) + jM18435g0);
            default:
                gregorianChronology.getClass();
                xwc.m24769h0(this, i, -292275054, 292278993);
                return gregorianChronology.m18435g0(i, j);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: D */
    public long mo11485D(long j, int i) {
        switch (this.f54913d) {
            case 1:
                GregorianChronology gregorianChronology = this.f54914e;
                gregorianChronology.getClass();
                xwc.m24769h0(this, i, -292275055, 292278994);
                return gregorianChronology.m18435g0(i, j);
            default:
                return super.mo11485D(j, i);
        }
    }

    @Override // org.joda.time.field.AbstractC3431a
    /* JADX INFO: renamed from: F */
    public final long mo18445F(long j, long j2) {
        switch (this.f54913d) {
            case 0:
                break;
        }
        return mo11031a(xwc.m24759c0(j2), j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        switch (this.f54913d) {
            case 0:
                return i == 0 ? j : mo3733B(this.f54914e.m18427Y(j) + i, j);
            default:
                if (i == 0) {
                    return j;
                }
                int iM18428Z = this.f54914e.m18428Z(j);
                int i2 = iM18428Z + i;
                if ((iM18428Z ^ i2) >= 0 || (iM18428Z ^ i) < 0) {
                    return mo3733B(i2, j);
                }
                throw new ArithmeticException(wq1.m24115k("The calculation caused an overflow: ", iM18428Z, i, " + "));
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        switch (this.f54913d) {
            case 0:
                return this.f54914e.m18427Y(j);
            default:
                return this.f54914e.m18428Z(j);
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: j */
    public final en2 mo11036j() {
        switch (this.f54913d) {
            case 0:
                return this.f54914e.f54878g;
            default:
                return this.f54914e.f54877f;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        switch (this.f54913d) {
            case 0:
                this.f54914e.getClass();
                break;
            default:
                this.f54914e.getClass();
                break;
        }
        return 292278993;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        switch (this.f54913d) {
            case 0:
                this.f54914e.getClass();
                break;
            default:
                this.f54914e.getClass();
                break;
        }
        return -292275054;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        switch (this.f54913d) {
        }
        return null;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: s */
    public final boolean mo11038s(long j) {
        int i = this.f54913d;
        GregorianChronology gregorianChronology = this.f54914e;
        switch (i) {
            case 0:
                return gregorianChronology.m18426X(gregorianChronology.m18427Y(j)) > 52;
            default:
                return gregorianChronology.mo18431c0(gregorianChronology.m18428Z(j));
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        switch (this.f54913d) {
        }
        return false;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        long jMo4687x;
        switch (this.f54913d) {
            case 0:
                jMo4687x = mo4687x(j);
                break;
            default:
                jMo4687x = mo4687x(j);
                break;
        }
        return j - jMo4687x;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public long mo4686w(long j) {
        switch (this.f54913d) {
            case 1:
                GregorianChronology gregorianChronology = this.f54914e;
                int iM18428Z = gregorianChronology.m18428Z(j);
                return j != gregorianChronology.m18429a0(iM18428Z) ? gregorianChronology.m18429a0(iM18428Z + 1) : j;
            default:
                return super.mo4686w(j);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        int i = this.f54913d;
        GregorianChronology gregorianChronology = this.f54914e;
        switch (i) {
            case 0:
                long jMo4687x = gregorianChronology.f54863V.mo4687x(j);
                int iM18425W = gregorianChronology.m18425W(gregorianChronology.m18428Z(jMo4687x), jMo4687x);
                return iM18425W > 1 ? jMo4687x - (((long) (iM18425W - 1)) * 604800000) : jMo4687x;
            default:
                return gregorianChronology.m18429a0(gregorianChronology.m18428Z(j));
        }
    }
}
