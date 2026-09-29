package com.google.android.gms.internal.clearcut;

import p000.etb;
import p000.kcc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzge$zzv$zzb {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);

    private static final etb zzbq = new kcc();
    private final int value;

    zzge$zzv$zzb(int i) {
        this.value = i;
    }

    public static zzge$zzv$zzb zzbc(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public static etb zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}
