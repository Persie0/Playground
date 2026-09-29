package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2680h implements InterfaceC2790p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p f14220a;

    /* JADX INFO: renamed from: b */
    public final String f14221b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2680h() {
        throw null;
    }

    public C2680h(String str) {
        this.f14220a = InterfaceC2790p.f14375r;
        this.f14221b = str;
    }

    public C2680h(String str, InterfaceC2790p interfaceC2790p) {
        this.f14220a = interfaceC2790p;
        this.f14221b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return new C2680h(this.f14221b, this.f14220a.mo7782a());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2680h)) {
            return false;
        }
        C2680h c2680h = (C2680h) obj;
        return this.f14221b.equals(c2680h.f14221b) && this.f14220a.equals(c2680h.f14220a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f14220a.hashCode() + (this.f14221b.hashCode() * 31);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }
}
