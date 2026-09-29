package com.google.android.gms.internal.vision;

import p000.e7c;
import p000.j13;
import p000.joc;
import p000.toc;
import p000.xoc;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfi$zzj$zza implements joc {
    FORMAT_UNKNOWN(0),
    FORMAT_LUMINANCE(1),
    FORMAT_RGB8(2),
    FORMAT_MONOCHROME(3);

    private static final xoc zze = new j13();
    private final int zzf;

    zzfi$zzj$zza(int i) {
        this.zzf = i;
    }

    public static zzfi$zzj$zza zza(int i) {
        if (i == 0) {
            return FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return FORMAT_LUMINANCE;
        }
        if (i == 2) {
            return FORMAT_RGB8;
        }
        if (i != 3) {
            return null;
        }
        return FORMAT_MONOCHROME;
    }

    public static toc zzb() {
        return e7c.f36823g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfi$zzj$zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
