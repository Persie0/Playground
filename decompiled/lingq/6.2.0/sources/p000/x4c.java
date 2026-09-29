package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x4c extends whb {
    private static final x4c zzj;
    private static volatile ajb zzk;
    private int zzb;
    private int zze;
    private mib zzf;
    private mib zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        x4c x4cVar = new x4c();
        zzj = x4cVar;
        whb.m23957n(x4c.class, x4cVar);
    }

    public x4c() {
        djb djbVar = djb.f35734e;
        this.zzf = djbVar;
        this.zzg = djbVar;
    }

    /* JADX INFO: renamed from: A */
    public final void m24274A(int i, f7c f7cVar) {
        mib mibVar = this.zzf;
        if (!((chb) mibVar).f10103a) {
            this.zzf = g9a.m12432i(mibVar);
        }
        this.zzf.set(i, f7cVar);
    }

    /* JADX INFO: renamed from: B */
    public final void m24275B(int i, k5c k5cVar) {
        mib mibVar = this.zzg;
        if (!((chb) mibVar).f10103a) {
            this.zzg = g9a.m12432i(mibVar);
        }
        this.zzg.set(i, k5cVar);
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
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", f7c.class, "zzg", k5c.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new x4c();
        }
        if (i2 == 4) {
            return new q4c();
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
        synchronized (x4c.class) {
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
    public final boolean m24276s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m24277t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final List m24278u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m24279v() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: w */
    public final f7c m24280w(int i) {
        return (f7c) this.zzf.get(i);
    }

    /* JADX INFO: renamed from: x */
    public final mib m24281x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final int m24282y() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: z */
    public final k5c m24283z(int i) {
        return (k5c) this.zzg.get(i);
    }
}
