package p021j$.time;

import java.io.Serializable;
import java.util.List;
import p021j$.time.chrono.AbstractC0422d;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0424f;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalUnit;
import p021j$.time.zone.C0491a;
import p021j$.time.zone.C0493c;

/* JADX INFO: renamed from: j$.time.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C0471s implements Temporal, InterfaceC0424f, Serializable {

    /* JADX INFO: renamed from: a */
    private final C0461i f33032a;

    /* JADX INFO: renamed from: b */
    private final C0468p f33033b;

    /* JADX INFO: renamed from: c */
    private final ZoneId f33034c;

    private C0471s(C0461i c0461i, ZoneId zoneId, C0468p c0468p) {
        this.f33032a = c0461i;
        this.f33033b = c0468p;
        this.f33034c = zoneId;
    }

    /* JADX INFO: renamed from: n */
    private static C0471s m12404n(long j, int i, ZoneId zoneId) {
        C0468p c0468pM12490d = zoneId.mo12261r().m12490d(Instant.ofEpochSecond(j, i));
        return new C0471s(C0461i.m12348G(j, i, c0468pM12490d), zoneId, c0468pM12490d);
    }

    /* JADX INFO: renamed from: r */
    public static C0471s m12405r(Instant instant, ZoneId zoneId) {
        if (instant != null) {
            return m12404n(instant.getEpochSecond(), instant.getNano(), zoneId);
        }
        throw new NullPointerException("instant");
    }

    /* JADX INFO: renamed from: s */
    public static C0471s m12406s(C0461i c0461i, ZoneId zoneId, C0468p c0468p) {
        if (c0461i == null) {
            throw new NullPointerException("localDateTime");
        }
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        if (zoneId instanceof C0468p) {
            return new C0471s(c0461i, zoneId, (C0468p) zoneId);
        }
        C0493c c0493cMo12261r = zoneId.mo12261r();
        List listM12492g = c0493cMo12261r.m12492g(c0461i);
        if (listM12492g.size() == 1) {
            c0468p = (C0468p) listM12492g.get(0);
        } else if (listM12492g.size() == 0) {
            C0491a c0491aM12491f = c0493cMo12261r.m12491f(c0461i);
            c0461i = c0461i.m12357I(c0491aM12491f.m12478e().getSeconds());
            c0468p = c0491aM12491f.m12479f();
        } else if ((c0468p == null || !listM12492g.contains(c0468p)) && (c0468p = (C0468p) listM12492g.get(0)) == null) {
            throw new NullPointerException("offset");
        }
        return new C0471s(c0461i, zoneId, c0468p);
    }

    /* JADX INFO: renamed from: y */
    private C0471s m12407y(C0468p c0468p) {
        if (!c0468p.equals(this.f33033b)) {
            ZoneId zoneId = this.f33034c;
            C0493c c0493cMo12261r = zoneId.mo12261r();
            C0461i c0461i = this.f33032a;
            if (c0493cMo12261r.m12492g(c0461i).contains(c0468p)) {
                return new C0471s(c0461i, zoneId, c0468p);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: A */
    public final C0459g m12408A() {
        return this.f33032a.m12359L();
    }

    /* JADX INFO: renamed from: B */
    public final C0461i m12409B() {
        return this.f33032a;
    }

    /* JADX INFO: renamed from: C */
    public final C0461i m12410C() {
        return this.f33032a;
    }

    /* JADX INFO: renamed from: D */
    public final C0463k m12411D() {
        return this.f33032a.m12361N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [j$.time.s] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final long mo12244a(Temporal temporal, TemporalUnit temporalUnit) {
        C0471s c0471sM12404n;
        if (temporal instanceof C0471s) {
            temporal = (C0471s) temporal;
        } else {
            try {
                ZoneId zoneIdM12257n = ZoneId.m12257n(temporal);
                EnumC0472a enumC0472a = EnumC0472a.INSTANT_SECONDS;
                temporal = temporal.mo12248h(enumC0472a) ? m12404n(temporal.mo12251k(enumC0472a), temporal.mo12247f(EnumC0472a.NANO_OF_SECOND), zoneIdM12257n) : m12406s(C0461i.m12347F(C0459g.m12325s(temporal), C0463k.m12373r(temporal)), zoneIdM12257n, null);
            } catch (C0417b e) {
                throw new C0417b("Unable to obtain ZonedDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, temporal);
        }
        ZoneId zoneId = this.f33034c;
        if (zoneId == null) {
            temporal.getClass();
            throw new NullPointerException("zone");
        }
        if (!temporal.f33034c.equals(zoneId)) {
            c0471sM12404n = temporal;
            C0468p c0468p = temporal.f33033b;
            C0461i c0461i = temporal.f33032a;
            c0471sM12404n = m12404n(c0461i.m12358K(c0468p), c0461i.m12369z(), zoneId);
        }
        c0471sM12404n = temporal;
        boolean zMo12416c = temporalUnit.mo12416c();
        C0461i c0461i2 = this.f33032a;
        C0461i c0461i3 = c0471sM12404n.f33032a;
        return zMo12416c ? c0461i2.mo12244a(c0461i3, temporalUnit) : C0467o.m12392n(c0461i2, this.f33033b).mo12244a(C0467o.m12392n(c0461i3, c0471sM12404n.f33033b), temporalUnit);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (C0471s) interfaceC0483l.mo12426i(this, j);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        int i = AbstractC0470r.f33031a[enumC0472a.ordinal()];
        ZoneId zoneId = this.f33034c;
        C0461i c0461i = this.f33032a;
        if (i != 1) {
            return i != 2 ? m12406s(c0461i.mo12245c(j, interfaceC0483l), zoneId, this.f33033b) : m12407y(C0468p.m12399C(enumC0472a.m12428k(j)));
        }
        return m12404n(j, c0461i.m12369z(), zoneId);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0471s c0471s = (C0471s) ((InterfaceC0424f) obj);
        int i = (m12414z() > c0471s.m12414z() ? 1 : (m12414z() == c0471s.m12414z() ? 0 : -1));
        if (i != 0) {
            return i;
        }
        int iM12388z = m12411D().m12388z() - c0471s.m12411D().m12388z();
        if (iM12388z != 0) {
            return iM12388z;
        }
        int iCompareTo = this.f33032a.compareTo(c0471s.f33032a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f33034c.mo12260q().compareTo(c0471s.f33034c.mo12260q());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        m12408A().getClass();
        C0426h c0426h = C0426h.f32915a;
        c0471s.m12408A().getClass();
        c0426h.getClass();
        c0426h.getClass();
        return 0;
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
        if (!(obj instanceof C0471s)) {
            return false;
        }
        C0471s c0471s = (C0471s) obj;
        return this.f33032a.equals(c0471s.f33032a) && this.f33033b.equals(c0471s.f33033b) && this.f33034c.equals(c0471s.f33034c);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return AbstractC0422d.m12265a(this, interfaceC0483l);
        }
        int i = AbstractC0470r.f33031a[((EnumC0472a) interfaceC0483l).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f33032a.mo12247f(interfaceC0483l) : this.f33033b.m12402z();
        }
        throw new C0487p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        return (interfaceC0483l instanceof EnumC0472a) || (interfaceC0483l != null && interfaceC0483l.mo12425h(this));
    }

    public final int hashCode() {
        return (this.f33032a.hashCode() ^ this.f33033b.hashCode()) ^ Integer.rotateLeft(this.f33034c.hashCode(), 3);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i */
    public final Temporal mo12249i(C0459g c0459g) {
        return m12406s(C0461i.m12347F(c0459g, this.f33032a.m12361N()), this.f33034c, this.f33033b);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return (interfaceC0483l == EnumC0472a.INSTANT_SECONDS || interfaceC0483l == EnumC0472a.OFFSET_SECONDS) ? interfaceC0483l.mo12424f() : this.f33032a.mo12250j(interfaceC0483l);
        }
        return interfaceC0483l.mo12427j(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12423e(this);
        }
        int i = AbstractC0470r.f33031a[((EnumC0472a) interfaceC0483l).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f33032a.mo12251k(interfaceC0483l) : this.f33033b.m12402z();
        }
        return m12414z();
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12440b()) {
            return m12408A();
        }
        if (interfaceC0486o == AbstractC0485n.m12444f() || interfaceC0486o == AbstractC0485n.m12445g()) {
            return this.f33034c;
        }
        if (interfaceC0486o == AbstractC0485n.m12442d()) {
            return this.f33033b;
        }
        if (interfaceC0486o == AbstractC0485n.m12441c()) {
            return m12411D();
        }
        if (interfaceC0486o != AbstractC0485n.m12439a()) {
            return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.NANOS : interfaceC0486o.mo12274a(this);
        }
        m12408A().getClass();
        return C0426h.f32915a;
    }

    /* JADX INFO: renamed from: q */
    public final C0468p m12412q() {
        return this.f33033b;
    }

    public final String toString() {
        String string = this.f33032a.toString();
        C0468p c0468p = this.f33033b;
        String str = string + c0468p.toString();
        ZoneId zoneId = this.f33034c;
        if (c0468p == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C0471s mo12252l(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C0471s) temporalUnit.mo12420i(this, j);
        }
        boolean zMo12416c = temporalUnit.mo12416c();
        C0461i c0461iMo12252l = this.f33032a.mo12252l(j, temporalUnit);
        C0468p c0468p = this.f33033b;
        ZoneId zoneId = this.f33034c;
        if (zMo12416c) {
            return m12406s(c0461iMo12252l, zoneId, c0468p);
        }
        if (c0461iMo12252l == null) {
            throw new NullPointerException("localDateTime");
        }
        if (c0468p == null) {
            throw new NullPointerException("offset");
        }
        if (zoneId != null) {
            return zoneId.mo12261r().m12492g(c0461iMo12252l).contains(c0468p) ? new C0471s(c0461iMo12252l, zoneId, c0468p) : m12404n(c0461iMo12252l.m12358K(c0468p), c0461iMo12252l.m12369z(), zoneId);
        }
        throw new NullPointerException("zone");
    }

    /* JADX INFO: renamed from: z */
    public final long m12414z() {
        return ((m12408A().m12337P() * 86400) + ((long) m12411D().m12382J())) - ((long) m12412q().m12402z());
    }
}
