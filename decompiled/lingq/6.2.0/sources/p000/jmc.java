package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jmc extends whb {
    private static final jmc zzk;
    private static volatile ajb zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        jmc jmcVar = new jmc();
        zzk = jmcVar;
        whb.m23957n(jmc.class, jmcVar);
    }

    /* JADX INFO: renamed from: D */
    public static emc m14536D() {
        return (emc) zzk.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final float m14537A() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m14538B() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final double m14539C() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m14540E(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m14541F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m14542G(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14543H() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m14544I(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m14545J() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m14546K(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m14547L() {
        this.zzb &= -33;
        this.zzj = 0.0d;
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
            return new ejb(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new jmc();
        }
        if (i2 == 4) {
            return new emc(zzk);
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
        synchronized (jmc.class) {
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
    public final boolean m14548s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final long m14549t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final String m14550u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m14551v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m14552w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m14553x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final long m14554y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m14555z() {
        return (this.zzb & 16) != 0;
    }
}
