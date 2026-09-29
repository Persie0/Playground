package com.clevertap.android.sdk.pushnotification;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2254a {
    int getPlatform();

    PushConstants.PushType getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
