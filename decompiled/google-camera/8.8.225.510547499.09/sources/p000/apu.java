package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", m18657c = "RoomDatabaseExt.kt", m18658d = "invokeSuspend", m18659e = {103})
final class apu extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2074a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ apt f2075b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ opx f2076c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ onm f2077d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ Object f2078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apu(apt aptVar, opx opxVar, onm onmVar, ols olsVar) {
        super(2, olsVar);
        this.f2075b = aptVar;
        this.f2076c = opxVar;
        this.f2077d = onmVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((apu) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Throwable {
        ols olsVar;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2074a) {
            case 0:
                lkm.m15592s(obj);
                olv olvVar = ((oqs) this.f2078e).mo18859cS().get(olu.f46271a);
                olvVar.getClass();
                olu oluVar = (olu) olvVar;
                apt aptVar = this.f2075b;
                aqb aqbVar = new aqb(oluVar);
                ThreadLocal threadLocal = aptVar.f2070i;
                Integer numValueOf = Integer.valueOf(System.identityHashCode(aqbVar));
                threadLocal.getClass();
                oly olyVarPlus = oluVar.plus(aqbVar).plus(new oyc(numValueOf, threadLocal));
                olsVar = this.f2076c;
                onm onmVar = this.f2077d;
                this.f2078e = olsVar;
                this.f2074a = 1;
                obj = ook.m18774L(olyVarPlus, onmVar, this);
                if (obj == omaVar) {
                    return omaVar;
                }
                break;
            default:
                olsVar = (ols) this.f2078e;
                lkm.m15592s(obj);
                break;
        }
        olsVar.mo18640e(obj);
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        apu apuVar = new apu(this.f2075b, this.f2076c, this.f2077d, olsVar);
        apuVar.f2078e = obj;
        return apuVar;
    }
}
