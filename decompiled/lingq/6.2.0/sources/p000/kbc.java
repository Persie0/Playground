package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kbc extends whb {
    private static final kbc zzw;
    private static volatile ajb zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private mib zzh;
    private mib zzi;
    private mib zzj;
    private String zzk;
    private boolean zzl;
    private mib zzm;
    private mib zzn;
    private String zzo;
    private String zzp;
    private hac zzq;
    private bcc zzr;
    private cdc zzs;
    private fcc zzt;
    private sbc zzu;
    private hib zzv;

    static {
        kbc kbcVar = new kbc();
        zzw = kbcVar;
        whb.m23957n(kbc.class, kbcVar);
    }

    public kbc() {
        djb djbVar = djb.f35734e;
        this.zzh = djbVar;
        this.zzi = djbVar;
        this.zzj = djbVar;
        this.zzk = "";
        this.zzm = djbVar;
        this.zzn = djbVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = xhb.f68225e;
    }

    /* JADX INFO: renamed from: J */
    public static ebc m15059J() {
        return (ebc) zzw.m23965i();
    }

    /* JADX INFO: renamed from: K */
    public static kbc m15060K() {
        return zzw;
    }

    /* JADX INFO: renamed from: A */
    public final mib m15061A() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: B */
    public final int m15062B() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: C */
    public final mib m15063C() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: D */
    public final String m15064D() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m15065E() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final hac m15066F() {
        hac hacVar = this.zzq;
        return hacVar == null ? hac.m13158y() : hacVar;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m15067G() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final cdc m15068H() {
        cdc cdcVar = this.zzs;
        return cdcVar == null ? cdc.m4565u() : cdcVar;
    }

    /* JADX INFO: renamed from: I */
    public final hib m15069I() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: L */
    public final void m15070L(int i, zac zacVar) {
        mib mibVar = this.zzi;
        if (!((chb) mibVar).f10103a) {
            this.zzi = g9a.m12432i(mibVar);
        }
        this.zzi.set(i, zacVar);
    }

    /* JADX INFO: renamed from: M */
    public final void m15071M() {
        this.zzj = djb.f35734e;
    }

    /* JADX INFO: renamed from: N */
    public final void m15072N() {
        this.zzm = djb.f35734e;
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
            return new ejb(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", tcc.class, "zzi", zac.class, "zzj", x4c.class, "zzk", "zzl", "zzm", pnc.class, "zzn", pac.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new kbc();
        }
        if (i2 == 4) {
            return new ebc(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzx;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (kbc.class) {
            try {
                vhbVar = zzx;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzw);
                    zzx = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15073s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final long m15074t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15075u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m15076v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final mib m15077w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final int m15078x() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: y */
    public final zac m15079y(int i) {
        return (zac) this.zzi.get(i);
    }

    /* JADX INFO: renamed from: z */
    public final List m15080z() {
        return this.zzj;
    }
}
