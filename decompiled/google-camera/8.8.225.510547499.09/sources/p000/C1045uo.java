package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$ActiveCamera$1", m18657c = "VirtualCameraManager.kt", m18658d = "invokeSuspend", m18659e = {262})
public final class C1045uo extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47757a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AmbientDelegate f47758b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Object f47759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1045uo(AmbientDelegate ambientDelegate, ols olsVar, byte[] bArr) {
        super(2, olsVar);
        this.f47758b = ambientDelegate;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1045uo) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f47757a) {
            case 0:
                lkm.m15592s(obj);
                oqs oqsVar = (oqs) this.f47759c;
                AmbientDelegate ambientDelegate = this.f47758b;
                ovm ovmVar = ((C0986sj) ambientDelegate.f1686b).f47586b;
                C1044un c1044un = new C1044un(ambientDelegate, oqsVar, null);
                this.f47757a = 1;
                if (ovmVar.mo16104da(c1044un, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        throw new ojx();
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C1045uo c1045uo = new C1045uo(this.f47758b, olsVar, null);
        c1045uo.f47759c = obj;
        return c1045uo;
    }
}
