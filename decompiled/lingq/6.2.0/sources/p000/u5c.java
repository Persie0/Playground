package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u5c extends whb {
    private static final u5c zzi;
    private static volatile ajb zzj;
    private int zzb;
    private u7c zze;
    private w6c zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        u5c u5cVar = new u5c();
        zzi = u5cVar;
        whb.m23957n(u5c.class, u5cVar);
    }

    /* JADX INFO: renamed from: A */
    public static u5c m22493A() {
        return zzi;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m22494B(String str) {
        this.zzb |= 8;
        this.zzh = str;
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new u5c();
        }
        if (i2 == 4) {
            return new q5c(zzi);
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
        synchronized (u5c.class) {
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
    public final boolean m22495s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final u7c m22496t() {
        u7c u7cVar = this.zze;
        return u7cVar == null ? u7c.m22522z() : u7cVar;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22497u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final w6c m22498v() {
        w6c w6cVar = this.zzf;
        return w6cVar == null ? w6c.m23781B() : w6cVar;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22499w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m22500x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m22501y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m22502z() {
        return this.zzh;
    }
}
