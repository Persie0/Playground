package p021j$.time;

import java.io.Serializable;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0420b;
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

/* JADX INFO: renamed from: j$.time.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0459g implements Temporal, InterfaceC0420b, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C0459g f32997d = m12322I(-999999999, 1, 1);

    /* JADX INFO: renamed from: e */
    public static final C0459g f32998e = m12322I(999999999, 12, 31);

    /* JADX INFO: renamed from: a */
    private final int f32999a;

    /* JADX INFO: renamed from: b */
    private final short f33000b;

    /* JADX INFO: renamed from: c */
    private final short f33001c;

    static {
        m12322I(1970, 1, 1);
    }

    private C0459g(int i, int i2, int i3) {
        this.f32999a = i;
        this.f33000b = (short) i2;
        this.f33001c = (short) i3;
    }

    /* JADX INFO: renamed from: C */
    private long m12320C() {
        return ((((long) this.f32999a) * 12) + ((long) this.f33000b)) - 1;
    }

    /* JADX INFO: renamed from: H */
    private long m12321H(C0459g c0459g) {
        return (((c0459g.m12320C() * 32) + ((long) c0459g.f33001c)) - ((m12320C() * 32) + ((long) this.f33001c))) / 32;
    }

    /* JADX INFO: renamed from: I */
    public static C0459g m12322I(int i, int i2, int i3) {
        long j = i;
        EnumC0472a.YEAR.m12429l(j);
        EnumC0472a.MONTH_OF_YEAR.m12429l(i2);
        EnumC0472a.DAY_OF_MONTH.m12429l(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C0426h.f32915a.getClass();
                if (C0426h.m12267a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C0417b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C0417b("Invalid date '" + EnumC0465m.m12389q(i2).name() + " " + i3 + "'");
            }
        }
        return new C0459g(i, i2, i3);
    }

    /* JADX INFO: renamed from: J */
    public static C0459g m12323J(long j) {
        long j2;
        EnumC0472a.EPOCH_DAY.m12429l(j);
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C0459g(EnumC0472a.YEAR.m12428k(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* JADX INFO: renamed from: O */
    private static C0459g m12324O(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new C0459g(i, i2, i3);
        }
        C0426h.f32915a.getClass();
        i4 = C0426h.m12267a((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new C0459g(i, i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public static C0459g m12325s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor == null) {
            throw new NullPointerException("temporal");
        }
        C0459g c0459g = (C0459g) temporalAccessor.mo12253m(AbstractC0485n.m12440b());
        if (c0459g != null) {
            return c0459g;
        }
        throw new C0417b("Unable to obtain LocalDate from TemporalAccessor: " + String.valueOf(temporalAccessor) + " of type " + temporalAccessor.getClass().getName());
    }

    /* JADX INFO: renamed from: u */
    private int m12326u(InterfaceC0483l interfaceC0483l) {
        int i;
        int i2 = AbstractC0429f.f32919a[((EnumC0472a) interfaceC0483l).ordinal()];
        int i3 = this.f32999a;
        short s = this.f33001c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return m12327A();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return m12345z().m12263n();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((m12327A() - 1) % 7) + 1;
            case 8:
                throw new C0487p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m12327A() - 1) / 7) + 1;
            case 10:
                return this.f33000b;
            case 11:
                throw new C0487p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: A */
    public final int m12327A() {
        return (EnumC0465m.m12389q(this.f33000b).m12390n(m12330E()) + this.f33001c) - 1;
    }

    /* JADX INFO: renamed from: B */
    public final int m12328B() {
        return this.f33000b;
    }

    /* JADX INFO: renamed from: D */
    public final int m12329D() {
        return this.f32999a;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m12330E() {
        C0426h c0426h = C0426h.f32915a;
        long j = this.f32999a;
        c0426h.getClass();
        return C0426h.m12267a(j);
    }

    /* JADX INFO: renamed from: F */
    public final int m12331F() {
        short s = this.f33000b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return m12330E() ? 29 : 28;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final C0459g mo12246e(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo12252l(Long.MAX_VALUE, chronoUnit).mo12252l(1L, chronoUnit) : mo12252l(-j, chronoUnit);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C0459g mo12252l(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C0459g) temporalUnit.mo12420i(this, j);
        }
        switch (AbstractC0429f.f32920b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m12334L(j);
            case 2:
                return m12334L(AbstractC0304a.m12055g(j, 7));
            case 3:
                return m12335M(j);
            case 4:
                return m12336N(j);
            case 5:
                return m12336N(AbstractC0304a.m12055g(j, 10));
            case 6:
                return m12336N(AbstractC0304a.m12055g(j, 100));
            case 7:
                return m12336N(AbstractC0304a.m12055g(j, 1000));
            case 8:
                EnumC0472a enumC0472a = EnumC0472a.ERA;
                return mo12245c(AbstractC0304a.m12052d(mo12251k(enumC0472a), j), enumC0472a);
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* JADX INFO: renamed from: L */
    public final C0459g m12334L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f33001c) + j;
        if (j2 > 0) {
            short s = this.f33000b;
            int i = this.f32999a;
            if (j2 <= 28) {
                return new C0459g(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jM12331F = m12331F();
                if (j2 <= jM12331F) {
                    return new C0459g(i, s, (int) j2);
                }
                if (s < 12) {
                    return new C0459g(i, s + 1, (int) (j2 - jM12331F));
                }
                int i2 = i + 1;
                EnumC0472a.YEAR.m12429l(i2);
                return new C0459g(i2, 1, (int) (j2 - jM12331F));
            }
        }
        return m12323J(AbstractC0304a.m12052d(m12337P(), j));
    }

    /* JADX INFO: renamed from: M */
    public final C0459g m12335M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f32999a) * 12) + ((long) (this.f33000b - 1)) + j;
        long j3 = 12;
        return m12324O(EnumC0472a.YEAR.m12428k(AbstractC0359Y.m12154c(j2, j3)), ((int) AbstractC0359Y.m12155d(j2, j3)) + 1, this.f33001c);
    }

    /* JADX INFO: renamed from: N */
    public final C0459g m12336N(long j) {
        return j == 0 ? this : m12324O(EnumC0472a.YEAR.m12428k(((long) this.f32999a) + j), this.f33000b, this.f33001c);
    }

    /* JADX INFO: renamed from: P */
    public final long m12337P() {
        long j;
        long j2 = this.f32999a;
        long j3 = this.f33000b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f33001c - 1));
        if (j3 > 2) {
            j5--;
            if (!m12330E()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C0459g mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (C0459g) interfaceC0483l.mo12426i(this, j);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        enumC0472a.m12429l(j);
        int i = AbstractC0429f.f32919a[enumC0472a.ordinal()];
        short s = this.f33000b;
        short s2 = this.f33001c;
        int i2 = this.f32999a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s2 == i3 ? this : m12322I(i2, s, i3);
            case 2:
                return m12339R((int) j);
            case 3:
                return m12334L(AbstractC0304a.m12055g(j - mo12251k(EnumC0472a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return m12340S((int) j);
            case 5:
                return m12334L(j - ((long) m12345z().m12263n()));
            case 6:
                return m12334L(j - mo12251k(EnumC0472a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m12334L(j - mo12251k(EnumC0472a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m12323J(j);
            case 9:
                return m12334L(AbstractC0304a.m12055g(j - mo12251k(EnumC0472a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s == i4) {
                    return this;
                }
                EnumC0472a.MONTH_OF_YEAR.m12429l(i4);
                return m12324O(i2, i4, s2);
            case 11:
                return m12335M(j - m12320C());
            case 12:
                return m12340S((int) j);
            case 13:
                return mo12251k(EnumC0472a.ERA) == j ? this : m12340S(1 - i2);
            default:
                throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
    }

    /* JADX INFO: renamed from: R */
    public final C0459g m12339R(int i) {
        if (m12327A() == i) {
            return this;
        }
        EnumC0472a enumC0472a = EnumC0472a.YEAR;
        int i2 = this.f32999a;
        long j = i2;
        enumC0472a.m12429l(j);
        EnumC0472a.DAY_OF_YEAR.m12429l(i);
        C0426h.f32915a.getClass();
        boolean zM12267a = C0426h.m12267a(j);
        if (i == 366 && !zM12267a) {
            throw new C0417b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        int i3 = 31;
        EnumC0465m enumC0465mM12389q = EnumC0465m.m12389q(((i - 1) / 31) + 1);
        int iM12390n = enumC0465mM12389q.m12390n(zM12267a);
        int i4 = AbstractC0464l.f33016a[enumC0465mM12389q.ordinal()];
        if (i4 == 1) {
            i3 = zM12267a ? 29 : 28;
        } else if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
            i3 = 30;
        }
        if (i > (iM12390n + i3) - 1) {
            enumC0465mM12389q = enumC0465mM12389q.m12391r();
        }
        return new C0459g(i2, enumC0465mM12389q.ordinal() + 1, (i - enumC0465mM12389q.m12390n(zM12267a)) + 1);
    }

    /* JADX INFO: renamed from: S */
    public final C0459g m12340S(int i) {
        if (this.f32999a == i) {
            return this;
        }
        EnumC0472a.YEAR.m12429l(i);
        return m12324O(i, this.f33000b, this.f33001c);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final long mo12244a(Temporal temporal, TemporalUnit temporalUnit) {
        long jM12337P;
        long j;
        C0459g c0459gM12325s = m12325s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, c0459gM12325s);
        }
        switch (AbstractC0429f.f32920b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c0459gM12325s.m12337P() - m12337P();
            case 2:
                jM12337P = c0459gM12325s.m12337P() - m12337P();
                j = 7;
                break;
            case 3:
                return m12321H(c0459gM12325s);
            case 4:
                jM12337P = m12321H(c0459gM12325s);
                j = 12;
                break;
            case 5:
                jM12337P = m12321H(c0459gM12325s);
                j = 120;
                break;
            case 6:
                jM12337P = m12321H(c0459gM12325s);
                j = 1200;
                break;
            case 7:
                jM12337P = m12321H(c0459gM12325s);
                j = 12000;
                break;
            case 8:
                EnumC0472a enumC0472a = EnumC0472a.ERA;
                return c0459gM12325s.mo12251k(enumC0472a) - mo12251k(enumC0472a);
            default:
                throw new C0487p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        return jM12337P / j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0459g) && m12343r((C0459g) obj) == 0;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l instanceof EnumC0472a ? m12326u(interfaceC0483l) : AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l.mo12422c();
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    public final int hashCode() {
        int i = this.f32999a;
        return (((i << 11) + (this.f33000b << 6)) + this.f33001c) ^ (i & (-2048));
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i */
    public final Temporal mo12249i(C0459g c0459g) {
        return c0459g;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        int iM12331F;
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12427j(this);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        if (!enumC0472a.mo12422c()) {
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        int i = AbstractC0429f.f32919a[enumC0472a.ordinal()];
        if (i == 1) {
            iM12331F = m12331F();
        } else {
            if (i != 2) {
                if (i == 3) {
                    return C0488q.m12447i(1L, (EnumC0465m.m12389q(this.f33000b) != EnumC0465m.FEBRUARY || m12330E()) ? 5L : 4L);
                }
                if (i != 4) {
                    return interfaceC0483l.mo12424f();
                }
                return C0488q.m12447i(1L, this.f32999a <= 0 ? 1000000000L : 999999999L);
            }
            iM12331F = m12330E() ? 366 : 365;
        }
        return C0488q.m12447i(1L, iM12331F);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12423e(this);
        }
        if (interfaceC0483l == EnumC0472a.EPOCH_DAY) {
            return m12337P();
        }
        return interfaceC0483l == EnumC0472a.PROLEPTIC_MONTH ? m12320C() : m12326u(interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12440b()) {
            return this;
        }
        if (interfaceC0486o == AbstractC0485n.m12445g() || interfaceC0486o == AbstractC0485n.m12444f() || interfaceC0486o == AbstractC0485n.m12442d() || interfaceC0486o == AbstractC0485n.m12441c()) {
            return null;
        }
        if (interfaceC0486o == AbstractC0485n.m12439a()) {
            return C0426h.f32915a;
        }
        return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.DAYS : interfaceC0486o.mo12274a(this);
    }

    /* JADX INFO: renamed from: n */
    public final Temporal m12341n(Temporal temporal) {
        return temporal.mo12245c(m12337P(), EnumC0472a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0420b interfaceC0420b) {
        if (interfaceC0420b instanceof C0459g) {
            return m12343r((C0459g) interfaceC0420b);
        }
        int i = (m12337P() > ((C0459g) interfaceC0420b).m12337P() ? 1 : (m12337P() == ((C0459g) interfaceC0420b).m12337P() ? 0 : -1));
        if (i != 0) {
            return i;
        }
        C0426h.f32915a.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    final int m12343r(C0459g c0459g) {
        int i = this.f32999a - c0459g.f32999a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f33000b - c0459g.f33000b;
        return i2 == 0 ? this.f33001c - c0459g.f33001c : i2;
    }

    public final String toString() {
        int i;
        int i2 = this.f32999a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        short s = this.f33000b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.f33001c;
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final int m12344y() {
        return this.f33001c;
    }

    /* JADX INFO: renamed from: z */
    public final EnumC0418c m12345z() {
        return EnumC0418c.m12262q(((int) AbstractC0359Y.m12155d(m12337P() + 3, 7)) + 1);
    }
}
