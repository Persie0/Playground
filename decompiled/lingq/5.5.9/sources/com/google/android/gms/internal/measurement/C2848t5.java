package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2848t5 extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final C2610c f14438c;

    public C2848t5(C2610c c2610c) {
        super("internal.eventLogger");
        this.f14438c = c2610c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        C2601b4.m7692h(3, this.f14260a, list);
        String strMo7784f = c2684h3.m7863b((InterfaceC2790p) list.get(0)).mo7784f();
        long jM7685a = (long) C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) list.get(1)).mo7783e().doubleValue());
        InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) list.get(2));
        HashMap mapM7691g = interfaceC2790pM7863b instanceof C2750m ? C2601b4.m7691g((C2750m) interfaceC2790pM7863b) : new HashMap();
        C2610c c2610c = this.f14438c;
        c2610c.getClass();
        c2610c.f14076c.add(new C2596b(strMo7784f, jM7685a, mapM7691g));
        return InterfaceC2790p.f14375r;
    }
}
