package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.F250AirlockInternal$logOnFirstAndError$2", m18657c = "F250AirlockInternal.kt", m18658d = "invokeSuspend", m18659e = {322})
final class lwt extends oml implements onn {

    /* JADX INFO: renamed from: a */
    int f39460a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f39461b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lwv f39462c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mau f39463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwt(lwv lwvVar, mau mauVar, ols olsVar) {
        super(3, olsVar);
        this.f39462c = lwvVar;
        this.f39463d = mauVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.onn
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16102a(Object obj, Object obj2, Object obj3) {
        lwt lwtVar = new lwt(this.f39462c, this.f39463d, obj3);
        lwtVar.f39461b = obj2;
        return lwtVar.mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39460a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f39461b;
                if (obj2 != null && !(obj2 instanceof CancellationException)) {
                    mav mavVar = this.f39462c.f39467a;
                    lvo lvoVarM16277c = mau.m16277c(this.f39463d, oer.ERROR_QUERY, (Throwable) obj2, null, 12);
                    this.f39460a = 1;
                    if (mavVar.m16285a(lvoVarM16277c, this) == omaVar) {
                        return omaVar;
                    }
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }
}
