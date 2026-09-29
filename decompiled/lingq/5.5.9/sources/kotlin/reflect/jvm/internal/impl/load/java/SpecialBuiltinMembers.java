package kotlin.reflect.jvm.internal.impl.load.java;

import bn.InterfaceC1619c;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import mn.C7648e;
import p102eo.C5446k;
import p260m8.C7499b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p392t5.C9203i;
import p543do.AbstractC5244m0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import pn.C8413d;
import zm.C10518c;
import zm.C10519d;

/* JADX INFO: loaded from: classes2.dex */
public final class SpecialBuiltinMembers {
    /* JADX INFO: renamed from: a */
    public static final String m13658a(CallableMemberDescriptor callableMemberDescriptor) {
        C7648e c7648e;
        CallableMemberDescriptor callableMemberDescriptorM13659b = AbstractC6795c.m13528A(callableMemberDescriptor) ? m13659b(callableMemberDescriptor) : null;
        if (callableMemberDescriptorM13659b == null) {
            return null;
        }
        CallableMemberDescriptor callableMemberDescriptorM14115l = DescriptorUtilsKt.m14115l(callableMemberDescriptorM13659b);
        if (callableMemberDescriptorM14115l instanceof InterfaceC8829b0) {
            AbstractC6795c.m13528A(callableMemberDescriptorM14115l);
            CallableMemberDescriptor callableMemberDescriptorM14105b = DescriptorUtilsKt.m14105b(DescriptorUtilsKt.m14115l(callableMemberDescriptorM14115l), C6836xccd5eab2.f38600b);
            if (callableMemberDescriptorM14105b == null || (c7648e = C10519d.f52506a.get(DescriptorUtilsKt.m14110g(callableMemberDescriptorM14105b))) == null) {
                return null;
            }
            return c7648e.m15235f();
        }
        if (!(callableMemberDescriptorM14115l instanceof InterfaceC6824e)) {
            return null;
        }
        int i10 = C10518c.f52505m;
        LinkedHashMap linkedHashMap = SpecialGenericSignatures.f38624j;
        String strM14959q = C7499b.m14959q((InterfaceC6824e) callableMemberDescriptorM14115l);
        C7648e c7648e2 = strM14959q == null ? null : (C7648e) linkedHashMap.get(strM14959q);
        if (c7648e2 != null) {
            return c7648e2.m15235f();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final <T extends CallableMemberDescriptor> T m13659b(T t10) {
        C5207g.m11111f(t10, "<this>");
        if (!SpecialGenericSignatures.f38625k.contains(t10.mo11874a()) && !C10519d.f52509d.contains(DescriptorUtilsKt.m14115l(t10).mo11874a())) {
            return null;
        }
        if (t10 instanceof InterfaceC8829b0 ? true : t10 instanceof InterfaceC6823d) {
            return (T) DescriptorUtilsKt.m14105b(t10, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                    C5207g.m11111f(callableMemberDescriptor2, "it");
                    return Boolean.valueOf(C6841b.m13675b(DescriptorUtilsKt.m14115l(callableMemberDescriptor2)));
                }
            });
        }
        if (t10 instanceof InterfaceC6824e) {
            return (T) DescriptorUtilsKt.m14105b(t10, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                    C5207g.m11111f(callableMemberDescriptor2, "it");
                    int i10 = C10518c.f52505m;
                    final InterfaceC6824e interfaceC6824e = (InterfaceC6824e) callableMemberDescriptor2;
                    return Boolean.valueOf(AbstractC6795c.m13528A(interfaceC6824e) && DescriptorUtilsKt.m14105b(interfaceC6824e, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                            C5207g.m11111f(callableMemberDescriptor3, "it");
                            return Boolean.valueOf(SpecialGenericSignatures.f38624j.containsKey(C7499b.m14959q(interfaceC6824e)));
                        }
                    }) != null);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final <T extends CallableMemberDescriptor> T m13660c(T t10) {
        C5207g.m11111f(t10, "<this>");
        T t11 = (T) m13659b(t10);
        if (t11 != null) {
            return t11;
        }
        int i10 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
        C7648e c7648eMo11874a = t10.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "name");
        if (BuiltinMethodsWithSpecialGenericSignature.m13655b(c7648eMo11874a)) {
            return (T) DescriptorUtilsKt.m14105b(t10, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2
                /* JADX WARN: Code duplicated, block: B:23:0x0065  */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
                    boolean z10;
                    CallableMemberDescriptor callableMemberDescriptorM14105b;
                    String strM14959q;
                    SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo;
                    CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                    C5207g.m11111f(callableMemberDescriptor2, "it");
                    if (AbstractC6795c.m13528A(callableMemberDescriptor2)) {
                        int i11 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
                        if (!SpecialGenericSignatures.f38620f.contains(callableMemberDescriptor2.mo11874a()) || (callableMemberDescriptorM14105b = DescriptorUtilsKt.m14105b(callableMemberDescriptor2, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
                            /* JADX WARN: Code duplicated, block: B:7:0x0022  */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                                boolean z11;
                                CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                                C5207g.m11111f(callableMemberDescriptor4, "it");
                                if (callableMemberDescriptor4 instanceof InterfaceC6822c) {
                                    int i12 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
                                    if (C6752c.m13415I(SpecialGenericSignatures.f38621g, C7499b.m14959q(callableMemberDescriptor4))) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                return Boolean.valueOf(z11);
                            }
                        })) == null || (strM14959q = C7499b.m14959q(callableMemberDescriptorM14105b)) == null) {
                            specialSignatureInfo = null;
                        } else if (SpecialGenericSignatures.f38617c.contains(strM14959q)) {
                            specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                        } else {
                            specialSignatureInfo = ((SpecialGenericSignatures.TypeSafeBarrierDescription) C6753d.m13460M0(strM14959q, SpecialGenericSignatures.f38619e)) == SpecialGenericSignatures.TypeSafeBarrierDescription.NULL ? SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                        }
                        if (specialSignatureInfo != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            });
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m13661d(InterfaceC8830c interfaceC8830c, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        C5207g.m11111f(interfaceC8830c, "<this>");
        C5207g.m11111f(callableMemberDescriptor, "specialCallableDescriptor");
        InterfaceC8838g interfaceC8838gMo11876g = callableMemberDescriptor.mo11876g();
        C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC5265x abstractC5265xMo5316v = ((InterfaceC8830c) interfaceC8838gMo11876g).mo5316v();
        C5207g.m11110e(abstractC5265xMo5316v, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC8830c interfaceC8830cM16451j = C8413d.m16451j(interfaceC8830c);
        while (true) {
            if (interfaceC8830cM16451j == null) {
                return false;
            }
            if (!(interfaceC8830cM16451j instanceof InterfaceC1619c)) {
                AbstractC5265x abstractC5265xMo5316v2 = interfaceC8830cM16451j.mo5316v();
                if (abstractC5265xMo5316v2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                AbstractC5262v0 abstractC5262v0M11299j = null;
                arrayDeque.add(new C5446k(abstractC5265xMo5316v2, null));
                InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5265xMo5316v.mo11250X0();
                while (!arrayDeque.isEmpty()) {
                    C5446k c5446k = (C5446k) arrayDeque.poll();
                    AbstractC5257t abstractC5257tM14204i = c5446k.f33997a;
                    InterfaceC5240k0 interfaceC5240k0Mo11250X1 = abstractC5257tM14204i.mo11250X0();
                    if (C9203i.m17542c(interfaceC5240k0Mo11250X1, interfaceC5240k0Mo11250X0)) {
                        boolean zMo11242Y0 = abstractC5257tM14204i.mo11242Y0();
                        for (C5446k c5446k2 = c5446k.f33998b; c5446k2 != null; c5446k2 = c5446k2.f33998b) {
                            AbstractC5257t abstractC5257t = c5446k2.f33997a;
                            List<InterfaceC5246n0> listMo11240V0 = abstractC5257t.mo11240V0();
                            if (!(listMo11240V0 instanceof Collection) || !listMo11240V0.isEmpty()) {
                                Iterator<T> it = listMo11240V0.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((InterfaceC5246n0) it.next()).mo11237d() != Variance.INVARIANT) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z10) {
                                    AbstractC5257t abstractC5257tM14204i2 = TypeSubstitutor.m14199e(CapturedTypeConstructorKt.m14099b(AbstractC5244m0.f33335b.m11280a(abstractC5257t))).m14204i(abstractC5257tM14204i, Variance.INVARIANT);
                                    C5207g.m11110e(abstractC5257tM14204i2, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                                    abstractC5257tM14204i = CapturedTypeApproximationKt.m14240a(abstractC5257tM14204i2).f35845b;
                                } else {
                                    abstractC5257tM14204i = TypeSubstitutor.m14199e(AbstractC5244m0.f33335b.m11280a(abstractC5257t)).m14204i(abstractC5257tM14204i, Variance.INVARIANT);
                                    C5207g.m11110e(abstractC5257tM14204i, "{\n                    Ty…ARIANT)\n                }");
                                }
                                zMo11242Y0 = !zMo11242Y0 || abstractC5257t.mo11242Y0();
                            }
                            z10 = false;
                            if (z10) {
                                AbstractC5257t abstractC5257tM14204i3 = TypeSubstitutor.m14199e(CapturedTypeConstructorKt.m14099b(AbstractC5244m0.f33335b.m11280a(abstractC5257t))).m14204i(abstractC5257tM14204i, Variance.INVARIANT);
                                C5207g.m11110e(abstractC5257tM14204i3, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                                abstractC5257tM14204i = CapturedTypeApproximationKt.m14240a(abstractC5257tM14204i3).f35845b;
                            } else {
                                abstractC5257tM14204i = TypeSubstitutor.m14199e(AbstractC5244m0.f33335b.m11280a(abstractC5257t)).m14204i(abstractC5257tM14204i, Variance.INVARIANT);
                                C5207g.m11110e(abstractC5257tM14204i, "{\n                    Ty…ARIANT)\n                }");
                            }
                            if (zMo11242Y0) {
                            }
                        }
                        InterfaceC5240k0 interfaceC5240k0Mo11250X2 = abstractC5257tM14204i.mo11250X0();
                        if (C9203i.m17542c(interfaceC5240k0Mo11250X2, interfaceC5240k0Mo11250X0)) {
                            abstractC5262v0M11299j = C5258t0.m11299j(abstractC5257tM14204i, zMo11242Y0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + C5212l.m11136I(interfaceC5240k0Mo11250X2) + ", \n\nsupertype: " + C5212l.m11136I(interfaceC5240k0Mo11250X0) + " \n" + C9203i.m17542c(interfaceC5240k0Mo11250X2, interfaceC5240k0Mo11250X0));
                    }
                    for (AbstractC5257t abstractC5257t2 : interfaceC5240k0Mo11250X1.mo11278p()) {
                        C5207g.m11110e(abstractC5257t2, "immediateSupertype");
                        arrayDeque.add(new C5446k(abstractC5257t2, c5446k));
                    }
                }
                if (abstractC5262v0M11299j != null) {
                    return !AbstractC6795c.m13528A(interfaceC8830cM16451j);
                }
            }
            interfaceC8830cM16451j = C8413d.m16451j(interfaceC8830cM16451j);
        }
    }
}
