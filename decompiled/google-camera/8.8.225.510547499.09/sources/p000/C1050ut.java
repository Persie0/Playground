package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: ut */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$requestLoop$2$2", m18657c = "VirtualCameraManager.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1050ut extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AmbientDelegate f47774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050ut(AmbientDelegate ambientDelegate, ols olsVar, byte[] bArr) {
        super(2, olsVar);
        this.f47774a = ambientDelegate;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1050ut) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47774a.m1608k();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1050ut(this.f47774a, olsVar, null);
    }
}
