package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b8c extends whb {
    private static final b8c zzh;
    private static volatile ajb zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        b8c b8cVar = new b8c();
        zzh = b8cVar;
        whb.m23957n(b8c.class, b8cVar);
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
            return new ejb(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", u8c.f63602c, "zzf", u8c.f63601b, "zzg", u8c.f63603d});
        }
        int i3 = 3;
        if (i2 == 3) {
            return new b8c();
        }
        if (i2 == 4) {
            return new k6c(i3);
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
        synchronized (b8c.class) {
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

    /* JADX INFO: renamed from: t */
    public final int m3484t() {
        int iM20034b = qma.m20034b(this.zze);
        if (iM20034b == 0) {
            return 1;
        }
        return iM20034b;
    }

    /* JADX INFO: renamed from: u */
    public final int m3485u() {
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
    public final int m3486v() {
        int iM19076b = pdd.m19076b(this.zzg);
        if (iM19076b == 0) {
            return 1;
        }
        return iM19076b;
    }
}
