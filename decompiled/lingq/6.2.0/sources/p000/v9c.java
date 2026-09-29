package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v9c extends whb {
    private static final v9c zzg;
    private static volatile ajb zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        v9c v9cVar = new v9c();
        zzg = v9cVar;
        whb.m23957n(v9c.class, v9cVar);
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
            return new v9c();
        }
        int i3 = 5;
        if (i2 == 4) {
            return new k6c(i3);
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
        synchronized (v9c.class) {
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
    public final String m23198s() {
        return this.zze;
    }
}
