package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2627d2 implements InterfaceC2797p6 {

    /* JADX INFO: renamed from: a */
    public static final C2627d2 f14148a = new C2627d2();

    /* JADX WARN: Code duplicated, block: B:18:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
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
            if (c10 != 0) {
                return true;
            }
            return false;
        }
        c10 = 1;
        if (c10 != 0) {
            return true;
        }
        return false;
    }
}
