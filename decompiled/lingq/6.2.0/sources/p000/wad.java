package p000;

import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class wad extends whb {
    private static final wad zzl;
    private static volatile ajb zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private mib zzg = djb.f35734e;

    static {
        wad wadVar = new wad();
        zzl = wadVar;
        whb.m23957n(wad.class, wadVar);
    }

    /* JADX INFO: renamed from: v */
    public static wad m23826v(InputStream inputStream, phb phbVar) throws zzaeh {
        wad wadVar = zzl;
        ghb ghbVarM12663h = ghb.m12663h(inputStream, 4096);
        whb whbVarM23964h = wadVar.m23964h();
        try {
            fjb fjbVarM4784a = cjb.f10181c.m4784a(whbVarM23964h.getClass());
            k80 k80Var = ghbVarM12663h.f40837c;
            if (k80Var == null) {
                k80Var = new k80(ghbVarM12663h);
            }
            fjbVarM4784a.mo11897f(whbVarM23964h, k80Var, phbVar);
            fjbVarM4784a.mo11892a(whbVarM23964h);
            whb.m23960q(whbVarM23964h);
            return (wad) whbVarM23964h;
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

    @Override // p000.whb
    /* JADX INFO: renamed from: r */
    public final Object mo329r(int i) {
        ajb vhbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ejb(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzabz.zzc(), "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new wad();
        }
        if (i2 == 4) {
            return new k6c(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzm;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (wad.class) {
            try {
                vhbVar = zzm;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzl);
                    zzm = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final String m23827s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m23828t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final void m23829u() {
        zzabz.zzb(this.zzh);
    }
}
