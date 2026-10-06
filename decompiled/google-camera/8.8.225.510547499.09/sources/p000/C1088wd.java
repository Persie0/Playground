package p000;

import java.util.List;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.graph.GraphProcessorImpl$submit$1$1", m18657c = "GraphProcessor.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1088wd extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1090wf f47903a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f47904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1088wd(C1090wf c1090wf, List list, ols olsVar) {
        super(2, olsVar);
        this.f47903a = c1090wf;
        this.f47904b = list;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1088wd) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47903a.m19519e(this.f47904b);
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1088wd(this.f47903a, this.f47904b, olsVar);
    }
}
