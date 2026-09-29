package com.kochava.tracker.privacy.internal;

/* JADX INFO: loaded from: classes.dex */
public enum ConsentState {
    NOT_ANSWERED("not_answered"),
    GRANTED("granted"),
    DECLINED("declined");

    public final String key;

    ConsentState(String str) {
        this.key = str;
    }

    public static ConsentState fromKey(String str) {
        for (ConsentState consentState : values()) {
            if (consentState.key.equals(str)) {
                return consentState;
            }
        }
        return NOT_ANSWERED;
    }
}
