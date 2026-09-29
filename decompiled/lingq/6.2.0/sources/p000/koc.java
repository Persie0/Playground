package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class koc extends whb {
    private static final koc zzk;
    private static volatile ajb zzl;
    private int zzb;
    private int zze;
    private mib zzf = djb.f35734e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        koc kocVar = new koc();
        zzk = kocVar;
        whb.m23957n(koc.class, kocVar);
    }

    /* JADX INFO: renamed from: A */
    public final int m15346A() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // p000.whb
    /* JADX INFO: renamed from: r */
    public final Object mo329r(int i) {
        ajb vhbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ejb(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", wgb.f66811k, "zzf", koc.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new koc();
        }
        if (i2 == 4) {
            return new k6c(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzl;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (koc.class) {
            try {
                vhbVar = zzl;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzk);
                    zzl = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m15347s() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: t */
    public final String m15348t() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15349u() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m15350v() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15351w() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m15352x() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m15353y() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final double m15354z() {
        return this.zzj;
    }
}
