package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m18657c = "CoroutinesRoom.kt", m18658d = "invokeSuspend", m18659e = {})
public final class apl extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Callable f2012a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ opx f2013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apl(Callable callable, opx opxVar, ols olsVar) {
        super(2, olsVar);
        this.f2012a = callable;
        this.f2013b = opxVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((apl) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        try {
            this.f2013b.mo18640e(this.f2012a.call());
        } catch (Throwable th) {
            this.f2013b.mo18640e(lkm.m15591r(th));
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new apl(this.f2012a, this.f2013b, olsVar);
    }
}
