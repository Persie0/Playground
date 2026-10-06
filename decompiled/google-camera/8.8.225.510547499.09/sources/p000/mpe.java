package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.async.coroutines.MapConcurrentlyKt$mapConcurrently$2$2", m18657c = "MapConcurrently.kt", m18658d = "invokeSuspend", m18659e = {})
final class mpe extends oml implements onn {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f41241a;

    public mpe(ols olsVar) {
        super(3, olsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.onn
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16102a(Object obj, Object obj2, Object obj3) {
        mpe mpeVar = new mpe(obj3);
        mpeVar.f41241a = obj2;
        return mpeVar.mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        Object obj2 = this.f41241a;
        if (obj2 instanceof mpa) {
            throw ((mpa) obj2).f41226a;
        }
        return oki.f46196a;
    }
}
