package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fcc extends whb {
    private static final fcc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        fcc fccVar = new fcc();
        zzg = fccVar;
        whb.m23957n(fcc.class, fccVar);
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new fcc();
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
        synchronized (fcc.class) {
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
}
