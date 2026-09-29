package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2803q implements InterfaceC2790p {

    /* JADX INFO: renamed from: a */
    public final String f14395a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f14396b;

    public C2803q(ArrayList arrayList, String str) {
        this.f14395a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f14396b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2803q)) {
            return false;
        }
        C2803q c2803q = (C2803q) obj;
        String str = this.f14395a;
        if (str == null ? c2803q.f14395a == null : str.equals(c2803q.f14395a)) {
            return this.f14396b.equals(c2803q.f14396b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f14395a;
        return this.f14396b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
