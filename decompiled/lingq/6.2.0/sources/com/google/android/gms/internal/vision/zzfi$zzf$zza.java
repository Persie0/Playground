package com.google.android.gms.internal.vision;

import p000.e7c;
import p000.joc;
import p000.nid;
import p000.toc;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zzf$zza implements joc {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);

    private static final xoc zze = new nid();
    private final int zzf;

    zzfi$zzf$zza(int i) {
        this.zzf = i;
    }

    public static zzfi$zzf$zza zza(int i) {
        if (i == 0) {
            return RESULT_UNKNOWN;
        }
        if (i == 1) {
            return RESULT_SUCCESS;
        }
        if (i == 2) {
            return RESULT_FAIL;
        }
        if (i != 3) {
            return null;
        }
        return RESULT_SKIPPED;
    }

    public static toc zzb() {
        return e7c.f36819c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zzf$zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
