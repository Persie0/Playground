package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: uu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$requestLoop$2$3", m18657c = "VirtualCameraManager.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1051uu extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AmbientDelegate f47775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051uu(AmbientDelegate ambientDelegate, ols olsVar, byte[] bArr) {
        super(2, olsVar);
        this.f47775a = ambientDelegate;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1051uu) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        this.f47775a.m1608k();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1051uu(this.f47775a, olsVar, null);
    }
}
