package p000;

/* JADX INFO: renamed from: vq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1", m18657c = "WakeLock.kt", m18658d = "invokeSuspend", m18659e = {118})
final class C1074vq extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f47861a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1075vr f47862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074vq(C1075vr c1075vr, ols olsVar) {
        super(2, olsVar);
        this.f47862b = c1075vr;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1074vq) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f47861a) {
            case 0:
                lkm.m15592s(obj);
                this.f47861a = 1;
                opy opyVar = new opy(omn.m18701f(this), 1);
                opyVar.m18898x();
                oqv.m18923d(opyVar.f46407b).mo18944a(opyVar);
                Object objM18887m = opyVar.m18887m();
                if (objM18887m != oma.COROUTINE_SUSPENDED) {
                    objM18887m = oki.f46196a;
                }
                if (objM18887m == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        C1075vr c1075vr = this.f47862b;
        synchronized (c1075vr.f47864b) {
            if (!c1075vr.f47867e && c1075vr.f47865c == 0) {
                c1075vr.f47866d = null;
                c1075vr.f47867e = true;
                this.f47862b.f47863a.mo2077a();
                return oki.f46196a;
            }
            return oki.f46196a;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new C1074vq(this.f47862b, olsVar);
    }
}
