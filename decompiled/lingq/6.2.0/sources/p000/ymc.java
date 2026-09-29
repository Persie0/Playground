package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ymc extends whb {
    private static final ymc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private String zze = "";
    private mib zzf = djb.f35734e;

    static {
        ymc ymcVar = new ymc();
        zzg = ymcVar;
        whb.m23957n(ymc.class, ymcVar);
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", koc.class});
        }
        if (i2 == 3) {
            return new ymc();
        }
        if (i2 == 4) {
            return new k6c(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzh;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (ymc.class) {
            try {
                vhbVar = zzh;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzg);
                    zzh = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final String m25202s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final List m25203t() {
        return this.zzf;
    }
}
