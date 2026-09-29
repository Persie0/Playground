package p000;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l2d extends whb {
    private static final l2d zzj;
    private static volatile ajb zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.f11872b;
    private String zze = "";
    private zzacr zzf = zzacr.f11869b;
    private String zzg = "";

    static {
        l2d l2dVar = new l2d();
        zzj = l2dVar;
        whb.m23957n(l2d.class, l2dVar);
    }

    /* JADX INFO: renamed from: y */
    public static l2d m15750y(ghb ghbVar, phb phbVar) throws zzaeh {
        whb whbVarM23964h = zzj.m23964h();
        try {
            fjb fjbVarM4784a = cjb.f10181c.m4784a(whbVarM23964h.getClass());
            k80 k80Var = ghbVar.f40837c;
            if (k80Var == null) {
                k80Var = new k80(ghbVar);
            }
            fjbVarM4784a.mo11897f(whbVarM23964h, k80Var, phbVar);
            fjbVarM4784a.mo11892a(whbVarM23964h);
            whb.m23960q(whbVarM23964h);
            return (l2d) whbVarM23964h;
        } catch (zzaeh e) {
            if (e.f11871a) {
                throw new zzaeh(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.m5438a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new zzaeh(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: z */
    public static l2d m15751z() {
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
        if (i2 == 2) {
            return new ejb(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", j2d.f44985a});
        }
        if (i2 == 3) {
            return new l2d();
        }
        if (i2 == 4) {
            return new k6c(zzj);
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
        synchronized (l2d.class) {
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
    public final String m15752s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final zzacr m15753t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final String m15754u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final long m15755v() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: w */
    public final int m15756w() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: x */
    public final Map m15757x() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
