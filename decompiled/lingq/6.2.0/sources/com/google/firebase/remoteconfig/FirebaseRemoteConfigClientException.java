package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException() {
        super("Unable to connect to the server. Check your connection and try again.");
    }

    public FirebaseRemoteConfigClientException(String str, Exception exc) {
        super(str, exc);
    }

    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }
}
