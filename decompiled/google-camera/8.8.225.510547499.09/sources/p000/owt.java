package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m18657c = "ChannelFlow.kt", m18658d = "invokeSuspend", m18659e = {212})
final class owt extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46736a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f46737b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ous f46738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owt(ous ousVar, ols olsVar) {
        super(2, olsVar);
        this.f46738c = ousVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((owt) mo562c(obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f46736a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f46737b;
                ous ousVar = this.f46738c;
                this.f46736a = 1;
                if (ousVar.mo16103a(obj2, this) == omaVar) {
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
        owt owtVar = new owt(this.f46738c, olsVar);
        owtVar.f46737b = obj;
        return owtVar;
    }
}
