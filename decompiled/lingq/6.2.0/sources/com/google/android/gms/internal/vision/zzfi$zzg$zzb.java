package com.google.android.gms.internal.vision;

import p000.e7c;
import p000.joc;
import p000.mkd;
import p000.toc;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zzg$zzb implements joc {
    CLASSIFICATION_UNKNOWN(0),
    CLASSIFICATION_NONE(1),
    CLASSIFICATION_ALL(2);

    private static final xoc zzd = new mkd();
    private final int zze;

    zzfi$zzg$zzb(int i) {
        this.zze = i;
    }

    public static zzfi$zzg$zzb zza(int i) {
        if (i == 0) {
            return CLASSIFICATION_UNKNOWN;
        }
        if (i == 1) {
            return CLASSIFICATION_NONE;
        }
        if (i != 2) {
            return null;
        }
        return CLASSIFICATION_ALL;
    }

    public static toc zzb() {
        return e7c.f36820d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zzg$zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zze;
    }
}
