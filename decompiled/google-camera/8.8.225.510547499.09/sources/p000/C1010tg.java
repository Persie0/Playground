package p000;

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.Camera2MetadataCache$getCameraMetadata$3", m18657c = "Camera2MetadataCache.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1010tg extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1011th f47667a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f47668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010tg(C1011th c1011th, String str, ols olsVar) {
        super(2, olsVar);
        this.f47667a = c1011th;
        this.f47668b = str;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1010tg) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        return this.f47667a.m19447a(this.f47668b);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1010tg(this.f47667a, this.f47668b, olsVar);
    }
}
