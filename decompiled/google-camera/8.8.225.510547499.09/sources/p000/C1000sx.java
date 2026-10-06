package p000;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.Camera2CameraController$close$2", m18657c = "Camera2CameraController.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1000sx extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ooi f47617a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ooi f47618b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000sx(ooi ooiVar, ooi ooiVar2, ols olsVar) {
        super(2, olsVar);
        this.f47617a = ooiVar;
        this.f47618b = ooiVar2;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1000sx) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Exception {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        C1028ty c1028ty = (C1028ty) this.f47617a.f46351a;
        if (c1028ty != null) {
            c1028ty.m19453d();
        }
        InterfaceC1041uk interfaceC1041uk = (InterfaceC1041uk) this.f47618b.f46351a;
        if (interfaceC1041uk != null) {
            interfaceC1041uk.mo19457a(null);
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1000sx(this.f47617a, this.f47618b, olsVar);
    }
}
