package p000;

/* JADX INFO: renamed from: si */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.AndroidCameraState$awaitClosed$2", m18657c = "VirtualCamera.kt", m18658d = "invokeSuspend", m18659e = {})
public final class C0985si extends oml implements onm {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f47584a;

    public C0985si(ols olsVar) {
        super(2, olsVar);
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C0985si) mo562c((C0748jo) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        return Boolean.valueOf(((C0748jo) this.f47584a) instanceof C1017tn);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C0985si c0985si = new C0985si(olsVar);
        c0985si.f47584a = obj;
        return c0985si;
    }
}
