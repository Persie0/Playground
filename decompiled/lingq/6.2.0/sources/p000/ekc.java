package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ekc extends whb {
    private static final ekc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze = 1;
    private mib zzf = djb.f35734e;

    static {
        ekc ekcVar = new ekc();
        zzg = ekcVar;
        whb.m23957n(ekc.class, ekcVar);
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", wgb.f66807g, "zzf", whc.class});
        }
        if (i2 == 3) {
            return new ekc();
        }
        if (i2 == 4) {
            return new k6c(15);
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
        synchronized (ekc.class) {
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
