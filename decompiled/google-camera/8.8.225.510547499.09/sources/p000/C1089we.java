package p000;

/* JADX INFO: renamed from: we */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.graph.GraphProcessorImpl$submit$2", m18657c = "GraphProcessor.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1089we extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1090wf f47905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089we(C1090wf c1090wf, ols olsVar) {
        super(2, olsVar);
        this.f47905a = c1090wf;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1089we) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47905a.m19521g();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1089we(this.f47905a, olsVar);
    }
}
