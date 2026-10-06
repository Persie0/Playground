package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.window.java.area.WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1", m18657c = "WindowAreaControllerJavaAdapter.kt", m18658d = "invokeSuspend", m18659e = {73})
public final class awj extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2586a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f2587b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ aea f2588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awj(our ourVar, aea aeaVar, ols olsVar) {
        super(2, olsVar);
        this.f2587b = ourVar;
        this.f2588c = aeaVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((awj) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2586a) {
            case 0:
                lkm.m15592s(obj);
                our ourVar = this.f2587b;
                C1053uw c1053uw = new C1053uw(this.f2588c, 2);
                this.f2586a = 1;
                if (ourVar.mo16104da(c1053uw, this) == omaVar) {
                    return omaVar;
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
        return new awj(this.f2587b, this.f2588c, olsVar);
    }
}
