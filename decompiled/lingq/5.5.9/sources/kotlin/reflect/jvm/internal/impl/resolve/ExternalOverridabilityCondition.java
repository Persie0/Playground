package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import p372rm.InterfaceC8830c;

/* JADX INFO: loaded from: classes2.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* JADX INFO: renamed from: a */
    Result mo13656a(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c);

    /* JADX INFO: renamed from: b */
    Contract mo13657b();
}
