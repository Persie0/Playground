package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2666g implements InterfaceC2790p {

    /* JADX INFO: renamed from: a */
    public final boolean f14202a;

    public C2666g(Boolean bool) {
        this.f14202a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return new C2666g(Boolean.valueOf(this.f14202a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        return Double.valueOf(true != this.f14202a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2666g) && this.f14202a == ((C2666g) obj).f14202a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return Boolean.toString(this.f14202a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f14202a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.valueOf(this.f14202a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z10 = this.f14202a;
        if (zEquals) {
            return new C2842t(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(z10), str));
    }

    public final String toString() {
        return String.valueOf(this.f14202a);
    }
}
