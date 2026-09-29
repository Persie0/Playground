package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2611c0 extends AbstractC2881w {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2881w
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7739a(String str, C2684h3 c2684h3, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !c2684h3.m7868g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC2790p interfaceC2790pM7865d = c2684h3.m7865d(str);
        if (interfaceC2790pM7865d instanceof AbstractC2708j) {
            return ((AbstractC2708j) interfaceC2790pM7865d).mo7646b(c2684h3, arrayList);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
