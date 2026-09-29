package kotlin.reflect.jvm.internal.impl.load.java;

import dm.C5207g;
import java.util.Collection;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7648e;
import p372rm.InterfaceC8831c0;
import zm.C10519d;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6841b {
    /* JADX INFO: renamed from: a */
    public static String m13674a(InterfaceC8831c0 interfaceC8831c0) {
        C7648e c7648e;
        AbstractC6795c.m13528A(interfaceC8831c0);
        CallableMemberDescriptor callableMemberDescriptorM14105b = DescriptorUtilsKt.m14105b(DescriptorUtilsKt.m14115l(interfaceC8831c0), C6836xccd5eab2.f38600b);
        if (callableMemberDescriptorM14105b == null || (c7648e = C10519d.f52506a.get(DescriptorUtilsKt.m14110g(callableMemberDescriptorM14105b))) == null) {
            return null;
        }
        return c7648e.m15235f();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13675b(CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "callableMemberDescriptor");
        boolean z10 = false;
        if (!C10519d.f52509d.contains(callableMemberDescriptor.mo11874a())) {
            return false;
        }
        if (C6752c.m13415I(C10519d.f52508c, DescriptorUtilsKt.m14106c(callableMemberDescriptor)) && callableMemberDescriptor.mo11889i().isEmpty()) {
            z10 = true;
        } else if (AbstractC6795c.m13528A(callableMemberDescriptor)) {
            Collection<? extends CallableMemberDescriptor> collectionMo11893p = callableMemberDescriptor.mo11893p();
            C5207g.m11110e(collectionMo11893p, "overriddenDescriptors");
            if (!collectionMo11893p.isEmpty()) {
                for (CallableMemberDescriptor callableMemberDescriptor2 : collectionMo11893p) {
                    C5207g.m11110e(callableMemberDescriptor2, "it");
                    if (m13675b(callableMemberDescriptor2)) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        return z10;
    }
}
