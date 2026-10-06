package p000;

/* JADX INFO: renamed from: um */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$1", m18657c = "VirtualCameraManager.kt", m18658d = "invokeSuspend", m18659e = {69})
public final class C1043um extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47753a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ drj f47754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043um(drj drjVar, ols olsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(2, olsVar);
        this.f47754b = drjVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1043um) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Throwable {
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (this.f47753a) {
            case 0:
                lkm.m15592s(obj);
                drj drjVar = this.f47754b;
                this.f47753a = 1;
                Object objM18924e = oqv.m18924e(new C1052uv(drjVar, null, null, null, null), this);
                if (objM18924e != oma.COROUTINE_SUSPENDED) {
                    objM18924e = oki.f46196a;
                }
                if (objM18924e == obj2) {
                    return obj2;
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
        return new C1043um(this.f47754b, olsVar, null, null, null);
    }
}
