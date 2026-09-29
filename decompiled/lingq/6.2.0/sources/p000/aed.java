package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final class aed extends whb {
    private static final aed zzh;
    private static volatile ajb zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        aed aedVar = new aed();
        zzh = aedVar;
        whb.m23957n(aed.class, aedVar);
    }

    /* JADX INFO: renamed from: y */
    public static xdd m322y() {
        return (xdd) zzh.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m323A(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m324B(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m325C(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m326D(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m327E(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 6;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: F */
    public final int m328F() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
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
            return new ejb(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new aed();
        }
        if (i2 == 4) {
            return new xdd(zzh);
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
        synchronized (aed.class) {
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
    public final String m330s() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final long m331t() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m332u() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final double m333v() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: w */
    public final String m334w() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: x */
    public final zzacr m335x() {
        return this.zze == 6 ? (zzacr) this.zzf : zzacr.f11869b;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m336z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }
}
