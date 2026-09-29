package com.clevertap.android.sdk.pushnotification;

import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import p290o6.C7977q0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.e */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2259e implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f11335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PushConstants.PushType f11336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2260f f11337c;

    public CallableC2259e(C2260f c2260f, String str, PushConstants.PushType pushType) {
        this.f11337c = c2260f;
        this.f11335a = str;
        this.f11336b = pushType;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C2260f c2260f = this.f11337c;
        c2260f.getClass();
        String str = this.f11335a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        PushConstants.PushType pushType = this.f11336b;
        boolean z10 = (zIsEmpty || pushType == null || !str.equalsIgnoreCase(c2260f.m6577g(pushType))) ? false : true;
        CleverTapInstanceConfig cleverTapInstanceConfig = c2260f.f11344g;
        if (pushType != null) {
            cleverTapInstanceConfig.m6434c("PushProvider", pushType + "Token Already available value: " + z10);
        }
        if (!z10) {
            String tokenPrefKey = pushType.getTokenPrefKey();
            if (!TextUtils.isEmpty(tokenPrefKey)) {
                try {
                    C7977q0.m15827e(c2260f.f11345h, null).edit().putString(C7977q0.m15833k(cleverTapInstanceConfig, tokenPrefKey), str).commit();
                } catch (Throwable th2) {
                    C2181a.m6457j("CRITICAL: Failed to persist shared preferences!", th2);
                }
                cleverTapInstanceConfig.m6434c("PushProvider", pushType + "Cached New Token successfully " + str);
            }
        }
        return null;
    }
}
