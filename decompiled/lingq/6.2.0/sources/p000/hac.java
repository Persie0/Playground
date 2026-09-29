package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hac extends whb {
    private static final hac zzj;
    private static volatile ajb zzk;
    private int zzb;
    private mib zze;
    private mib zzf;
    private mib zzg;
    private boolean zzh;
    private mib zzi;

    static {
        hac hacVar = new hac();
        zzj = hacVar;
        whb.m23957n(hac.class, hacVar);
    }

    public hac() {
        djb djbVar = djb.f35734e;
        this.zze = djbVar;
        this.zzf = djbVar;
        this.zzg = djbVar;
        this.zzi = djbVar;
    }

    /* JADX INFO: renamed from: y */
    public static hac m13158y() {
        return zzj;
    }

    @Override // p000.whb
    /* JADX INFO: renamed from: r */
    public final Object mo329r(int i) {
        ajb vhbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 2;
        if (i2 == 2) {
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", b8c.class, "zzf", o8c.class, "zzg", v9c.class, "zzh", "zzi", b8c.class});
        }
        if (i2 == 3) {
            return new hac();
        }
        if (i2 == 4) {
            return new k6c(i3);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzk;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (hac.class) {
            try {
                vhbVar = zzk;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzj);
                    zzk = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m13160s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final List m13161t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final List m13162u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13163v() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13164w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final mib m13165x() {
        return this.zzi;
    }
}
