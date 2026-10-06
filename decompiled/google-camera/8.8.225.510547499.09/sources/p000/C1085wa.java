package p000;

import android.os.Trace;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.graph.GraphProcessorImpl$abort$2", m18657c = "GraphProcessor.kt", m18658d = "invokeSuspend", m18659e = {})
final class C1085wa extends oml implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ooi f47897a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ooi f47898b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1090wf f47899c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f47900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1085wa(ooi ooiVar, ooi ooiVar2, C1090wf c1090wf, ols olsVar) {
        super(2, olsVar);
        this.f47897a = ooiVar;
        this.f47898b = ooiVar2;
        this.f47899c = c1090wf;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1085wa) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        List<InterfaceC0962rm> listM18673M;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        oqs oqsVar = (oqs) this.f47900d;
        StringBuilder sb = new StringBuilder();
        sb.append(oqsVar);
        sb.append("#abort");
        Trace.beginSection(String.valueOf(oqsVar).concat("#abort"));
        ooi ooiVar = this.f47897a;
        Object obj2 = ooiVar.f46351a;
        if (obj2 != null) {
            synchronized (obj2) {
                C1091wg c1091wg = (C1091wg) ooiVar.f46351a;
                synchronized (c1091wg.f47920a) {
                    listM18673M = omn.m18673M(c1091wg.f47920a);
                    c1091wg.f47920a.clear();
                }
                for (InterfaceC0962rm interfaceC0962rm : listM18673M) {
                    int size = interfaceC0962rm.mo19380a().size();
                    for (int i = 0; i < size; i++) {
                        C1013tj c1013tj = (C1013tj) interfaceC0962rm.mo19380a().get(i);
                        int size2 = interfaceC0962rm.mo19381b().size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((InterfaceC0972rw) interfaceC0962rm.mo19381b().get(i2)).mo14439a((C0973rx) c1013tj.f47674a);
                        }
                    }
                    int size3 = interfaceC0962rm.mo19380a().size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        C1013tj c1013tj2 = (C1013tj) interfaceC0962rm.mo19380a().get(i3);
                        int size4 = ((C0973rx) c1013tj2.f47674a).f47568c.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            ((InterfaceC0972rw) ((C0973rx) c1013tj2.f47674a).f47568c.get(i4)).mo14439a((C0973rx) c1013tj2.f47674a);
                        }
                    }
                }
                c1091wg.f47921b.f47657a.mo19393g();
            }
        }
        Iterator it = ((List) this.f47898b.f46351a).iterator();
        while (it.hasNext()) {
            this.f47899c.m19519e((List) it.next());
        }
        Trace.endSection();
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C1085wa c1085wa = new C1085wa(this.f47897a, this.f47898b, this.f47899c, olsVar);
        c1085wa.f47900d = obj;
        return c1085wa;
    }
}
