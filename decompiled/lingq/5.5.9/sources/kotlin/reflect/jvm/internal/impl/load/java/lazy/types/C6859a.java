package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ae.C0062b;
import cm.InterfaceC2041a;
import cn.C2064a;
import cn.InterfaceC2068e;
import dm.C5207g;
import fo.C5600f;
import fo.C5602h;
import gn.InterfaceC5821a0;
import gn.InterfaceC5826f;
import gn.InterfaceC5827g;
import gn.InterfaceC5829i;
import gn.InterfaceC5830j;
import gn.InterfaceC5841u;
import gn.InterfaceC5843w;
import gn.InterfaceC5844x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.C6796d;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.C7058b;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import p101en.C5434a;
import p101en.C5435b;
import p266n.C7669f;
import p338qd.C8573r0;
import p347qm.C8646c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p491xm.AbstractC10248w;
import p541zn.C10544h;
import p543do.AbstractC5248o0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import pn.C8413d;
import sm.C9078f;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6859a {

    /* JADX INFO: renamed from: a */
    public final C7669f f38832a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2068e f38833b;

    /* JADX INFO: renamed from: c */
    public final TypeParameterUpperBoundEraser f38834c;

    /* JADX INFO: renamed from: d */
    public final RawSubstitution f38835d;

    public C6859a(C7669f c7669f, InterfaceC2068e interfaceC2068e) {
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(interfaceC2068e, "typeParameterResolver");
        this.f38832a = c7669f;
        this.f38833b = interfaceC2068e;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(null);
        this.f38834c = typeParameterUpperBoundEraser;
        this.f38835d = new RawSubstitution(typeParameterUpperBoundEraser);
    }

    /* JADX INFO: renamed from: d */
    public static final C5600f m13731d(InterfaceC5830j interfaceC5830j) {
        return C5602h.m11912c(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, interfaceC5830j.mo12265s());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x023b  */
    /* JADX WARN: Code duplicated, block: B:119:0x023d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x0279 A[LOOP:1: B:125:0x0273->B:127:0x0279, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x0311  */
    /* JADX WARN: Code duplicated, block: B:148:0x0316  */
    /* JADX WARN: Code duplicated, block: B:149:0x0327  */
    /* JADX WARN: Code duplicated, block: B:150:0x032d  */
    /* JADX WARN: Code duplicated, block: B:162:0x033e A[EDGE_INSN: B:162:0x033e->B:152:0x033e BREAK  A[LOOP:2: B:130:0x02bb->B:151:0x0339], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0196  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public final AbstractC5265x m13732a(final InterfaceC5830j interfaceC5830j, final C5434a c5434a, AbstractC5265x abstractC5265x) {
        C5238j0 c5238j0M379o2;
        InterfaceC5240k0 interfaceC5240k0;
        InterfaceC5240k0 interfaceC5240k0Mo13600k;
        InterfaceC8830c interfaceC8830cM16676H0;
        boolean z10;
        Variance varianceMo17088n;
        boolean z11;
        boolean z12;
        InterfaceC5240k0 interfaceC5240k0Mo11250X0;
        boolean z13;
        List<InterfaceC8847k0> listMo11260r;
        ArrayList arrayList;
        Iterator it;
        C9333u c9333u;
        List listM13453u0;
        InterfaceC5843w interfaceC5843w;
        InterfaceC8847k0 interfaceC8847k0;
        TypeUsage typeUsage;
        C5434a c5434aM11586b;
        AbstractC5248o0 c5250p0;
        InterfaceC5821a0 interfaceC5821a0;
        AbstractC10248w abstractC10248wMo12236z;
        Variance variance;
        boolean z14;
        ?? arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        final InterfaceC8847k0 interfaceC8847k1;
        C5434a c5434aM11584b;
        AbstractC5248o0 abstractC5248o0M13724g;
        C7669f c7669f = this.f38832a;
        if (abstractC5265x == null || (c5238j0M379o2 = abstractC5265x.mo11241W0()) == null) {
            c5238j0M379o2 = C0062b.m379o2(new LazyJavaAnnotations(c7669f, interfaceC5830j, false));
        }
        C5238j0 c5238j0 = c5238j0M379o2;
        InterfaceC5829i interfaceC5829iMo12264g = interfaceC5830j.mo12264g();
        InterfaceC5240k0 interfaceC5240k1 = null;
        TypeUsage typeUsage2 = c5434a.f33974a;
        JavaTypeFlexibility javaTypeFlexibility = c5434a.f33975b;
        boolean z15 = c5434a.f33976c;
        if (interfaceC5829iMo12264g == null) {
            interfaceC5240k0Mo13600k = m13733b(interfaceC5830j);
        } else {
            if (!(interfaceC5829iMo12264g instanceof InterfaceC5827g)) {
                if (!(interfaceC5829iMo12264g instanceof InterfaceC5844x)) {
                    throw new IllegalStateException("Unknown classifier kind: " + interfaceC5829iMo12264g);
                }
                InterfaceC8847k0 interfaceC8847k0Mo6215a = this.f38833b.mo6215a((InterfaceC5844x) interfaceC5829iMo12264g);
                if (interfaceC8847k0Mo6215a != null) {
                    interfaceC5240k0Mo13600k = interfaceC8847k0Mo6215a.mo13600k();
                } else {
                    interfaceC5240k0 = null;
                }
                if (interfaceC5240k0 == null) {
                    return null;
                }
                if (javaTypeFlexibility == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
                    z12 = false;
                } else {
                    if (!z15 || typeUsage2 == TypeUsage.SUPERTYPE) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z12 = z11;
                }
                if (abstractC5265x != null) {
                    interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
                } else {
                    interfaceC5240k0Mo11250X0 = null;
                }
                if (!C5207g.m11106a(interfaceC5240k0Mo11250X0, interfaceC5240k0) && !interfaceC5830j.mo12261E() && z12) {
                    return abstractC5265x.mo11217b1(true);
                }
                if (interfaceC5830j.mo12261E()) {
                    if (interfaceC5830j.mo12263L().isEmpty()) {
                        List<InterfaceC8847k0> listMo11260r2 = interfaceC5240k0.mo11260r();
                        C5207g.m11110e(listMo11260r2, "constructor.parameters");
                        z13 = listMo11260r2.isEmpty() ^ true;
                    }
                }
                listMo11260r = interfaceC5240k0.mo11260r();
                C5207g.m11110e(listMo11260r, "constructor.parameters");
                if (z13) {
                    arrayList2 = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                    it2 = listMo11260r.iterator();
                    while (it2.hasNext()) {
                        interfaceC8847k1 = (InterfaceC8847k0) it2.next();
                        if (TypeUtilsKt.m14232i(interfaceC8847k1, interfaceC5240k1, c5434a.f33977d)) {
                            abstractC5248o0M13724g = C5435b.m11585a(interfaceC8847k1, c5434a);
                        } else {
                            final InterfaceC5240k0 interfaceC5240k2 = interfaceC5240k0;
                            C7058b c7058b = new C7058b(c7669f.m15268b(), new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final AbstractC5257t mo807E() {
                                    TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f38813b.f38834c;
                                    boolean zMo12261E = interfaceC5830j.mo12261E();
                                    InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k2.mo11235q();
                                    AbstractC5265x abstractC5265xMo5316v = interfaceC8834eMo11235q != null ? interfaceC8834eMo11235q.mo5316v() : null;
                                    C5434a c5434a2 = c5434a;
                                    c5434a2.getClass();
                                    AbstractC5257t abstractC5257tM13730a = typeParameterUpperBoundEraser.m13730a(interfaceC8847k1, zMo12261E, C5434a.m11583a(c5434a2, null, null, abstractC5265xMo5316v, 15));
                                    C5207g.m11110e(abstractC5257tM13730a, "typeParameterUpperBoundE…efaultType)\n            )");
                                    return abstractC5257tM13730a;
                                }
                            });
                            if (interfaceC5830j.mo12261E()) {
                                c5434aM11584b = c5434a;
                            } else {
                                c5434aM11584b = c5434a.m11584b(JavaTypeFlexibility.INFLEXIBLE);
                            }
                            this.f38835d.getClass();
                            abstractC5248o0M13724g = RawSubstitution.m13724g(interfaceC8847k1, c5434aM11584b, c7058b);
                        }
                        arrayList2.add(abstractC5248o0M13724g);
                        it2 = it2;
                        c7669f = c7669f;
                        interfaceC5240k1 = null;
                    }
                } else {
                    if (listMo11260r.size() != interfaceC5830j.mo12263L().size()) {
                        arrayList3 = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                        for (InterfaceC8847k0 interfaceC8847k2 : listMo11260r) {
                            ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                            String strM15235f = interfaceC8847k2.mo11874a().m15235f();
                            C5207g.m11110e(strM15235f, "p.name.asString()");
                            arrayList3.add(new C5250p0(C5602h.m11912c(errorTypeKind, strM15235f)));
                        }
                        listM13453u0 = C6752c.m13453u0(arrayList3);
                    } else {
                        C9332t c9332tM13458z0 = C6752c.m13458z0(interfaceC5830j.mo12263L());
                        arrayList = new ArrayList(C9325m.m17681z(c9332tM13458z0, 10));
                        it = c9332tM13458z0.iterator();
                        while (true) {
                            c9333u = (C9333u) it;
                            if (c9333u.hasNext()) {
                                break;
                            }
                            C9331s c9331s = (C9331s) c9333u.next();
                            interfaceC5843w = (InterfaceC5843w) c9331s.f48067b;
                            listMo11260r.size();
                            interfaceC8847k0 = listMo11260r.get(c9331s.f48066a);
                            typeUsage = TypeUsage.COMMON;
                            c5434aM11586b = C5435b.m11586b(typeUsage, false, null, 3);
                            C5207g.m11110e(interfaceC8847k0, "parameter");
                            if (interfaceC5843w instanceof InterfaceC5821a0) {
                                interfaceC5821a0 = (InterfaceC5821a0) interfaceC5843w;
                                abstractC10248wMo12236z = interfaceC5821a0.mo12236z();
                                if (interfaceC5821a0.mo12235R()) {
                                    variance = Variance.OUT_VARIANCE;
                                } else {
                                    variance = Variance.IN_VARIANCE;
                                }
                                if (abstractC10248wMo12236z == null) {
                                    c5250p0 = C5435b.m11585a(interfaceC8847k0, c5434aM11586b);
                                } else {
                                    if (interfaceC8847k0.mo17088n() == Variance.INVARIANT && variance != interfaceC8847k0.mo17088n()) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        c5250p0 = C5435b.m11585a(interfaceC8847k0, c5434aM11586b);
                                    } else {
                                        c5250p0 = TypeUtilsKt.m14228e(m13735e(abstractC10248wMo12236z, C5435b.m11586b(typeUsage, false, null, 3)), variance, interfaceC8847k0);
                                    }
                                }
                            } else {
                                c5250p0 = new C5250p0(m13735e(interfaceC5843w, c5434aM11586b), Variance.INVARIANT);
                            }
                            arrayList.add(c5250p0);
                        }
                        listM13453u0 = C6752c.m13453u0(arrayList);
                    }
                    arrayList2 = listM13453u0;
                }
                return KotlinTypeFactory.m14187f(c5238j0, interfaceC5240k0, arrayList2, z12, null);
            }
            InterfaceC5827g interfaceC5827g = (InterfaceC5827g) interfaceC5829iMo12264g;
            C7646c c7646cMo12252e = interfaceC5827g.mo12252e();
            if (c7646cMo12252e == null) {
                throw new AssertionError("Class type should have a FQ name: " + interfaceC5829iMo12264g);
            }
            if (z15 && C5207g.m11106a(c7646cMo12252e, C5435b.f33979a)) {
                C6796d c6796d = ((C2064a) c7669f.f42146a).f10510p;
                c6796d.getClass();
                InterfaceC6727j<Object> interfaceC6727j = C6796d.f38331e[0];
                c6796d.f38334c.getClass();
                C5207g.m11111f(interfaceC6727j, "property");
                C7648e c7648eM15232l = C7648e.m15232l(C0062b.m336c0(interfaceC6727j.mo13336a()));
                InterfaceC8834e interfaceC8834eMo5304g = ((MemberScope) c6796d.f38333b.getValue()).mo5304g(c7648eM15232l, NoLookupLocation.FROM_REFLECTION);
                interfaceC8830cM16676H0 = interfaceC8834eMo5304g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g : null;
                if (interfaceC8830cM16676H0 == null) {
                    interfaceC8830cM16676H0 = c6796d.f38332a.m13588a(new C7645b(C6797e.f38341g, c7648eM15232l), C9000b.m17251q(1));
                }
            } else {
                interfaceC8830cM16676H0 = C8573r0.m16676H0(C8573r0.f45963O, c7646cMo12252e, c7669f.m15267a().mo11877o());
                if (interfaceC8830cM16676H0 == null) {
                    interfaceC8830cM16676H0 = null;
                } else {
                    String str = C8646c.f46201a;
                    C7647d c7647dM16448g = C8413d.m16448g(interfaceC8830cM16676H0);
                    HashMap<C7647d, C7646c> map = C8646c.f46211k;
                    if (map.containsKey(c7647dM16448g)) {
                        if (javaTypeFlexibility == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || typeUsage2 == TypeUsage.SUPERTYPE) {
                            interfaceC8830cM16676H0 = C8573r0.m16707X(interfaceC8830cM16676H0);
                        } else {
                            InterfaceC5843w interfaceC5843w2 = (InterfaceC5843w) C6752c.m13433a0(interfaceC5830j.mo12263L());
                            InterfaceC5821a0 interfaceC5821a1 = interfaceC5843w2 instanceof InterfaceC5821a0 ? (InterfaceC5821a0) interfaceC5843w2 : null;
                            if ((interfaceC5821a1 == null || interfaceC5821a1.mo12236z() == null || interfaceC5821a1.mo12235R()) ? false : true) {
                                C7647d c7647dM16448g2 = C8413d.m16448g(interfaceC8830cM16676H0);
                                String str2 = C8646c.f46201a;
                                C7646c c7646c = map.get(c7647dM16448g2);
                                if (c7646c == null) {
                                    throw new IllegalArgumentException("Given class " + interfaceC8830cM16676H0 + " is not a read-only collection");
                                }
                                List<InterfaceC8847k0> listMo11260r3 = DescriptorUtilsKt.m14108e(interfaceC8830cM16676H0).m13553j(c7646c).mo13600k().mo11260r();
                                C5207g.m11110e(listMo11260r3, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                InterfaceC8847k0 interfaceC8847k3 = (InterfaceC8847k0) C6752c.m13433a0(listMo11260r3);
                                if (interfaceC8847k3 == null || (varianceMo17088n = interfaceC8847k3.mo17088n()) == null || varianceMo17088n == Variance.OUT_VARIANCE) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                interfaceC8830cM16676H0 = C8573r0.m16707X(interfaceC8830cM16676H0);
                            }
                        }
                    }
                }
            }
            if (interfaceC8830cM16676H0 == null) {
                interfaceC8830cM16676H0 = ((C2064a) c7669f.f42146a).f10505k.mo6214a(interfaceC5827g);
            }
            if (interfaceC8830cM16676H0 == null || (interfaceC5240k0Mo13600k = interfaceC8830cM16676H0.mo13600k()) == null) {
                interfaceC5240k0Mo13600k = m13733b(interfaceC5830j);
            }
        }
        interfaceC5240k0 = interfaceC5240k0Mo13600k;
        if (interfaceC5240k0 == null) {
            return null;
        }
        if (javaTypeFlexibility == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
            z12 = false;
        } else {
            if (z15) {
                z11 = false;
            } else {
                z11 = false;
            }
            z12 = z11;
        }
        if (abstractC5265x != null) {
            interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
        } else {
            interfaceC5240k0Mo11250X0 = null;
        }
        if (!C5207g.m11106a(interfaceC5240k0Mo11250X0, interfaceC5240k0)) {
        }
        if (interfaceC5830j.mo12261E()) {
            if (interfaceC5830j.mo12263L().isEmpty()) {
                List<InterfaceC8847k0> listMo11260r4 = interfaceC5240k0.mo11260r();
                C5207g.m11110e(listMo11260r4, "constructor.parameters");
                if (listMo11260r4.isEmpty() ^ true) {
                }
            }
        }
        listMo11260r = interfaceC5240k0.mo11260r();
        C5207g.m11110e(listMo11260r, "constructor.parameters");
        if (z13) {
            arrayList2 = new ArrayList(C9325m.m17681z(listMo11260r, 10));
            it2 = listMo11260r.iterator();
            while (it2.hasNext()) {
                interfaceC8847k1 = (InterfaceC8847k0) it2.next();
                if (TypeUtilsKt.m14232i(interfaceC8847k1, interfaceC5240k1, c5434a.f33977d)) {
                    abstractC5248o0M13724g = C5435b.m11585a(interfaceC8847k1, c5434a);
                } else {
                    final InterfaceC5240k0 interfaceC5240k3 = interfaceC5240k0;
                    C7058b c7058b2 = new C7058b(c7669f.m15268b(), new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final AbstractC5257t mo807E() {
                            TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f38813b.f38834c;
                            boolean zMo12261E = interfaceC5830j.mo12261E();
                            InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k3.mo11235q();
                            AbstractC5265x abstractC5265xMo5316v = interfaceC8834eMo11235q != null ? interfaceC8834eMo11235q.mo5316v() : null;
                            C5434a c5434a2 = c5434a;
                            c5434a2.getClass();
                            AbstractC5257t abstractC5257tM13730a = typeParameterUpperBoundEraser.m13730a(interfaceC8847k1, zMo12261E, C5434a.m11583a(c5434a2, null, null, abstractC5265xMo5316v, 15));
                            C5207g.m11110e(abstractC5257tM13730a, "typeParameterUpperBoundE…efaultType)\n            )");
                            return abstractC5257tM13730a;
                        }
                    });
                    if (interfaceC5830j.mo12261E()) {
                        c5434aM11584b = c5434a;
                    } else {
                        c5434aM11584b = c5434a.m11584b(JavaTypeFlexibility.INFLEXIBLE);
                    }
                    this.f38835d.getClass();
                    abstractC5248o0M13724g = RawSubstitution.m13724g(interfaceC8847k1, c5434aM11584b, c7058b2);
                }
                arrayList2.add(abstractC5248o0M13724g);
                it2 = it2;
                c7669f = c7669f;
                interfaceC5240k1 = null;
            }
        } else {
            if (listMo11260r.size() != interfaceC5830j.mo12263L().size()) {
                arrayList3 = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                while (r1.hasNext()) {
                    ErrorTypeKind errorTypeKind2 = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String strM15235f2 = interfaceC8847k2.mo11874a().m15235f();
                    C5207g.m11110e(strM15235f2, "p.name.asString()");
                    arrayList3.add(new C5250p0(C5602h.m11912c(errorTypeKind2, strM15235f2)));
                }
                listM13453u0 = C6752c.m13453u0(arrayList3);
            } else {
                C9332t c9332tM13458z1 = C6752c.m13458z0(interfaceC5830j.mo12263L());
                arrayList = new ArrayList(C9325m.m17681z(c9332tM13458z1, 10));
                it = c9332tM13458z1.iterator();
                while (true) {
                    c9333u = (C9333u) it;
                    if (c9333u.hasNext()) {
                        break;
                        break;
                    }
                    C9331s c9331s2 = (C9331s) c9333u.next();
                    interfaceC5843w = (InterfaceC5843w) c9331s2.f48067b;
                    listMo11260r.size();
                    interfaceC8847k0 = listMo11260r.get(c9331s2.f48066a);
                    typeUsage = TypeUsage.COMMON;
                    c5434aM11586b = C5435b.m11586b(typeUsage, false, null, 3);
                    C5207g.m11110e(interfaceC8847k0, "parameter");
                    if (interfaceC5843w instanceof InterfaceC5821a0) {
                        interfaceC5821a0 = (InterfaceC5821a0) interfaceC5843w;
                        abstractC10248wMo12236z = interfaceC5821a0.mo12236z();
                        if (interfaceC5821a0.mo12235R()) {
                            variance = Variance.OUT_VARIANCE;
                        } else {
                            variance = Variance.IN_VARIANCE;
                        }
                        if (abstractC10248wMo12236z == null) {
                            c5250p0 = C5435b.m11585a(interfaceC8847k0, c5434aM11586b);
                        } else {
                            if (interfaceC8847k0.mo17088n() == Variance.INVARIANT) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (z14) {
                                c5250p0 = C5435b.m11585a(interfaceC8847k0, c5434aM11586b);
                            } else {
                                c5250p0 = TypeUtilsKt.m14228e(m13735e(abstractC10248wMo12236z, C5435b.m11586b(typeUsage, false, null, 3)), variance, interfaceC8847k0);
                            }
                        }
                    } else {
                        c5250p0 = new C5250p0(m13735e(interfaceC5843w, c5434aM11586b), Variance.INVARIANT);
                    }
                    arrayList.add(c5250p0);
                }
                listM13453u0 = C6752c.m13453u0(arrayList);
            }
            arrayList2 = listM13453u0;
        }
        return KotlinTypeFactory.m14187f(c5238j0, interfaceC5240k0, arrayList2, z12, null);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5240k0 m13733b(InterfaceC5830j interfaceC5830j) {
        C7645b c7645bM15203l = C7645b.m15203l(new C7646c(interfaceC5830j.mo12262F()));
        C10544h c10544hM13769c = ((C2064a) this.f38832a.f42146a).f10498d.m13769c();
        InterfaceC5240k0 interfaceC5240k0Mo13600k = c10544hM13769c.f52590l.m13588a(c7645bM15203l, C9000b.m17251q(0)).mo13600k();
        C5207g.m11110e(interfaceC5240k0Mo13600k, "c.components.deserialize…istOf(0)).typeConstructor");
        return interfaceC5240k0Mo13600k;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5262v0 m13734c(InterfaceC5826f interfaceC5826f, C5434a c5434a, boolean z10) {
        C5207g.m11111f(interfaceC5826f, "arrayType");
        InterfaceC5843w interfaceC5843wMo12243S = interfaceC5826f.mo12243S();
        InterfaceC5841u interfaceC5841u = interfaceC5843wMo12243S instanceof InterfaceC5841u ? (InterfaceC5841u) interfaceC5843wMo12243S : null;
        PrimitiveType primitiveTypeMo12284c = interfaceC5841u != null ? interfaceC5841u.mo12284c() : null;
        C7669f c7669f = this.f38832a;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(c7669f, interfaceC5826f, true);
        boolean z11 = c5434a.f33976c;
        if (primitiveTypeMo12284c == null) {
            AbstractC5257t abstractC5257tM13735e = m13735e(interfaceC5843wMo12243S, C5435b.m11586b(TypeUsage.COMMON, z11, null, 2));
            if (z11) {
                return c7669f.m15267a().mo11877o().m13552i(z10 ? Variance.OUT_VARIANCE : Variance.INVARIANT, abstractC5257tM13735e, lazyJavaAnnotations);
            }
            return KotlinTypeFactory.m14184c(c7669f.m15267a().mo11877o().m13552i(Variance.INVARIANT, abstractC5257tM13735e, lazyJavaAnnotations), c7669f.m15267a().mo11877o().m13552i(Variance.OUT_VARIANCE, abstractC5257tM13735e, lazyJavaAnnotations).mo11217b1(true));
        }
        AbstractC5265x abstractC5265xM13561r = c7669f.m15267a().mo11877o().m13561r(primitiveTypeMo12284c);
        C5207g.m11110e(abstractC5265xM13561r, "c.module.builtIns.getPri…KotlinType(primitiveType)");
        ArrayList arrayListM13436d0 = C6752c.m13436d0(lazyJavaAnnotations, abstractC5265xM13561r.mo11289w());
        TypeUtilsKt.m14236m(abstractC5265xM13561r, arrayListM13436d0.isEmpty() ? InterfaceC9077e.a.f47365a : new C9078f(arrayListM13436d0));
        return z11 ? abstractC5265xM13561r : KotlinTypeFactory.m14184c(abstractC5265xM13561r, abstractC5265xM13561r.mo11217b1(true));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final AbstractC5257t m13735e(InterfaceC5843w interfaceC5843w, C5434a c5434a) {
        AbstractC5265x abstractC5265xM13732a;
        boolean z10 = interfaceC5843w instanceof InterfaceC5841u;
        C7669f c7669f = this.f38832a;
        if (z10) {
            PrimitiveType primitiveTypeMo12284c = ((InterfaceC5841u) interfaceC5843w).mo12284c();
            AbstractC5265x abstractC5265xM13562t = primitiveTypeMo12284c != null ? c7669f.m15267a().mo11877o().m13562t(primitiveTypeMo12284c) : c7669f.m15267a().mo11877o().m13565x();
            C5207g.m11110e(abstractC5265xM13562t, "{\n                val pr…ns.unitType\n            }");
            return abstractC5265xM13562t;
        }
        boolean z11 = false;
        if (!(interfaceC5843w instanceof InterfaceC5830j)) {
            if (interfaceC5843w instanceof InterfaceC5826f) {
                return m13734c((InterfaceC5826f) interfaceC5843w, c5434a, false);
            }
            if (interfaceC5843w instanceof InterfaceC5821a0) {
                AbstractC10248w abstractC10248wMo12236z = ((InterfaceC5821a0) interfaceC5843w).mo12236z();
                return abstractC10248wMo12236z != null ? m13735e(abstractC10248wMo12236z, c5434a) : c7669f.m15267a().mo11877o().m13559p();
            }
            if (interfaceC5843w == null) {
                return c7669f.m15267a().mo11877o().m13559p();
            }
            throw new UnsupportedOperationException("Unsupported type: " + interfaceC5843w);
        }
        InterfaceC5830j interfaceC5830j = (InterfaceC5830j) interfaceC5843w;
        if (!c5434a.f33976c) {
            if (c5434a.f33974a != TypeUsage.SUPERTYPE) {
                z11 = true;
            }
        }
        boolean zMo12261E = interfaceC5830j.mo12261E();
        if (!zMo12261E && !z11) {
            AbstractC5265x abstractC5265xM13732a2 = m13732a(interfaceC5830j, c5434a, null);
            return abstractC5265xM13732a2 != null ? abstractC5265xM13732a2 : m13731d(interfaceC5830j);
        }
        AbstractC5265x abstractC5265xM13732a3 = m13732a(interfaceC5830j, c5434a.m11584b(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (abstractC5265xM13732a3 != null && (abstractC5265xM13732a = m13732a(interfaceC5830j, c5434a.m11584b(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), abstractC5265xM13732a3)) != null) {
            return zMo12261E ? new RawTypeImpl(abstractC5265xM13732a3, abstractC5265xM13732a) : KotlinTypeFactory.m14184c(abstractC5265xM13732a3, abstractC5265xM13732a);
        }
        return m13731d(interfaceC5830j);
    }
}
