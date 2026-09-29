package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzll extends IOException {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f14565a = 0;

    public zzll(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static zzll m8500a() {
        return new zzll("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static zzll m8501b() {
        return new zzll("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static zzll m8502c() {
        return new zzll("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: d */
    public static zzll m8503d() {
        return new zzll("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
