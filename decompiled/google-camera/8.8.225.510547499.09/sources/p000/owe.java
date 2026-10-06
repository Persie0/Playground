package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m18657c = "ChannelFlow.kt", m18658d = "invokeSuspend", m18659e = {123})
final class owe extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46705a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ous f46706b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ owg f46707c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f46708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owe(ous ousVar, owg owgVar, ols olsVar) {
        super(2, olsVar);
        this.f46706b = ousVar;
        this.f46707c = owgVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((owe) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f46705a) {
            case 0:
                lkm.m15592s(obj);
                oqs oqsVar = (oqs) this.f46708d;
                ous ousVar = this.f46706b;
                owg owgVar = this.f46707c;
                oqsVar.getClass();
                oly olyVar = owgVar.f46712a;
                onm owfVar = new owf(owgVar, null);
                oub oubVar = new oub(oqn.m18912b(oqsVar, olyVar), ooc.m18752r(-2, 1, 4));
                oubVar.m18861cU(3, oubVar, owfVar);
                this.f46705a = 1;
                if (ook.m18780R(ousVar, oubVar, this) == omaVar) {
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
        owe oweVar = new owe(this.f46706b, this.f46707c, olsVar);
        oweVar.f46708d = obj;
        return oweVar;
    }
}
