package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esj implements bog {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f15313a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f15314b;

    public esj(chg chgVar, int i) {
        this.f15314b = i;
        this.f15313a = chgVar;
    }

    public esj(esl eslVar, int i) {
        this.f15314b = i;
        this.f15313a = eslVar;
    }

    /* JADX INFO: renamed from: d */
    private final void m7764d() {
        esl eslVar = (esl) this.f15313a;
        if (eslVar.f15419w) {
            return;
        }
        eslVar.f15419w = true;
        if (eslVar.f15422z) {
            eslVar.mo3707u("CameraActivityController: Fatal error during onPause!");
        } else {
            eslVar.f15400d.mo6460h();
        }
    }

    @Override // p000.bog
    /* JADX INFO: renamed from: a */
    public final void mo2789a(int i) {
        switch (this.f15314b) {
            case 0:
                ((nbe) ((nbe) esl.f15318a.m17251b()).mo17276G(1873)).mo17291p("Camera error callback. error=%d", i);
                break;
            default:
                ((nbe) ((nbe) chg.f5729a.m17252c()).mo17276G((char) 138)).mo17290o("cameraExceptionCallback.onCameraError");
                Iterator it = ((chg) this.f15313a).f5734f.iterator();
                while (it.hasNext()) {
                    ((boh) it.next()).mo2757a(i);
                }
                break;
        }
    }

    @Override // p000.bog
    /* JADX INFO: renamed from: b */
    public final void mo2790b(RuntimeException runtimeException, String str, int i, int i2) {
        switch (this.f15314b) {
            case 0:
                ((nbe) ((nbe) ((nbe) esl.f15318a.m17251b()).mo17283h(runtimeException)).mo17276G((char) 1874)).mo17290o("Camera Exception");
                fcp fcpVar = ((esl) this.f15313a).f15416t;
                int i3 = mws.f41739d;
                mws mwsVar = mzr.f41857a;
                fcpVar.mo8147V(5, str, runtimeException, i, i2, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
                m7764d();
                break;
            default:
                ((nbe) ((nbe) chg.f5729a.m17252c()).mo17276G((char) 139)).mo17290o("cameraExceptionCallback.onCameraException");
                Iterator it = ((chg) this.f15313a).f5734f.iterator();
                while (it.hasNext()) {
                    ((boh) it.next()).mo2758b(runtimeException, str, i, i2);
                }
                break;
        }
    }

    @Override // p000.bog
    /* JADX INFO: renamed from: c */
    public final void mo2791c(RuntimeException runtimeException) {
        switch (this.f15314b) {
            case 0:
                ((nbe) ((nbe) ((nbe) esl.f15318a.m17251b()).mo17283h(runtimeException)).mo17276G((char) 1875)).mo17290o("DispatchThread Exception");
                fcp fcpVar = ((esl) this.f15313a).f15416t;
                int i = mws.f41739d;
                mws mwsVar = mzr.f41857a;
                fcpVar.mo8147V(6, null, runtimeException, -1, -1, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
                m7764d();
                break;
            default:
                ((nbe) ((nbe) chg.f5729a.m17252c()).mo17276G((char) 140)).mo17290o("cameraExceptionCallback.onDispatchThreadException");
                Iterator it = ((chg) this.f15313a).f5734f.iterator();
                while (it.hasNext()) {
                    ((boh) it.next()).mo2759c(runtimeException);
                }
                break;
        }
    }
}
