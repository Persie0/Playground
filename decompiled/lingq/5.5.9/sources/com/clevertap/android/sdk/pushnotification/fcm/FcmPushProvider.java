package com.clevertap.android.sdk.pushnotification.fcm;

import ae.C0065e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.InterfaceC2254a;
import com.clevertap.android.sdk.pushnotification.InterfaceC2256b;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import p008a7.C0047a;
import p008a7.C0048b;
import p008a7.InterfaceC0049c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"unused"})
public class FcmPushProvider implements InterfaceC2254a {
    private InterfaceC0049c handler;

    @SuppressLint({"unused"})
    public FcmPushProvider(InterfaceC2256b interfaceC2256b, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new C0048b(interfaceC2256b, context, cleverTapInstanceConfig);
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public int getPlatform() {
        return 1;
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public PushConstants.PushType getPushType() {
        ((C0048b) this.handler).getClass();
        return PushConstants.PushType.FCM;
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public boolean isAvailable() {
        boolean z10;
        C0048b c0048b = (C0048b) this.handler;
        CleverTapInstanceConfig cleverTapInstanceConfig = c0048b.f57a;
        try {
            Context context = c0048b.f58b;
            try {
                String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                z10 = C2549d.f13922b.mo7586c(context, C2549d.f13921a) == 0;
            } catch (ClassNotFoundException unused) {
            }
            if (!z10) {
                cleverTapInstanceConfig.m6434c("PushProvider", PushConstants.f11331a + "Google Play services is currently unavailable.");
                return false;
            }
            C0065e c0065eM434b = C0065e.m434b();
            c0065eM434b.m437a();
            if (!TextUtils.isEmpty(c0065eM434b.f173c.f187e)) {
                return true;
            }
            cleverTapInstanceConfig.m6434c("PushProvider", PushConstants.f11331a + "The FCM sender ID is not set. Unable to register for FCM.");
            return false;
        } catch (Throwable th2) {
            cleverTapInstanceConfig.m6435d(PushConstants.f11331a + "Unable to register with FCM.", th2);
            return false;
        }
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public boolean isSupported() {
        boolean z10;
        boolean z11;
        Context context = ((C0048b) this.handler).f58b;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            z10 = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.market", 0);
            z11 = true;
        } catch (PackageManager.NameNotFoundException unused2) {
            z11 = false;
        }
        return z11;
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public int minSDKSupportVersionCode() {
        return 0;
    }

    @Override // com.clevertap.android.sdk.pushnotification.InterfaceC2254a
    public void requestToken() {
        FirebaseMessaging firebaseMessaging;
        C0048b c0048b = (C0048b) this.handler;
        CleverTapInstanceConfig cleverTapInstanceConfig = c0048b.f57a;
        try {
            cleverTapInstanceConfig.m6434c("PushProvider", PushConstants.f11331a + "Requesting FCM token using googleservices.json");
            C3260w c3260w = FirebaseMessaging.f16304m;
            synchronized (FirebaseMessaging.class) {
                try {
                    firebaseMessaging = FirebaseMessaging.getInstance(C0065e.m434b());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            firebaseMessaging.m9230c().mo12100b(new C0047a(c0048b));
        } catch (Throwable th3) {
            cleverTapInstanceConfig.m6435d(PushConstants.f11331a + "Error requesting FCM token", th3);
            c0048b.f59c.mo6568a(null, PushConstants.PushType.FCM);
        }
    }

    public void setHandler(InterfaceC0049c interfaceC0049c) {
        this.handler = interfaceC0049c;
    }
}
