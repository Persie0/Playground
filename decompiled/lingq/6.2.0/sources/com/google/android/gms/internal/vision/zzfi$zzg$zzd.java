package com.google.android.gms.internal.vision;

import p000.e7c;
import p000.joc;
import p000.q41;
import p000.toc;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zzg$zzd implements joc {
    MODE_UNKNOWN(0),
    MODE_ACCURATE(1),
    MODE_FAST(2),
    MODE_SELFIE(3);

    private static final xoc zze = new q41(14);
    private final int zzf;

    zzfi$zzg$zzd(int i) {
        this.zzf = i;
    }

    public static zzfi$zzg$zzd zza(int i) {
        if (i == 0) {
            return MODE_UNKNOWN;
        }
        if (i == 1) {
            return MODE_ACCURATE;
        }
        if (i == 2) {
            return MODE_FAST;
        }
        if (i != 3) {
            return null;
        }
        return MODE_SELFIE;
    }

    public static toc zzb() {
        return e7c.f36822f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zzg$zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
