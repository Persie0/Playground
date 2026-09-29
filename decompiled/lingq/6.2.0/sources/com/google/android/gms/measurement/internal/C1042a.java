package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1042a {

    /* JADX INFO: renamed from: a */
    public final EnumMap f12314a;

    public C1042a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f12314a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: a */
    public final void m5848a(zzjk zzjkVar, int i) {
        zzam zzamVar = zzam.UNSET;
        if (i == -30) {
            zzamVar = zzam.TCF;
        } else if (i == -20) {
            zzamVar = zzam.API;
        } else if (i == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i == 0) {
            zzamVar = zzam.API;
        } else if (i == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.f12314a.put(zzjkVar, zzamVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m5849b(zzjk zzjkVar, zzam zzamVar) {
        this.f12314a.put(zzjkVar, zzamVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.f12314a.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb.append(zzamVar.zzb());
        }
        return sb.toString();
    }

    public C1042a() {
        this.f12314a = new EnumMap(zzjk.class);
    }
}
