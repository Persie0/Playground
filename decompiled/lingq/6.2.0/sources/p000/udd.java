package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes.dex */
public final class udd extends whb {
    private static final udd zzj;
    private static volatile ajb zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private zzacr zzf = zzacr.f11869b;
    private String zzg = "";
    private mib zzi = djb.f35734e;

    static {
        udd uddVar = new udd();
        zzj = uddVar;
        whb.m23957n(udd.class, uddVar);
    }

    /* JADX INFO: renamed from: y */
    public static rdd m22702y() {
        return (rdd) zzj.m23965i();
    }

    /* JADX INFO: renamed from: z */
    public static udd m22703z() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m22704A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m22705B(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m22706C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m22707D(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: E */
    public final void m22708E(aed aedVar) {
        mib mibVar = this.zzi;
        if (!((chb) mibVar).f10103a) {
            this.zzi = g9a.m12432i(mibVar);
        }
        this.zzi.add(aedVar);
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
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", aed.class});
        }
        if (i2 == 3) {
            return new udd();
        }
        if (i2 == 4) {
            return new rdd();
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzk;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (udd.class) {
            try {
                vhbVar = zzk;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzj);
                    zzk = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final String m22709s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final zzacr m22710t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final String m22711u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final long m22712v() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: w */
    public final mib m22713w() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final int m22714x() {
        return this.zzi.size();
    }
}
