package p000;

import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final class s4d extends whb {
    private static final s4d zzo;
    private static volatile ajb zzp;
    private int zzb;
    private boolean zzf;
    private mib zzh;
    private mib zzi;
    private hib zzj;
    private z4d zzk;
    private boolean zzl;
    private boolean zzm;
    private f4d zzn;
    private zzacr zze = zzacr.f11869b;
    private String zzg = "";

    static {
        s4d s4dVar = new s4d();
        zzo = s4dVar;
        whb.m23957n(s4d.class, s4dVar);
    }

    public s4d() {
        djb djbVar = djb.f35734e;
        this.zzh = djbVar;
        this.zzi = djbVar;
        this.zzj = xhb.f68225e;
    }

    /* JADX INFO: renamed from: s */
    public static s4d m21079s() {
        return zzo;
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
            return new ejb(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzabz.zzc(), "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new s4d();
        }
        if (i2 == 4) {
            return new k6c(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzp;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (s4d.class) {
            try {
                vhbVar = zzp;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzo);
                    zzp = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }
}
