package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lfc extends whb {
    private static final lfc zzi;
    private static volatile ajb zzj;
    private int zzb;
    private int zze;
    private mkc zzf;
    private mkc zzg;
    private boolean zzh;

    static {
        lfc lfcVar = new lfc();
        zzi = lfcVar;
        whb.m23957n(lfc.class, lfcVar);
    }

    /* JADX INFO: renamed from: z */
    public static hfc m16165z() {
        return (hfc) zzi.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m16166A(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m16167B(mkc mkcVar) {
        this.zzf = mkcVar;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m16168C(mkc mkcVar) {
        this.zzg = mkcVar;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m16169D(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new lfc();
        }
        if (i2 == 4) {
            return new hfc();
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
        synchronized (lfc.class) {
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
    public final boolean m16170s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m16171t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final mkc m16172u() {
        mkc mkcVar = this.zzf;
        return mkcVar == null ? mkc.m16885B() : mkcVar;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m16173v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final mkc m16174w() {
        mkc mkcVar = this.zzg;
        return mkcVar == null ? mkc.m16885B() : mkcVar;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m16175x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m16176y() {
        return this.zzh;
    }
}
