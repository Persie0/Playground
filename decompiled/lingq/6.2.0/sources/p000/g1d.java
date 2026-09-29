package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final class g1d extends whb {
    private static final g1d zzl;
    private static volatile ajb zzm;
    private int zzb;
    private String zze = "";
    private zzacr zzf = zzacr.f11869b;
    private String zzg = "";
    private mib zzh;
    private mib zzi;
    private boolean zzj;
    private long zzk;

    static {
        g1d g1dVar = new g1d();
        zzl = g1dVar;
        whb.m23957n(g1d.class, g1dVar);
    }

    public g1d() {
        djb djbVar = djb.f35734e;
        this.zzh = djbVar;
        this.zzi = djbVar;
    }

    /* JADX INFO: renamed from: y */
    public static c1d m12284y() {
        return (c1d) zzl.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m12285A(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m12286B(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: C */
    public final void m12287C(o1d o1dVar) {
        mib mibVar = this.zzh;
        if (!((chb) mibVar).f10103a) {
            this.zzh = g9a.m12432i(mibVar);
        }
        this.zzh.add(o1dVar);
    }

    /* JADX INFO: renamed from: D */
    public final void m12288D(String str) {
        str.getClass();
        mib mibVar = this.zzi;
        if (!((chb) mibVar).f10103a) {
            this.zzi = g9a.m12432i(mibVar);
        }
        this.zzi.add(str);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m12289E(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12290F(long j) {
        this.zzb |= 16;
        this.zzk = j;
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
            return new ejb(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", o1d.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new g1d();
        }
        if (i2 == 4) {
            return new c1d(zzl);
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
        synchronized (g1d.class) {
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
    public final String m12291s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m12292t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final zzacr m12293u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final String m12294v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final mib m12295w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final long m12296x() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m12297z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
