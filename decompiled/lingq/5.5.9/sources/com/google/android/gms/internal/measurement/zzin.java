package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class zzin implements Serializable, InterfaceC2588a5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2588a5 f14539a;

    /* JADX INFO: renamed from: b */
    public volatile transient boolean f14540b;

    /* JADX INFO: renamed from: c */
    public transient Object f14541c;

    public zzin(InterfaceC2588a5 interfaceC2588a5) {
        this.f14539a = interfaceC2588a5;
    }

    public final String toString() {
        return C0141b.m611g("Suppliers.memoize(", (this.f14540b ? C0141b.m611g("<supplier that returned ", String.valueOf(this.f14541c), ">") : this.f14539a).toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2588a5
    public final Object zza() {
        if (!this.f14540b) {
            synchronized (this) {
                if (!this.f14540b) {
                    Object objZza = this.f14539a.zza();
                    this.f14541c = objZza;
                    this.f14540b = true;
                    return objZza;
                }
            }
        }
        return this.f14541c;
    }
}
