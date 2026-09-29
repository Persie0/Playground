package com.google.firebase.messaging.reporting;

import p000.bo7;

/* JADX INFO: loaded from: classes2.dex */
public enum MessagingClientEvent$Event implements bo7 {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    MessagingClientEvent$Event(int i) {
        this.number_ = i;
    }

    @Override // p000.bo7
    public int getNumber() {
        return this.number_;
    }
}
