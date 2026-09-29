package com.facebook.appevents.ondeviceprocessing;

/* JADX INFO: loaded from: classes2.dex */
public enum RemoteServiceWrapper$EventType {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

    private final String eventType;

    RemoteServiceWrapper$EventType(String str) {
        this.eventType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.eventType;
    }
}
