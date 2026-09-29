package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o8c extends whb {
    private static final o8c zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        o8c o8cVar = new o8c();
        zzg = o8cVar;
        whb.m23957n(o8c.class, o8cVar);
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
            u8c u8cVar = u8c.f63602c;
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", u8cVar, "zzf", u8cVar});
        }
        if (i2 == 3) {
            return new o8c();
        }
        int i3 = 4;
        if (i2 == 4) {
            return new k6c(i3);
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
        synchronized (o8c.class) {
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
    public final int m17858t() {
        int iM20034b = qma.m20034b(this.zze);
        if (iM20034b == 0) {
            return 1;
        }
        return iM20034b;
    }

    /* JADX INFO: renamed from: u */
    public final int m17859u() {
        int iM20034b = qma.m20034b(this.zzf);
        if (iM20034b == 0) {
            return 1;
        }
        return iM20034b;
    }
}
