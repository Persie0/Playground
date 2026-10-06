package p021j$.time.temporal;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.C0459g;
import p021j$.time.EnumC0418c;
import p021j$.time.chrono.C0426h;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.g */
/* JADX INFO: loaded from: classes3.dex */
abstract class EnumC0478g implements InterfaceC0483l {
    public static final EnumC0478g DAY_OF_QUARTER;
    public static final EnumC0478g QUARTER_OF_YEAR;
    public static final EnumC0478g WEEK_BASED_YEAR;
    public static final EnumC0478g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a */
    private static final int[] f33044a;

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ EnumC0478g[] f33045b;

    static {
        EnumC0478g enumC0478g = new EnumC0478g() { // from class: j$.time.temporal.c
            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: e */
            public final long mo12423e(TemporalAccessor temporalAccessor) {
                if (!mo12425h(temporalAccessor)) {
                    throw new C0487p("Unsupported field: DayOfQuarter");
                }
                int iMo12247f = temporalAccessor.mo12247f(EnumC0472a.DAY_OF_YEAR);
                int iMo12247f2 = temporalAccessor.mo12247f(EnumC0472a.MONTH_OF_YEAR);
                long jMo12251k = temporalAccessor.mo12251k(EnumC0472a.YEAR);
                int[] iArr = EnumC0478g.f33044a;
                int i = (iMo12247f2 - 1) / 3;
                C0426h.f32915a.getClass();
                return iMo12247f - iArr[i + (C0426h.m12267a(jMo12251k) ? 4 : 0)];
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: f */
            public final C0488q mo12424f() {
                return C0488q.m12449k(90L, 92L);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: h */
            public final boolean mo12425h(TemporalAccessor temporalAccessor) {
                return temporalAccessor.mo12248h(EnumC0472a.DAY_OF_YEAR) && temporalAccessor.mo12248h(EnumC0472a.MONTH_OF_YEAR) && temporalAccessor.mo12248h(EnumC0472a.YEAR) && AbstractC0480i.m12437a(temporalAccessor);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: i */
            public final Temporal mo12426i(Temporal temporal, long j) {
                long jMo12423e = mo12423e(temporal);
                mo12424f().m12451b(j, this);
                EnumC0472a enumC0472a = EnumC0472a.DAY_OF_YEAR;
                return temporal.mo12245c((j - jMo12423e) + temporal.mo12251k(enumC0472a), enumC0472a);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: j */
            public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
                if (!mo12425h(temporalAccessor)) {
                    throw new C0487p("Unsupported field: DayOfQuarter");
                }
                long jMo12251k = temporalAccessor.mo12251k(EnumC0478g.QUARTER_OF_YEAR);
                if (jMo12251k == 1) {
                    long jMo12251k2 = temporalAccessor.mo12251k(EnumC0472a.YEAR);
                    C0426h.f32915a.getClass();
                    return C0426h.m12267a(jMo12251k2) ? C0488q.m12447i(1L, 91L) : C0488q.m12447i(1L, 90L);
                }
                if (jMo12251k == 2) {
                    return C0488q.m12447i(1L, 91L);
                }
                return (jMo12251k == 3 || jMo12251k == 4) ? C0488q.m12447i(1L, 92L) : mo12424f();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC0478g;
        EnumC0478g enumC0478g2 = new EnumC0478g() { // from class: j$.time.temporal.d
            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: e */
            public final long mo12423e(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return (temporalAccessor.mo12251k(EnumC0472a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C0487p("Unsupported field: QuarterOfYear");
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: f */
            public final C0488q mo12424f() {
                return C0488q.m12447i(1L, 4L);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: h */
            public final boolean mo12425h(TemporalAccessor temporalAccessor) {
                return temporalAccessor.mo12248h(EnumC0472a.MONTH_OF_YEAR) && AbstractC0480i.m12437a(temporalAccessor);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: i */
            public final Temporal mo12426i(Temporal temporal, long j) {
                long jMo12423e = mo12423e(temporal);
                mo12424f().m12451b(j, this);
                EnumC0472a enumC0472a = EnumC0472a.MONTH_OF_YEAR;
                return temporal.mo12245c(((j - jMo12423e) * 3) + temporal.mo12251k(enumC0472a), enumC0472a);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: j */
            public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return mo12424f();
                }
                throw new C0487p("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC0478g2;
        EnumC0478g enumC0478g3 = new EnumC0478g() { // from class: j$.time.temporal.e
            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: e */
            public final long mo12423e(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return EnumC0478g.m12431l(C0459g.m12325s(temporalAccessor));
                }
                throw new C0487p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: f */
            public final C0488q mo12424f() {
                return C0488q.m12449k(52L, 53L);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: h */
            public final boolean mo12425h(TemporalAccessor temporalAccessor) {
                return temporalAccessor.mo12248h(EnumC0472a.EPOCH_DAY) && AbstractC0480i.m12437a(temporalAccessor);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: i */
            public final Temporal mo12426i(Temporal temporal, long j) {
                mo12424f().m12451b(j, this);
                return temporal.mo12252l(AbstractC0304a.m12056h(j, mo12423e(temporal)), ChronoUnit.WEEKS);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: j */
            public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return EnumC0478g.m12434q(C0459g.m12325s(temporalAccessor));
                }
                throw new C0487p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC0478g3;
        EnumC0478g enumC0478g4 = new EnumC0478g() { // from class: j$.time.temporal.f
            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: e */
            public final long mo12423e(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return EnumC0478g.m12435r(C0459g.m12325s(temporalAccessor));
                }
                throw new C0487p("Unsupported field: WeekBasedYear");
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: f */
            public final C0488q mo12424f() {
                return EnumC0472a.YEAR.mo12424f();
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: h */
            public final boolean mo12425h(TemporalAccessor temporalAccessor) {
                return temporalAccessor.mo12248h(EnumC0472a.EPOCH_DAY) && AbstractC0480i.m12437a(temporalAccessor);
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: i */
            public final Temporal mo12426i(Temporal temporal, long j) {
                if (!mo12425h(temporal)) {
                    throw new C0487p("Unsupported field: WeekBasedYear");
                }
                int iM12450a = mo12424f().m12450a(j, EnumC0478g.WEEK_BASED_YEAR);
                C0459g c0459gM12325s = C0459g.m12325s(temporal);
                EnumC0472a enumC0472a = EnumC0472a.DAY_OF_WEEK;
                int iMo12247f = c0459gM12325s.mo12247f(enumC0472a);
                int iM12431l = EnumC0478g.m12431l(c0459gM12325s);
                if (iM12431l == 53 && EnumC0478g.m12436s(iM12450a) == 52) {
                    iM12431l = 52;
                }
                C0459g c0459gM12322I = C0459g.m12322I(iM12450a, 1, 4);
                return temporal.mo12249i(c0459gM12322I.m12334L(((iM12431l - 1) * 7) + (iMo12247f - c0459gM12322I.mo12247f(enumC0472a))));
            }

            @Override // p021j$.time.temporal.InterfaceC0483l
            /* JADX INFO: renamed from: j */
            public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
                if (mo12425h(temporalAccessor)) {
                    return mo12424f();
                }
                throw new C0487p("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC0478g4;
        f33045b = new EnumC0478g[]{enumC0478g, enumC0478g2, enumC0478g3, enumC0478g4};
        f33044a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    EnumC0478g(String str, int i) {
        super(str, i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX INFO: renamed from: l */
    static int m12431l(C0459g c0459g) {
        int i;
        int iOrdinal = c0459g.m12345z().ordinal();
        int iM12327A = c0459g.m12327A() - 1;
        int i2 = (3 - iOrdinal) + iM12327A;
        int i3 = (i2 - ((i2 / 7) * 7)) - 3;
        if (i3 < -3) {
            i3 += 7;
        }
        if (iM12327A < i3) {
            return (int) C0488q.m12447i(1L, m12436s(m12435r(c0459g.m12339R(180).m12336N(-1L)))).m12452d();
        }
        int i4 = ((iM12327A - i3) / 7) + 1;
        if (i4 == 53) {
            i = i3 == -3 || (i3 == -2 && c0459g.m12330E()) ? i4 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: q */
    static C0488q m12434q(C0459g c0459g) {
        return C0488q.m12447i(1L, m12436s(m12435r(c0459g)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static int m12435r(C0459g c0459g) {
        int iM12329D = c0459g.m12329D();
        int iM12327A = c0459g.m12327A();
        if (iM12327A <= 3) {
            return iM12327A - c0459g.m12345z().ordinal() < -2 ? iM12329D - 1 : iM12329D;
        }
        if (iM12327A >= 363) {
            return ((iM12327A - 363) - (c0459g.m12330E() ? 1 : 0)) - c0459g.m12345z().ordinal() >= 0 ? iM12329D + 1 : iM12329D;
        }
        return iM12329D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static int m12436s(int i) {
        C0459g c0459gM12322I = C0459g.m12322I(i, 1, 1);
        if (c0459gM12322I.m12345z() != EnumC0418c.THURSDAY) {
            return (c0459gM12322I.m12345z() == EnumC0418c.WEDNESDAY && c0459gM12322I.m12330E()) ? 53 : 52;
        }
        return 53;
    }

    public static EnumC0478g valueOf(String str) {
        return (EnumC0478g) Enum.valueOf(EnumC0478g.class, str);
    }

    public static EnumC0478g[] values() {
        return (EnumC0478g[]) f33045b.clone();
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
}
