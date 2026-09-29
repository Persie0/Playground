package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class x0d extends whb {
    private static final x0d zzh;
    private static volatile ajb zzi;
    private int zzb;
    private t0d zzf;
    private String zze = "";
    private String zzg = "";

    static {
        x0d x0dVar = new x0d();
        zzh = x0dVar;
        whb.m23957n(x0d.class, x0dVar);
    }

    /* JADX INFO: renamed from: t */
    public static k0d m24230t() {
        return (k0d) zzh.m23965i();
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
            return new ejb(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new x0d();
        }
        if (i2 == 4) {
            return new k0d(zzh);
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
        synchronized (x0d.class) {
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
    public final String m24231s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m24232u(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m24233v(t0d t0dVar) {
        this.zzf = t0dVar;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m24234w(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
