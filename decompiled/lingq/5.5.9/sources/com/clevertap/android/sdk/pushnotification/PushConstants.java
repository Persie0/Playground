package com.clevertap.android.sdk.pushnotification;

import com.clevertap.android.sdk.C2181a;

/* JADX INFO: loaded from: classes.dex */
public interface PushConstants {

    /* JADX INFO: renamed from: a */
    public static final String f11331a = PushType.FCM.toString();

    public enum PushType {
        FCM("fcm", "fcm_token", "com.clevertap.android.sdk.pushnotification.fcm.FcmPushProvider", "com.google.firebase.messaging.FirebaseMessagingService", 1, ""),
        XPS("xps", "xps_token", "com.clevertap.android.xps.XiaomiPushProvider", "com.xiaomi.mipush.sdk.MiPushClient", 1, ""),
        HPS("hps", "hps_token", "com.clevertap.android.hms.HmsPushProvider", "com.huawei.hms.push.HmsMessageService", 1, ""),
        BPS("bps", "bps_token", "com.clevertap.android.bps.BaiduPushProvider", "com.baidu.android.pushservice.PushMessageReceiver", 1, ""),
        ADM("adm", "adm_token", "com.clevertap.android.adm.AmazonPushProvider", "com.amazon.device.messaging.ADM", 1, "");

        private final String ctProviderClassName;
        private final String messagingSDKClassName;
        private int runningDevices;
        private String serverRegion;
        private final String tokenPrefKey;
        private final String type;

        PushType(String str, String str2, String str3, String str4, int i10, String str5) {
            this.type = str;
            this.tokenPrefKey = str2;
            this.ctProviderClassName = str3;
            this.messagingSDKClassName = str4;
            this.runningDevices = i10;
            this.serverRegion = str5;
        }

        public String getCtProviderClassName() {
            return this.ctProviderClassName;
        }

        public String getMessagingSDKClassName() {
            return this.messagingSDKClassName;
        }

        public int getRunningDevices() {
            return this.runningDevices;
        }

        public String getServerRegion() {
            C2181a.m6455h("PushConstants: getServerRegion called, returning region:" + this.serverRegion);
            return this.serverRegion;
        }

        public String getTokenPrefKey() {
            return this.tokenPrefKey;
        }

        public String getType() {
            return this.type;
        }

        public void setRunningDevices(int i10) {
            this.runningDevices = i10;
        }

        public void setServerRegion(String str) {
            C2181a.m6455h("PushConstants: setServerRegion called with region:" + str);
            this.serverRegion = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return " [PushType:" + name() + "] ";
        }
    }
}
