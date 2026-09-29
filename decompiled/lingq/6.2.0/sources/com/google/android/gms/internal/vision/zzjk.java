package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzjk extends IOException {
    /* JADX INFO: renamed from: a */
    public static zzjk m5835a() {
        return new zzjk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static zzjk m5836b() {
        return new zzjk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static zzjk m5837c() {
        return new zzjk("Protocol message had invalid UTF-8.");
    }
}
