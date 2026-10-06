package p000;

import androidx.work.CoroutineWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.work.CoroutineWorker$startWork$1", m18657c = "CoroutineWorker.kt", m18658d = "invokeSuspend", m18659e = {68})
public final class axs extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2687a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CoroutineWorker f2688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axs(CoroutineWorker coroutineWorker, ols olsVar) {
        super(2, olsVar);
        this.f2688b = coroutineWorker;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((axs) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        try {
            switch (this.f2687a) {
                case 0:
                    lkm.m15592s(obj);
                    CoroutineWorker coroutineWorker = this.f2688b;
                    this.f2687a = 1;
                    obj = coroutineWorker.mo1696b(this);
                    if (obj == omaVar) {
                        return omaVar;
                    }
                    break;
                default:
                    lkm.m15592s(obj);
                    break;
            }
            this.f2688b.f1793b.m2285h((C0139dr) obj);
        } catch (Throwable th) {
            this.f2688b.f1793b.m2283e(th);
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new axs(this.f2688b, olsVar);
    }
}
