package p000;

import com.google.android.gms.internal.measurement.zzaew;

/* JADX INFO: loaded from: classes2.dex */
public final class w5d extends whb {
    private static final w5d zze;
    private static volatile ajb zzf;
    private zzaew zzb = zzaew.f11872b;

    static {
        w5d w5dVar = new w5d();
        zze = w5dVar;
        whb.m23957n(w5d.class, w5dVar);
    }

    /* JADX INFO: renamed from: t */
    public static w5d m23768t() {
        return zze;
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
            return new ejb(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", s5d.f60394a});
        }
        if (i2 == 3) {
            return new w5d();
        }
        if (i2 == 4) {
            return new u5d(zze);
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
        synchronized (w5d.class) {
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
    public final p5d m23769s(String str, p5d p5dVar) {
        str.getClass();
        p5d p5dVar2 = (p5d) this.zzb.get(str);
        return p5dVar2 != null ? p5dVar2 : p5dVar;
    }

    /* JADX INFO: renamed from: u */
    public final zzaew m23770u() {
        zzaew zzaewVar = this.zzb;
        if (!zzaewVar.f11873a) {
            this.zzb = zzaewVar.m5436a();
        }
        return this.zzb;
    }
}
