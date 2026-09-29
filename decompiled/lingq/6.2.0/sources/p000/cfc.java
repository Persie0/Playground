package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cfc extends whb {
    private static final cfc zzl;
    private static volatile ajb zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        cfc cfcVar = new cfc();
        zzl = cfcVar;
        whb.m23957n(cfc.class, cfcVar);
    }

    /* JADX INFO: renamed from: A */
    public static cfc m4609A() {
        return zzl;
    }

    /* JADX INFO: renamed from: z */
    public static zec m4611z() {
        return (zec) zzl.m23965i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m4612B(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m4613C(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m4614D(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4615E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4616F(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4617G(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4618H(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
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
            return new ejb(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new cfc();
        }
        if (i2 == 4) {
            return new zec();
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzm;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (cfc.class) {
            try {
                vhbVar = zzm;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzl);
                    zzm = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4619s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4620t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4621u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4622v() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4623w() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4624x() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4625y() {
        return this.zzk;
    }
}
