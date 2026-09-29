package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzco extends IOException {
    /* JADX INFO: renamed from: a */
    public static zzco m5346a() {
        return new zzco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static zzco m5347b() {
        return new zzco("Failed to parse the message.");
    }
}
