package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.common.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2572x extends C2573y {

    /* JADX INFO: renamed from: e */
    public final Callable f14003e;

    public /* synthetic */ C2572x(CallableC2559k callableC2559k) {
        super(false, null, null);
        this.f14003e = callableC2559k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.common.C2573y
    /* JADX INFO: renamed from: a */
    public final String mo7619a() {
        try {
            return (String) this.f14003e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
