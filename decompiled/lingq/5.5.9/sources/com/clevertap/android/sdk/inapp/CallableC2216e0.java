package com.clevertap.android.sdk.inapp;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2216e0 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f11196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InAppController f11197b;

    public CallableC2216e0(InAppController inAppController, Context context) {
        this.f11197b = inAppController;
        this.f11196a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        InAppController.m6502e(this.f11197b, this.f11196a);
        return null;
    }
}
