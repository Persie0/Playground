package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.CoroutinesRoom$Companion$execute$2", m18657c = "CoroutinesRoom.kt", m18658d = "invokeSuspend", m18659e = {})
public final class apj extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Callable f2008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apj(Callable callable, ols olsVar) {
        super(2, olsVar);
        this.f2008a = callable;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((apj) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        return this.f2008a.call();
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new apj(this.f2008a, olsVar);
    }
}
