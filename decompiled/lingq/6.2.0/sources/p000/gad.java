package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gad extends whb {
    private static final gad zze;
    private static volatile ajb zzf;
    private mib zzb = djb.f35734e;

    static {
        gad gadVar = new gad();
        zze = gadVar;
        whb.m23957n(gad.class, gadVar);
    }

    /* JADX INFO: renamed from: t */
    public static gad m12454t(byte[] bArr, phb phbVar) {
        return (gad) whb.m23955d(zze, bArr, phbVar);
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
            return new ejb(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new gad();
        }
        if (i2 == 4) {
            return new k6c(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzf;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (gad.class) {
            try {
                vhbVar = zzf;
                if (vhbVar == null) {
                    vhbVar = new vhb(zze);
                    zzf = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m12455s() {
        return this.zzb;
    }
}
