package com.google.android.gms.internal.vision;

import p000.e7c;
import p000.joc;
import p000.toc;
import p000.wkd;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zzg$zzc implements joc {
    LANDMARK_UNKNOWN(0),
    LANDMARK_NONE(1),
    LANDMARK_ALL(2),
    LANDMARK_CONTOUR(3);

    private static final xoc zze = new wkd();
    private final int zzf;

    zzfi$zzg$zzc(int i) {
        this.zzf = i;
    }

    public static zzfi$zzg$zzc zza(int i) {
        if (i == 0) {
            return LANDMARK_UNKNOWN;
        }
        if (i == 1) {
            return LANDMARK_NONE;
        }
        if (i == 2) {
            return LANDMARK_ALL;
        }
        if (i != 3) {
            return null;
        }
        return LANDMARK_CONTOUR;
    }

    public static toc zzb() {
        return e7c.f36821e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zzg$zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
