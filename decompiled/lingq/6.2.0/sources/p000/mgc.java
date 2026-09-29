package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mgc extends whb {
    private static final mgc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        mgc mgcVar = new mgc();
        zzg = mgcVar;
        whb.m23957n(mgc.class, mgcVar);
    }

    /* JADX INFO: renamed from: s */
    public static hgc m16831s() {
        return (hgc) zzg.m23965i();
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", wgb.f66805e, "zzf", wgb.f66806f});
        }
        if (i2 == 3) {
            return new mgc();
        }
        if (i2 == 4) {
            return new hgc(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzh;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (mgc.class) {
            try {
                vhbVar = zzh;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzg);
                    zzh = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: t */
    public final int m16832t() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: u */
    public final int m16833u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m16834v(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m16835w(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
