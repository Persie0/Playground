package p000;

/* JADX INFO: renamed from: ux */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1$1", m18657c = "VirtualCamera.kt", m18658d = "invokeSuspend", m18659e = {153})
final class C1054ux extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47783a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f47784b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1056uz f47785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1054ux(our ourVar, C1056uz c1056uz, ols olsVar) {
        super(2, olsVar);
        this.f47784b = ourVar;
        this.f47785c = c1056uz;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1054ux) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f47783a) {
            case 0:
                lkm.m15592s(obj);
                our ourVar = this.f47784b;
                C1053uw c1053uw = new C1053uw(this.f47785c, 0);
                this.f47783a = 1;
                if (ourVar.mo16104da(c1053uw, this) == omaVar) {
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
        return new C1054ux(this.f47784b, this.f47785c, olsVar);
    }
}
