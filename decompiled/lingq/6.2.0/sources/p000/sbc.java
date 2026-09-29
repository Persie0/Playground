package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sbc extends whb {
    private static final sbc zze;
    private static volatile ajb zzf;
    private mib zzb = djb.f35734e;

    static {
        sbc sbcVar = new sbc();
        zze = sbcVar;
        whb.m23957n(sbc.class, sbcVar);
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
            return new ejb(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new sbc();
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
        synchronized (sbc.class) {
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
}
