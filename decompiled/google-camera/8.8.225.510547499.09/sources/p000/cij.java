package p000;

import android.view.Choreographer;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cij implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5791a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5792b;

    public /* synthetic */ cij(ciq ciqVar, int i) {
        this.f5792b = i;
        this.f5791a = ciqVar;
    }

    public /* synthetic */ cij(hjx hjxVar, int i) {
        this.f5792b = i;
        this.f5791a = hjxVar;
    }

    public /* synthetic */ cij(hxd hxdVar, int i) {
        this.f5792b = i;
        this.f5791a = hxdVar;
    }

    public /* synthetic */ cij(Runnable runnable, int i) {
        this.f5792b = i;
        this.f5791a = runnable;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f5792b) {
            case 0:
                ciq ciqVar = (ciq) this.f5791a;
                CameraActivityTiming cameraActivityTiming = ciqVar.f5860z;
                cameraActivityTiming.m10438i(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED, CameraActivityTiming.f6961a);
                cameraActivityTiming.f6966f.mo13952a();
                cameraActivityTiming.f6966f = kcc.f35555b;
                ciqVar.f5816A.accept(ckb.f5962e);
                break;
            case 1:
                this.f5791a.run();
                break;
            case 2:
                hjx hjxVar = (hjx) this.f5791a;
                hjxVar.f28069c.add(Long.valueOf(j));
                if (hjxVar.f28069c.size() > 100) {
                    ((nbe) ((nbe) hjx.f28067a.m17252c()).mo17276G((char) 3690)).mo17293r("%s", "Never reached the steady state.");
                    hjxVar.f28070d.mo8566a(new TimeoutException("Never reached the steady state."));
                } else {
                    int i = 0;
                    int i2 = 0;
                    while (i < hjxVar.f28069c.size() - 1) {
                        int i3 = i + 1;
                        i2 = ((Long) hjxVar.f28069c.get(i3)).longValue() - ((Long) hjxVar.f28069c.get(i)).longValue() < hjx.f28068b ? i2 + 1 : 0;
                        i = i3;
                    }
                    if (i2 < 10) {
                        hjxVar.m10398a();
                    } else {
                        hjxVar.f28070d.mo14894e(null);
                    }
                }
                break;
            case 3:
                ((hxd) this.f5791a).m10803c();
                break;
            default:
                ((hxd) this.f5791a).m10804d();
                break;
        }
    }
}
