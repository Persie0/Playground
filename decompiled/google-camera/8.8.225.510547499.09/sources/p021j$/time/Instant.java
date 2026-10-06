package p021j$.time;

import java.io.Serializable;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.format.DateTimeFormatter;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.temporal.TemporalAmount;
import p021j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant implements Temporal, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: a */
    private final long f32907a;

    /* JADX INFO: renamed from: b */
    private final int f32908b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.f32907a = j;
        this.f32908b = i;
    }

    /* JADX INFO: renamed from: n */
    private static Instant m12240n(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C0417b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return m12240n(AbstractC0359Y.m12154c(j, j2), ((int) AbstractC0359Y.m12155d(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return m12240n(j, 0);
    }

    /* JADX INFO: renamed from: q */
    public static Instant m12241q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        if (temporalAccessor == null) {
            throw new NullPointerException("temporal");
        }
        try {
            return ofEpochSecond(temporalAccessor.mo12251k(EnumC0472a.INSTANT_SECONDS), temporalAccessor.mo12247f(EnumC0472a.NANO_OF_SECOND));
        } catch (C0417b e) {
            throw new C0417b("Unable to obtain Instant from TemporalAccessor: " + String.valueOf(temporalAccessor) + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: r */
    private Instant m12242r(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC0304a.m12052d(AbstractC0304a.m12052d(this.f32907a, j), j2 / 1000000000), ((long) this.f32908b) + (j2 % 1000000000));
    }

    /* JADX INFO: renamed from: z */
    private long m12243z(Instant instant) {
        long jM12056h = AbstractC0304a.m12056h(instant.f32907a, this.f32907a);
        long j = instant.f32908b - this.f32908b;
        if (jM12056h <= 0 || j >= 0) {
            return (jM12056h >= 0 || j <= 0) ? jM12056h : jM12056h + 1;
        }
        return jM12056h - 1;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final long mo12244a(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantM12241q = m12241q(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, instantM12241q);
        }
        int i = AbstractC0428e.f32918b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.f32908b;
        long j = this.f32907a;
        switch (i) {
            case 1:
                return AbstractC0304a.m12052d(AbstractC0304a.m12055g(AbstractC0304a.m12056h(instantM12241q.f32907a, j), 1000000000L), instantM12241q.f32908b - i2);
            case 2:
                return AbstractC0304a.m12052d(AbstractC0304a.m12055g(AbstractC0304a.m12056h(instantM12241q.f32907a, j), 1000000000L), instantM12241q.f32908b - i2) / 1000;
            case 3:
                return AbstractC0304a.m12056h(instantM12241q.toEpochMilli(), toEpochMilli());
            case 4:
                return m12243z(instantM12241q);
            case 5:
                return m12243z(instantM12241q) / 60;
            case 6:
                return m12243z(instantM12241q) / 3600;
            case 7:
                return m12243z(instantM12241q) / 43200;
            case 8:
                return m12243z(instantM12241q) / 86400;
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r7 != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7 != r4) goto L26;
     */
    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Temporal mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        int i;
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (Instant) interfaceC0483l.mo12426i(this, j);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        enumC0472a.m12429l(j);
        int i2 = AbstractC0428e.f32917a[enumC0472a.ordinal()];
        long j2 = this.f32907a;
        int i3 = this.f32908b;
        if (i2 == 1) {
            if (j != i3) {
                i = (int) j;
                return m12240n(j2, i);
            }
            return this;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                i = ((int) j) * 1000000;
            } else {
                if (i2 != 4) {
                    throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
                }
                if (j != j2) {
                    return m12240n(j, i3);
                }
            }
            return this;
        }
        i = ((int) j) * 1000;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int i = (this.f32907a > instant2.f32907a ? 1 : (this.f32907a == instant2.f32907a ? 0 : -1));
        return i != 0 ? i : this.f32908b - instant2.f32908b;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo12246e(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo12252l(Long.MAX_VALUE, chronoUnit).mo12252l(1L, chronoUnit) : mo12252l(-j, chronoUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f32907a == instant.f32907a && this.f32908b == instant.f32908b;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return AbstractC0304a.m12051c(this, interfaceC0483l).m12450a(interfaceC0483l.mo12423e(this), interfaceC0483l);
        }
        int i = AbstractC0428e.f32917a[((EnumC0472a) interfaceC0483l).ordinal()];
        int i2 = this.f32908b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            EnumC0472a.INSTANT_SECONDS.m12428k(this.f32907a);
        }
        throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
    }

    public long getEpochSecond() {
        return this.f32907a;
    }

    public int getNano() {
        return this.f32908b;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l == EnumC0472a.INSTANT_SECONDS || interfaceC0483l == EnumC0472a.NANO_OF_SECOND || interfaceC0483l == EnumC0472a.MICRO_OF_SECOND || interfaceC0483l == EnumC0472a.MILLI_OF_SECOND;
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    public int hashCode() {
        long j = this.f32907a;
        return (this.f32908b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i */
    public final Temporal mo12249i(C0459g c0459g) {
        return (Instant) c0459g.m12341n(this);
    }

    public boolean isAfter(Instant instant) {
        int i = (this.f32907a > instant.f32907a ? 1 : (this.f32907a == instant.f32907a ? 0 : -1));
        if (i == 0) {
            i = this.f32908b - instant.f32908b;
        }
        return i > 0;
    }

    public boolean isBefore(Instant instant) {
        int i = (this.f32907a > instant.f32907a ? 1 : (this.f32907a == instant.f32907a ? 0 : -1));
        if (i == 0) {
            i = this.f32908b - instant.f32908b;
        }
        return i < 0;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        return AbstractC0304a.m12051c(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        int i;
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12423e(this);
        }
        int i2 = AbstractC0428e.f32917a[((EnumC0472a) interfaceC0483l).ordinal()];
        int i3 = this.f32908b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.f32907a;
                }
                throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12443e()) {
            return ChronoUnit.NANOS;
        }
        if (interfaceC0486o == AbstractC0485n.m12439a() || interfaceC0486o == AbstractC0485n.m12445g() || interfaceC0486o == AbstractC0485n.m12444f() || interfaceC0486o == AbstractC0485n.m12442d() || interfaceC0486o == AbstractC0485n.m12440b() || interfaceC0486o == AbstractC0485n.m12441c()) {
            return null;
        }
        return interfaceC0486o.mo12274a(this);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.mo12237a(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? m12255u(Long.MAX_VALUE).m12255u(1L) : m12255u(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? m12256y(Long.MAX_VALUE).m12256y(1L) : m12256y(-j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.mo12238c(this);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Instant mo12252l(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo12420i(this, j);
        }
        switch (AbstractC0428e.f32918b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m12242r(0L, j);
            case 2:
                return m12242r(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m12255u(j);
            case 4:
                return m12256y(j);
            case 5:
                return m12256y(AbstractC0304a.m12055g(j, 60));
            case 6:
                return m12256y(AbstractC0304a.m12055g(j, 3600));
            case 7:
                return m12256y(AbstractC0304a.m12055g(j, 43200));
            case 8:
                return m12256y(AbstractC0304a.m12055g(j, 86400));
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public long toEpochMilli() {
        long jM12055g;
        int i;
        int i2 = this.f32908b;
        long j = this.f32907a;
        if (j >= 0 || i2 <= 0) {
            jM12055g = AbstractC0304a.m12055g(j, 1000);
            i = i2 / 1000000;
        } else {
            jM12055g = AbstractC0304a.m12055g(j + 1, 1000);
            i = (i2 / 1000000) - 1000;
        }
        return AbstractC0304a.m12052d(jM12055g, i);
    }

    public final String toString() {
        return DateTimeFormatter.f32925h.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration durationMo12418f = temporalUnit.mo12418f();
        if (durationMo12418f.getSeconds() > 86400) {
            throw new C0487p("Unit is too large to be used for truncation");
        }
        long nanos = durationMo12418f.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new C0487p("Unit must divide into a standard day without remainder");
        }
        long j = ((this.f32907a % 86400) * 1000000000) + ((long) this.f32908b);
        return m12242r(0L, (AbstractC0359Y.m12154c(j, nanos) * nanos) - j);
    }

    /* JADX INFO: renamed from: u */
    public final Instant m12255u(long j) {
        return m12242r(j / 1000, (j % 1000) * 1000000);
    }

    /* JADX INFO: renamed from: y */
    public final Instant m12256y(long j) {
        return m12242r(j, 0L);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return m12240n(AbstractC0304a.m12052d(j, AbstractC0359Y.m12154c(j2, 1000000000L)), (int) AbstractC0359Y.m12155d(j2, 1000000000L));
    }
}
