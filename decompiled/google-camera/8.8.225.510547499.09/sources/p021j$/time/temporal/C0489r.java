package p021j$.time.temporal;

import p021j$.time.C0459g;
import p021j$.time.chrono.AbstractC0422d;

/* JADX INFO: renamed from: j$.time.temporal.r */
/* JADX INFO: loaded from: classes3.dex */
final class C0489r implements InterfaceC0483l {

    /* JADX INFO: renamed from: f */
    private static final C0488q f33072f = C0488q.m12447i(1, 7);

    /* JADX INFO: renamed from: g */
    private static final C0488q f33073g = C0488q.m12448j(0, 4, 6);

    /* JADX INFO: renamed from: h */
    private static final C0488q f33074h = C0488q.m12448j(0, 52, 54);

    /* JADX INFO: renamed from: i */
    private static final C0488q f33075i = C0488q.m12449k(52, 53);

    /* JADX INFO: renamed from: a */
    private final String f33076a;

    /* JADX INFO: renamed from: b */
    private final C0490s f33077b;

    /* JADX INFO: renamed from: c */
    private final TemporalUnit f33078c;

    /* JADX INFO: renamed from: d */
    private final TemporalUnit f33079d;

    /* JADX INFO: renamed from: e */
    private final C0488q f33080e;

    private C0489r(String str, C0490s c0490s, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, C0488q c0488q) {
        this.f33076a = str;
        this.f33077b = c0490s;
        this.f33078c = temporalUnit;
        this.f33079d = temporalUnit2;
        this.f33080e = c0488q;
    }

