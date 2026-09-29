package p000;

import com.google.android.gms.internal.measurement.zzin;

/* JADX INFO: loaded from: classes.dex */
public final class amc extends whb {
    private static final amc zzh;
    private static volatile ajb zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        amc amcVar = new amc();
        zzh = amcVar;
        whb.m23957n(amc.class, amcVar);
    }

    /* JADX INFO: renamed from: t */
    public static alc m580t() {
        return (alc) zzh.m23965i();
    }

    /* JADX INFO: renamed from: u */
    public static amc m581u() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m583A(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
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
            return new ejb(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", wgb.f66810j, "zzf", wgb.f66808h, "zzg", wgb.f66809i});
        }
        if (i2 == 3) {
            return new amc();
        }
        if (i2 == 4) {
            return new alc();
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
        synchronized (amc.class) {
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
    public final zzin m584s() {
        zzin zzinVarZzb = zzin.zzb(this.zzf);
        return zzinVarZzb == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarZzb;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m585v(zzin zzinVar) {
        this.zzf = zzinVar.zza();
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: x */
    public final int m586x() {
        int iM10317c = ded.m10317c(this.zze);
        if (iM10317c == 0) {
            return 1;
        }
        return iM10317c;
    }

    /* JADX INFO: renamed from: y */
    public final int m587y() {
        int iM4604b = ced.m4604b(this.zzg);
        if (iM4604b == 0) {
            return 1;
        }
        return iM4604b;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m588z(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
