package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.async.coroutines.MapConcurrentlyKt$mapConcurrently$2$1$1$1", m18657c = "MapConcurrently.kt", m18658d = "invokeSuspend", m18659e = {43, 52})
final class mpb extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f41227a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ onm f41228b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f41229c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f41230d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ oub f41231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpb(onm onmVar, Object obj, oub oubVar, int i, ols olsVar) {
        super(2, olsVar);
        this.f41228b = onmVar;
        this.f41229c = obj;
        this.f41231e = oubVar;
        this.f41230d = i;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mpb) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1.mo19056q(r2, r4) == r0) goto L14;
     */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo561b(Object obj) throws mpa {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        try {
            switch (this.f41227a) {
                case 0:
                    lkm.m15592s(obj);
                    onm onmVar = this.f41228b;
                    Object obj2 = this.f41229c;
                    this.f41227a = 1;
                    obj = onmVar.mo560a(obj2, this);
                    if (obj != omaVar) {
                        oub oubVar = this.f41231e;
                        oky okyVar = new oky(this.f41230d, obj);
                        this.f41227a = 2;
                        break;
                    }
                    return omaVar;
                case 1:
                    lkm.m15592s(obj);
                    oub oubVar2 = this.f41231e;
                    oky okyVar2 = new oky(this.f41230d, obj);
                    this.f41227a = 2;
                    break;
                default:
                    lkm.m15592s(obj);
                    return oki.f46196a;
            }
        } catch (CancellationException e) {
            throw new mpa(e);
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new mpb(this.f41228b, this.f41229c, this.f41231e, this.f41230d, olsVar);
    }
}
