package p021j$.time;

import java.io.Serializable;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.p024io.AbstractC0304a;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0420b;
import p021j$.time.chrono.InterfaceC0421c;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.Temporal;
import p021j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0461i implements Temporal, InterfaceC0421c, Serializable {

    /* JADX INFO: renamed from: c */
    public static final C0461i f33003c = m12347F(C0459g.f32997d, C0463k.f33009e);

    /* JADX INFO: renamed from: d */
    public static final C0461i f33004d = m12347F(C0459g.f32998e, C0463k.f33010f);

    /* JADX INFO: renamed from: a */
    private final C0459g f33005a;

    /* JADX INFO: renamed from: b */
    private final C0463k f33006b;

    private C0461i(C0459g c0459g, C0463k c0463k) {
        this.f33005a = c0459g;
        this.f33006b = c0463k;
    }

    /* JADX INFO: renamed from: E */
    public static C0461i m12346E(int i) {
        return new C0461i(C0459g.m12322I(i, 12, 31), C0463k.m12370B());
    }

    /* JADX INFO: renamed from: F */
    public static C0461i m12347F(C0459g c0459g, C0463k c0463k) {
        if (c0459g == null) {
            throw new NullPointerException("date");
        }
        if (c0463k != null) {
            return new C0461i(c0459g, c0463k);
        }
        throw new NullPointerException("time");
    }

    /* JADX INFO: renamed from: G */
    public static C0461i m12348G(long j, int i, C0468p c0468p) {
        if (c0468p == null) {
            throw new NullPointerException("offset");
        }
        long j2 = i;
        EnumC0472a.NANO_OF_SECOND.m12429l(j2);
        long jM12402z = j + ((long) c0468p.m12402z());
        long j3 = 86400;
        return new C0461i(C0459g.m12323J(AbstractC0359Y.m12154c(jM12402z, j3)), C0463k.m12371C((((long) ((int) AbstractC0359Y.m12155d(jM12402z, j3))) * 1000000000) + j2));
    }

    /* JADX INFO: renamed from: J */
    private C0461i m12349J(C0459g c0459g, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        C0463k c0463kM12371C = this.f33006b;
        if (j5 == 0) {
            return m12350Q(c0459g, c0463kM12371C);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM12381I = c0463kM12371C.m12381I();
        long j10 = (j9 * j8) + jM12381I;
        long jM12154c = AbstractC0359Y.m12154c(j10, 86400000000000L) + (j7 * j8);
        long jM12155d = AbstractC0359Y.m12155d(j10, 86400000000000L);
        if (jM12155d != jM12381I) {
            c0463kM12371C = C0463k.m12371C(jM12155d);
        }
        return m12350Q(c0459g.m12334L(jM12154c), c0463kM12371C);
    }

    /* JADX INFO: renamed from: Q */
    private C0461i m12350Q(C0459g c0459g, C0463k c0463k) {
        return (this.f33005a == c0459g && this.f33006b == c0463k) ? this : new C0461i(c0459g, c0463k);
    }

    /* JADX INFO: renamed from: q */
    private int m12351q(C0461i c0461i) {
        int iM12343r = this.f33005a.m12343r(c0461i.f33005a);
        return iM12343r == 0 ? this.f33006b.compareTo(c0461i.f33006b) : iM12343r;
    }

    /* JADX INFO: renamed from: A */
    public final int m12352A() {
        return this.f33006b.m12375A();
    }

    /* JADX INFO: renamed from: B */
    public final int m12353B() {
        return this.f33005a.m12329D();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m12354C(C0461i c0461i) {
        if (c0461i instanceof C0461i) {
            return m12351q(c0461i) > 0;
        }
        long jM12337P = this.f33005a.m12337P();
        long jM12337P2 = c0461i.f33005a.m12337P();
        if (jM12337P <= jM12337P2) {
            return jM12337P == jM12337P2 && this.f33006b.m12381I() > c0461i.f33006b.m12381I();
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m12355D(C0461i c0461i) {
        if (c0461i instanceof C0461i) {
            return m12351q(c0461i) < 0;
        }
        long jM12337P = this.f33005a.m12337P();
        long jM12337P2 = c0461i.f33005a.m12337P();
        if (jM12337P >= jM12337P2) {
            return jM12337P == jM12337P2 && this.f33006b.m12381I() < c0461i.f33006b.m12381I();
        }
        return true;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final C0461i mo12252l(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C0461i) temporalUnit.mo12420i(this, j);
        }
        int i = AbstractC0460h.f33002a[((ChronoUnit) temporalUnit).ordinal()];
        C0463k c0463k = this.f33006b;
        C0459g c0459g = this.f33005a;
        switch (i) {
            case 1:
                return m12349J(this.f33005a, 0L, 0L, 0L, j);
            case 2:
                C0461i c0461iM12350Q = m12350Q(c0459g.m12334L(j / 86400000000L), c0463k);
                return c0461iM12350Q.m12349J(c0461iM12350Q.f33005a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0461i c0461iM12350Q2 = m12350Q(c0459g.m12334L(j / 86400000), c0463k);
                return c0461iM12350Q2.m12349J(c0461iM12350Q2.f33005a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m12357I(j);
            case 5:
                return m12349J(this.f33005a, 0L, j, 0L, 0L);
            case 6:
                return m12349J(this.f33005a, j, 0L, 0L, 0L);
            case 7:
                C0461i c0461iM12350Q3 = m12350Q(c0459g.m12334L(j / 256), c0463k);
                return c0461iM12350Q3.m12349J(c0461iM12350Q3.f33005a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m12350Q(c0459g.mo12252l(j, temporalUnit), c0463k);
        }
    }

    /* JADX INFO: renamed from: I */
    public final C0461i m12357I(long j) {
        return m12349J(this.f33005a, 0L, 0L, j, 0L);
    }

    /* JADX INFO: renamed from: K */
    public final long m12358K(C0468p c0468p) {
        if (c0468p != null) {
            return ((((C0459g) m12360M()).m12337P() * 86400) + ((long) m12361N().m12382J())) - ((long) c0468p.m12402z());
        }
        throw new NullPointerException("offset");
    }

    /* JADX INFO: renamed from: L */
    public final C0459g m12359L() {
        return this.f33005a;
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC0420b m12360M() {
        return this.f33005a;
    }

    /* JADX INFO: renamed from: N */
    public final C0463k m12361N() {
        return this.f33006b;
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C0461i mo12245c(long j, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return (C0461i) interfaceC0483l.mo12426i(this, j);
        }
        boolean zMo12421a = ((EnumC0472a) interfaceC0483l).mo12421a();
        C0463k c0463k = this.f33006b;
        C0459g c0459g = this.f33005a;
        return zMo12421a ? m12350Q(c0459g, c0463k.mo12245c(j, interfaceC0483l)) : m12350Q(c0459g.mo12245c(j, interfaceC0483l), c0463k);
    }

    @Override // p021j$.time.temporal.Temporal
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final C0461i mo12249i(C0459g c0459g) {
        return m12350Q(c0459g, this.f33006b);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
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
        C0461i c0461i;
        long jM12055g;
        long j;
        long jM12055g2;
        long j2;
        if (temporal instanceof C0461i) {
            c0461i = (C0461i) temporal;
        } else if (temporal instanceof C0471s) {
            c0461i = ((C0471s) temporal).m12409B();
        } else if (temporal instanceof C0467o) {
            c0461i = ((C0467o) temporal).m12396s();
        } else {
            try {
                c0461i = new C0461i(C0459g.m12325s(temporal), C0463k.m12373r(temporal));
            } catch (C0417b e) {
                throw new C0417b("Unable to obtain LocalDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo12419h(this, c0461i);
        }
        boolean zMo12415a = temporalUnit.mo12415a();
        C0463k c0463k = this.f33006b;
        C0459g c0459g = this.f33005a;
        if (!zMo12415a) {
            C0459g c0459gM12334L = c0461i.f33005a;
            c0459gM12334L.getClass();
            boolean z = c0459g instanceof C0459g;
            boolean z2 = !z ? c0459gM12334L.m12337P() <= c0459g.m12337P() : c0459gM12334L.m12343r(c0459g) <= 0;
            C0463k c0463k2 = c0461i.f33006b;
            if (z2) {
                if (c0463k2.compareTo(c0463k) < 0) {
                    c0459gM12334L = c0459gM12334L.m12334L(-1L);
                } else {
                    if (z ? c0459gM12334L.m12337P() < c0459g.m12337P() : c0459gM12334L.m12343r(c0459g) < 0) {
                        if (c0463k2.compareTo(c0463k) > 0) {
                            c0459gM12334L = c0459gM12334L.m12334L(1L);
                        }
                    }
                }
            } else {
                if (z ? c0459gM12334L.m12337P() < c0459g.m12337P() : c0459gM12334L.m12343r(c0459g) < 0) {
                    if (c0463k2.compareTo(c0463k) > 0) {
                        c0459gM12334L = c0459gM12334L.m12334L(1L);
                    }
                }
            }
            return c0459g.mo12244a(c0459gM12334L, temporalUnit);
        }
        C0459g c0459g2 = c0461i.f33005a;
        c0459g.getClass();
        long jM12337P = c0459g2.m12337P() - c0459g.m12337P();
        C0463k c0463k3 = c0461i.f33006b;
        if (jM12337P == 0) {
            return c0463k.mo12244a(c0463k3, temporalUnit);
        }
        long jM12381I = c0463k3.m12381I() - c0463k.m12381I();
        if (jM12337P > 0) {
            jM12055g = jM12337P - 1;
            j = jM12381I + 86400000000000L;
        } else {
            jM12055g = jM12337P + 1;
            j = jM12381I - 86400000000000L;
        }
        switch (AbstractC0460h.f33002a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jM12055g = AbstractC0304a.m12055g(jM12055g, 86400000000000L);
                break;
            case 2:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 86400000000L);
                j2 = 1000;
                jM12055g = jM12055g2;
                j /= j2;
                break;
            case 3:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 86400000L);
                j2 = 1000000;
                jM12055g = jM12055g2;
                j /= j2;
                break;
            case 4:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 86400);
                j2 = 1000000000;
                jM12055g = jM12055g2;
                j /= j2;
                break;
            case 5:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 1440);
                j2 = 60000000000L;
                jM12055g = jM12055g2;
                j /= j2;
                break;
            case 6:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 24);
                j2 = 3600000000000L;
                jM12055g = jM12055g2;
                j /= j2;
                break;
            case 7:
                jM12055g2 = AbstractC0304a.m12055g(jM12055g, 2);
                j2 = 43200000000000L;
                jM12055g = jM12055g2;
                j /= j2;
                break;
        }
        return AbstractC0304a.m12052d(jM12055g, j);
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
        if (!(obj instanceof C0461i)) {
            return false;
        }
        C0461i c0461i = (C0461i) obj;
        return this.f33005a.equals(c0461i.f33005a) && this.f33006b.equals(c0461i.f33006b);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return ((EnumC0472a) interfaceC0483l).mo12421a() ? this.f33006b.mo12247f(interfaceC0483l) : this.f33005a.mo12247f(interfaceC0483l);
        }
        return AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
        }
        EnumC0472a enumC0472a = (EnumC0472a) interfaceC0483l;
        return enumC0472a.mo12422c() || enumC0472a.mo12421a();
    }

    public final int hashCode() {
        return this.f33005a.hashCode() ^ this.f33006b.hashCode();
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return interfaceC0483l.mo12427j(this);
        }
        if (!((EnumC0472a) interfaceC0483l).mo12421a()) {
            return this.f33005a.mo12250j(interfaceC0483l);
        }
        C0463k c0463k = this.f33006b;
        c0463k.getClass();
        return AbstractC0304a.m12051c(c0463k, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return ((EnumC0472a) interfaceC0483l).mo12421a() ? this.f33006b.mo12251k(interfaceC0483l) : this.f33005a.mo12251k(interfaceC0483l);
        }
        return interfaceC0483l.mo12423e(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12440b()) {
            return this.f33005a;
        }
        if (interfaceC0486o == AbstractC0485n.m12445g() || interfaceC0486o == AbstractC0485n.m12444f() || interfaceC0486o == AbstractC0485n.m12442d()) {
            return null;
        }
        if (interfaceC0486o == AbstractC0485n.m12441c()) {
            return this.f33006b;
        }
        if (interfaceC0486o != AbstractC0485n.m12439a()) {
            return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.NANOS : interfaceC0486o.mo12274a(this);
        }
        ((C0459g) m12360M()).getClass();
        return C0426h.f32915a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0421c interfaceC0421c) {
        if (interfaceC0421c instanceof C0461i) {
            return m12351q((C0461i) interfaceC0421c);
        }
        C0461i c0461i = (C0461i) interfaceC0421c;
        int iCompareTo = this.f33005a.compareTo(c0461i.f33005a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iM12385n = this.f33006b.compareTo(c0461i.f33006b);
        if (iM12385n != 0) {
            return iM12385n;
        }
        ((C0459g) m12360M()).getClass();
        C0426h c0426h = C0426h.f32915a;
        ((C0459g) c0461i.m12360M()).getClass();
        c0426h.getClass();
        c0426h.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final int m12365r() {
        return this.f33005a.m12344y();
    }

    /* JADX INFO: renamed from: s */
    public final int m12366s() {
        return this.f33006b.m12386u();
    }

    public final String toString() {
        return this.f33005a.toString() + "T" + this.f33006b.toString();
    }

    /* JADX INFO: renamed from: u */
    public final int m12367u() {
        return this.f33006b.m12387y();
    }

    /* JADX INFO: renamed from: y */
    public final int m12368y() {
        return this.f33005a.m12328B();
    }

    /* JADX INFO: renamed from: z */
    public final int m12369z() {
        return this.f33006b.m12388z();
    }
}
