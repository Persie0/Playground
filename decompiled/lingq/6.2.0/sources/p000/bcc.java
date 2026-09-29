package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bcc extends whb {
    private static final bcc zzj;
    private static volatile ajb zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        bcc bccVar = new bcc();
        zzj = bccVar;
        whb.m23957n(bcc.class, bccVar);
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
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new bcc();
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
        synchronized (bcc.class) {
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
}
