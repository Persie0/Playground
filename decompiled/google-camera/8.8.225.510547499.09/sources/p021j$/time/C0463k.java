package p021j$.time;

import java.io.Serializable;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0463k implements Temporal, Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final C0463k f33009e;

    /* JADX INFO: renamed from: f */
    public static final C0463k f33010f;

    /* JADX INFO: renamed from: g */
    private static final C0463k[] f33011g = new C0463k[24];

    /* JADX INFO: renamed from: a */
    private final byte f33012a;

    /* JADX INFO: renamed from: b */
    private final byte f33013b;

    /* JADX INFO: renamed from: c */
    private final byte f33014c;

    /* JADX INFO: renamed from: d */
    private final int f33015d;

    static {
        int i = 0;
        while (true) {
            C0463k[] c0463kArr = f33011g;
            if (i >= c0463kArr.length) {
                C0463k c0463k = c0463kArr[0];
                C0463k c0463k2 = c0463kArr[12];
                f33009e = c0463k;
                f33010f = new C0463k(23, 59, 59, 999999999);
                return;
            }
            c0463kArr[i] = new C0463k(i, 0, 0, 0);
            i++;
        }
    }

    private C0463k(int i, int i2, int i3, int i4) {
        this.f33012a = (byte) i;
        this.f33013b = (byte) i2;
        this.f33014c = (byte) i3;
        this.f33015d = i4;
    }

    /* JADX INFO: renamed from: B */
    public static C0463k m12370B() {
        EnumC0472a.HOUR_OF_DAY.m12429l(0);
        return f33011g[0];
    }

    /* JADX INFO: renamed from: C */
    public static C0463k m12371C(long j) {
        EnumC0472a.NANO_OF_DAY.m12429l(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m12372q(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* JADX INFO: renamed from: q */
    private static C0463k m12372q(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f33011g[i] : new C0463k(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: r */
    public static C0463k m12373r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor == null) {
            throw new NullPointerException("temporal");
        }
        C0463k c0463k = (C0463k) temporalAccessor.mo12253m(AbstractC0485n.m12441c());
        if (c0463k != null) {
            return c0463k;
        }
        throw new C0417b("Unable to obtain LocalTime from TemporalAccessor: " + String.valueOf(temporalAccessor) + " of type " + temporalAccessor.getClass().getName());
    }

    /* JADX INFO: renamed from: s */
    private int m12374s(InterfaceC0483l interfaceC0483l) {
        int i = AbstractC0462j.f33007a[((EnumC0472a) interfaceC0483l).ordinal()];
        byte b = this.f33013b;
        int i2 = this.f33015d;
        byte b2 = this.f33012a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new C0487p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new C0487p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (m12381I() / 1000000);
            case 7:
                return this.f33014c;
            case 8:
                return m12382J();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m12375A() {
        return this.f33014c;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C0463k mo12252l(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C0463k) temporalUnit.mo12420i(this, j);
        }
        switch (AbstractC0462j.f33008b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m12379G(j);
            case 2:
                return m12379G((j % 86400000000L) * 1000);
            case 3:
                return m12379G((j % 86400000) * 1000000);
            case 4:
                return m12380H(j);
            case 5:
                return m12378F(j);
            case 6:
                return m12377E(j);
            case 7:
                return m12377E((j % 2) * 12);
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* JADX INFO: renamed from: E */
    public final C0463k m12377E(long j) {
        if (j == 0) {
            return this;
        }
        return m12372q(((((int) (j % 24)) + this.f33012a) + 24) % 24, this.f33013b, this.f33014c, this.f33015d);
    }

    /* JADX INFO: renamed from: F */
    public final C0463k m12378F(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f33012a * 60) + this.f33013b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m12372q(i2 / 60, i2 % 60, this.f33014c, this.f33015d);
    }

    /* JADX INFO: renamed from: G */
    public final C0463k m12379G(long j) {
        if (j == 0) {
            return this;
        }
        long jM12381I = m12381I();
        long j2 = (((j % 86400000000000L) + jM12381I) + 86400000000000L) % 86400000000000L;
        return jM12381I == j2 ? this : m12372q((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* JADX INFO: renamed from: H */
    public final C0463k m12380H(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f33013b * 60) + (this.f33012a * 3600) + this.f33014c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m12372q(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f33015d);
    }

    /* JADX INFO: renamed from: I */
    public final long m12381I() {
        return (((long) this.f33014c) * 1000000000) + (((long) this.f33013b) * 60000000000L) + (((long) this.f33012a) * 3600000000000L) + ((long) this.f33015d);
    }

    /* JADX INFO: renamed from: J */
    public final int m12382J() {
        return (this.f33013b * 60) + (this.f33012a * 3600) + this.f33014c;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C0463k mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (C0463k) interfaceC0483l.mo12426i(this, j);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        enumC0472a.m12429l(j);
        int i = AbstractC0462j.f33007a[enumC0472a.ordinal()];
        byte b = this.f33013b;
        byte b2 = this.f33014c;
        int i2 = this.f33015d;
        byte b3 = this.f33012a;
        switch (i) {
            case 1:
                return m12384L((int) j);
            case 2:
                return m12371C(j);
            case 3:
                return m12384L(((int) j) * 1000);
            case 4:
                return m12371C(j * 1000);
            case 5:
                return m12384L(((int) j) * 1000000);
            case 6:
                return m12371C(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 == i3) {
                    return this;
                }
                EnumC0472a.SECOND_OF_MINUTE.m12429l(i3);
                return m12372q(b3, b, i3, i2);
            case 8:
                return m12380H(j - ((long) m12382J()));
            case 9:
                int i4 = (int) j;
                if (b == i4) {
                    return this;
                }
                EnumC0472a.MINUTE_OF_HOUR.m12429l(i4);
                return m12372q(b3, i4, b2, i2);
            case 10:
                return m12378F(j - ((long) ((b3 * 60) + b)));
            case 11:
                return m12377E(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m12377E(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                EnumC0472a.HOUR_OF_DAY.m12429l(i5);
                return m12372q(i5, b, b2, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                EnumC0472a.HOUR_OF_DAY.m12429l(i6);
                return m12372q(i6, b, b2, i2);
            case 15:
                return m12377E((j - ((long) (b3 / 12))) * 12);
            default:
                throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
    }

    /* JADX INFO: renamed from: L */
    public final C0463k m12384L(int i) {
        if (this.f33015d == i) {
            return this;
        }
        EnumC0472a.NANO_OF_SECOND.m12429l(i);
        return m12372q(this.f33012a, this.f33013b, this.f33014c, i);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final long mo12244a(Temporal temporal, TemporalUnit temporalUnit) {
        long j;
        C0463k c0463kM12373r = m12373r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, c0463kM12373r);
        }
        long jM12381I = c0463kM12373r.m12381I() - m12381I();
        switch (AbstractC0462j.f33008b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jM12381I;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        return jM12381I / j;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo12246e(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo12252l(Long.MAX_VALUE, chronoUnit).mo12252l(1L, chronoUnit) : mo12252l(-j, chronoUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0463k)) {
            return false;
        }
        C0463k c0463k = (C0463k) obj;
        return this.f33012a == c0463k.f33012a && this.f33013b == c0463k.f33013b && this.f33014c == c0463k.f33014c && this.f33015d == c0463k.f33015d;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l instanceof EnumC0472a ? m12374s(interfaceC0483l) : AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l.mo12421a();
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    public final int hashCode() {
        long jM12381I = m12381I();
        return (int) (jM12381I ^ (jM12381I >>> 32));
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i */
    public final Temporal mo12249i(C0459g c0459g) {
        boolean z = c0459g instanceof C0463k;
        Object objM12341n = c0459g;
        if (!z) {
            objM12341n = c0459g.m12341n(this);
        }
        return (C0463k) objM12341n;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        return AbstractC0304a.m12051c(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12423e(this);
        }
        if (interfaceC0483l == EnumC0472a.NANO_OF_DAY) {
            return m12381I();
        }
        return interfaceC0483l == EnumC0472a.MICRO_OF_DAY ? m12381I() / 1000 : m12374s(interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12439a() || interfaceC0486o == AbstractC0485n.m12445g() || interfaceC0486o == AbstractC0485n.m12444f() || interfaceC0486o == AbstractC0485n.m12442d()) {
            return null;
        }
        if (interfaceC0486o == AbstractC0485n.m12441c()) {
            return this;
        }
        if (interfaceC0486o == AbstractC0485n.m12440b()) {
            return null;
        }
        return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.NANOS : interfaceC0486o.mo12274a(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0463k c0463k) {
        int i;
        int i2;
        int i3;
        byte b = c0463k.f33012a;
        int i4 = -1;
        byte b2 = this.f33012a;
        if (b2 == b) {
            i = 0;
        } else {
            i = b2 < b ? -1 : 1;
        }
        if (i != 0) {
            return i;
        }
        byte b3 = this.f33013b;
        byte b4 = c0463k.f33013b;
        if (b3 == b4) {
            i2 = 0;
        } else {
            i2 = b3 < b4 ? -1 : 1;
        }
        if (i2 != 0) {
            return i2;
        }
        byte b5 = this.f33014c;
        byte b6 = c0463k.f33014c;
        if (b5 == b6) {
            i3 = 0;
        } else {
            i3 = b5 < b6 ? -1 : 1;
        }
        if (i3 != 0) {
            return i3;
        }
        int i5 = this.f33015d;
        int i6 = c0463k.f33015d;
        if (i5 == i6) {
            i4 = 0;
        } else if (i5 >= i6) {
            i4 = 1;
        }
        return i4;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f33012a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.f33013b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.f33014c;
        int i2 = this.f33015d;
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 >= 10 ? ":" : ":0");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final int m12386u() {
        return this.f33012a;
    }

    /* JADX INFO: renamed from: y */
    public final int m12387y() {
        return this.f33013b;
    }

    /* JADX INFO: renamed from: z */
    public final int m12388z() {
        return this.f33015d;
    }
}
