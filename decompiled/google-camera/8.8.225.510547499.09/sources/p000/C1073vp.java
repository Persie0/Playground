package p000;

/* JADX INFO: renamed from: vp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.core.WakeLock$release$2", m18657c = "WakeLock.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1073vp extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1075vr f47860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073vp(C1075vr c1075vr, ols olsVar) {
        super(2, olsVar);
        this.f47860a = c1075vr;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1073vp) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47860a.f47863a.mo2077a();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1073vp(this.f47860a, olsVar);
    }
}
