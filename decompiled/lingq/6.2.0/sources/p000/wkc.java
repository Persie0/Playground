package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wkc extends whb {
    private static final wkc zzg;
    private static volatile ajb zzh;
    private int zzb;
    private int zze;
    private lib zzf = pib.m19181h();

    static {
        wkc wkcVar = new wkc();
        zzg = wkcVar;
        whb.m23957n(wkc.class, wkcVar);
    }

    /* JADX INFO: renamed from: x */
    public static rkc m24031x() {
        return (rkc) zzg.m23965i();
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new wkc();
        }
        if (i2 == 4) {
            return new rkc(zzg);
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
        synchronized (wkc.class) {
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

    /* JADX INFO: renamed from: s */
    public final boolean m24032s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final int m24033t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final List m24034u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m24035v() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: w */
    public final long m24036w(int i) {
        return ((pib) this.zzf).m19182f(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m24037y(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: z */
    public final void m24038z(List list) {
        List list2 = this.zzf;
        if (!((chb) list2).f10103a) {
            int size = list2.size();
            this.zzf = ((pib) list2).mo10419Y(size + size);
        }
        bhb.m3724c(list, this.zzf);
    }
}
