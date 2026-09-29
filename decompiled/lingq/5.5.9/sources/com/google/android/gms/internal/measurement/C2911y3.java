package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2911y3 implements InterfaceC2797p6 {

    /* JADX INFO: renamed from: a */
    public static final C2911y3 f14512a = new C2911y3();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2797p6
    /* JADX INFO: renamed from: a */
    public final boolean mo7746a(int i10) {
        char c10;
        if (i10 != 0) {
            c10 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    c10 = 4;
                    if (i10 != 3) {
                        c10 = i10 != 4 ? (char) 0 : (char) 5;
                    }
                } else {
                    c10 = 3;
                }
            }
        } else {
            c10 = 1;
        }
        return c10 != 0;
    }
}
