package p021j$.time;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalAmount;
import p021j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f32904c = BigInteger.valueOf(1000000000);

    /* JADX INFO: renamed from: a */
    private final long f32905a;

    /* JADX INFO: renamed from: b */
    private final int f32906b;

    private Duration(long j, int i) {
        this.f32905a = j;
        this.f32906b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.mo12244a(temporal2, ChronoUnit.NANOS));
        } catch (C0417b | ArithmeticException unused) {
            long jMo12244a = temporal.mo12244a(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                EnumC0472a enumC0472a = EnumC0472a.NANO_OF_SECOND;
                long jMo12251k = temporal2.mo12251k(enumC0472a) - temporal.mo12251k(enumC0472a);
                if (jMo12244a > 0 && jMo12251k < 0) {
                    jMo12244a++;
                } else if (jMo12244a < 0 && jMo12251k > 0) {
                    jMo12244a--;
                }
                j = jMo12251k;
            } catch (C0417b unused2) {
            }
            return ofSeconds(jMo12244a, j);
        }
    }

    /* JADX INFO: renamed from: e */
    private static Duration m12234e(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    /* JADX INFO: renamed from: f */
    private Duration m12235f(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(AbstractC0304a.m12052d(AbstractC0304a.m12052d(this.f32905a, j), j2 / 1000000000), ((long) this.f32906b) + (j2 % 1000000000));
    }

    /* JADX INFO: renamed from: of */
    public static Duration m12236of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        if (temporalUnit == null) {
            throw new NullPointerException("unit");
        }
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.m12235f(AbstractC0304a.m12055g(j, 86400), 0L);
        }
        if (temporalUnit.mo12417e()) {
            throw new C0487p("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationMultipliedBy = temporalUnit.mo12418f().multipliedBy(j);
            return duration.plusSeconds(durationMultipliedBy.getSeconds()).m12239h(durationMultipliedBy.getNano());
        }
        int i = AbstractC0427d.f32916a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.m12239h(j);
        }
        if (i == 2) {
            return duration.plusSeconds((j / 1000000000) * 1000).m12239h((j % 1000000000) * 1000);
        }
        if (i == 3) {
            return duration.m12235f(j / 1000, (j % 1000) * 1000000);
        }
        if (i != 4) {
            j = AbstractC0304a.m12055g(temporalUnit.mo12418f().f32905a, j);
        }
        return duration.plusSeconds(j);
    }

    public static Duration ofHours(long j) {
        return m12234e(AbstractC0304a.m12055g(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m12234e(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return m12234e(AbstractC0304a.m12055g(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m12234e(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return m12234e(j, 0);
    }

    @Override // p021j$.time.temporal.TemporalAmount
    /* JADX INFO: renamed from: a */
    public final Temporal mo12237a(Temporal temporal) {
        long j = this.f32905a;
        if (j != 0) {
            temporal = temporal.mo12246e(j, ChronoUnit.SECONDS);
        }
        int i = this.f32906b;
        return i != 0 ? temporal.mo12246e(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // p021j$.time.temporal.TemporalAmount
    /* JADX INFO: renamed from: c */
    public final Temporal mo12238c(Temporal temporal) {
        long j = this.f32905a;
        if (j != 0) {
            temporal = temporal.mo12252l(j, ChronoUnit.SECONDS);
        }
        int i = this.f32906b;
        return i != 0 ? temporal.mo12252l(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int i = (this.f32905a > duration.f32905a ? 1 : (this.f32905a == duration.f32905a ? 0 : -1));
        return i != 0 ? i : this.f32906b - duration.f32906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f32905a == duration.f32905a && this.f32906b == duration.f32906b;
    }

    public int getNano() {
        return this.f32906b;
    }

    public long getSeconds() {
        return this.f32905a;
    }

    /* JADX INFO: renamed from: h */
    public final Duration m12239h(long j) {
        return m12235f(0L, j);
    }

    public int hashCode() {
        long j = this.f32905a;
        return (this.f32906b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.f32905a < 0;
    }

    public boolean isZero() {
        return (((long) this.f32906b) | this.f32905a) == 0;
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? m12235f(Long.MAX_VALUE, -nano).m12235f(1L, 0L) : m12235f(-seconds, -nano);
    }

    public Duration minusNanos(long j) {
        return j == Long.MIN_VALUE ? m12239h(Long.MAX_VALUE).m12239h(1L) : m12239h(-j);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.f32905a).add(BigDecimal.valueOf(this.f32906b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f32904c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    public Duration plusSeconds(long j) {
        return m12235f(j, 0L);
    }

    public long toMillis() {
        long j = this.f32906b;
        long j2 = this.f32905a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return AbstractC0304a.m12052d(AbstractC0304a.m12055g(j2, 1000), j / 1000000);
    }

    public long toNanos() {
        long j = this.f32906b;
        long j2 = this.f32905a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return AbstractC0304a.m12052d(AbstractC0304a.m12055g(j2, 1000000000L), j);
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f32905a;
        int i = this.f32906b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            sb.append(j < 0 ? 2000000000 - ((long) i) : ((long) i) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j, long j2) {
        return m12234e(AbstractC0304a.m12052d(j, AbstractC0359Y.m12154c(j2, 1000000000L)), (int) AbstractC0359Y.m12155d(j2, 1000000000L));
    }
}
