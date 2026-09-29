package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import p000.ci7;
import p000.en2;
import p000.nj3;

/* JADX INFO: renamed from: org.joda.time.chrono.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3426b extends ci7 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f54911d;

    /* JADX INFO: renamed from: e */
    public final GregorianChronology f54912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3426b(GregorianChronology gregorianChronology, en2 en2Var, int i) {
        super(DateTimeFieldType.f54823h, en2Var);
        this.f54911d = i;
        switch (i) {
            case 1:
                super(DateTimeFieldType.f54821f, en2Var);
                this.f54912e = gregorianChronology;
                break;
            case 2:
                super(DateTimeFieldType.f54826k, en2Var);
                this.f54912e = gregorianChronology;
                break;
            case 3:
                super(DateTimeFieldType.f54827l, en2Var);
                this.f54912e = gregorianChronology;
                break;
            default:
                this.f54912e = gregorianChronology;
                break;
        }
    }

    @Override // p000.w80
    /* JADX INFO: renamed from: E */
    public int mo18444E(String str, Locale locale) {
        switch (this.f54911d) {
            case 3:
                return nj3.m17460g(locale).m17462b(str);
            default:
                return super.mo18444E(str, locale);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        int i = this.f54911d;
        GregorianChronology gregorianChronology = this.f54912e;
        switch (i) {
            case 0:
                int iM18428Z = gregorianChronology.m18428Z(j);
                return gregorianChronology.m18421Q(j, iM18428Z, gregorianChronology.m18433e0(iM18428Z, j));
            case 1:
                return ((int) ((j - gregorianChronology.m18429a0(gregorianChronology.m18428Z(j))) / 86400000)) + 1;
            case 2:
                return gregorianChronology.m18425W(gregorianChronology.m18428Z(j), j);
            default:
                gregorianChronology.getClass();
                return BasicChronology.m18419R(j);
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: c */
    public String mo11032c(int i, Locale locale) {
        switch (this.f54911d) {
            case 3:
                return nj3.m17460g(locale).m17463c(i);
            default:
                return super.mo11032c(i, locale);
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: f */
    public String mo11034f(int i, Locale locale) {
        switch (this.f54911d) {
            case 3:
                return nj3.m17460g(locale).m17464d(i);
            default:
                return super.mo11034f(i, locale);
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: k */
    public int mo11037k(Locale locale) {
        switch (this.f54911d) {
            case 3:
                return nj3.m17460g(locale).m17467h();
            default:
                return super.mo11037k(locale);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        switch (this.f54911d) {
            case 0:
                this.f54912e.getClass();
                return 31;
            case 1:
                this.f54912e.getClass();
                return 366;
            case 2:
                return 53;
            default:
                return 7;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: m */
    public int mo11488m(long j) {
        int i = this.f54911d;
        GregorianChronology gregorianChronology = this.f54912e;
        switch (i) {
            case 0:
                int iM18428Z = gregorianChronology.m18428Z(j);
                return gregorianChronology.m18432d0(iM18428Z, gregorianChronology.m18433e0(iM18428Z, j));
            case 1:
                return gregorianChronology.mo18431c0(gregorianChronology.m18428Z(j)) ? 366 : 365;
            case 2:
                return gregorianChronology.m18426X(gregorianChronology.m18427Y(j));
            default:
                return super.mo11488m(j);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: n */
    public int mo11489n(long j, int i) {
        int i2 = this.f54911d;
        GregorianChronology gregorianChronology = this.f54912e;
        switch (i2) {
            case 0:
                gregorianChronology.getClass();
                if (i <= 28 && i >= 1) {
                    return 28;
                }
                int iM18428Z = gregorianChronology.m18428Z(j);
                return gregorianChronology.m18432d0(iM18428Z, gregorianChronology.m18433e0(iM18428Z, j));
            case 1:
                gregorianChronology.getClass();
                if (i > 365 || i < 1) {
                    return mo11488m(j);
                }
                return 365;
            case 2:
                if (i > 52) {
                    return mo11488m(j);
                }
                return 52;
            default:
                return super.mo11489n(j, i);
        }
    }

    @Override // p000.ci7, p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        switch (this.f54911d) {
        }
        return 1;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        switch (this.f54911d) {
            case 0:
                return this.f54912e.f54880i;
            case 1:
                return this.f54912e.f54881j;
            case 2:
                return this.f54912e.f54879h;
            default:
                return this.f54912e.f54878g;
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: s */
    public boolean mo11038s(long j) {
        switch (this.f54911d) {
            case 0:
                return this.f54912e.m18434f0(j);
            case 1:
                return this.f54912e.m18434f0(j);
            default:
                return super.mo11038s(j);
        }
    }

    @Override // p000.ci7, p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public long mo4685v(long j) {
        switch (this.f54911d) {
            case 2:
                return super.mo4685v(j + 259200000);
            default:
                return super.mo4685v(j);
        }
    }

    @Override // p000.ci7, p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public long mo4686w(long j) {
        switch (this.f54911d) {
            case 2:
                return super.mo4686w(j + 259200000) - 259200000;
            default:
                return super.mo4686w(j);
        }
    }

    @Override // p000.ci7, p000.f12
    /* JADX INFO: renamed from: x */
    public long mo4687x(long j) {
        switch (this.f54911d) {
            case 2:
                return super.mo4687x(j + 259200000) - 259200000;
            default:
                return super.mo4687x(j);
        }
    }
}
