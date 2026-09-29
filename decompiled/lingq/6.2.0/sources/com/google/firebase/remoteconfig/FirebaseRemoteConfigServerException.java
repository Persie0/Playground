package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: a */
    public final int f13791a;

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f13791a = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, int i2) {
        super(str);
        this.f13791a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f13791a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f13791a = i;
    }
}
