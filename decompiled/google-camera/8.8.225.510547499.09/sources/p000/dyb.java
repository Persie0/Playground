package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyb implements dxy {

    /* JADX INFO: renamed from: a */
    private static final nbh f12867a = nbh.m17259h("com/google/android/apps/camera/framestore/PerOneCameraFrameStoreResourceControllerImpl");

    /* JADX INFO: renamed from: b */
    private final dxx f12868b;

    /* JADX INFO: renamed from: c */
    private final imu f12869c;

    /* JADX INFO: renamed from: d */
    private final Map f12870d = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f12871e = true;

    /* JADX INFO: renamed from: f */
    private dya f12872f;

    public dyb(dxx dxxVar, imu imuVar) {
        this.f12868b = dxxVar;
        this.f12869c = imuVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kba m6915b(dxr dxrVar, Executor executor) {
        this.f12870d.put(dxrVar, executor);
        return new cic(this, dxrVar, 19);
    }

    @Override // p000.dxy
    /* JADX INFO: renamed from: bP */
    public final void mo6891bP(gsr gsrVar) {
        if (this.f12871e) {
            dya dyaVar = new dya(this.f12868b, this.f12869c);
            this.f12872f = dyaVar;
            synchronized (this) {
                for (Map.Entry entry : this.f12870d.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new dgq(entry, dyaVar, 11));
                    } catch (RejectedExecutionException e) {
                        ((nbe) ((nbe) ((nbe) f12867a.m17251b()).mo17283h(e)).mo17276G(1177)).mo17290o("Cannot execute onResourcesAvailable");
                    }
                }
            }
            dyv.m6941d(dyaVar);
            this.f12871e = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6916c(dxr dxrVar) {
        if (this.f12870d.remove(dxrVar) != null) {
            dxrVar.m6864b(this.f12872f);
        }
    }
}