    /* JADX INFO: renamed from: b */
    private static int m12457b(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* JADX INFO: renamed from: d */
    private int m12458d(TemporalAccessor temporalAccessor) {
        int i;
        int iMo12247f = temporalAccessor.mo12247f(EnumC0472a.DAY_OF_WEEK) - this.f33077b.m12471d().m12263n();
        int i2 = iMo12247f % 7;
        if (i2 == 0) {
            i = 0;
        } else {
            if ((((iMo12247f ^ 7) >> 31) | 1) <= 0) {
                i2 += 7;
            }
            i = i2;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: g */
    private int m12459g(TemporalAccessor temporalAccessor) {
        int iM12458d = m12458d(temporalAccessor);
        EnumC0472a enumC0472a = EnumC0472a.DAY_OF_YEAR;
        int iMo12247f = temporalAccessor.mo12247f(enumC0472a);
        int iM12466q = m12466q(iMo12247f, iM12458d);
        int iM12457b = m12457b(iM12466q, iMo12247f);
        if (iM12457b == 0) {
            AbstractC0422d.m12266b(temporalAccessor);
            return m12459g(C0459g.m12325s(temporalAccessor).mo12246e(iMo12247f, ChronoUnit.DAYS));
        }
        if (iM12457b <= 50) {
            return iM12457b;
        }
        int iM12457b2 = m12457b(iM12466q, this.f33077b.m12472e() + ((int) temporalAccessor.mo12250j(enumC0472a).m12452d()));
        return iM12457b >= iM12457b2 ? (iM12457b - iM12457b2) + 1 : iM12457b;
    }

    /* JADX INFO: renamed from: k */
    static C0489r m12460k(C0490s c0490s) {
        return new C0489r("DayOfWeek", c0490s, ChronoUnit.DAYS, ChronoUnit.WEEKS, f33072f);
    }

    /* JADX INFO: renamed from: l */
    static C0489r m12461l(C0490s c0490s) {
        return new C0489r("WeekBasedYear", c0490s, AbstractC0480i.f33052d, ChronoUnit.FOREVER, EnumC0472a.YEAR.mo12424f());
    }

    /* JADX INFO: renamed from: m */
    static C0489r m12462m(C0490s c0490s) {
        return new C0489r("WeekOfMonth", c0490s, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f33073g);
    }

    /* JADX INFO: renamed from: n */
    static C0489r m12463n(C0490s c0490s) {
        return new C0489r("WeekOfWeekBasedYear", c0490s, ChronoUnit.WEEKS, AbstractC0480i.f33052d, f33075i);
    }

    /* JADX INFO: renamed from: o */
    private C0488q m12464o(TemporalAccessor temporalAccessor, EnumC0472a enumC0472a) {
        int iM12466q = m12466q(temporalAccessor.mo12247f(enumC0472a), m12458d(temporalAccessor));
        C0488q c0488qMo12250j = temporalAccessor.mo12250j(enumC0472a);
        return C0488q.m12447i(m12457b(iM12466q, (int) c0488qMo12250j.m12453e()), m12457b(iM12466q, (int) c0488qMo12250j.m12452d()));
    }

    /* JADX INFO: renamed from: p */
    private C0488q m12465p(TemporalAccessor temporalAccessor) {
        EnumC0472a enumC0472a = EnumC0472a.DAY_OF_YEAR;
        if (!temporalAccessor.mo12248h(enumC0472a)) {
            return f33074h;
        }
        int iM12458d = m12458d(temporalAccessor);
        int iMo12247f = temporalAccessor.mo12247f(enumC0472a);
        int iM12466q = m12466q(iMo12247f, iM12458d);
        int iM12457b = m12457b(iM12466q, iMo12247f);
        if (iM12457b == 0) {
            AbstractC0422d.m12266b(temporalAccessor);
            return m12465p(C0459g.m12325s(temporalAccessor).mo12246e(iMo12247f + 7, ChronoUnit.DAYS));
        }
        int iM12452d = (int) temporalAccessor.mo12250j(enumC0472a).m12452d();
        int iM12457b2 = m12457b(iM12466q, this.f33077b.m12472e() + iM12452d);
        if (iM12457b < iM12457b2) {
            return C0488q.m12447i(1L, iM12457b2 - 1);
        }
        AbstractC0422d.m12266b(temporalAccessor);
        return m12465p(C0459g.m12325s(temporalAccessor).mo12252l((iM12452d - iMo12247f) + 1 + 7, ChronoUnit.DAYS));
    }

    /* JADX INFO: renamed from: q */
    private int m12466q(int i, int i2) {
        int i3;
        int i4 = i - i2;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i3 = 0;
        } else {
            if ((((i4 ^ 7) >> 31) | 1) <= 0) {
                i5 += 7;
            }
            i3 = i5;
        }
        return i3 + 1 > this.f33077b.m12472e() ? 7 - i3 : -i3;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: a */
    public final boolean mo12421a() {
        return false;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: c */
    public final boolean mo12422c() {
        return true;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: e */
    public final long mo12423e(TemporalAccessor temporalAccessor) {
        int iM12459g;
        int iM12457b;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f33079d;
        if (temporalUnit != chronoUnit) {
            if (temporalUnit == ChronoUnit.MONTHS) {
                int iM12458d = m12458d(temporalAccessor);
                int iMo12247f = temporalAccessor.mo12247f(EnumC0472a.DAY_OF_MONTH);
                iM12457b = m12457b(m12466q(iMo12247f, iM12458d), iMo12247f);
            } else if (temporalUnit == ChronoUnit.YEARS) {
                int iM12458d2 = m12458d(temporalAccessor);
                int iMo12247f2 = temporalAccessor.mo12247f(EnumC0472a.DAY_OF_YEAR);
                iM12457b = m12457b(m12466q(iMo12247f2, iM12458d2), iMo12247f2);
            } else {
                if (temporalUnit != C0490s.f33082h) {
                    if (temporalUnit != ChronoUnit.FOREVER) {
                        throw new IllegalStateException("unreachable, rangeUnit: " + String.valueOf(temporalUnit) + ", this: " + String.valueOf(this));
                    }
                    int iM12458d3 = m12458d(temporalAccessor);
                    int iMo12247f3 = temporalAccessor.mo12247f(EnumC0472a.YEAR);
                    EnumC0472a enumC0472a = EnumC0472a.DAY_OF_YEAR;
                    int iMo12247f4 = temporalAccessor.mo12247f(enumC0472a);
                    int iM12466q = m12466q(iMo12247f4, iM12458d3);
                    int iM12457b2 = m12457b(iM12466q, iMo12247f4);
                    if (iM12457b2 == 0) {
                        iMo12247f3--;
                    } else {
                        if (iM12457b2 >= m12457b(iM12466q, this.f33077b.m12472e() + ((int) temporalAccessor.mo12250j(enumC0472a).m12452d()))) {
                            iMo12247f3++;
                        }
                    }
                    return iMo12247f3;
                }
                iM12459g = m12459g(temporalAccessor);
            }
            return iM12457b;
        }
        iM12459g = m12458d(temporalAccessor);
        return iM12459g;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: f */
    public final C0488q mo12424f() {
        return this.f33080e;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: h */
    public final boolean mo12425h(TemporalAccessor temporalAccessor) {
        EnumC0472a enumC0472a;
        if (!temporalAccessor.mo12248h(EnumC0472a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f33079d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            enumC0472a = EnumC0472a.DAY_OF_MONTH;
        } else if (temporalUnit == ChronoUnit.YEARS || temporalUnit == C0490s.f33082h) {
            enumC0472a = EnumC0472a.DAY_OF_YEAR;
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                return false;
            }
            enumC0472a = EnumC0472a.YEAR;
        }
        return temporalAccessor.mo12248h(enumC0472a);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: i */
    public final Temporal mo12426i(Temporal temporal, long j) {
        int iM12450a = this.f33080e.m12450a(j, this);
        int iMo12247f = temporal.mo12247f(this);
        if (iM12450a == iMo12247f) {
            return temporal;
        }
        if (this.f33079d != ChronoUnit.FOREVER) {
            return temporal.mo12252l(iM12450a - iMo12247f, this.f33078c);
        }
        C0490s c0490s = this.f33077b;
        int iMo12247f2 = temporal.mo12247f(c0490s.f33085c);
        int iMo12247f3 = temporal.mo12247f(c0490s.f33087e);
        AbstractC0422d.m12266b(temporal);
        C0459g c0459gM12322I = C0459g.m12322I((int) j, 1, 1);
        int iM12466q = m12466q(1, m12458d(c0459gM12322I));
        return c0459gM12322I.mo12252l(((Math.min(iMo12247f3, m12457b(iM12466q, c0490s.m12472e() + (c0459gM12322I.m12330E() ? 366 : 365)) - 1) - 1) * 7) + (iMo12247f2 - 1) + (-iM12466q), ChronoUnit.DAYS);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: j */
    public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f33079d;
        if (temporalUnit == chronoUnit) {
            return this.f33080e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return m12464o(temporalAccessor, EnumC0472a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return m12464o(temporalAccessor, EnumC0472a.DAY_OF_YEAR);
        }
        if (temporalUnit == C0490s.f33082h) {
            return m12465p(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return EnumC0472a.YEAR.mo12424f();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + String.valueOf(temporalUnit) + ", this: " + String.valueOf(this));
    }

    public final String toString() {
        return this.f33076a + "[" + this.f33077b.toString() + "]";
    }
}
