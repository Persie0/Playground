package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2881w {

    /* JADX INFO: renamed from: a */
    public final ArrayList f14483a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC2790p mo7739a(String str, C2684h3 c2684h3, ArrayList arrayList);

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final void m8326b(String str) {
        if (!this.f14483a.contains(C2601b4.m7689e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
