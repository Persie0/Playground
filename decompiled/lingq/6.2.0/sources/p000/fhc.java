package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fhc extends whb {
    private static final fhc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        fhc fhcVar = new fhc();
        zzg = fhcVar;
        whb.m23957n(fhc.class, fhcVar);
    }

    /* JADX INFO: renamed from: w */
    public static bhc m11831w() {
        return (bhc) zzg.m23965i();
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new fhc();
        }
        if (i2 == 4) {
            return new bhc(zzg);
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
        synchronized (fhc.class) {
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
    public final boolean m11832s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m11833t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11834u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final long m11835v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11836x(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11837y(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}
