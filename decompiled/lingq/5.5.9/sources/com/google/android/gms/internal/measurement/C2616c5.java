package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2616c5 implements InterfaceC2588a5 {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC2588a5 f14091a;

    /* JADX INFO: renamed from: b */
    public Object f14092b;

    public C2616c5(InterfaceC2588a5 interfaceC2588a5) {
        this.f14091a = interfaceC2588a5;
    }

    public final String toString() {
        Object objM611g = this.f14091a;
        if (objM611g == C2602b5.f14066a) {
            objM611g = C0141b.m611g("<supplier that returned ", String.valueOf(this.f14092b), ">");
        }
        return C0141b.m611g("Suppliers.memoize(", String.valueOf(objM611g), ")");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2588a5
    public final Object zza() {
        InterfaceC2588a5 interfaceC2588a5 = this.f14091a;
        C2602b5 c2602b5 = C2602b5.f14066a;
        if (interfaceC2588a5 != c2602b5) {
            synchronized (this) {
                if (this.f14091a != c2602b5) {
                    Object objZza = this.f14091a.zza();
                    this.f14092b = objZza;
                    this.f14091a = c2602b5;
                    return objZza;
                }
            }
        }
        return this.f14092b;
    }
}
