package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mkc extends whb {
    private static final mkc zzh;
    private static volatile ajb zzi;
    private lib zzb = pib.m19181h();
    private lib zze = pib.m19181h();
    private mib zzf;
    private mib zzg;

    static {
        mkc mkcVar = new mkc();
        zzh = mkcVar;
        whb.m23957n(mkc.class, mkcVar);
    }

    public mkc() {
        djb djbVar = djb.f35734e;
        this.zzf = djbVar;
        this.zzg = djbVar;
    }

    /* JADX INFO: renamed from: A */
    public static ikc m16884A() {
        return (ikc) zzh.m23965i();
    }

    /* JADX INFO: renamed from: B */
    public static mkc m16885B() {
        return zzh;
    }

    /* JADX INFO: renamed from: C */
    public final void m16887C(Iterable iterable) {
        List list = this.zzb;
        if (!((chb) list).f10103a) {
            int size = list.size();
            this.zzb = ((pib) list).mo10419Y(size + size);
        }
        bhb.m3724c(iterable, this.zzb);
    }

    /* JADX INFO: renamed from: D */
    public final void m16888D() {
        this.zzb = pib.m19181h();
    }

    /* JADX INFO: renamed from: E */
    public final void m16889E(List list) {
        List list2 = this.zze;
        if (!((chb) list2).f10103a) {
            int size = list2.size();
            this.zze = ((pib) list2).mo10419Y(size + size);
        }
        bhb.m3724c(list, this.zze);
    }

    /* JADX INFO: renamed from: F */
    public final void m16890F() {
        this.zze = pib.m19181h();
    }

    /* JADX INFO: renamed from: G */
    public final void m16891G(ArrayList arrayList) {
        mib mibVar = this.zzf;
        if (!((chb) mibVar).f10103a) {
            this.zzf = g9a.m12432i(mibVar);
        }
        bhb.m3724c(arrayList, this.zzf);
    }

    /* JADX INFO: renamed from: H */
    public final void m16892H() {
        this.zzf = djb.f35734e;
    }

    /* JADX INFO: renamed from: I */
    public final void m16893I(Iterable iterable) {
        mib mibVar = this.zzg;
        if (!((chb) mibVar).f10103a) {
            this.zzg = g9a.m12432i(mibVar);
        }
        bhb.m3724c(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: J */
    public final void m16894J() {
        this.zzg = djb.f35734e;
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
            return new ejb(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", fhc.class, "zzg", wkc.class});
        }
        if (i2 == 3) {
            return new mkc();
        }
        if (i2 == 4) {
            return new ikc();
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
        synchronized (mkc.class) {
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

    /* JADX INFO: renamed from: s */
    public final List m16895s() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: t */
    public final int m16896t() {
        return this.zzb.size();
    }

    /* JADX INFO: renamed from: u */
    public final List m16897u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m16898v() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: w */
    public final mib m16899w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final int m16900x() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: y */
    public final mib m16901y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final int m16902z() {
        return this.zzg.size();
    }
}
