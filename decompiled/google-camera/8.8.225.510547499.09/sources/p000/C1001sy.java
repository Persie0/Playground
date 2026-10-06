package p000;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.Camera2CameraController$start$2", m18657c = "Camera2CameraController.kt", m18658d = "invokeSuspend", m18659e = {90})
final class C1001sy extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47619a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1002sz f47620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001sy(C1002sz c1002sz, ols olsVar) {
        super(2, olsVar);
        this.f47620b = c1002sz;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1001sy) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        InterfaceC1041uk interfaceC1041uk;
        Object objMo16104da;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f47619a) {
            case 0:
                lkm.m15592s(obj);
                C1002sz c1002sz = this.f47620b;
                this.f47619a = 1;
                ooi ooiVar = new ooi();
                synchronized (c1002sz) {
                    interfaceC1041uk = c1002sz.f47621a;
                    ooiVar.f46351a = c1002sz.f47622b;
                }
                if (interfaceC1041uk == null || ooiVar.f46351a == null || (objMo16104da = ((C1056uz) interfaceC1041uk).f47793d.mo16104da(new C1053uw(ooiVar, 1), this)) != oma.COROUTINE_SUSPENDED) {
                    objMo16104da = oki.f46196a;
                }
                if (objMo16104da == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1001sy(this.f47620b, olsVar);
    }
}
