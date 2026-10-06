package p021j$.time.temporal;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.Duration;

/* JADX INFO: renamed from: j$.time.temporal.h */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC0479h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));


    /* JADX INFO: renamed from: a */
    private final String f33047a;

    /* JADX INFO: renamed from: b */
    private final Duration f33048b;

    EnumC0479h(String str, Duration duration) {
        this.f33047a = str;
        this.f33048b = duration;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: a */
    public final boolean mo12415a() {
        return false;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: c */
    public final boolean mo12416c() {
        return true;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: e */
    public final boolean mo12417e() {
        return true;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: f */
    public final Duration mo12418f() {
        return this.f33048b;
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: h */
    public final long mo12419h(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.mo12244a(temporal2, this);
        }
        int i = AbstractC0473b.f33043a[ordinal()];
        if (i == 1) {
            InterfaceC0483l interfaceC0483l = AbstractC0480i.f33051c;
            return AbstractC0304a.m12056h(temporal2.mo12251k(interfaceC0483l), temporal.mo12251k(interfaceC0483l));
        }
        if (i == 2) {
            return temporal.mo12244a(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p021j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: i */
    public final Temporal mo12420i(Temporal temporal, long j) {
        int i = AbstractC0473b.f33043a[ordinal()];
        if (i == 1) {
            InterfaceC0483l interfaceC0483l = AbstractC0480i.f33051c;
            return temporal.mo12245c(AbstractC0304a.m12052d(temporal.mo12247f(interfaceC0483l), j), interfaceC0483l);
        }
        if (i == 2) {
            return temporal.mo12252l(j / 4, ChronoUnit.YEARS).mo12252l((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33047a;
    }
}
