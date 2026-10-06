package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m18657c = "Channels.kt", m18658d = "invokeSuspend", m18659e = {39})
public final class otv extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f46547a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ouh f46548b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f46549c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f46550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otv(ouh ouhVar, Object obj, ols olsVar) {
        super(2, olsVar);
        this.f46548b = ouhVar;
        this.f46549c = obj;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((otv) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        Object objM15591r;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        try {
            switch (this.f46547a) {
                case 0:
                    lkm.m15592s(obj);
                    ouh ouhVar = this.f46548b;
                    Object obj2 = this.f46549c;
                    this.f46547a = 1;
                    if (ouhVar.mo19056q(obj2, this) == omaVar) {
                        return omaVar;
                    }
                    break;
                default:
                    lkm.m15592s(obj);
                    break;
            }
            objM15591r = oki.f46196a;
        } catch (Throwable th) {
            objM15591r = lkm.m15591r(th);
        }
        return otu.m19065a(okd.m18590b(objM15591r) ? oki.f46196a : ooc.m18751q(okd.m18589a(objM15591r)));
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        otv otvVar = new otv(this.f46548b, this.f46549c, olsVar);
        otvVar.f46550d = obj;
        return otvVar;
    }
}
