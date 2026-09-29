package com.google.firebase.messaging.reporting;

import p000.bo7;

/* JADX INFO: loaded from: classes2.dex */
public enum MessagingClientEvent$MessageType implements bo7 {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    MessagingClientEvent$MessageType(int i) {
        this.number_ = i;
    }

    @Override // p000.bo7
    public int getNumber() {
        return this.number_;
    }
}
