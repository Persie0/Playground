package p000;

/* JADX INFO: renamed from: tr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$result$1", m18657c = "RetryingCameraStateOpener.kt", m18658d = "invokeSuspend", m18659e = {})
public final class C1021tr extends oml implements onm {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f47694a;

    public C1021tr(ols olsVar) {
        super(2, olsVar);
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1021tr) mo562c((C0748jo) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        return Boolean.valueOf(!(((C0748jo) this.f47694a) instanceof C1022ts));
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C1021tr c1021tr = new C1021tr(olsVar);
        c1021tr.f47694a = obj;
        return c1021tr;
    }
}
