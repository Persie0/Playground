package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m18657c = "ChannelFlow.kt", m18658d = "invokeSuspend", m18659e = {60})
final class owf extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46709a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f46710b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ owg f46711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owf(owg owgVar, ols olsVar) {
        super(2, olsVar);
        this.f46711c = owgVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((owf) mo562c((oub) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f46709a) {
            case 0:
                lkm.m15592s(obj);
                oub oubVar = (oub) this.f46710b;
                owg owgVar = this.f46711c;
                this.f46709a = 1;
                if (owgVar.mo19080b(oubVar, this) == omaVar) {
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
        owf owfVar = new owf(this.f46711c, olsVar);
        owfVar.f46710b = obj;
        return owfVar;
    }
}
