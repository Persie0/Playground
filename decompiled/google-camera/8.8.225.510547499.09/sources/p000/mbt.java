package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$doWork$2$1", m18657c = "F250Worker.kt", m18658d = "invokeSuspend", m18659e = {71})
final class mbt extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f39866a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ F250Worker f39867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbt(F250Worker f250Worker, ols olsVar) {
        super(2, olsVar);
        this.f39867b = f250Worker;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mbt) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39866a) {
            case 0:
                lkm.m15592s(obj);
                F250Worker f250Worker = this.f39867b;
                mav mavVar = f250Worker.f7991j;
                lvo lvoVarM16278d = mau.m16278d(new mau(f250Worker.f7988g, lwd.f39426a, null));
                this.f39866a = 1;
                if (mavVar.m16285a(lvoVarM16278d, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return C0139dr.m6615d();
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new mbt(this.f39867b, olsVar);
    }
}
