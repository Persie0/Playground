package zm;

import bn.InterfaceC1619c;
import dm.C5207g;
import in.AbstractC6364h;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: zm.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C10528m implements ExternalOverridabilityCondition {

    /* JADX INFO: renamed from: zm.m$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m19505a(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
            C5207g.m11111f(interfaceC6816a, "superDescriptor");
            C5207g.m11111f(interfaceC6816a2, "subDescriptor");
            if ((interfaceC6816a2 instanceof JavaMethodDescriptor) && (interfaceC6816a instanceof InterfaceC6822c)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) interfaceC6816a2;
                javaMethodDescriptor.mo11889i().size();
                InterfaceC6822c interfaceC6822c = (InterfaceC6822c) interfaceC6816a;
                interfaceC6822c.mo11889i().size();
                List<InterfaceC8853n0> listMo11889i = javaMethodDescriptor.mo18004P0().mo11889i();
                C5207g.m11110e(listMo11889i, "subDescriptor.original.valueParameters");
                List<InterfaceC8853n0> listMo11889i2 = interfaceC6822c.mo18004P0().mo11889i();
                C5207g.m11110e(listMo11889i2, "superDescriptor.original.valueParameters");
                for (Pair pair : C6752c.m13412A0(listMo11889i, listMo11889i2)) {
                    InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) pair.f38012a;
                    InterfaceC8853n0 interfaceC8853n1 = (InterfaceC8853n0) pair.f38013b;
                    C5207g.m11110e(interfaceC8853n0, "subParameter");
                    boolean z10 = m19506b((InterfaceC6822c) interfaceC6816a2, interfaceC8853n0) instanceof AbstractC6364h.c;
                    C5207g.m11110e(interfaceC8853n1, "superParameter");
                    if (z10 != (m19506b(interfaceC6822c, interfaceC8853n1) instanceof AbstractC6364h.c)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
        /* JADX INFO: renamed from: b */
        public static AbstractC6364h m19506b(InterfaceC6822c interfaceC6822c, InterfaceC8853n0 interfaceC8853n0) {
            boolean z10;
            InterfaceC6822c interfaceC6822cM13654a;
            C5207g.m11111f(interfaceC6822c, "f");
            boolean z11 = false;
            if (C5207g.m11106a(interfaceC6822c.mo11874a().m15235f(), "remove") && interfaceC6822c.mo11889i().size() == 1) {
                if ((DescriptorUtilsKt.m14115l(interfaceC6822c).mo11876g() instanceof InterfaceC1619c) || AbstractC6795c.m13528A(interfaceC6822c)) {
                    z10 = false;
                } else {
                    List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo18004P0().mo11889i();
                    C5207g.m11110e(listMo11889i, "f.original.valueParameters");
                    AbstractC5257t abstractC5257tMo11884c = ((InterfaceC8853n0) C6752c.m13443k0(listMo11889i)).mo11884c();
                    C5207g.m11110e(abstractC5257tMo11884c, "f.original.valueParameters.single().type");
                    AbstractC6364h abstractC6364hM14944i0 = C7499b.m14944i0(abstractC5257tMo11884c);
                    AbstractC6364h.c cVar = abstractC6364hM14944i0 instanceof AbstractC6364h.c ? (AbstractC6364h.c) abstractC6364hM14944i0 : null;
                    if ((cVar != null ? cVar.f36753i : null) == JvmPrimitiveType.INT && (interfaceC6822cM13654a = BuiltinMethodsWithSpecialGenericSignature.m13654a(interfaceC6822c)) != null) {
                        List<InterfaceC8853n0> listMo11889i2 = interfaceC6822cM13654a.mo18004P0().mo11889i();
                        C5207g.m11110e(listMo11889i2, "overridden.original.valueParameters");
                        AbstractC5257t abstractC5257tMo11884c2 = ((InterfaceC8853n0) C6752c.m13443k0(listMo11889i2)).mo11884c();
                        C5207g.m11110e(abstractC5257tMo11884c2, "overridden.original.valueParameters.single().type");
                        AbstractC6364h abstractC6364hM14944i1 = C7499b.m14944i0(abstractC5257tMo11884c2);
                        InterfaceC8838g interfaceC8838gMo11876g = interfaceC6822cM13654a.mo11876g();
                        C5207g.m11110e(interfaceC8838gMo11876g, "overridden.containingDeclaration");
                        if (C5207g.m11106a(DescriptorUtilsKt.m14111h(interfaceC8838gMo11876g), C6797e.a.f38358J.m15221i()) && (abstractC6364hM14944i1 instanceof AbstractC6364h.b) && C5207g.m11106a(((AbstractC6364h.b) abstractC6364hM14944i1).f36752i, "java/lang/Object")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                if (interfaceC6822c.mo11889i().size() == 1) {
                    InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC6822c.mo11876g();
                    InterfaceC8830c interfaceC8830c = interfaceC8838gMo11876g2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g2 : null;
                    if (interfaceC8830c != null) {
                        List<InterfaceC8853n0> listMo11889i3 = interfaceC6822c.mo11889i();
                        C5207g.m11110e(listMo11889i3, "f.valueParameters");
                        InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC8853n0) C6752c.m13443k0(listMo11889i3)).mo11884c().mo11250X0().mo11235q();
                        InterfaceC8830c interfaceC8830c2 = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
                        if (interfaceC8830c2 != null) {
                            z11 = (AbstractC6795c.m13544u(interfaceC8830c) != null) && C5207g.m11106a(DescriptorUtilsKt.m14110g(interfaceC8830c), DescriptorUtilsKt.m14110g(interfaceC8830c2));
                        }
                    }
                }
                if (!z11) {
                    AbstractC5257t abstractC5257tMo11884c3 = interfaceC8853n0.mo11884c();
                    C5207g.m11110e(abstractC5257tMo11884c3, "valueParameterDescriptor.type");
                    return C7499b.m14944i0(abstractC5257tMo11884c3);
                }
            }
            AbstractC5257t abstractC5257tMo11884c4 = interfaceC8853n0.mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c4, "valueParameterDescriptor.type");
            return C7499b.m14944i0(TypeUtilsKt.m14235l(abstractC5257tMo11884c4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (dm.C5207g.m11106a(r10, p260m8.C7499b.m14957p(r10, 2)) != false) goto L51;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExternalOverridabilityCondition.Result mo13656a(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c) {
        CallableMemberDescriptor callableMemberDescriptorM13660c;
        boolean z10;
        InterfaceC6822c interfaceC6822c;
        boolean z11;
        C5207g.m11111f(interfaceC6816a, "superDescriptor");
        C5207g.m11111f(interfaceC6816a2, "subDescriptor");
        boolean z12 = false;
        if ((interfaceC6816a instanceof CallableMemberDescriptor) && (interfaceC6816a2 instanceof InterfaceC6822c) && !AbstractC6795c.m13528A(interfaceC6816a2)) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
            InterfaceC6822c interfaceC6822c2 = (InterfaceC6822c) interfaceC6816a2;
            C7648e c7648eMo11874a = interfaceC6822c2.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "subDescriptor.name");
            if (BuiltinMethodsWithSpecialGenericSignature.m13655b(c7648eMo11874a)) {
                callableMemberDescriptorM13660c = SpecialBuiltinMembers.m13660c((CallableMemberDescriptor) interfaceC6816a);
                z10 = interfaceC6816a instanceof InterfaceC6822c;
                if (z10) {
                    interfaceC6822c = (InterfaceC6822c) interfaceC6816a;
                } else {
                    interfaceC6822c = null;
                }
                if (interfaceC6822c == null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (!(!z11)) {
                    if (callableMemberDescriptorM13660c == null) {
                        if (!interfaceC6822c2.mo13616E0()) {
                            if (interfaceC8830c instanceof InterfaceC1619c) {
                                if (callableMemberDescriptorM13660c instanceof InterfaceC6822c) {
                                    String strM14957p = C7499b.m14957p(interfaceC6822c2, 2);
                                    InterfaceC6822c interfaceC6822cMo18004P0 = ((InterfaceC6822c) interfaceC6816a).mo18004P0();
                                    C5207g.m11110e(interfaceC6822cMo18004P0, "superDescriptor.original");
                                }
                            }
                        }
                    }
                    z12 = true;
                } else if (interfaceC8830c instanceof InterfaceC1619c) {
                    if (callableMemberDescriptorM13660c instanceof InterfaceC6822c) {
                        String strM14957p2 = C7499b.m14957p(interfaceC6822c2, 2);
                        InterfaceC6822c interfaceC6822cMo18004P1 = ((InterfaceC6822c) interfaceC6816a).mo18004P0();
                        C5207g.m11110e(interfaceC6822cMo18004P1, "superDescriptor.original");
                    }
                    z12 = true;
                }
            } else {
                SpecialGenericSignatures.C6839a c6839a = SpecialGenericSignatures.f38615a;
                C7648e c7648eMo11874a2 = interfaceC6822c2.mo11874a();
                C5207g.m11110e(c7648eMo11874a2, "subDescriptor.name");
                if (SpecialGenericSignatures.f38625k.contains(c7648eMo11874a2)) {
                    callableMemberDescriptorM13660c = SpecialBuiltinMembers.m13660c((CallableMemberDescriptor) interfaceC6816a);
                    z10 = interfaceC6816a instanceof InterfaceC6822c;
                    if (z10) {
                        interfaceC6822c = (InterfaceC6822c) interfaceC6816a;
                    } else {
                        interfaceC6822c = null;
                    }
                    if (interfaceC6822c == null && interfaceC6822c2.mo13616E0() == interfaceC6822c.mo13616E0()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!(!z11)) {
                        if (callableMemberDescriptorM13660c == null) {
                            if (!interfaceC6822c2.mo13616E0()) {
                                if (interfaceC8830c instanceof InterfaceC1619c) {
                                    if (callableMemberDescriptorM13660c instanceof InterfaceC6822c) {
                                        String strM14957p3 = C7499b.m14957p(interfaceC6822c2, 2);
                                        InterfaceC6822c interfaceC6822cMo18004P2 = ((InterfaceC6822c) interfaceC6816a).mo18004P0();
                                        C5207g.m11110e(interfaceC6822cMo18004P2, "superDescriptor.original");
                                    }
                                }
                            }
                        }
                        z12 = true;
                    } else if ((interfaceC8830c instanceof InterfaceC1619c) && interfaceC6822c2.mo13620k0() == null && callableMemberDescriptorM13660c != null && !SpecialBuiltinMembers.m13661d(interfaceC8830c, callableMemberDescriptorM13660c)) {
                        if ((callableMemberDescriptorM13660c instanceof InterfaceC6822c) && z10 && BuiltinMethodsWithSpecialGenericSignature.m13654a((InterfaceC6822c) callableMemberDescriptorM13660c) != null) {
                            String strM14957p4 = C7499b.m14957p(interfaceC6822c2, 2);
                            InterfaceC6822c interfaceC6822cMo18004P3 = ((InterfaceC6822c) interfaceC6816a).mo18004P0();
                            C5207g.m11110e(interfaceC6822cMo18004P3, "superDescriptor.original");
                        }
                        z12 = true;
                    }
                }
            }
        }
        if (!z12 && !a.m19505a(interfaceC6816a, interfaceC6816a2)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Contract mo13657b() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }
}
