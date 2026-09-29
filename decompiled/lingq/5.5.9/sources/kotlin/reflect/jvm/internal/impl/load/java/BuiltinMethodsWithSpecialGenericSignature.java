package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7648e;
import p260m8.C7499b;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f38597m = 0;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6822c m13654a(InterfaceC6822c interfaceC6822c) {
        C5207g.m11111f(interfaceC6822c, "functionDescriptor");
        C7648e c7648eMo11874a = interfaceC6822c.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "functionDescriptor.name");
        if (m13655b(c7648eMo11874a)) {
            return (InterfaceC6822c) DescriptorUtilsKt.m14105b(interfaceC6822c, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                    C5207g.m11111f(callableMemberDescriptor2, "it");
                    int i10 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
                    return Boolean.valueOf(C6752c.m13415I(SpecialGenericSignatures.f38621g, C7499b.m14959q(callableMemberDescriptor2)));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13655b(C7648e c7648e) {
        C5207g.m11111f(c7648e, "<this>");
        return SpecialGenericSignatures.f38620f.contains(c7648e);
    }
}
