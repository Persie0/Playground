package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zac extends whb {
    private static final zac zzi;
    private static volatile ajb zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zac zacVar = new zac();
        zzi = zacVar;
        whb.m23957n(zac.class, zacVar);
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zac();
        }
        if (i2 == 4) {
            return new uac(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzj;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (zac.class) {
            try {
                vhbVar = zzj;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzi);
                    zzj = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final String m25528s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25529t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m25530u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25531v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m25532w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m25533x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final int m25534y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m25535z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
