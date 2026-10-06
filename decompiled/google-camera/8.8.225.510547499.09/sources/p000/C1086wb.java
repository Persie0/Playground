package p000;

/* JADX INFO: renamed from: wb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.graph.GraphProcessorImpl$resubmit$1", m18657c = "GraphProcessor.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1086wb extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1090wf f47901a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086wb(C1090wf c1090wf, ols olsVar) {
        super(2, olsVar);
        this.f47901a = c1090wf;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1086wb) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47901a.m19522h();
        this.f47901a.m19521g();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1086wb(this.f47901a, olsVar);
    }
}
