package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cdc extends whb {
    private static final cdc zzj;
    private static volatile ajb zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        cdc cdcVar = new cdc();
        zzj = cdcVar;
        whb.m23957n(cdc.class, cdcVar);
    }

    /* JADX INFO: renamed from: u */
    public static cdc m4565u() {
        return zzj;
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
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new cdc();
        }
        if (i2 == 4) {
            return new k6c(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzk;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (cdc.class) {
            try {
                vhbVar = zzk;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzj);
                    zzk = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final int m4566s() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: t */
    public final String m4567t() {
        return this.zzi;
    }
}
