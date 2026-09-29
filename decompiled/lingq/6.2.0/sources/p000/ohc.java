package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ohc extends whb {
    private static final ohc zzm;
    private static volatile ajb zzn;
    private int zzb;
    private mib zze = djb.f35734e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        ohc ohcVar = new ohc();
        zzm = ohcVar;
        whb.m23957n(ohc.class, ohcVar);
    }

    /* JADX INFO: renamed from: I */
    public static khc m18002I() {
        return (khc) zzm.m23965i();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18003A() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final long m18004B() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18005C() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m18006D() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m18007E() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final long m18008F() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m18009G() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final long m18010H() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m18011J(int i, fic ficVar) {
        m18022t();
        this.zze.set(i, ficVar);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m18012K(fic ficVar) {
        ficVar.getClass();
        m18022t();
        this.zze.add(ficVar);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m18013L(Iterable iterable) {
        m18022t();
        bhb.m3724c(iterable, this.zze);
    }

    /* JADX INFO: renamed from: M */
    public final void m18014M() {
        this.zze = djb.f35734e;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m18015N(int i) {
        m18022t();
        this.zze.remove(i);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m18016O(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m18017P(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m18018Q(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m18019R(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m18020S(long j) {
        this.zzb |= 32;
        this.zzk = j;
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
            return new ejb(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", fic.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new ohc();
        }
        if (i2 == 4) {
            return new khc(zzm);
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
        synchronized (ohc.class) {
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
    public final /* synthetic */ void m18021s(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: t */
    public final void m18022t() {
        mib mibVar = this.zze;
        if (((chb) mibVar).f10103a) {
            return;
        }
        this.zze = g9a.m12432i(mibVar);
    }

    /* JADX INFO: renamed from: u */
    public final List m18023u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m18024v() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: w */
    public final fic m18025w(int i) {
        return (fic) this.zze.get(i);
    }

    /* JADX INFO: renamed from: x */
    public final String m18026x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m18027y() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final long m18028z() {
        return this.zzg;
    }
}
