package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f7c extends whb {
    private static final f7c zzk;
    private static volatile ajb zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private u5c zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        f7c f7cVar = new f7c();
        zzk = f7cVar;
        whb.m23957n(f7c.class, f7cVar);
    }

    /* JADX INFO: renamed from: A */
    public static a7c m11580A() {
        return (a7c) zzk.m23965i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m11581B(String str) {
        this.zzb |= 2;
        this.zzf = str;
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
            return new ejb(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new f7c();
        }
        if (i2 == 4) {
            return new a7c(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzl;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (f7c.class) {
            try {
                vhbVar = zzl;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzk);
                    zzl = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11582s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m11583t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final String m11584u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final u5c m11585v() {
        u5c u5cVar = this.zzg;
        return u5cVar == null ? u5c.m22493A() : u5cVar;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11586w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11587x() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11588y() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m11589z() {
        return this.zzj;
    }
}
