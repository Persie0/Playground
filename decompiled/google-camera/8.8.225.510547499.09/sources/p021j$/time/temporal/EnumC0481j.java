package p021j$.time.temporal;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.C0417b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.j */
/* JADX INFO: loaded from: classes3.dex */
final class EnumC0481j implements InterfaceC0483l {
    public static final EnumC0481j JULIAN_DAY;
    public static final EnumC0481j MODIFIED_JULIAN_DAY;
    public static final EnumC0481j RATA_DIE;

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ EnumC0481j[] f33053f;

    /* JADX INFO: renamed from: a */
    private final transient String f33054a;

    /* JADX INFO: renamed from: b */
    private final transient TemporalUnit f33055b;

    /* JADX INFO: renamed from: c */
    private final transient TemporalUnit f33056c;

    /* JADX INFO: renamed from: d */
    private final transient C0488q f33057d;

    /* JADX INFO: renamed from: e */
    private final transient long f33058e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC0481j enumC0481j = new EnumC0481j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC0481j;
        EnumC0481j enumC0481j2 = new EnumC0481j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC0481j2;
        EnumC0481j enumC0481j3 = new EnumC0481j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC0481j3;
        f33053f = new EnumC0481j[]{enumC0481j, enumC0481j2, enumC0481j3};
    }

    private EnumC0481j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.f33054a = str2;
        this.f33055b = chronoUnit;
        this.f33056c = chronoUnit2;
        this.f33057d = C0488q.m12447i((-365243219162L) + j, 365241780471L + j);
        this.f33058e = j;
    }

    public static EnumC0481j valueOf(String str) {
        return (EnumC0481j) Enum.valueOf(EnumC0481j.class, str);
    }

    public static EnumC0481j[] values() {
        return (EnumC0481j[]) f33053f.clone();
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
        return temporalAccessor.mo12251k(EnumC0472a.EPOCH_DAY) + this.f33058e;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: f */
    public final C0488q mo12424f() {
        return this.f33057d;
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: h */
    public final boolean mo12425h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo12248h(EnumC0472a.EPOCH_DAY);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: i */
    public final Temporal mo12426i(Temporal temporal, long j) {
        if (this.f33057d.m12456h(j)) {
            return temporal.mo12245c(AbstractC0304a.m12056h(j, this.f33058e), EnumC0472a.EPOCH_DAY);
        }
        throw new C0417b("Invalid value: " + this.f33054a + " " + j);
    }

    @Override // p021j$.time.temporal.InterfaceC0483l
    /* JADX INFO: renamed from: j */
    public final C0488q mo12427j(TemporalAccessor temporalAccessor) {
        if (mo12425h(temporalAccessor)) {
            return this.f33057d;
        }
        throw new C0417b("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33054a;
    }
}
