package p543do;

import ae.C0062b;
import dm.C5206f;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p260m8.C7499b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: do.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5228e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5232g0 f33315a = InterfaceC5232g0.a.f33325a;

    /* JADX INFO: renamed from: b */
    public final boolean f33316b = false;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static C5238j0 m11252b(AbstractC5257t abstractC5257t, C5238j0 c5238j0) {
        C5225d c5225dMo11247a;
        if (C7499b.m14926X(abstractC5257t)) {
            return abstractC5257t.mo11241W0();
        }
        C5238j0 c5238j0Mo11241W0 = abstractC5257t.mo11241W0();
        c5238j0.getClass();
        C5207g.m11111f(c5238j0Mo11241W0, "other");
        if (c5238j0.isEmpty() && c5238j0Mo11241W0.isEmpty()) {
            return c5238j0;
        }
        ArrayList arrayList = new ArrayList();
        Collection<Integer> collectionValues = C5238j0.f33329b.f39936a.values();
        C5207g.m11110e(collectionValues, "idPerType.values");
        Iterator<Integer> it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            AbstractC5234h0 abstractC5234h0 = (AbstractC5234h0) c5238j0.f36779a.get(iIntValue);
            AbstractC5234h0 abstractC5234h1 = (AbstractC5234h0) c5238j0Mo11241W0.f36779a.get(iIntValue);
            if (abstractC5234h0 == null) {
                c5225dMo11247a = abstractC5234h1 != null ? abstractC5234h1.mo11247a(abstractC5234h0) : null;
            } else {
                c5225dMo11247a = abstractC5234h0.mo11247a(abstractC5234h1);
            }
            C0062b.m282K(c5225dMo11247a, arrayList);
        }
        return C5238j0.a.m11272c(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m11253a(InterfaceC9077e interfaceC9077e, InterfaceC9077e interfaceC9077e2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC9075c> it = interfaceC9077e.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo12515e());
        }
        while (true) {
            for (InterfaceC9075c interfaceC9075c : interfaceC9077e2) {
                if (hashSet.contains(interfaceC9075c.mo12515e())) {
                    this.f33315a.mo11266c(interfaceC9075c);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5265x m11254c(C5230f0 c5230f0, C5238j0 c5238j0, boolean z10, int i10, boolean z11) {
        Variance variance = Variance.INVARIANT;
        InterfaceC8845j0 interfaceC8845j0 = c5230f0.f33321b;
        InterfaceC5246n0 interfaceC5246n0M11255d = m11255d(new C5250p0(interfaceC8845j0.mo5314n0(), variance), c5230f0, null, i10);
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0M11255d.mo11236c();
        C5207g.m11110e(abstractC5257tMo11236c, "expandedProjection.type");
        AbstractC5265x abstractC5265xM11024u0 = C5206f.m11024u0(abstractC5257tMo11236c);
        if (C7499b.m14926X(abstractC5265xM11024u0)) {
            return abstractC5265xM11024u0;
        }
        interfaceC5246n0M11255d.mo11237d();
        m11253a(abstractC5265xM11024u0.mo11289w(), C5227e.m11251a(c5238j0));
        if (!C7499b.m14926X(abstractC5265xM11024u0)) {
            abstractC5265xM11024u0 = C5206f.m11015n1(abstractC5265xM11024u0, null, m11252b(abstractC5265xM11024u0, c5238j0), 1);
        }
        AbstractC5265x abstractC5265xM11301l = C5258t0.m11301l(abstractC5265xM11024u0, z10);
        C5207g.m11110e(abstractC5265xM11301l, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z11) {
            InterfaceC5240k0 interfaceC5240k0Mo13600k = interfaceC8845j0.mo13600k();
            C5207g.m11110e(interfaceC5240k0Mo13600k, "descriptor.typeConstructor");
            abstractC5265xM11301l = C0062b.m423z2(abstractC5265xM11301l, KotlinTypeFactory.m14189h(c5230f0.f33322c, MemberScope.C7015a.f39670b, c5238j0, interfaceC5240k0Mo13600k, z10));
        }
        return abstractC5265xM11301l;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 m11255d(InterfaceC5246n0 interfaceC5246n0, C5230f0 c5230f0, InterfaceC8847k0 interfaceC8847k0, int i10) {
        Variance varianceMo17088n;
        AbstractC5265x abstractC5265xM11301l;
        AbstractC5257t abstractC5257tM11015n1;
        Variance variance;
        Variance variance2;
        InterfaceC8845j0 interfaceC8845j0 = c5230f0.f33321b;
        if (i10 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + interfaceC8845j0.mo11874a());
        }
        if (interfaceC5246n0.mo11239f()) {
            C5207g.m11108c(interfaceC8847k0);
            return C5258t0.m11302m(interfaceC8847k0);
        }
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
        C5207g.m11110e(abstractC5257tMo11236c, "underlyingProjection.type");
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257tMo11236c.mo11250X0();
        C5207g.m11111f(interfaceC5240k0Mo11250X0, "constructor");
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0Mo11250X0.mo11235q();
        InterfaceC5246n0 interfaceC5246n1 = interfaceC8834eMo11235q instanceof InterfaceC8847k0 ? c5230f0.f33323d.get(interfaceC8834eMo11235q) : null;
        InterfaceC5232g0 interfaceC5232g0 = this.f33315a;
        if (interfaceC5246n1 != null) {
            if (interfaceC5246n1.mo11239f()) {
                C5207g.m11108c(interfaceC8847k0);
                return C5258t0.m11302m(interfaceC8847k0);
            }
            AbstractC5262v0 abstractC5262v0Mo11288a1 = interfaceC5246n1.mo11236c().mo11288a1();
            Variance varianceMo11237d = interfaceC5246n1.mo11237d();
            C5207g.m11110e(varianceMo11237d, "argument.projectionKind");
            Variance varianceMo11237d2 = interfaceC5246n0.mo11237d();
            C5207g.m11110e(varianceMo11237d2, "underlyingProjection.projectionKind");
            if (varianceMo11237d2 != varianceMo11237d && varianceMo11237d2 != (variance2 = Variance.INVARIANT)) {
                if (varianceMo11237d == variance2) {
                    varianceMo11237d = varianceMo11237d2;
                } else {
                    interfaceC5232g0.mo11264a(interfaceC8845j0, abstractC5262v0Mo11288a1);
                }
            }
            if (interfaceC8847k0 == null || (varianceMo17088n = interfaceC8847k0.mo17088n()) == null) {
                varianceMo17088n = Variance.INVARIANT;
            }
            C5207g.m11110e(varianceMo17088n, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
            if (varianceMo17088n != varianceMo11237d && varianceMo17088n != (variance = Variance.INVARIANT)) {
                if (varianceMo11237d == variance) {
                    varianceMo11237d = variance;
                } else {
                    interfaceC5232g0.mo11264a(interfaceC8845j0, abstractC5262v0Mo11288a1);
                }
            }
            m11253a(abstractC5257tMo11236c.mo11289w(), abstractC5262v0Mo11288a1.mo11289w());
            if (abstractC5262v0Mo11288a1 instanceof C5247o) {
                C5247o c5247o = (C5247o) abstractC5262v0Mo11288a1;
                C5238j0 c5238j0M11252b = m11252b(c5247o, abstractC5257tMo11236c.mo11241W0());
                C5207g.m11111f(c5238j0M11252b, "newAttributes");
                abstractC5257tM11015n1 = new C5247o(TypeUtilsKt.m14230g(c5247o.f33341c), c5238j0M11252b);
            } else {
                abstractC5265xM11301l = C5258t0.m11301l(C5206f.m11024u0(abstractC5262v0Mo11288a1), abstractC5257tMo11236c.mo11242Y0());
                C5207g.m11110e(abstractC5265xM11301l, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
                C5238j0 c5238j0Mo11241W0 = abstractC5257tMo11236c.mo11241W0();
                if (!C7499b.m14926X(abstractC5265xM11301l)) {
                    abstractC5257tM11015n1 = abstractC5265xM11301l;
                    abstractC5257tM11015n1 = C5206f.m11015n1(abstractC5265xM11301l, null, m11252b(abstractC5265xM11301l, c5238j0Mo11241W0), 1);
                }
            }
            abstractC5257tM11015n1 = abstractC5265xM11301l;
            return new C5250p0(abstractC5257tM11015n1, varianceMo11237d);
        }
        AbstractC5262v0 abstractC5262v0Mo11288a2 = interfaceC5246n0.mo11236c().mo11288a1();
        if (!C7499b.m14925W(abstractC5262v0Mo11288a2)) {
            AbstractC5265x abstractC5265xM11024u0 = C5206f.m11024u0(abstractC5262v0Mo11288a2);
            if (!C7499b.m14926X(abstractC5265xM11024u0) && TypeUtilsKt.m14239p(abstractC5265xM11024u0)) {
                InterfaceC5240k0 interfaceC5240k0Mo11250X1 = abstractC5265xM11024u0.mo11250X0();
                InterfaceC8834e interfaceC8834eMo11235q2 = interfaceC5240k0Mo11250X1.mo11235q();
                interfaceC5240k0Mo11250X1.mo11260r().size();
                abstractC5265xM11024u0.mo11240V0().size();
                if (!(interfaceC8834eMo11235q2 instanceof InterfaceC8847k0)) {
                    int i11 = 0;
                    if (interfaceC8834eMo11235q2 instanceof InterfaceC8845j0) {
                        InterfaceC8845j0 interfaceC8845j1 = (InterfaceC8845j0) interfaceC8834eMo11235q2;
                        if (c5230f0.m11262a(interfaceC8845j1)) {
                            interfaceC5232g0.mo11267d(interfaceC8845j1);
                            Variance variance3 = Variance.INVARIANT;
                            ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                            String str = interfaceC8845j1.mo11874a().f42086a;
                            C5207g.m11110e(str, "typeDescriptor.name.toString()");
                            return new C5250p0(C5602h.m11912c(errorTypeKind, str), variance3);
                        }
                        List<InterfaceC5246n0> listMo11240V0 = abstractC5265xM11024u0.mo11240V0();
                        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11240V0, 10));
                        for (Object obj : listMo11240V0) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            arrayList.add(m11255d((InterfaceC5246n0) obj, c5230f0, interfaceC5240k0Mo11250X1.mo11260r().get(i11), i10 + 1));
                            i11 = i12;
                        }
                        AbstractC5265x abstractC5265xM11254c = m11254c(C5230f0.a.m11263a(c5230f0, interfaceC8845j1, arrayList), abstractC5265xM11024u0.mo11241W0(), abstractC5265xM11024u0.mo11242Y0(), i10 + 1, false);
                        AbstractC5265x abstractC5265xM11256e = m11256e(abstractC5265xM11024u0, c5230f0, i10);
                        if (!C7499b.m14925W(abstractC5265xM11254c)) {
                            abstractC5265xM11254c = C0062b.m423z2(abstractC5265xM11254c, abstractC5265xM11256e);
                        }
                        return new C5250p0(abstractC5265xM11254c, interfaceC5246n0.mo11237d());
                    }
                    AbstractC5265x abstractC5265xM11256e2 = m11256e(abstractC5265xM11024u0, c5230f0, i10);
                    TypeSubstitutor typeSubstitutorM14198d = TypeSubstitutor.m14198d(abstractC5265xM11256e2);
                    for (Object obj2 : abstractC5265xM11256e2.mo11240V0()) {
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        InterfaceC5246n0 interfaceC5246n2 = (InterfaceC5246n0) obj2;
                        if (!interfaceC5246n2.mo11239f()) {
                            AbstractC5257t abstractC5257tMo11236c2 = interfaceC5246n2.mo11236c();
                            C5207g.m11110e(abstractC5257tMo11236c2, "substitutedArgument.type");
                            if (!TypeUtilsKt.m14227d(abstractC5257tMo11236c2)) {
                                InterfaceC5246n0 interfaceC5246n3 = abstractC5265xM11024u0.mo11240V0().get(i11);
                                InterfaceC8847k0 interfaceC8847k1 = abstractC5265xM11024u0.mo11250X0().mo11260r().get(i11);
                                if (this.f33316b) {
                                    AbstractC5257t abstractC5257tMo11236c3 = interfaceC5246n3.mo11236c();
                                    C5207g.m11110e(abstractC5257tMo11236c3, "unsubstitutedArgument.type");
                                    AbstractC5257t abstractC5257tMo11236c4 = interfaceC5246n2.mo11236c();
                                    C5207g.m11110e(abstractC5257tMo11236c4, "substitutedArgument.type");
                                    C5207g.m11110e(interfaceC8847k1, "typeParameter");
                                    interfaceC5232g0.mo11265b(typeSubstitutorM14198d, abstractC5257tMo11236c3, abstractC5257tMo11236c4, interfaceC8847k1);
                                }
                            }
                        }
                        i11 = i13;
                    }
                    return new C5250p0(abstractC5265xM11256e2, interfaceC5246n0.mo11237d());
                }
            }
        }
        return interfaceC5246n0;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC5265x m11256e(AbstractC5265x abstractC5265x, C5230f0 c5230f0, int i10) {
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
        List<InterfaceC5246n0> listMo11240V0 = abstractC5265x.mo11240V0();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11240V0, 10));
        int i11 = 0;
        for (Object obj : listMo11240V0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C9000b.m17257w();
                throw null;
            }
            InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) obj;
            InterfaceC5246n0 interfaceC5246n0M11255d = m11255d(interfaceC5246n0, c5230f0, interfaceC5240k0Mo11250X0.mo11260r().get(i11), i10 + 1);
            if (!interfaceC5246n0M11255d.mo11239f()) {
                interfaceC5246n0M11255d = new C5250p0(C5258t0.m11300k(interfaceC5246n0M11255d.mo11236c(), interfaceC5246n0.mo11236c().mo11242Y0()), interfaceC5246n0M11255d.mo11237d());
            }
            arrayList.add(interfaceC5246n0M11255d);
            i11 = i12;
        }
        return C5206f.m11015n1(abstractC5265x, arrayList, null, 2);
    }
}
