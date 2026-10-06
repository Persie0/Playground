package p000;

/* JADX INFO: renamed from: tx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.CaptureSessionState$configureSurfaceMap$1$2", m18657c = "CaptureSessionState.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1027tx extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1028ty f47700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027tx(C1028ty c1028ty, ols olsVar) {
        super(2, olsVar);
        this.f47700a = c1028ty;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1027tx) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47700a.m19455f();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1027tx(this.f47700a, olsVar);
    }
}
