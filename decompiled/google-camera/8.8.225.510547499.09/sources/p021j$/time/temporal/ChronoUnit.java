package p021j$.time.temporal;

import p021j$.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: a */
    private final String f33036a;

    /* JADX INFO: renamed from: b */
    private final Duration f33037b;

    ChronoUnit(String str, Duration duration) {
        this.f33036a = str;
        this.f33037b = duration;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: a */
    public final boolean mo12415a() {
        return compareTo(DAYS) < 0;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: c */
    public final boolean mo12416c() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: e */
    public final boolean mo12417e() {
        return compareTo(DAYS) >= 0;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: f */
    public final Duration mo12418f() {
        return this.f33037b;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: h */
    public final long mo12419h(Temporal temporal, Temporal temporal2) {
        return temporal.mo12244a(temporal2, this);
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: i */
    public final Temporal mo12420i(Temporal temporal, long j) {
        return temporal.mo12252l(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33036a;
    }
}
