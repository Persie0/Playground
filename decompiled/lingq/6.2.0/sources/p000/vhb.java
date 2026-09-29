package p000;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class vhb implements ajb {

    /* JADX INFO: renamed from: a */
    public final whb f65407a;

    static {
        phb phbVar = phb.f56224a;
        int i = dhb.f35664a;
    }

    public vhb(whb whbVar) {
        this.f65407a = whbVar;
    }

    /* JADX INFO: renamed from: a */
    public final whb m23288a(InputStream inputStream, phb phbVar) throws zzaeh {
        ghb ghbVarM12663h = ghb.m12663h(inputStream, 4096);
        int i = whb.zzd;
        whb whbVarM23964h = this.f65407a.m23964h();
        try {
            fjb fjbVarM4784a = cjb.f10181c.m4784a(whbVarM23964h.getClass());
            fjbVarM4784a.mo11897f(whbVarM23964h, k80.m14952B(ghbVarM12663h), phbVar);
            fjbVarM4784a.mo11892a(whbVarM23964h);
            ghbVarM12663h.mo5381m(0);
            if (whb.m23959p(whbVarM23964h, true)) {
                return whbVarM23964h;
            }
            throw new zzafy().m5438a();
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
}
