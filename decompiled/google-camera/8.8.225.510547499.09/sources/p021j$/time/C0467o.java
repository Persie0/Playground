package p021j$.time;

import java.io.Serializable;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.chrono.C0426h;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalUnit;
import p021j$.time.zone.C0493c;

/* JADX INFO: renamed from: j$.time.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0467o implements Temporal, Comparable, Serializable {

    /* JADX INFO: renamed from: a */
    private final C0461i f33020a;

    /* JADX INFO: renamed from: b */
    private final C0468p f33021b;

    static {
        C0461i c0461i = C0461i.f33003c;
        C0468p c0468p = C0468p.f33026h;
        c0461i.getClass();
        m12392n(c0461i, c0468p);
        C0461i c0461i2 = C0461i.f33004d;
        C0468p c0468p2 = C0468p.f33025g;
        c0461i2.getClass();
        m12392n(c0461i2, c0468p2);
    }

    private C0467o(C0461i c0461i, C0468p c0468p) {
        if (c0461i == null) {
            throw new NullPointerException("dateTime");
        }
        this.f33020a = c0461i;
        if (c0468p == null) {
            throw new NullPointerException("offset");
        }
        this.f33021b = c0468p;
    }

    /* JADX INFO: renamed from: n */
    public static C0467o m12392n(C0461i c0461i, C0468p c0468p) {
        return new C0467o(c0461i, c0468p);
    }

    /* JADX INFO: renamed from: q */
    public static C0467o m12393q(Instant instant, C0468p c0468p) {
        if (instant == null) {
            throw new NullPointerException("instant");
        }
        if (c0468p == null) {
            throw new NullPointerException("zone");
        }
        C0468p c0468pM12490d = C0493c.m12488j(c0468p).m12490d(instant);
        return new C0467o(C0461i.m12348G(instant.getEpochSecond(), instant.getNano(), c0468pM12490d), c0468pM12490d);
    }

    /* JADX INFO: renamed from: u */
    private C0467o m12394u(C0461i c0461i, C0468p c0468p) {
        return (this.f33020a == c0461i && this.f33021b.equals(c0468p)) ? this : new C0467o(c0461i, c0468p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.o] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final long mo12244a(Temporal temporal, TemporalUnit temporalUnit) {
        C0467o c0467o;
        if (temporal instanceof C0467o) {
            temporal = (C0467o) temporal;
        } else {
            try {
                C0468p c0468pM12401y = C0468p.m12401y(temporal);
                C0459g c0459g = (C0459g) temporal.mo12253m(AbstractC0485n.m12440b());
                C0463k c0463k = (C0463k) temporal.mo12253m(AbstractC0485n.m12441c());
                temporal = (c0459g == null || c0463k == null) ? m12393q(Instant.m12241q(temporal), c0468pM12401y) : new C0467o(C0461i.m12347F(c0459g, c0463k), c0468pM12401y);
            } catch (C0417b e) {
                throw new C0417b("Unable to obtain OffsetDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, temporal);
        }
        C0468p c0468p = temporal.f33021b;
        C0468p c0468p2 = this.f33021b;
        if (!c0468p2.equals(c0468p)) {
            c0467o = temporal;
            c0467o = new C0467o(temporal.f33020a.m12357I(c0468p2.m12402z() - c0468p.m12402z()), c0468p2);
        }
        c0467o = temporal;
        return this.f33020a.mo12244a(c0467o.f33020a, temporalUnit);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (C0467o) interfaceC0483l.mo12426i(this, j);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        int i = AbstractC0466n.f33019a[enumC0472a.ordinal()];
        C0468p c0468p = this.f33021b;
        C0461i c0461i = this.f33020a;
        if (i != 1) {
            return i != 2 ? m12394u(c0461i.mo12245c(j, interfaceC0483l), c0468p) : m12394u(c0461i, C0468p.m12399C(enumC0472a.m12428k(j)));
        }
        return m12393q(Instant.ofEpochSecond(j, c0461i.m12369z()), c0468p);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iM12388z;
        C0467o c0467o = (C0467o) obj;
        C0468p c0468p = c0467o.f33021b;
        C0468p c0468p2 = this.f33021b;
        boolean zEquals = c0468p2.equals(c0468p);
        C0461i c0461i = c0467o.f33020a;
        C0461i c0461i2 = this.f33020a;
        if (zEquals) {
            iM12388z = c0461i2.compareTo(c0461i);
        } else {
            iM12388z = (c0461i2.m12358K(c0468p2) > c0461i.m12358K(c0467o.f33021b) ? 1 : (c0461i2.m12358K(c0468p2) == c0461i.m12358K(c0467o.f33021b) ? 0 : -1));
            if (iM12388z == 0) {
                iM12388z = c0461i2.m12361N().m12388z() - c0461i.m12361N().m12388z();
            }
        }
        return iM12388z == 0 ? c0461i2.compareTo(c0461i) : iM12388z;
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
        if (!(obj instanceof C0467o)) {
            return false;
        }
        C0467o c0467o = (C0467o) obj;
        return this.f33020a.equals(c0467o.f33020a) && this.f33021b.equals(c0467o.f33021b);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return AbstractC0304a.m12049a(this, interfaceC0483l);
        }
        int i = AbstractC0466n.f33019a[((EnumC0472a) interfaceC0483l).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f33020a.mo12247f(interfaceC0483l) : this.f33021b.m12402z();
        }
        throw new C0487p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        return (interfaceC0483l instanceof EnumC0472a) || (interfaceC0483l != null && interfaceC0483l.mo12425h(this));
    }

    public final int hashCode() {
        return this.f33020a.hashCode() ^ this.f33021b.hashCode();
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i */
    public final Temporal mo12249i(C0459g c0459g) {
        return m12394u(this.f33020a.mo12249i(c0459g), this.f33021b);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return (interfaceC0483l == EnumC0472a.INSTANT_SECONDS || interfaceC0483l == EnumC0472a.OFFSET_SECONDS) ? interfaceC0483l.mo12424f() : this.f33020a.mo12250j(interfaceC0483l);
        }
        return interfaceC0483l.mo12427j(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12423e(this);
        }
        int i = AbstractC0466n.f33019a[((EnumC0472a) interfaceC0483l).ordinal()];
        C0468p c0468p = this.f33021b;
        C0461i c0461i = this.f33020a;
        if (i != 1) {
            return i != 2 ? c0461i.mo12251k(interfaceC0483l) : c0468p.m12402z();
        }
        return c0461i.m12358K(c0468p);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12442d() || interfaceC0486o == AbstractC0485n.m12444f()) {
            return this.f33021b;
        }
        if (interfaceC0486o == AbstractC0485n.m12445g()) {
            return null;
        }
        InterfaceC0486o interfaceC0486oM12440b = AbstractC0485n.m12440b();
        C0461i c0461i = this.f33020a;
        if (interfaceC0486o == interfaceC0486oM12440b) {
            return c0461i.m12359L();
        }
        if (interfaceC0486o == AbstractC0485n.m12441c()) {
            return c0461i.m12361N();
        }
        if (interfaceC0486o == AbstractC0485n.m12439a()) {
            return C0426h.f32915a;
        }
        return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.NANOS : interfaceC0486o.mo12274a(this);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C0467o mo12252l(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? m12394u(this.f33020a.mo12252l(j, temporalUnit), this.f33021b) : (C0467o) temporalUnit.mo12420i(this, j);
    }

    /* JADX INFO: renamed from: s */
    public final C0461i m12396s() {
        return this.f33020a;
    }

    public final String toString() {
        return this.f33020a.toString() + this.f33021b.toString();
    }
}
