package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2701i6 implements InterfaceC2716j7 {

    /* JADX INFO: renamed from: a */
    public static final C2701i6 f14252a = new C2701i6();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2716j7
    /* JADX INFO: renamed from: a */
    public final InterfaceC2702i7 mo7700a(Class cls) {
        if (!AbstractC2771n6.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2702i7) AbstractC2771n6.m8079k(cls.asSubclass(AbstractC2771n6.class)).mo7659s(3);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2716j7
    /* JADX INFO: renamed from: b */
    public final boolean mo7701b(Class cls) {
        return AbstractC2771n6.class.isAssignableFrom(cls);
    }
}
