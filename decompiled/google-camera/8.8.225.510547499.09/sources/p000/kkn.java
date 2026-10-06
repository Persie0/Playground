package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "com.google.android.libraries.camera.frameserver.internal.requestprocessorv2.CameraPipeRequestProcessor$submit$1", m18657c = "CameraPipeRequestProcessor.kt", m18658d = "invokeSuspend", m18659e = {57})
final class kkn extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f36386a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kko f36387b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f36388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(kko kkoVar, List list, ols olsVar) {
        super(2, olsVar);
        this.f36387b = kkoVar;
        this.f36388c = list;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((kkn) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Exception {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f36386a) {
            case 0:
                lkm.m15592s(obj);
                InterfaceC0951rb interfaceC0951rb = this.f36387b.f36389a;
                this.f36386a = 1;
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
            List listM14450f = this.f36387b.m14450f(this.f36388c);
            if (c1079vv.f47883b.m18842a()) {
                throw new IllegalStateException("Cannot call submit on " + c1079vv + " after close.");
            }
            if (listM14450f.isEmpty()) {
                throw new IllegalStateException("Cannot call submit with an empty list of Requests!");
            }
            c1079vv.f47882a.mo19513d(listM14450f);
            omn.m18707l(autoCloseable, null);
            return oki.f46196a;
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
        return new kkn(this.f36387b, this.f36388c, olsVar);
    }
}
