package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "com.google.android.libraries.camera.frameserver.internal.requestprocessorv2.CameraPipeRequestProcessor$setRepeating$1", m18657c = "CameraPipeRequestProcessor.kt", m18658d = "invokeSuspend", m18659e = {64})
final class kkm extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f36383a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kko f36384b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kiz f36385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkm(kko kkoVar, kiz kizVar, ols olsVar) {
        super(2, olsVar);
        this.f36384b = kkoVar;
        this.f36385c = kizVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((kkm) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Exception {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f36383a) {
            case 0:
                lkm.m15592s(obj);
                InterfaceC0951rb interfaceC0951rb = this.f36384b.f36389a;
                this.f36383a = 1;
                obj = interfaceC0951rb.mo19369b(this);
                if (obj == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        AutoCloseable autoCloseable = (AutoCloseable) obj;
        try {
            C1079vv c1079vv = (C1079vv) autoCloseable;
            C0973rx c0973rx = (C0973rx) omn.m18671K(this.f36384b.m14450f(omn.m18666F(this.f36385c)));
            c0973rx.getClass();
            if (!c1079vv.f47883b.m18842a()) {
                c1079vv.f47882a.mo19512c(c0973rx);
                omn.m18707l(autoCloseable, null);
                return oki.f46196a;
            }
            throw new IllegalStateException("Cannot call startRepeating on " + c1079vv + " after close.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                omn.m18707l(autoCloseable, th);
                throw th2;
            }
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new kkm(this.f36384b, this.f36385c, olsVar);
    }
}
