package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p102eo.InterfaceC5438c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5250p0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9331s;
import tl.C9333u;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final C5250p0 m14224a(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        return new C5250p0(abstractC5257t);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m14225b(AbstractC5257t abstractC5257t, InterfaceC2052l<? super AbstractC5262v0, Boolean> interfaceC2052l) {
        C5207g.m11111f(abstractC5257t, "<this>");
        C5207g.m11111f(interfaceC2052l, "predicate");
        return C5258t0.m11292c(abstractC5257t, interfaceC2052l);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m14226c(AbstractC5257t abstractC5257t, InterfaceC5240k0 interfaceC5240k0, Set<? extends InterfaceC8847k0> set) {
        boolean zM14226c;
        if (C5207g.m11106a(abstractC5257t.mo11250X0(), interfaceC5240k0)) {
            return true;
        }
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        InterfaceC8836f interfaceC8836f = interfaceC8834eMo11235q instanceof InterfaceC8836f ? (InterfaceC8836f) interfaceC8834eMo11235q : null;
        List<InterfaceC8847k0> listMo13604z = interfaceC8836f != null ? interfaceC8836f.mo13604z() : null;
        Iterable iterableM13458z0 = C6752c.m13458z0(abstractC5257t.mo11240V0());
        if (!(iterableM13458z0 instanceof Collection) || !((Collection) iterableM13458z0).isEmpty()) {
            Iterator it = iterableM13458z0.iterator();
            do {
                C9333u c9333u = (C9333u) it;
                if (c9333u.hasNext()) {
                    C9331s c9331s = (C9331s) c9333u.next();
                    int i10 = c9331s.f48066a;
                    InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) c9331s.f48067b;
                    InterfaceC8847k0 interfaceC8847k0 = listMo13604z != null ? (InterfaceC8847k0) C6752c.m13426T(i10, listMo13604z) : null;
                    if (((interfaceC8847k0 == null || set == null || !set.contains(interfaceC8847k0)) ? false : true) || interfaceC5246n0.mo11239f()) {
                        zM14226c = false;
                    } else {
                        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                        C5207g.m11110e(abstractC5257tMo11236c, "argument.type");
                        zM14226c = m14226c(abstractC5257tMo11236c, interfaceC5240k0, set);
                    }
                }
            } while (!zM14226c);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m14227d(AbstractC5257t abstractC5257t) {
        return m14225b(abstractC5257t, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeAliasParameters$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                AbstractC5262v0 abstractC5262v1 = abstractC5262v0;
                C5207g.m11111f(abstractC5262v1, "it");
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v1.mo11250X0().mo11235q();
                return Boolean.valueOf(interfaceC8834eMo11235q != null && (interfaceC8834eMo11235q instanceof InterfaceC8847k0) && (((InterfaceC8847k0) interfaceC8834eMo11235q).mo11876g() instanceof InterfaceC8845j0));
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final C5250p0 m14228e(AbstractC5257t abstractC5257t, Variance variance, InterfaceC8847k0 interfaceC8847k0) {
        C5207g.m11111f(abstractC5257t, "type");
        C5207g.m11111f(variance, "projectionKind");
        if ((interfaceC8847k0 != null ? interfaceC8847k0.mo17088n() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new C5250p0(abstractC5257t, variance);
    }

    /* JADX INFO: renamed from: f */
    public static final void m14229f(AbstractC5257t abstractC5257t, AbstractC5265x abstractC5265x, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
            if (!C5207g.m11106a(abstractC5257t.mo11250X0(), abstractC5265x.mo11250X0())) {
                linkedHashSet.add(interfaceC8834eMo11235q);
                return;
            }
            for (AbstractC5257t abstractC5257t2 : ((InterfaceC8847k0) interfaceC8834eMo11235q).getUpperBounds()) {
                C5207g.m11110e(abstractC5257t2, "upperBound");
                m14229f(abstractC5257t2, abstractC5265x, linkedHashSet, set);
            }
            return;
        }
        InterfaceC8834e interfaceC8834eMo11235q2 = abstractC5257t.mo11250X0().mo11235q();
        InterfaceC8836f interfaceC8836f = interfaceC8834eMo11235q2 instanceof InterfaceC8836f ? (InterfaceC8836f) interfaceC8834eMo11235q2 : null;
        List<InterfaceC8847k0> listMo13604z = interfaceC8836f != null ? interfaceC8836f.mo13604z() : null;
        int i10 = 0;
        for (InterfaceC5246n0 interfaceC5246n0 : abstractC5257t.mo11240V0()) {
            int i11 = i10 + 1;
            InterfaceC8847k0 interfaceC8847k0 = listMo13604z != null ? (InterfaceC8847k0) C6752c.m13426T(i10, listMo13604z) : null;
            if (!((interfaceC8847k0 == null || set == null || !set.contains(interfaceC8847k0)) ? false : true) && !interfaceC5246n0.mo11239f() && !C6752c.m13415I(linkedHashSet, interfaceC5246n0.mo11236c().mo11250X0().mo11235q()) && !C5207g.m11106a(interfaceC5246n0.mo11236c().mo11250X0(), abstractC5265x.mo11250X0())) {
                AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                C5207g.m11110e(abstractC5257tMo11236c, "argument.type");
                m14229f(abstractC5257tMo11236c, abstractC5265x, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC6795c m14230g(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC6795c abstractC6795cMo11234o = abstractC5257t.mo11250X0().mo11234o();
        C5207g.m11110e(abstractC6795cMo11234o, "constructor.builtIns");
        return abstractC6795cMo11234o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5, types: [rm.c] */
    /* JADX INFO: renamed from: h */
    public static final AbstractC5257t m14231h(InterfaceC8847k0 interfaceC8847k0) {
        Object obj;
        ?? r10;
        boolean z10;
        List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
        C5207g.m11110e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<AbstractC5257t> upperBounds2 = interfaceC8847k0.getUpperBounds();
        C5207g.m11110e(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC8834e interfaceC8834eMo11235q = ((AbstractC5257t) next).mo11250X0().mo11235q();
            if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
                r10 = obj;
                r10 = (InterfaceC8830c) interfaceC8834eMo11235q;
            }
            r10 = obj;
            if (r10 != 0) {
                z10 = (r10.mo13602u() == ClassKind.INTERFACE || r10.mo13602u() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        AbstractC5257t abstractC5257t = (AbstractC5257t) obj;
        if (abstractC5257t != null) {
            return abstractC5257t;
        }
        List<AbstractC5257t> upperBounds3 = interfaceC8847k0.getUpperBounds();
        C5207g.m11110e(upperBounds3, "upperBounds");
        Object objM13423Q = C6752c.m13423Q(upperBounds3);
        C5207g.m11110e(objM13423Q, "upperBounds.first()");
        return (AbstractC5257t) objM13423Q;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m14232i(InterfaceC8847k0 interfaceC8847k0, InterfaceC5240k0 interfaceC5240k0, Set<? extends InterfaceC8847k0> set) {
        C5207g.m11111f(interfaceC8847k0, "typeParameter");
        List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
        C5207g.m11110e(upperBounds, "typeParameter.upperBounds");
        boolean z10 = false;
        if (!upperBounds.isEmpty()) {
            for (AbstractC5257t abstractC5257t : upperBounds) {
                C5207g.m11110e(abstractC5257t, "upperBound");
                if (m14226c(abstractC5257t, interfaceC8847k0.mo5316v().mo11250X0(), set) && (interfaceC5240k0 == null || C5207g.m11106a(abstractC5257t.mo11250X0(), interfaceC5240k0))) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m14233j(InterfaceC8847k0 interfaceC8847k0, InterfaceC5240k0 interfaceC5240k0, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC5240k0 = null;
        }
        return m14232i(interfaceC8847k0, interfaceC5240k0, null);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m14234k(AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2) {
        C5207g.m11111f(abstractC5257t2, "superType");
        return InterfaceC5438c.f33982a.m11667d(abstractC5257t, abstractC5257t2);
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC5262v0 m14235l(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        return C5258t0.m11299j(abstractC5257t, true);
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC5257t m14236m(AbstractC5257t abstractC5257t, InterfaceC9077e interfaceC9077e) {
        return (abstractC5257t.mo11289w().isEmpty() && interfaceC9077e.isEmpty()) ? abstractC5257t : abstractC5257t.mo11288a1().mo11243d1(C0062b.m293N1(abstractC5257t.mo11241W0(), interfaceC9077e));
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC5257t m14237n(AbstractC5257t abstractC5257t, TypeSubstitutor typeSubstitutor, LinkedHashMap linkedHashMap, Variance variance, Set set) {
        AbstractC5262v0 abstractC5262v0M11015n1;
        C5207g.m11111f(variance, "variance");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
            AbstractC5265x abstractC5265xM11015n1 = abstractC5249p.f33340b;
            if (!abstractC5265xM11015n1.mo11250X0().mo11260r().isEmpty() && abstractC5265xM11015n1.mo11250X0().mo11235q() != null) {
                List<InterfaceC8847k0> listMo11260r = abstractC5265xM11015n1.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                for (InterfaceC8847k0 interfaceC8847k0 : listMo11260r) {
                    InterfaceC5246n0 starProjectionImpl = (InterfaceC5246n0) C6752c.m13426T(interfaceC8847k0.getIndex(), abstractC5257t.mo11240V0());
                    if ((set != null && set.contains(interfaceC8847k0)) || starProjectionImpl == null || !linkedHashMap.containsKey(starProjectionImpl.mo11236c().mo11250X0())) {
                        starProjectionImpl = new StarProjectionImpl(interfaceC8847k0);
                    }
                    arrayList.add(starProjectionImpl);
                }
                abstractC5265xM11015n1 = C5206f.m11015n1(abstractC5265xM11015n1, arrayList, null, 2);
            }
            AbstractC5265x abstractC5265xM11015n2 = abstractC5249p.f33341c;
            if (!abstractC5265xM11015n2.mo11250X0().mo11260r().isEmpty() && abstractC5265xM11015n2.mo11250X0().mo11235q() != null) {
                List<InterfaceC8847k0> listMo11260r2 = abstractC5265xM11015n2.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo11260r2, 10));
                for (InterfaceC8847k0 interfaceC8847k1 : listMo11260r2) {
                    InterfaceC5246n0 starProjectionImpl2 = (InterfaceC5246n0) C6752c.m13426T(interfaceC8847k1.getIndex(), abstractC5257t.mo11240V0());
                    if ((set != null && set.contains(interfaceC8847k1)) || starProjectionImpl2 == null || !linkedHashMap.containsKey(starProjectionImpl2.mo11236c().mo11250X0())) {
                        starProjectionImpl2 = new StarProjectionImpl(interfaceC8847k1);
                    }
                    arrayList2.add(starProjectionImpl2);
                }
                abstractC5265xM11015n2 = C5206f.m11015n1(abstractC5265xM11015n2, arrayList2, null, 2);
            }
            abstractC5262v0M11015n1 = KotlinTypeFactory.m14184c(abstractC5265xM11015n1, abstractC5265xM11015n2);
        } else {
            if (!(abstractC5262v0Mo11288a1 instanceof AbstractC5265x)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5265x abstractC5265x = (AbstractC5265x) abstractC5262v0Mo11288a1;
            if (abstractC5265x.mo11250X0().mo11260r().isEmpty() || abstractC5265x.mo11250X0().mo11235q() == null) {
                abstractC5262v0M11015n1 = abstractC5265x;
            } else {
                List<InterfaceC8847k0> listMo11260r3 = abstractC5265x.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listMo11260r3, 10));
                for (InterfaceC8847k0 interfaceC8847k2 : listMo11260r3) {
                    InterfaceC5246n0 starProjectionImpl3 = (InterfaceC5246n0) C6752c.m13426T(interfaceC8847k2.getIndex(), abstractC5257t.mo11240V0());
                    if ((set != null && set.contains(interfaceC8847k2)) || starProjectionImpl3 == null || !linkedHashMap.containsKey(starProjectionImpl3.mo11236c().mo11250X0())) {
                        starProjectionImpl3 = new StarProjectionImpl(interfaceC8847k2);
                    }
                    arrayList3.add(starProjectionImpl3);
                }
                abstractC5262v0M11015n1 = C5206f.m11015n1(abstractC5265x, arrayList3, null, 2);
            }
        }
        AbstractC5257t abstractC5257tM14204i = typeSubstitutor.m14204i(C0062b.m382p1(abstractC5262v0M11015n1, abstractC5262v0Mo11288a1), variance);
        C5207g.m11110e(abstractC5257tM14204i, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return abstractC5257tM14204i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public static final AbstractC5262v0 m14238o(AbstractC5257t abstractC5257t) {
        AbstractC5265x abstractC5265x;
        AbstractC5262v0 abstractC5262v0M11015n1;
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
            AbstractC5265x abstractC5265xM11015n1 = abstractC5249p.f33340b;
            if (!abstractC5265xM11015n1.mo11250X0().mo11260r().isEmpty() && abstractC5265xM11015n1.mo11250X0().mo11235q() != null) {
                List<InterfaceC8847k0> listMo11260r = abstractC5265xM11015n1.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                Iterator<T> it = listMo11260r.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((InterfaceC8847k0) it.next()));
                }
                abstractC5265xM11015n1 = C5206f.m11015n1(abstractC5265xM11015n1, arrayList, null, 2);
            }
            AbstractC5265x abstractC5265xM11015n2 = abstractC5249p.f33341c;
            if (!abstractC5265xM11015n2.mo11250X0().mo11260r().isEmpty() && abstractC5265xM11015n2.mo11250X0().mo11235q() != null) {
                List<InterfaceC8847k0> listMo11260r2 = abstractC5265xM11015n2.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo11260r2, 10));
                Iterator<T> it2 = listMo11260r2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((InterfaceC8847k0) it2.next()));
                }
                abstractC5265xM11015n2 = C5206f.m11015n1(abstractC5265xM11015n2, arrayList2, null, 2);
            }
            abstractC5262v0M11015n1 = KotlinTypeFactory.m14184c(abstractC5265xM11015n1, abstractC5265xM11015n2);
        } else {
            if (!(abstractC5262v0Mo11288a1 instanceof AbstractC5265x)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC5265x = (AbstractC5265x) abstractC5262v0Mo11288a1;
            if (!abstractC5265x.mo11250X0().mo11260r().isEmpty() && abstractC5265x.mo11250X0().mo11235q() != null) {
                abstractC5262v0M11015n1 = abstractC5265x;
                abstractC5262v0M11015n1 = abstractC5265x;
                List<InterfaceC8847k0> listMo11260r3 = abstractC5265x.mo11250X0().mo11260r();
                C5207g.m11110e(listMo11260r3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listMo11260r3, 10));
                Iterator<T> it3 = listMo11260r3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((InterfaceC8847k0) it3.next()));
                }
                abstractC5262v0M11015n1 = C5206f.m11015n1(abstractC5265x, arrayList3, null, 2);
            }
        }
        abstractC5262v0M11015n1 = abstractC5265x;
        abstractC5262v0M11015n1 = abstractC5265x;
        abstractC5262v0M11015n1 = abstractC5265x;
        return C0062b.m382p1(abstractC5262v0M11015n1, abstractC5262v0Mo11288a1);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m14239p(AbstractC5265x abstractC5265x) {
        return m14225b(abstractC5265x, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$requiresTypeAliasExpansion$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                AbstractC5262v0 abstractC5262v1 = abstractC5262v0;
                C5207g.m11111f(abstractC5262v1, "it");
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v1.mo11250X0().mo11235q();
                return Boolean.valueOf(interfaceC8834eMo11235q != null && ((interfaceC8834eMo11235q instanceof InterfaceC8845j0) || (interfaceC8834eMo11235q instanceof InterfaceC8847k0)));
            }
        });
    }
}
