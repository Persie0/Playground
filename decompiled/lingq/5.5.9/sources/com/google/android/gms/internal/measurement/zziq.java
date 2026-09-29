package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zziq implements Serializable, InterfaceC2588a5 {

    /* JADX INFO: renamed from: a */
    public final Object f14542a;

    public zziq(Object obj) {
        this.f14542a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        boolean z10 = false;
        if ((obj instanceof zziq) && ((obj3 = this.f14542a) == (obj2 = ((zziq) obj).f14542a) || (obj3 != null && obj3.equals(obj2)))) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14542a});
    }

    public final String toString() {
        return C0141b.m611g("Suppliers.ofInstance(", this.f14542a.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2588a5
    public final Object zza() {
        return this.f14542a;
    }
}
