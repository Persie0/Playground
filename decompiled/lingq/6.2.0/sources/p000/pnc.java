package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pnc extends whb {
    private static final pnc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private mib zze = djb.f35734e;
    private pmc zzf;

    static {
        pnc pncVar = new pnc();
        zzg = pncVar;
        whb.m23957n(pnc.class, pncVar);
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", koc.class, "zzf"});
        }
        if (i2 == 3) {
            return new pnc();
        }
        if (i2 == 4) {
            return new k6c(18);
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
        synchronized (pnc.class) {
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
    public final List m19416s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final pmc m19417t() {
        pmc pmcVar = this.zzf;
        return pmcVar == null ? pmc.m19399u() : pmcVar;
    }
}
