package com.google.android.gms.internal.measurement;

import ae.C0062b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2708j implements InterfaceC2790p, InterfaceC2736l {

    /* JADX INFO: renamed from: a */
    public final String f14260a;

    /* JADX INFO: renamed from: b */
    public final HashMap f14261b = new HashMap();

    public AbstractC2708j(String str) {
        this.f14260a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public InterfaceC2790p mo7782a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC2790p mo7646b(C2684h3 c2684h3, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2708j)) {
            return false;
        }
        AbstractC2708j abstractC2708j = (AbstractC2708j) obj;
        String str = this.f14260a;
        if (str != null) {
            return str.equals(abstractC2708j.f14260a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return this.f14260a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: g */
    public final boolean mo7785g(String str) {
        return this.f14261b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f14260a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return new C2722k(this.f14261b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: m */
    public final void mo7788m(String str, InterfaceC2790p interfaceC2790p) {
        HashMap map = this.f14261b;
        if (interfaceC2790p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2790p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: o */
    public final InterfaceC2790p mo7789o(String str) {
        HashMap map = this.f14261b;
        return map.containsKey(str) ? (InterfaceC2790p) map.get(str) : InterfaceC2790p.f14375r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        return "toString".equals(str) ? new C2842t(this.f14260a) : C0062b.m259D2(this, new C2842t(str), c2684h3, arrayList);
    }
}
