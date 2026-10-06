package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m18657c = "ChannelFlow.kt", m18658d = "invokeSuspend", m18659e = {152})
final class owh extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46714a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f46715b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ owi f46716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owh(owi owiVar, ols olsVar) {
        super(2, olsVar);
        this.f46716c = owiVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((owh) mo562c((ous) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f46714a) {
            case 0:
                lkm.m15592s(obj);
                ous ousVar = (ous) this.f46715b;
                owi owiVar = this.f46716c;
                this.f46714a = 1;
                if (owiVar.m19114c(ousVar, this) == omaVar) {
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
        owh owhVar = new owh(this.f46716c, olsVar);
        owhVar.f46715b = obj;
        return owhVar;
    }
}
