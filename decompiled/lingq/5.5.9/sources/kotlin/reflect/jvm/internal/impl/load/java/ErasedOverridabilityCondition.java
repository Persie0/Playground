package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import p249lo.C7413f;
import p249lo.C7423p;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p385sf.C9000b;
import p543do.AbstractC5257t;

/* JADX INFO: loaded from: classes2.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$a */
    public /* synthetic */ class C6837a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38601a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            f38601a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Result mo13656a(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c) {
        boolean z10;
        InterfaceC6816a interfaceC6816aMo5312d;
        C5207g.m11111f(interfaceC6816a, "superDescriptor");
        C5207g.m11111f(interfaceC6816a2, "subDescriptor");
        if (interfaceC6816a2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) interfaceC6816a2;
            if (!(!javaMethodDescriptor.mo11895r().isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoM14074i = OverridingUtil.m14074i(interfaceC6816a, interfaceC6816a2);
                if ((overrideCompatibilityInfoM14074i != null ? overrideCompatibilityInfoM14074i.m14090c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<InterfaceC8853n0> listMo11889i = javaMethodDescriptor.mo11889i();
                C5207g.m11110e(listMo11889i, "subDescriptor.valueParameters");
                C7423p c7423pM14261V2 = C7073a.m14261V2(C6752c.m13413G(listMo11889i), new InterfaceC2052l<InterfaceC8853n0, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$isOverridable$signatureTypes$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final AbstractC5257t mo528n(InterfaceC8853n0 interfaceC8853n0) {
                        return interfaceC8853n0.mo11884c();
                    }
                });
                AbstractC5257t abstractC5257t = javaMethodDescriptor.f38534g;
                C5207g.m11108c(abstractC5257t);
                C7413f c7413fM14264Y2 = C7073a.m14264Y2(c7423pM14261V2, abstractC5257t);
                InterfaceC8835e0 interfaceC8835e0 = javaMethodDescriptor.f38536i;
                List listM17253s = C9000b.m17253s(interfaceC8835e0 != null ? interfaceC8835e0.mo11884c() : null);
                C5207g.m11111f(listM17253s, "elements");
                C7413f.a aVar = new C7413f.a(SequencesKt__SequencesKt.m14250K2(SequencesKt__SequencesKt.m14253N2(c7413fM14264Y2, C6752c.m13413G(listM17253s))));
                while (true) {
                    if (!aVar.m14817a()) {
                        z10 = false;
                        break;
                    }
                    AbstractC5257t abstractC5257t2 = (AbstractC5257t) aVar.next();
                    if ((abstractC5257t2.mo11240V0().isEmpty() ^ true) && !(abstractC5257t2.mo11288a1() instanceof RawTypeImpl)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (interfaceC6816aMo5312d = interfaceC6816a.mo5312d(TypeSubstitutor.m14199e(new RawSubstitution(null)))) != null) {
                    if (interfaceC6816aMo5312d instanceof InterfaceC6824e) {
                        InterfaceC6824e interfaceC6824e = (InterfaceC6824e) interfaceC6816aMo5312d;
                        List<InterfaceC8847k0> listMo11895r = interfaceC6824e.mo11895r();
                        C5207g.m11110e(listMo11895r, "erasedSuper.typeParameters");
                        if (!listMo11895r.isEmpty()) {
                            interfaceC6816aMo5312d = interfaceC6824e.mo11848M0().mo11852b(EmptyList.f38032a).mo11851a();
                            C5207g.m11108c(interfaceC6816aMo5312d);
                        }
                    }
                    OverridingUtil.OverrideCompatibilityInfo.Result resultM14090c = OverridingUtil.f39632f.m14086n(interfaceC6816aMo5312d, interfaceC6816a2, false).m14090c();
                    C5207g.m11110e(resultM14090c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    return C6837a.f38601a[resultM14090c.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Contract mo13657b() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
