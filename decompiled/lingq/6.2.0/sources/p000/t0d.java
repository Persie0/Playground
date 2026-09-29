package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t0d extends whb {
    private static final t0d zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        t0d t0dVar = new t0d();
        zzg = t0dVar;
        whb.m23957n(t0d.class, t0dVar);
    }

    /* JADX INFO: renamed from: s */
    public static q0d m21812s() {
        return (q0d) zzg.m23965i();
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new t0d();
        }
        if (i2 == 4) {
            return new q0d(zzg);
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
        synchronized (t0d.class) {
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
    public final /* synthetic */ void m21813t(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m21814u(int i) {
        if (i == 1) {
            C3386nv.m17626m("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
