package p000;

import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzacr;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n4d extends whb {
    private static final iib zzl = new gr7(29);
    private static final n4d zzq;
    private static volatile ajb zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private mib zzi;
    private mib zzj;
    private hib zzk;
    private z4d zzm;
    private boolean zzn;
    private boolean zzo;
    private f4d zzp;
    private zzacr zze = zzacr.f11869b;
    private String zzg = "";

    static {
        n4d n4dVar = new n4d();
        zzq = n4dVar;
        whb.m23957n(n4d.class, n4dVar);
    }

    public n4d() {
        djb djbVar = djb.f35734e;
        this.zzi = djbVar;
        this.zzj = djbVar;
        this.zzk = xhb.f68225e;
    }

    /* JADX INFO: renamed from: F */
    public static k4d m17211F() {
        return (k4d) zzq.m23965i();
    }

    /* JADX INFO: renamed from: G */
    public static n4d m17212G() {
        return zzq;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17214A() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final z4d m17215B() {
        z4d z4dVar = this.zzm;
        return z4dVar == null ? z4d.m25464u() : z4dVar;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m17216C() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m17217D() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: E */
    public final f4d m17218E() {
        f4d f4dVar = this.zzp;
        return f4dVar == null ? f4d.m11531t() : f4dVar;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m17219H(long j) {
        this.zzb |= 8;
        this.zzh = j;
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
            return new ejb(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzabz.zzc(), "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new n4d();
        }
        if (i2 == 4) {
            return new k4d();
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzr;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (n4d.class) {
            try {
                vhbVar = zzr;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzq);
                    zzr = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17220s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final zzacr m17221t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17222u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final String m17223v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final long m17224w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final mib m17225x() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: y */
    public final mib m17226y() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: z */
    public final List m17227z() {
        return new jib(this.zzk, zzl);
    }
}
