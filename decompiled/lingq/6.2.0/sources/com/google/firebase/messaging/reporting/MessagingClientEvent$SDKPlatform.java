package com.google.firebase.messaging.reporting;

import p000.bo7;

/* JADX INFO: loaded from: classes2.dex */
public enum MessagingClientEvent$SDKPlatform implements bo7 {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    MessagingClientEvent$SDKPlatform(int i) {
        this.number_ = i;
    }

    @Override // p000.bo7
    public int getNumber() {
        return this.number_;
    }
}
