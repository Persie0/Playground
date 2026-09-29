package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC3431a;
import p000.C3386nv;
import p000.en2;
import p000.nj3;
import p000.wq1;
import p000.xwc;

/* JADX INFO: renamed from: org.joda.time.chrono.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3429e extends AbstractC3431a {

    /* JADX INFO: renamed from: d */
    public final GregorianChronology f54916d;

    /* JADX INFO: renamed from: e */
    public final int f54917e;

    /* JADX INFO: renamed from: f */
    public final int f54918f;

    public C3429e(GregorianChronology gregorianChronology) {
        super(DateTimeFieldType.f54822g, 2629746000L);
        this.f54916d = gregorianChronology;
        this.f54917e = 12;
        this.f54918f = 2;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        xwc.m24769h0(this, i, 1, this.f54917e);
        GregorianChronology gregorianChronology = this.f54916d;
        int iM18428Z = gregorianChronology.m18428Z(j);
        int iM18421Q = gregorianChronology.m18421Q(j, iM18428Z, gregorianChronology.m18433e0(iM18428Z, j));
        int iM18432d0 = gregorianChronology.m18432d0(iM18428Z, i);
        if (iM18421Q > iM18432d0) {
            iM18421Q = iM18432d0;
        }
        return gregorianChronology.m18430b0(iM18428Z, i, iM18421Q) + ((long) BasicChronology.m18420T(j));
    }

    @Override // p000.w80
    /* JADX INFO: renamed from: E */
    public final int mo18444E(String str, Locale locale) {
        return nj3.m17460g(locale).m17473o(str);
    }

    @Override // org.joda.time.field.AbstractC3431a
    /* JADX INFO: renamed from: F */
    public final long mo18445F(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i = (int) j2;
        if (i == j2) {
            return mo11031a(i, j);
        }
        GregorianChronology gregorianChronology = this.f54916d;
        gregorianChronology.getClass();
        long jM18420T = BasicChronology.m18420T(j);
        int iM18428Z = gregorianChronology.m18428Z(j);
        int iM18433e0 = gregorianChronology.m18433e0(iM18428Z, j);
        long j8 = ((long) (iM18433e0 - 1)) + j2;
        int i2 = this.f54917e;
        if (j8 < 0) {
            j3 = jM18420T;
            j4 = 0;
            long j9 = i2;
            j5 = (j8 / j9) + ((long) iM18428Z);
            j6 = j5 - 1;
            int iAbs = (int) (Math.abs(j8) % j9);
            if (iAbs == 0) {
                iAbs = i2;
            }
            j7 = (i2 - iAbs) + 1;
            if (j7 == 1) {
            }
            if (j6 >= -292275054 || j6 > 292278993) {
                C3386nv.m17626m(wq1.m24116l("Magnitude of add amount is too large: ", j2));
                return j4;
            }
            int i3 = (int) j6;
            int i4 = (int) j7;
            int iM18421Q = gregorianChronology.m18421Q(j, iM18428Z, iM18433e0);
            int iM18432d0 = gregorianChronology.m18432d0(i3, i4);
            if (iM18421Q > iM18432d0) {
                iM18421Q = iM18432d0;
            }
            return gregorianChronology.m18430b0(i3, i4, iM18421Q) + j3;
        }
        j4 = 0;
        j3 = jM18420T;
        long j10 = i2;
        j5 = (j8 / j10) + ((long) iM18428Z);
        j7 = (j8 % j10) + 1;
        j6 = j5;
        if (j6 >= -292275054) {
        }
        C3386nv.m17626m(wq1.m24116l("Magnitude of add amount is too large: ", j2));
        return j4;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        GregorianChronology gregorianChronology = this.f54916d;
        gregorianChronology.getClass();
        long jM18420T = BasicChronology.m18420T(j);
        int iM18428Z = gregorianChronology.m18428Z(j);
        int iM18433e0 = gregorianChronology.m18433e0(iM18428Z, j);
        int i5 = iM18433e0 - 1;
        int i6 = i5 + i;
        int i7 = this.f54917e;
        if (iM18433e0 <= 0 || i6 >= 0) {
            i2 = iM18428Z;
        } else {
            int i8 = i + i7;
            if (Math.signum(i8) == Math.signum(i)) {
                i2 = iM18428Z - 1;
            } else {
                i8 = i - i7;
                i2 = iM18428Z + 1;
            }
            i6 = i8 + i5;
        }
        if (i6 >= 0) {
            i3 = (i6 / i7) + i2;
            i4 = (i6 % i7) + 1;
        } else {
            i3 = (i6 / i7) + i2;
            int i9 = i3 - 1;
            int iAbs = Math.abs(i6) % i7;
            if (iAbs == 0) {
                iAbs = i7;
            }
            i4 = (i7 - iAbs) + 1;
            if (i4 != 1) {
                i3 = i9;
            }
        }
        int iM18421Q = gregorianChronology.m18421Q(j, iM18428Z, iM18433e0);
        int iM18432d0 = gregorianChronology.m18432d0(i3, i4);
        if (iM18421Q > iM18432d0) {
            iM18421Q = iM18432d0;
        }
        return gregorianChronology.m18430b0(i3, i4, iM18421Q) + jM18420T;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        GregorianChronology gregorianChronology = this.f54916d;
        return gregorianChronology.m18433e0(gregorianChronology.m18428Z(j), j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: c */
    public final String mo11032c(int i, Locale locale) {
        return nj3.m17460g(locale).m17474p(i);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: f */
    public final String mo11034f(int i, Locale locale) {
        return nj3.m17460g(locale).m17475q(i);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: j */
    public final en2 mo11036j() {
        return this.f54916d.f54877f;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: k */
    public final int mo11037k(Locale locale) {
        return nj3.m17460g(locale).m17470k();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f54917e;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return 1;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return this.f54916d.f54881j;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: s */
    public final boolean mo11038s(long j) {
        GregorianChronology gregorianChronology = this.f54916d;
        int iM18428Z = gregorianChronology.m18428Z(j);
        return gregorianChronology.mo18431c0(iM18428Z) && gregorianChronology.m18433e0(iM18428Z, j) == this.f54918f;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return false;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        return j - mo4687x(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        GregorianChronology gregorianChronology = this.f54916d;
        int iM18428Z = gregorianChronology.m18428Z(j);
        return gregorianChronology.m18429a0(iM18428Z) + gregorianChronology.mo18424V(iM18428Z, gregorianChronology.m18433e0(iM18428Z, j));
    }
}
