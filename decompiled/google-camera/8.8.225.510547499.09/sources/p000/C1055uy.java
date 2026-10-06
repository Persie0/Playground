package p000;

/* JADX INFO: renamed from: uy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2", m18657c = "VirtualCamera.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1055uy extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1056uz f47786a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f47787b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ app f47788c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f47789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055uy(C1056uz c1056uz, app appVar, our ourVar, ols olsVar, byte[] bArr) {
        super(2, olsVar);
        this.f47786a = c1056uz;
        this.f47788c = appVar;
        this.f47787b = ourVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1055uy) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        oqs oqsVar = (oqs) this.f47789d;
        C1056uz c1056uz = this.f47786a;
        Object obj2 = c1056uz.f47791b;
        app appVar = this.f47788c;
        our ourVar = this.f47787b;
        synchronized (obj2) {
            if (!c1056uz.f47792c) {
                c1056uz.f47794e = ooc.m18746l(oqsVar, olz.f46282a, new C1054ux(ourVar, c1056uz, null), 2);
                c1056uz.f47795f = appVar;
                return oki.f46196a;
            }
            if (appVar != null) {
                appVar.m1809a();
            }
            return oki.f46196a;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C1055uy c1055uy = new C1055uy(this.f47786a, this.f47788c, this.f47787b, olsVar, null);
        c1055uy.f47789d = obj;
        return c1055uy;
    }
}
