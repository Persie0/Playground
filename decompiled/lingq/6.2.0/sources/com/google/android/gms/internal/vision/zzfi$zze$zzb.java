package com.google.android.gms.internal.vision;

import p000.a3d;
import p000.e7c;
import p000.joc;
import p000.toc;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zze$zzb implements joc {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);

    private static final xoc zze = new a3d();
    private final int zzf;

    zzfi$zze$zzb(int i) {
        this.zzf = i;
    }

    public static zzfi$zze$zzb zza(int i) {
        if (i == 0) {
            return REASON_UNKNOWN;
        }
        if (i == 1) {
            return REASON_MISSING;
        }
        if (i == 2) {
            return REASON_UPGRADE;
        }
        if (i != 3) {
            return null;
        }
        return REASON_INVALID;
    }

    public static toc zzb() {
        return e7c.f36818b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zze$zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
