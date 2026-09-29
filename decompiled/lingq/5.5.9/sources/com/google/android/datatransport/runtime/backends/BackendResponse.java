package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo6758a();

    /* JADX INFO: renamed from: b */
    public abstract Status mo6759b();
}
