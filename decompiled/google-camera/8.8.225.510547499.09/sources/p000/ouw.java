package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m18657c = "Collect.kt", m18658d = "invokeSuspend", m18659e = {50})
public final class ouw extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46606a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f46607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouw(our ourVar, ols olsVar) {
        super(2, olsVar);
        this.f46607b = ourVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((ouw) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f46606a) {
            case 0:
                lkm.m15592s(obj);
                our ourVar = this.f46607b;
                this.f46606a = 1;
                Object objMo16104da = ourVar.mo16104da(owl.f46722a, this);
                if (objMo16104da != oma.COROUTINE_SUSPENDED) {
                    objMo16104da = oki.f46196a;
                }
                if (objMo16104da == omaVar) {
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
        return new ouw(this.f46607b, olsVar);
    }
}
