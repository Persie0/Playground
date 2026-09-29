package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2914y6 extends AbstractC2927z6 {
    @Override // com.google.android.gms.internal.measurement.AbstractC2927z6
    /* JADX INFO: renamed from: a */
    public final void mo8429a(long j10, Object obj) {
        ((InterfaceC2836s6) C2812q8.m8222j(j10, obj)).mo8077c();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2927z6
    /* JADX INFO: renamed from: b */
    public final void mo8430b(long j10, Object obj, Object obj2) {
        InterfaceC2836s6 interfaceC2836s6Mo7645r = (InterfaceC2836s6) C2812q8.m8222j(j10, obj);
        InterfaceC2836s6 interfaceC2836s6 = (InterfaceC2836s6) C2812q8.m8222j(j10, obj2);
        int size = interfaceC2836s6Mo7645r.size();
        int size2 = interfaceC2836s6.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC2836s6Mo7645r.mo8078d()) {
                interfaceC2836s6Mo7645r = interfaceC2836s6Mo7645r.mo7645r(size2 + size);
            }
            interfaceC2836s6Mo7645r.addAll(interfaceC2836s6);
        }
        if (size > 0) {
            interfaceC2836s6 = interfaceC2836s6Mo7645r;
        }
        C2812q8.m8230r(j10, obj, interfaceC2836s6);
    }
}
