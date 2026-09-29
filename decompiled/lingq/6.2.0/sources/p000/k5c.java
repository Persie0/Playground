package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k5c extends whb {
    private static final k5c zzm;
    private static volatile ajb zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private mib zzg = djb.f35734e;
    private boolean zzh;
    private w6c zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        k5c k5cVar = new k5c();
        zzm = k5cVar;
        whb.m23957n(k5c.class, k5cVar);
    }

    /* JADX INFO: renamed from: E */
    public static d5c m14861E() {
        return (d5c) zzm.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m14862A() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m14863B() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m14864C() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m14865D() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m14866F(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m14867G(int i, u5c u5cVar) {
        mib mibVar = this.zzg;
        if (!((chb) mibVar).f10103a) {
            this.zzg = g9a.m12432i(mibVar);
        }
        this.zzg.set(i, u5cVar);
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
            return new ejb(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", u5c.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new k5c();
        }
        if (i2 == 4) {
            return new d5c(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzn;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (k5c.class) {
            try {
                vhbVar = zzn;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzm);
                    zzn = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m14868s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m14869t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final String m14870u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final List m14871v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final int m14872w() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: x */
    public final u5c m14873x(int i) {
        return (u5c) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m14874y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final w6c m14875z() {
        w6c w6cVar = this.zzi;
        return w6cVar == null ? w6c.m23781B() : w6cVar;
    }
}
