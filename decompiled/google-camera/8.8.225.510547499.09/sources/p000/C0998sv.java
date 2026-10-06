package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: sv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$awaitAvailableCamera$2", m18657c = "RetryingCameraStateOpener.kt", m18658d = "invokeSuspend", m18659e = {92})
public final class C0998sv extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47611a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f47612b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bck f47613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998sv(bck bckVar, String str, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(2, olsVar);
        this.f47613c = bckVar;
        this.f47612b = str;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C0998sv) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oju] */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f47611a) {
            case 0:
                lkm.m15592s(obj);
                bck bckVar = this.f47613c;
                String str = this.f47612b;
                this.f47611a = 1;
                opy opyVar = new opy(omn.m18701f(this), 1);
                opyVar.m18898x();
                C0999sw c0999sw = new C0999sw(str, opyVar);
                CameraManager cameraManager = (CameraManager) bckVar.f2949b.get();
                cameraManager.getClass();
                C0996st.m19436i(cameraManager, ((drj) bckVar.f2948a).m6623c(), c0999sw);
                opyVar.mo18870a(new apk(cameraManager, c0999sw, 1));
                obj = opyVar.m18887m();
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C0998sv(this.f47613c, this.f47612b, olsVar, null, null);
    }
}
