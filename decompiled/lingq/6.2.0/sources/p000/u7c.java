package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u7c extends whb {
    private static final u7c zzi;
    private static volatile ajb zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private mib zzh = djb.f35734e;

    static {
        u7c u7cVar = new u7c();
        zzi = u7cVar;
        whb.m23957n(u7c.class, u7cVar);
    }

    /* JADX INFO: renamed from: z */
    public static u7c m22522z() {
        return zzi;
    }

    /* JADX INFO: renamed from: A */
    public final int m22523A() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", wgb.f66804d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new u7c();
        }
        if (i2 == 4) {
            return new k6c(zzi);
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
        synchronized (u7c.class) {
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
    public final boolean m22524s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m22525t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final String m22526u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22527v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22528w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final mib m22529x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final int m22530y() {
        return this.zzh.size();
    }
}
