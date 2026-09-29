package com.clevertap.android.sdk.inapp;

import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import java.util.concurrent.Callable;
import p290o6.C7977q0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2220g0 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f11201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InAppController f11202b;

    public CallableC2220g0(InAppController inAppController, Context context) {
        this.f11202b = inAppController;
        this.f11201a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        try {
            C7977q0.m15827e(this.f11201a, null).edit().putInt("local_in_app_count", this.f11202b.f11145f.m15764h().f43318q).commit();
        } catch (Throwable th2) {
            C2181a.m6457j("CRITICAL: Failed to persist shared preferences!", th2);
        }
        return null;
    }
}
