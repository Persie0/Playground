package p021j$.nio.file.attribute;

import java.util.concurrent.TimeUnit;
import p021j$.time.C0461i;
import p021j$.time.C0468p;
import p021j$.time.Instant;

/* JADX INFO: renamed from: j$.nio.file.attribute.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0340E implements Comparable {

    /* JADX INFO: renamed from: a */
    private final TimeUnit f32837a;

    /* JADX INFO: renamed from: b */
    private final long f32838b;

    /* JADX INFO: renamed from: c */
    private Instant f32839c = null;

    /* JADX INFO: renamed from: d */
    private String f32840d;

    private C0340E(long j, TimeUnit timeUnit) {
        this.f32838b = j;
        this.f32837a = timeUnit;
    }

    /* JADX INFO: renamed from: a */
    private static void m12119a(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0340E m12120e(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return new C0340E(j, timeUnit);
        }
        throw new NullPointerException("unit");
    }

    /* JADX INFO: renamed from: f */
    public static C0340E m12121f(long j) {
        return new C0340E(j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: h */
    private static long m12122h(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    /* JADX INFO: renamed from: j */
    private long m12123j(long j) {
        long epochSecond;
        long seconds;
        TimeUnit timeUnit = this.f32837a;
        if (timeUnit != null) {
            seconds = timeUnit.convert(j, TimeUnit.DAYS);
            epochSecond = this.f32838b;
        } else {
            timeUnit = TimeUnit.SECONDS;
            epochSecond = m12126k().getEpochSecond();
            seconds = TimeUnit.DAYS.toSeconds(j);
        }
        return timeUnit.toNanos(epochSecond - seconds);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0340E c0340e) {
        long epochSecond;
        long jM12123j;
        long jM12123j2 = this.f32838b;
        TimeUnit timeUnit = this.f32837a;
        if (timeUnit == null || timeUnit != c0340e.f32837a) {
            long epochSecond2 = m12126k().getEpochSecond();
            int i = (epochSecond2 > c0340e.m12126k().getEpochSecond() ? 1 : (epochSecond2 == c0340e.m12126k().getEpochSecond() ? 0 : -1));
            if (i != 0) {
                return i;
            }
            int i2 = (m12126k().getNano() > c0340e.m12126k().getNano() ? 1 : (m12126k().getNano() == c0340e.m12126k().getNano() ? 0 : -1));
            if (i2 != 0) {
                return i2;
            }
            if (epochSecond2 != 31556889864403199L && epochSecond2 != -31557014167219200L) {
                return 0;
            }
            if (timeUnit == null) {
                timeUnit = TimeUnit.SECONDS;
                jM12123j2 = m12126k().getEpochSecond();
            }
            long days = timeUnit.toDays(jM12123j2);
            TimeUnit timeUnit2 = c0340e.f32837a;
            if (timeUnit2 != null) {
                epochSecond = c0340e.f32838b;
            } else {
                timeUnit2 = TimeUnit.SECONDS;
                epochSecond = c0340e.m12126k().getEpochSecond();
            }
            long days2 = timeUnit2.toDays(epochSecond);
            if (days != days2) {
                return (days > days2 ? 1 : (days == days2 ? 0 : -1));
            }
            jM12123j2 = m12123j(days);
            jM12123j = c0340e.m12123j(days2);
        } else {
            jM12123j = c0340e.f32838b;
        }
        return (jM12123j2 > jM12123j ? 1 : (jM12123j2 == jM12123j ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0340E) && compareTo((C0340E) obj) == 0;
    }

    public final int hashCode() {
        return m12126k().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final long m12125i(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        TimeUnit timeUnit2 = this.f32837a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.f32838b, timeUnit2);
        }
        long jConvert = timeUnit.convert(this.f32839c.getEpochSecond(), TimeUnit.SECONDS);
        if (jConvert == Long.MIN_VALUE || jConvert == Long.MAX_VALUE) {
            return jConvert;
        }
        long jConvert2 = timeUnit.convert(this.f32839c.getNano(), TimeUnit.NANOSECONDS);
        long j = jConvert + jConvert2;
        if (((jConvert2 ^ j) & (jConvert ^ j)) < 0) {
            return jConvert < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX INFO: renamed from: k */
    public final Instant m12126k() {
        Instant instantOfEpochSecond;
        long j;
        long j2;
        long j3;
        long jM12154c;
        if (this.f32839c == null) {
            int i = AbstractC0339D.f32836a[this.f32837a.ordinal()];
            long jM12122h = this.f32838b;
            int iM12155d = 0;
            switch (i) {
                case 1:
                    j = this.f32838b;
                    j2 = 86400;
                    j3 = 106751991167300L;
                    jM12122h = m12122h(j, j2, j3);
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                case 2:
                    j = this.f32838b;
                    j2 = 3600;
                    j3 = 2562047788015215L;
                    jM12122h = m12122h(j, j2, j3);
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                case 3:
                    jM12122h = m12122h(this.f32838b, 60L, 153722867280912930L);
                case 4:
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                case 5:
                    jM12154c = AbstractC0359Y.m12154c(jM12122h, 1000L);
                    iM12155d = ((int) AbstractC0359Y.m12155d(jM12122h, 1000L)) * 1000000;
                    jM12122h = jM12154c;
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                case 6:
                    jM12154c = AbstractC0359Y.m12154c(jM12122h, 1000000L);
                    iM12155d = ((int) AbstractC0359Y.m12155d(jM12122h, 1000000L)) * 1000;
                    jM12122h = jM12154c;
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                case 7:
                    jM12154c = AbstractC0359Y.m12154c(jM12122h, 1000000000L);
                    iM12155d = (int) AbstractC0359Y.m12155d(jM12122h, 1000000000L);
                    jM12122h = jM12154c;
                    if (jM12122h <= -31557014167219200L) {
                        instantOfEpochSecond = Instant.MIN;
                    } else if (jM12122h >= 31556889864403199L) {
                        instantOfEpochSecond = Instant.MAX;
                    } else {
                        instantOfEpochSecond = Instant.ofEpochSecond(jM12122h, iM12155d);
                    }
                    this.f32839c = instantOfEpochSecond;
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.f32839c;
    }

    /* JADX INFO: renamed from: l */
    public final long m12127l() {
        TimeUnit timeUnit = this.f32837a;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.f32838b);
        }
        long epochSecond = this.f32839c.getEpochSecond();
        int nano = this.f32839c.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / 1000000));
        }
        return epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final String toString() {
        long epochSecond;
        int nano;
        long jM12154c;
        long jM12155d;
        if (this.f32840d == null) {
            if (this.f32839c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                TimeUnit timeUnit2 = this.f32837a;
                if (timeUnit2.compareTo(timeUnit) >= 0) {
                    epochSecond = timeUnit2.toSeconds(this.f32838b);
                    nano = 0;
                } else {
                    epochSecond = m12126k().getEpochSecond();
                    nano = m12126k().getNano();
                }
            } else {
                epochSecond = m12126k().getEpochSecond();
                nano = m12126k().getNano();
            }
            if (epochSecond >= -62167219200L) {
                long j = (epochSecond - 315569520000L) + 62167219200L;
                jM12154c = AbstractC0359Y.m12154c(j, 315569520000L) + 1;
                jM12155d = AbstractC0359Y.m12155d(j, 315569520000L);
            } else {
                long j2 = epochSecond + 62167219200L;
                jM12154c = j2 / 315569520000L;
                jM12155d = j2 % 315569520000L;
            }
            C0461i c0461iM12348G = C0461i.m12348G(jM12155d - 62167219200L, nano, C0468p.f33024f);
            int iM12353B = (((int) jM12154c) * 10000) + c0461iM12348G.m12353B();
            if (iM12353B <= 0) {
                iM12353B--;
            }
            int iM12369z = c0461iM12348G.m12369z();
            StringBuilder sb = new StringBuilder(64);
            sb.append(iM12353B < 0 ? "-" : "");
            int iAbs = Math.abs(iM12353B);
            if (iAbs < 10000) {
                m12119a(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            m12119a(sb, 10, c0461iM12348G.m12368y());
            sb.append('-');
            m12119a(sb, 10, c0461iM12348G.m12365r());
            sb.append('T');
            m12119a(sb, 10, c0461iM12348G.m12366s());
            sb.append(':');
            m12119a(sb, 10, c0461iM12348G.m12367u());
            sb.append(':');
            m12119a(sb, 10, c0461iM12348G.m12352A());
            if (iM12369z != 0) {
                sb.append('.');
                int i = 100000000;
                while (iM12369z % 10 == 0) {
                    iM12369z /= 10;
                    i /= 10;
                }
                m12119a(sb, i, iM12369z);
            }
            sb.append('Z');
            this.f32840d = sb.toString();
        }
        return this.f32840d;
    }
}
