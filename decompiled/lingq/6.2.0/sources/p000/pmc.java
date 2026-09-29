package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pmc extends whb {
    private static final pmc zze;
    private static volatile ajb zzf;
    private mib zzb = djb.f35734e;

    static {
        pmc pmcVar = new pmc();
        zze = pmcVar;
        whb.m23957n(pmc.class, pmcVar);
    }

    /* JADX INFO: renamed from: u */
    public static pmc m19399u() {
        return zze;
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
            return new ejb(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", ymc.class});
        }
        if (i2 == 3) {
            return new pmc();
        }
        if (i2 == 4) {
            return new k6c(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzf;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (pmc.class) {
            try {
                vhbVar = zzf;
                if (vhbVar == null) {
                    vhbVar = new vhb(zze);
                    zzf = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m19400s() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: t */
    public final int m19401t() {
        return this.zzb.size();
    }
}
