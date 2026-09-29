package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: loaded from: classes2.dex */
    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        Code(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        Code code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        Code code = Code.UNKNOWN;
    }
}
