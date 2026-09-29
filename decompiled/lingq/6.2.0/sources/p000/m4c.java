package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m4c extends whb {
    private static final m4c zzi;
    private static volatile ajb zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        m4c m4cVar = new m4c();
        zzi = m4cVar;
        whb.m23957n(m4c.class, m4cVar);
    }

    /* JADX INFO: renamed from: s */
    public static h4c m16622s() {
        return (h4c) zzi.m23965i();
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new m4c();
        }
        if (i2 == 4) {
            return new h4c();
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
        synchronized (m4c.class) {
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

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m16624t(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m16625u() {
        this.zzb |= 2;
        this.zzf = true;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m16626v(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m16627w(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
