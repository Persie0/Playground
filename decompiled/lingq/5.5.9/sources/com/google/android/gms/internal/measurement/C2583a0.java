package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2583a0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2708j f14042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2684h3 f14043b;

    public C2583a0(AbstractC2708j abstractC2708j, C2684h3 c2684h3) {
        this.f14042a = abstractC2708j;
        this.f14043b = c2684h3;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2790p interfaceC2790p = (InterfaceC2790p) obj;
        InterfaceC2790p interfaceC2790p2 = (InterfaceC2790p) obj2;
        if (interfaceC2790p instanceof C2855u) {
            return !(interfaceC2790p2 instanceof C2855u) ? 1 : 0;
        }
        if (interfaceC2790p2 instanceof C2855u) {
            return -1;
        }
        AbstractC2708j abstractC2708j = this.f14042a;
        return abstractC2708j == null ? interfaceC2790p.mo7784f().compareTo(interfaceC2790p2.mo7784f()) : (int) C2601b4.m7685a(abstractC2708j.mo7646b(this.f14043b, Arrays.asList(interfaceC2790p, interfaceC2790p2)).mo7783e().doubleValue());
    }
}
