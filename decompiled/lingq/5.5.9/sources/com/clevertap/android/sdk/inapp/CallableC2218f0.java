package com.clevertap.android.sdk.inapp;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2218f0 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InAppController f11200a;

    public CallableC2218f0(InAppController inAppController) {
        this.f11200a = inAppController;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        InAppController inAppController = this.f11200a;
        InAppController.m6502e(inAppController, inAppController.f11143d);
        return null;
    }
}
