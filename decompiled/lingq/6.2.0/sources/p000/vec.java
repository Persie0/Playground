package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vec extends whb {
    private static final vec zzl;
    private static volatile ajb zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        vec vecVar = new vec();
        zzl = vecVar;
        whb.m23957n(vec.class, vecVar);
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
            return new ejb(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new vec();
        }
        if (i2 == 4) {
            return new k6c(zzl);
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
        synchronized (vec.class) {
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
}
