package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2618c7 implements InterfaceC2716j7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2716j7[] f14093a;

    public C2618c7(InterfaceC2716j7... interfaceC2716j7Arr) {
        this.f14093a = interfaceC2716j7Arr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2716j7
    /* JADX INFO: renamed from: a */
    public final InterfaceC2702i7 mo7700a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC2716j7 interfaceC2716j7 = this.f14093a[i10];
            if (interfaceC2716j7.mo7701b(cls)) {
                return interfaceC2716j7.mo7700a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2716j7
    /* JADX INFO: renamed from: b */
    public final boolean mo7701b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f14093a[i10].mo7701b(cls)) {
                return true;
            }
        }
        return false;
    }
}
