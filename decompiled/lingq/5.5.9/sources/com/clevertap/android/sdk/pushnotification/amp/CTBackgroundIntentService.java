package com.clevertap.android.sdk.pushnotification.amp;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.ConcurrentHashMap;
import p290o6.C7987z;

/* JADX INFO: loaded from: classes.dex */
public class CTBackgroundIntentService extends IntentService {
    public CTBackgroundIntentService() {
        super("CTBackgroundIntentService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = CleverTapAPI.f10979e;
        if (concurrentHashMap == null) {
            CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(applicationContext, null);
            if (cleverTapAPIM6420g != null) {
                C7987z c7987z = cleverTapAPIM6420g.f10981b;
                if (c7987z.f43471a.f11000f) {
                    c7987z.f43481k.m6581k(applicationContext, null);
                    return;
                } else {
                    C2181a.m6449a("Instance doesn't allow Background sync, not running the Job");
                    return;
                }
            }
            return;
        }
        for (String str : concurrentHashMap.keySet()) {
            CleverTapAPI cleverTapAPI = CleverTapAPI.f10979e.get(str);
            if (cleverTapAPI != null) {
                C7987z c7987z2 = cleverTapAPI.f10981b;
                CleverTapInstanceConfig cleverTapInstanceConfig = c7987z2.f43471a;
                if (cleverTapInstanceConfig.f10999e) {
                    C2181a.m6450b(str, "Instance is Analytics Only not processing device token");
                } else if (cleverTapInstanceConfig.f11000f) {
                    c7987z2.f43481k.m6581k(applicationContext, null);
                } else {
                    C2181a.m6450b(str, "Instance doesn't allow Background sync, not running the Job");
                }
            }
        }
    }
}
