package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzafy extends RuntimeException {
    public zzafy() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: a */
    public final zzaeh m5438a() {
        return new zzaeh(getMessage());
    }
}
