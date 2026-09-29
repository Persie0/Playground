package com.google.android.gms.internal.measurement;

import ae.C0062b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m */
/* JADX INFO: loaded from: classes.dex */
public class C2750m implements InterfaceC2790p, InterfaceC2736l {

    /* JADX INFO: renamed from: a */
    public final HashMap f14304a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        C2750m c2750m = new C2750m();
        for (Map.Entry entry : this.f14304a.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC2736l;
            HashMap map = c2750m.f14304a;
            if (z10) {
                map.put((String) entry.getKey(), (InterfaceC2790p) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC2790p) entry.getValue()).mo7782a());
            }
        }
        return c2750m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2750m) {
            return this.f14304a.equals(((C2750m) obj).f14304a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: g */
    public final boolean mo7785g(String str) {
        return this.f14304a.containsKey(str);
    }

    public final int hashCode() {
        return this.f14304a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return new C2722k(this.f14304a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: m */
    public final void mo7788m(String str, InterfaceC2790p interfaceC2790p) {
        HashMap map = this.f14304a;
        if (interfaceC2790p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2790p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: o */
    public final InterfaceC2790p mo7789o(String str) {
        HashMap map = this.f14304a;
        return map.containsKey(str) ? (InterfaceC2790p) map.get(str) : InterfaceC2790p.f14375r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        return "toString".equals(str) ? new C2842t(toString()) : C0062b.m259D2(this, new C2842t(str), c2684h3, arrayList);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f14304a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
