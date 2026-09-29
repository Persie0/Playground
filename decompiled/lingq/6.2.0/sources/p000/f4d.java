package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f4d extends whb {
    private static final f4d zzf;
    private static volatile ajb zzg;
    private int zzb;
    private boolean zze;

    static {
        f4d f4dVar = new f4d();
        zzf = f4dVar;
        whb.m23957n(f4d.class, f4dVar);
    }

    /* JADX INFO: renamed from: t */
    public static f4d m11531t() {
        return zzf;
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
            return new ejb(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new f4d();
        }
        if (i2 == 4) {
            return new k6c(21);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzg;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (f4d.class) {
            try {
                vhbVar = zzg;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzf);
                    zzg = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11533s() {
        return this.zze;
    }
}
