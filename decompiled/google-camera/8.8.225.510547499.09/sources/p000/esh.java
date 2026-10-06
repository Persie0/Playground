package p000;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esh implements ifh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ esl f15310a;

    public esh(esl eslVar) {
        this.f15310a = eslVar;
    }

    @Override // p000.ifh
    /* JADX INFO: renamed from: a */
    public final void mo7762a() {
        this.f15310a.f15402f.m10438i(hkp.ACTIVITY_SHUTTER_BUTTON_DRAWN, CameraActivityTiming.f6961a);
    }

    @Override // p000.ifh
    /* JADX INFO: renamed from: b */
    public final void mo7763b() {
        esl eslVar = this.f15310a;
        CameraActivityTiming cameraActivityTiming = eslVar.f15402f;
        if (!cameraActivityTiming.m10440k(hkp.ACTIVITY_SHUTTER_BUTTON_DRAWN) || cameraActivityTiming.m10440k(hkp.ACTIVITY_SHUTTER_BUTTON_ENABLED)) {
            return;
        }
        cameraActivityTiming.m10438i(hkp.ACTIVITY_SHUTTER_BUTTON_ENABLED, CameraActivityTiming.f6961a);
        cameraActivityTiming.f6968h.mo13952a();
        cameraActivityTiming.f6968h = kcc.f35555b;
        eslVar.f15337S.mo14894e(ckm.f5985a);
    }
}
