package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fic extends whb {
    private static final fic zzk;
    private static volatile ajb zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private mib zzj = djb.f35734e;

    static {
        fic ficVar = new fic();
        zzk = ficVar;
        whb.m23957n(fic.class, ficVar);
    }

    /* JADX INFO: renamed from: E */
    public static aic m11861E() {
        return (aic) zzk.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m11862A() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final double m11863B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: C */
    public final mib m11864C() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: D */
    public final int m11865D() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m11866F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m11867G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m11868H() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m11869I(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m11870J() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m11871K(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m11872L() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: M */
    public final void m11873M(fic ficVar) {
        mib mibVar = this.zzj;
        if (!((chb) mibVar).f10103a) {
            this.zzj = g9a.m12432i(mibVar);
        }
        this.zzj.add(ficVar);
    }

    /* JADX INFO: renamed from: N */
    public final void m11874N(ArrayList arrayList) {
        mib mibVar = this.zzj;
        if (!((chb) mibVar).f10103a) {
            this.zzj = g9a.m12432i(mibVar);
        }
        bhb.m3724c(arrayList, this.zzj);
    }

    /* JADX INFO: renamed from: O */
    public final void m11875O() {
        this.zzj = djb.f35734e;
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
            return new ejb(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", fic.class});
        }
        if (i2 == 3) {
            return new fic();
        }
        if (i2 == 4) {
            return new aic(zzk);
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
        synchronized (fic.class) {
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
    public final boolean m11876s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final String m11877t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11878u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m11879v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11880w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final long m11881x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11882y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final float m11883z() {
        return this.zzh;
    }
}
