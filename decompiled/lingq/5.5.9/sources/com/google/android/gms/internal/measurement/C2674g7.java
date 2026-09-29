package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2674g7 {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m7849a(Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj;
        if (zzmcVar.isEmpty()) {
            return;
        }
        Iterator it = zzmcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final zzmc m7850b(Object obj, Object obj2) {
        zzmc zzmcVarM8505c = (zzmc) obj;
        zzmc zzmcVar = (zzmc) obj2;
        if (!zzmcVar.isEmpty()) {
            if (!zzmcVarM8505c.f14567a) {
                zzmcVarM8505c = zzmcVarM8505c.m8505c();
            }
            zzmcVarM8505c.m8508h();
            if (!zzmcVar.isEmpty()) {
                zzmcVarM8505c.putAll(zzmcVar);
            }
        }
        return zzmcVarM8505c;
    }
}
