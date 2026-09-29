package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.smc;
import p000.vnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1007r extends AbstractC0998i {
    private static final C1007r zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        C1007r c1007r = new C1007r();
        zzb = c1007r;
        AbstractC0998i.m5533f(C1007r.class, c1007r);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5622p(C1007r c1007r, int i) {
        c1007r.zzd |= 1;
        c1007r.zze = i;
    }

    /* JADX INFO: renamed from: q */
    public static vnc m5623q() {
        return (vnc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5624r(C1007r c1007r, String str) {
        c1007r.zzd |= 8;
        c1007r.zzh = str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5625s(C1007r c1007r, String str) {
        str.getClass();
        c1007r.zzd |= 2;
        c1007r.zzf = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5626t(C1007r c1007r) {
        c1007r.zzd |= 32;
        c1007r.zzj = 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5627u(C1007r c1007r, int i) {
        c1007r.zzd |= 16;
        c1007r.zzi = i;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5628v(C1007r c1007r, zzjd zzjdVar) {
        c1007r.zzg = zzjdVar.zza();
        c1007r.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", smc.f61032c, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C1007r();
        }
        if (i2 == 4) {
            return new vnc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
