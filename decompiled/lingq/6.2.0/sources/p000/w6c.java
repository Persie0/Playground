package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w6c extends whb {
    private static final w6c zzj;
    private static volatile ajb zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        w6c w6cVar = new w6c();
        zzj = w6cVar;
        whb.m23957n(w6c.class, w6cVar);
    }

    /* JADX INFO: renamed from: B */
    public static w6c m23781B() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final String m23782A() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: C */
    public final int m23783C() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", wgb.f66803c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new w6c();
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
        synchronized (w6c.class) {
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
    public final boolean m23784s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m23785t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m23786u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m23787v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m23788w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m23789x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final String m23790y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m23791z() {
        return (this.zzb & 16) != 0;
    }
}
