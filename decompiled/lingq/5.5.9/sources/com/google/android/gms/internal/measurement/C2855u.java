package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2855u implements InterfaceC2790p {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return InterfaceC2790p.f14375r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2855u;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
