package zm;

import ae.C0062b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;

/* JADX INFO: renamed from: zm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10523h implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Result mo13656a(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC6816a, "superDescriptor");
        C5207g.m11111f(interfaceC6816a2, "subDescriptor");
        if (!(interfaceC6816a2 instanceof InterfaceC8829b0) || !(interfaceC6816a instanceof InterfaceC8829b0)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) interfaceC6816a2;
        InterfaceC8829b0 interfaceC8829b1 = (InterfaceC8829b0) interfaceC6816a;
        if (!C5207g.m11106a(interfaceC8829b0.mo11874a(), interfaceC8829b1.mo11874a())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (C0062b.m418y1(interfaceC8829b0) && C0062b.m418y1(interfaceC8829b1)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        return (C0062b.m418y1(interfaceC8829b0) || C0062b.m418y1(interfaceC8829b1)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Contract mo13657b() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }
}
