package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final class o1d extends whb {
    private static final o1d zzh;
    private static volatile ajb zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        o1d o1dVar = new o1d();
        zzh = o1dVar;
        whb.m23957n(o1d.class, o1dVar);
    }

    /* JADX INFO: renamed from: y */
    public static l1d m17754y() {
        return (l1d) zzh.m23965i();
    }

    /* JADX INFO: renamed from: z */
    public static o1d m17755z() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m17756A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m17757B(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m17758C(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m17759D(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m17760E(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m17761F(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 5;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: G */
    public final int m17762G() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
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
            return new ejb(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new o1d();
        }
        if (i2 == 4) {
            return new l1d(zzh);
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
        synchronized (o1d.class) {
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
    public final String m17763s() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final long m17764t() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17765u() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final double m17766v() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: w */
    public final String m17767w() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: x */
    public final zzacr m17768x() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.f11869b;
    }
}
