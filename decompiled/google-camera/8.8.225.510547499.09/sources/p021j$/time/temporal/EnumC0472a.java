package p021j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0472a implements InterfaceC0483l {
    public static final EnumC0472a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC0472a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC0472a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC0472a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC0472a AMPM_OF_DAY;
    public static final EnumC0472a CLOCK_HOUR_OF_AMPM;
    public static final EnumC0472a CLOCK_HOUR_OF_DAY;
    public static final EnumC0472a DAY_OF_MONTH;
    public static final EnumC0472a DAY_OF_WEEK;
    public static final EnumC0472a DAY_OF_YEAR;
    public static final EnumC0472a EPOCH_DAY;
    public static final EnumC0472a ERA;
    public static final EnumC0472a HOUR_OF_AMPM;
    public static final EnumC0472a HOUR_OF_DAY;
    public static final EnumC0472a INSTANT_SECONDS;
    public static final EnumC0472a MICRO_OF_DAY;
    public static final EnumC0472a MICRO_OF_SECOND;
    public static final EnumC0472a MILLI_OF_DAY;
    public static final EnumC0472a MILLI_OF_SECOND;
    public static final EnumC0472a MINUTE_OF_DAY;
    public static final EnumC0472a MINUTE_OF_HOUR;
    public static final EnumC0472a MONTH_OF_YEAR;
    public static final EnumC0472a NANO_OF_DAY;
    public static final EnumC0472a NANO_OF_SECOND;
    public static final EnumC0472a OFFSET_SECONDS;
    public static final EnumC0472a PROLEPTIC_MONTH;
    public static final EnumC0472a SECOND_OF_DAY;
    public static final EnumC0472a SECOND_OF_MINUTE;
    public static final EnumC0472a YEAR;
    public static final EnumC0472a YEAR_OF_ERA;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumC0472a[] f33038e;

    /* JADX INFO: renamed from: a */
    private final String f33039a;

    /* JADX INFO: renamed from: b */
    private final TemporalUnit f33040b;

    /* JADX INFO: renamed from: c */
    private final TemporalUnit f33041c;

    /* JADX INFO: renamed from: d */
    private final C0488q f33042d;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        EnumC0472a enumC0472a = new EnumC0472a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, C0488q.m12447i(0L, 999999999L));
        NANO_OF_SECOND = enumC0472a;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        EnumC0472a enumC0472a2 = new EnumC0472a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, C0488q.m12447i(0L, 86399999999999L));
        NANO_OF_DAY = enumC0472a2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        EnumC0472a enumC0472a3 = new EnumC0472a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, C0488q.m12447i(0L, 999999L));
        MICRO_OF_SECOND = enumC0472a3;
        EnumC0472a enumC0472a4 = new EnumC0472a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, C0488q.m12447i(0L, 86399999999L));
        MICRO_OF_DAY = enumC0472a4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        EnumC0472a enumC0472a5 = new EnumC0472a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, C0488q.m12447i(0L, 999L));
        MILLI_OF_SECOND = enumC0472a5;
        EnumC0472a enumC0472a6 = new EnumC0472a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, C0488q.m12447i(0L, 86399999L));
        MILLI_OF_DAY = enumC0472a6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        EnumC0472a enumC0472a7 = new EnumC0472a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, C0488q.m12447i(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC0472a7;
        EnumC0472a enumC0472a8 = new EnumC0472a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, C0488q.m12447i(0L, 86399L));
        SECOND_OF_DAY = enumC0472a8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        EnumC0472a enumC0472a9 = new EnumC0472a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, C0488q.m12447i(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC0472a9;
        EnumC0472a enumC0472a10 = new EnumC0472a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, C0488q.m12447i(0L, 1439L));
        MINUTE_OF_DAY = enumC0472a10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        EnumC0472a enumC0472a11 = new EnumC0472a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, C0488q.m12447i(0L, 11L));
        HOUR_OF_AMPM = enumC0472a11;
        EnumC0472a enumC0472a12 = new EnumC0472a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, C0488q.m12447i(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC0472a12;
        EnumC0472a enumC0472a13 = new EnumC0472a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, C0488q.m12447i(0L, 23L), 0);
        HOUR_OF_DAY = enumC0472a13;
        EnumC0472a enumC0472a14 = new EnumC0472a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, C0488q.m12447i(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC0472a14;
        EnumC0472a enumC0472a15 = new EnumC0472a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, C0488q.m12447i(0L, 1L), 0);
        AMPM_OF_DAY = enumC0472a15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        EnumC0472a enumC0472a16 = new EnumC0472a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, C0488q.m12447i(1L, 7L), 0);
        DAY_OF_WEEK = enumC0472a16;
        EnumC0472a enumC0472a17 = new EnumC0472a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, C0488q.m12447i(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC0472a17;
        EnumC0472a enumC0472a18 = new EnumC0472a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, C0488q.m12447i(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC0472a18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        EnumC0472a enumC0472a19 = new EnumC0472a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, C0488q.m12449k(28L, 31L), 0);
        DAY_OF_MONTH = enumC0472a19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        EnumC0472a enumC0472a20 = new EnumC0472a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, C0488q.m12449k(365L, 366L));
        DAY_OF_YEAR = enumC0472a20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        EnumC0472a enumC0472a21 = new EnumC0472a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, C0488q.m12447i(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC0472a21;
        EnumC0472a enumC0472a22 = new EnumC0472a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, C0488q.m12449k(4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC0472a22;
        EnumC0472a enumC0472a23 = new EnumC0472a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, C0488q.m12447i(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC0472a23;
        EnumC0472a enumC0472a24 = new EnumC0472a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, C0488q.m12447i(1L, 12L), 0);
        MONTH_OF_YEAR = enumC0472a24;
        EnumC0472a enumC0472a25 = new EnumC0472a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, C0488q.m12447i(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC0472a25;
        EnumC0472a enumC0472a26 = new EnumC0472a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, C0488q.m12449k(999999999L, 1000000000L));
        YEAR_OF_ERA = enumC0472a26;
        EnumC0472a enumC0472a27 = new EnumC0472a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, C0488q.m12447i(-999999999L, 999999999L), 0);
        YEAR = enumC0472a27;
        EnumC0472a enumC0472a28 = new EnumC0472a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, C0488q.m12447i(0L, 1L), 0);
        ERA = enumC0472a28;
        EnumC0472a enumC0472a29 = new EnumC0472a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, C0488q.m12447i(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC0472a29;
        EnumC0472a enumC0472a30 = new EnumC0472a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, C0488q.m12447i(-64800L, 64800L));
        OFFSET_SECONDS = enumC0472a30;
        f33038e = new EnumC0472a[]{enumC0472a, enumC0472a2, enumC0472a3, enumC0472a4, enumC0472a5, enumC0472a6, enumC0472a7, enumC0472a8, enumC0472a9, enumC0472a10, enumC0472a11, enumC0472a12, enumC0472a13, enumC0472a14, enumC0472a15, enumC0472a16, enumC0472a17, enumC0472a18, enumC0472a19, enumC0472a20, enumC0472a21, enumC0472a22, enumC0472a23, enumC0472a24, enumC0472a25, enumC0472a26, enumC0472a27, enumC0472a28, enumC0472a29, enumC0472a30};
    }

    private EnumC0472a(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C0488q c0488q) {
        super(str, i);
        this.f33039a = str2;
        this.f33040b = chronoUnit;
        this.f33041c = chronoUnit2;
        this.f33042d = c0488q;
    }

    public static EnumC0472a valueOf(String str) {
        return (EnumC0472a) Enum.valueOf(EnumC0472a.class, str);
    }

    public static EnumC0472a[] values() {
        return (EnumC0472a[]) f33038e.clone();
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: a */
    public final boolean mo12421a() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: c */
    public final boolean mo12422c() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: e */
    public final long mo12423e(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo12251k(this);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: f */
    public final C0488q mo12424f() {
        return this.f33042d;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: h */
    public final boolean mo12425h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo12248h(this);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: i */
    public final Temporal mo12426i(Temporal temporal, long j) {
        return temporal.mo12245c(j, this);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: j */
    public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo12250j(this);
    }

    /* JADX INFO: renamed from: k */
    public final int m12428k(long j) {
        return this.f33042d.m12450a(j, this);
    }

    /* JADX INFO: renamed from: l */
    public final void m12429l(long j) {
        this.f33042d.m12451b(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33039a;
    }

    private EnumC0472a(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C0488q c0488q, int i2) {
        super(str, i);
        this.f33039a = str2;
        this.f33040b = chronoUnit;
        this.f33041c = chronoUnit2;
        this.f33042d = c0488q;
    }
}
