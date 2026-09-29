package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import p432v8.AbstractC9668a;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i10) {
            this.value = i10;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC9668a mo6752a();

    /* JADX INFO: renamed from: b */
    public abstract ClientType mo6753b();
}
