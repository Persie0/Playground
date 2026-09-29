package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z4d extends whb {
    private static final z4d zzg;
    private static volatile ajb zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        z4d z4dVar = new z4d();
        zzg = z4dVar;
        whb.m23957n(z4d.class, z4dVar);
    }

    /* JADX INFO: renamed from: u */
    public static z4d m25464u() {
        return zzg;
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new z4d();
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
        synchronized (z4d.class) {
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
    public final String m25465s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final long m25466t() {
        return this.zzf;
    }
}
