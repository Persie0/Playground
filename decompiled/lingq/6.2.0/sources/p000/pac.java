package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pac extends whb {
    private static final pac zzh;
    private static volatile ajb zzi;
    private int zzb;
    private String zze = "";
    private mib zzf = djb.f35734e;
    private boolean zzg;

    static {
        pac pacVar = new pac();
        zzh = pacVar;
        whb.m23957n(pac.class, pacVar);
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
            return new ejb(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", fcc.class, "zzg"});
        }
        if (i2 == 3) {
            return new pac();
        }
        int i3 = 6;
        if (i2 == 4) {
            return new k6c(i3);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzi;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (pac.class) {
            try {
                vhbVar = zzi;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzh);
                    zzi = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final String m19010s() {
        return this.zze;
    }
}
