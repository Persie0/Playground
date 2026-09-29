package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p102eo.InterfaceC5438c;
import p162ho.C6091a;
import p162ho.C6092b;
import p162ho.C6093c;
import p348qn.InterfaceC8652b;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5250p0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeApproximationKt {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$a */
    public /* synthetic */ class C7063a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39918a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f39918a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0273  */
    /* JADX WARN: Code duplicated, block: B:70:0x0281  */
    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: a */
    public static final C6091a<AbstractC5257t> m14240a(AbstractC5257t abstractC5257t) {
        C6093c c6093c;
        Object objM14242c;
        Variance varianceM14196b;
        C6093c c6093c2;
        C5207g.m11111f(abstractC5257t, "type");
        if (C0062b.m410w1(abstractC5257t)) {
            C6091a<AbstractC5257t> c6091aM14240a = m14240a(C0062b.m262E1(abstractC5257t));
            C6091a<AbstractC5257t> c6091aM14240a2 = m14240a(C0062b.m415x2(abstractC5257t));
            return new C6091a<>(C0062b.m382p1(KotlinTypeFactory.m14184c(C0062b.m262E1(c6091aM14240a.f35844a), C0062b.m415x2(c6091aM14240a2.f35844a)), abstractC5257t), C0062b.m382p1(KotlinTypeFactory.m14184c(C0062b.m262E1(c6091aM14240a.f35845b), C0062b.m415x2(c6091aM14240a2.f35845b)), abstractC5257t));
        }
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
        if (abstractC5257t.mo11250X0() instanceof InterfaceC8652b) {
            C5207g.m11109d(interfaceC5240k0Mo11250X0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC5246n0 interfaceC5246n0Mo14219b = ((InterfaceC8652b) interfaceC5240k0Mo11250X0).mo14219b();
            AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0Mo14219b.mo11236c();
            C5207g.m11110e(abstractC5257tMo11236c, "typeProjection.type");
            AbstractC5257t abstractC5257tM11300k = C5258t0.m11300k(abstractC5257tMo11236c, abstractC5257t.mo11242Y0());
            int i10 = C7063a.f39918a[interfaceC5246n0Mo14219b.mo11237d().ordinal()];
            if (i10 == 2) {
                return new C6091a<>(abstractC5257tM11300k, TypeUtilsKt.m14230g(abstractC5257t).m13559p());
            }
            if (i10 == 3) {
                AbstractC5265x abstractC5265xM13558o = TypeUtilsKt.m14230g(abstractC5257t).m13558o();
                C5207g.m11110e(abstractC5265xM13558o, "type.builtIns.nothingType");
                return new C6091a<>(C5258t0.m11300k(abstractC5265xM13558o, abstractC5257t.mo11242Y0()), abstractC5257tM11300k);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + interfaceC5246n0Mo14219b);
        }
        if (!abstractC5257t.mo11240V0().isEmpty() && abstractC5257t.mo11240V0().size() == interfaceC5240k0Mo11250X0.mo11260r().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<InterfaceC5246n0> listMo11240V0 = abstractC5257t.mo11240V0();
            List<InterfaceC8847k0> listMo11260r = interfaceC5240k0Mo11250X0.mo11260r();
            C5207g.m11110e(listMo11260r, "typeConstructor.parameters");
            Iterator it = C6752c.m13412A0(listMo11240V0, listMo11260r).iterator();
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (it2.hasNext()) {
                                c6093c = (C6093c) it2.next();
                                c6093c.getClass();
                            }
                        } while (!(!InterfaceC5438c.f33982a.m11667d(c6093c.f35847b, c6093c.f35848c)));
                        if (z10) {
                            objM14242c = TypeUtilsKt.m14230g(abstractC5257t).m13558o();
                            C5207g.m11110e(objM14242c, "type.builtIns.nothingType");
                        } else {
                            objM14242c = m14242c(arrayList, abstractC5257t);
                        }
                        return new C6091a<>(objM14242c, m14242c(arrayList2, abstractC5257t));
                    }
                    z10 = false;
                    if (z10) {
                        objM14242c = TypeUtilsKt.m14230g(abstractC5257t).m13558o();
                        C5207g.m11110e(objM14242c, "type.builtIns.nothingType");
                    } else {
                        objM14242c = m14242c(arrayList, abstractC5257t);
                    }
                    return new C6091a<>(objM14242c, m14242c(arrayList2, abstractC5257t));
                }
                Pair pair = (Pair) it.next();
                InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) pair.f38012a;
                InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) pair.f38013b;
                C5207g.m11110e(interfaceC8847k0, "typeParameter");
                Variance varianceMo17088n = interfaceC8847k0.mo17088n();
                if (varianceMo17088n == null) {
                    TypeSubstitutor.m14195a(35);
                    throw null;
                }
                if (interfaceC5246n0 == null) {
                    TypeSubstitutor.m14195a(36);
                    throw null;
                }
                TypeSubstitutor typeSubstitutor = TypeSubstitutor.f39894b;
                if (interfaceC5246n0.mo11239f()) {
                    varianceM14196b = Variance.OUT_VARIANCE;
                    if (varianceM14196b == null) {
                        TypeSubstitutor.m14195a(37);
                        throw null;
                    }
                } else {
                    varianceM14196b = TypeSubstitutor.m14196b(varianceMo17088n, interfaceC5246n0.mo11237d());
                }
                int i11 = C7063a.f39918a[varianceM14196b.ordinal()];
                if (i11 == 1) {
                    AbstractC5257t abstractC5257tMo11236c2 = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c2, "type");
                    AbstractC5257t abstractC5257tMo11236c3 = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c3, "type");
                    c6093c2 = new C6093c(interfaceC8847k0, abstractC5257tMo11236c2, abstractC5257tMo11236c3);
                } else if (i11 == 2) {
                    AbstractC5257t abstractC5257tMo11236c4 = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c4, "type");
                    c6093c2 = new C6093c(interfaceC8847k0, abstractC5257tMo11236c4, DescriptorUtilsKt.m14108e(interfaceC8847k0).m13559p());
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC5265x abstractC5265xM13558o2 = DescriptorUtilsKt.m14108e(interfaceC8847k0).m13558o();
                    C5207g.m11110e(abstractC5265xM13558o2, "typeParameter.builtIns.nothingType");
                    AbstractC5257t abstractC5257tMo11236c5 = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c5, "type");
                    c6093c2 = new C6093c(interfaceC8847k0, abstractC5265xM13558o2, abstractC5257tMo11236c5);
                }
                if (interfaceC5246n0.mo11239f()) {
                    arrayList.add(c6093c2);
                    arrayList2.add(c6093c2);
                } else {
                    C6091a<AbstractC5257t> c6091aM14240a3 = m14240a(c6093c2.f35847b);
                    AbstractC5257t abstractC5257t2 = c6091aM14240a3.f35844a;
                    AbstractC5257t abstractC5257t3 = c6091aM14240a3.f35845b;
                    C6091a<AbstractC5257t> c6091aM14240a4 = m14240a(c6093c2.f35848c);
                    AbstractC5257t abstractC5257t4 = c6091aM14240a4.f35844a;
                    AbstractC5257t abstractC5257t5 = c6091aM14240a4.f35845b;
                    InterfaceC8847k0 interfaceC8847k1 = c6093c2.f35846a;
                    C6093c c6093c3 = new C6093c(interfaceC8847k1, abstractC5257t3, abstractC5257t4);
                    C6093c c6093c4 = new C6093c(interfaceC8847k1, abstractC5257t2, abstractC5257t5);
                    arrayList.add(c6093c3);
                    arrayList2.add(c6093c4);
                }
            }
        }
        return new C6091a<>(abstractC5257t, abstractC5257t);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5246n0 m14241b(InterfaceC5246n0 interfaceC5246n0, boolean z10) {
        if (interfaceC5246n0 == null) {
            return null;
        }
        if (interfaceC5246n0.mo11239f()) {
            return interfaceC5246n0;
        }
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
        C5207g.m11110e(abstractC5257tMo11236c, "typeProjection.type");
        if (!C5258t0.m11292c(abstractC5257tMo11236c, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                AbstractC5262v0 abstractC5262v1 = abstractC5262v0;
                C5207g.m11110e(abstractC5262v1, "it");
                return Boolean.valueOf(abstractC5262v1.mo11250X0() instanceof InterfaceC8652b);
            }
        })) {
            return interfaceC5246n0;
        }
        Variance varianceMo11237d = interfaceC5246n0.mo11237d();
        C5207g.m11110e(varianceMo11237d, "typeProjection.projectionKind");
        if (varianceMo11237d == Variance.OUT_VARIANCE) {
            return new C5250p0(m14240a(abstractC5257tMo11236c).f35845b, varianceMo11237d);
        }
        if (z10) {
            return new C5250p0(m14240a(abstractC5257tMo11236c).f35844a, varianceMo11237d);
        }
        TypeSubstitutor typeSubstitutorM14199e = TypeSubstitutor.m14199e(new C6092b());
        if (typeSubstitutorM14199e.m14203h()) {
            return interfaceC5246n0;
        }
        try {
            return typeSubstitutorM14199e.m14206l(interfaceC5246n0, null, 0);
        } catch (TypeSubstitutor.SubstitutionException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC5257t m14242c(ArrayList arrayList, AbstractC5257t abstractC5257t) {
        C5250p0 c5250p0;
        abstractC5257t.mo11240V0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6093c c6093c = (C6093c) it.next();
            c6093c.getClass();
            InterfaceC5438c.f33982a.m11667d(c6093c.f35847b, c6093c.f35848c);
            AbstractC5257t abstractC5257t2 = c6093c.f35847b;
            AbstractC5257t abstractC5257t3 = c6093c.f35848c;
            if (C5207g.m11106a(abstractC5257t2, abstractC5257t3)) {
                c5250p0 = new C5250p0(abstractC5257t2);
            } else {
                InterfaceC8847k0 interfaceC8847k0 = c6093c.f35846a;
                Variance varianceMo17088n = interfaceC8847k0.mo17088n();
                Variance variance = Variance.IN_VARIANCE;
                if (varianceMo17088n == variance) {
                    c5250p0 = new C5250p0(abstractC5257t2);
                } else if (AbstractC6795c.m13533F(abstractC5257t2) && interfaceC8847k0.mo17088n() != variance) {
                    Variance variance2 = Variance.OUT_VARIANCE;
                    if (variance2 == interfaceC8847k0.mo17088n()) {
                        variance2 = Variance.INVARIANT;
                    }
                    c5250p0 = new C5250p0(abstractC5257t3, variance2);
                } else {
                    if (abstractC5257t3 == null) {
                        AbstractC6795c.m13540a(140);
                        throw null;
                    }
                    if (AbstractC6795c.m13545y(abstractC5257t3) && abstractC5257t3.mo11242Y0()) {
                        if (variance == interfaceC8847k0.mo17088n()) {
                            variance = Variance.INVARIANT;
                        }
                        c5250p0 = new C5250p0(abstractC5257t2, variance);
                    } else {
                        Variance variance3 = Variance.OUT_VARIANCE;
                        if (variance3 == interfaceC8847k0.mo17088n()) {
                            variance3 = Variance.INVARIANT;
                        }
                        c5250p0 = new C5250p0(abstractC5257t3, variance3);
                    }
                }
            }
            arrayList2.add(c5250p0);
        }
        return C5206f.m11014m1(abstractC5257t, arrayList2, null, 6);
    }
}
