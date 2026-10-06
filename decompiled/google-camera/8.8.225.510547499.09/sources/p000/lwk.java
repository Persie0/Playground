package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.helper.F250Compat$observeResources$job$1$1", m18657c = "F250Compat.kt", m18658d = "invokeSuspend", m18659e = {})
final class lwk extends oml implements onn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lwj f39436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwk(lwj lwjVar, ols olsVar) {
        super(3, olsVar);
        this.f39436a = lwjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.onn
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16102a(Object obj, Object obj2, Object obj3) {
        return new lwk(this.f39436a, obj3).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        return oki.f46196a;
    }
}
