package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p5d extends whb {
    private static final p5d zzg;
    private static volatile ajb zzh;
    private int zzb;
    private mib zze = djb.f35734e;
    private String zzf = "";

    static {
        p5d p5dVar = new p5d();
        zzg = p5dVar;
        whb.m23957n(p5d.class, p5dVar);
    }

    /* JADX INFO: renamed from: t */
    public static p5d m18913t() {
        return zzg;
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new p5d();
        }
        if (i2 == 4) {
            return new m5d(zzg);
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
        synchronized (p5d.class) {
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
    public final List m18914s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final void m18915u(String str) {
        mib mibVar = this.zze;
        if (!((chb) mibVar).f10103a) {
            this.zze = g9a.m12432i(mibVar);
        }
        this.zze.add("");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m18916v(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
