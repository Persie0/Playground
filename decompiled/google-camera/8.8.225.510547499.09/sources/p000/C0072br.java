package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0917pv;
import p000.aie;
import p000.akq;
import p000.akv;

/* JADX INFO: renamed from: br */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0072br extends AbstractC0075bu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0944qv f4209a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AtomicReference f4210b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC0927qe f4211c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ InterfaceC0918pw f4212d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ComponentCallbacksC0077bw f4213e;

    public C0072br(ComponentCallbacksC0077bw componentCallbacksC0077bw, InterfaceC0944qv interfaceC0944qv, AtomicReference atomicReference, AbstractC0927qe abstractC0927qe, InterfaceC0918pw interfaceC0918pw) {
        this.f4213e = componentCallbacksC0077bw;
        this.f4209a = interfaceC0944qv;
        this.f4210b = atomicReference;
        this.f4211c = abstractC0927qe;
        this.f4212d = interfaceC0918pw;
    }

    @Override // p000.AbstractC0075bu
    /* JADX INFO: renamed from: a */
    public final void mo2783a() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f4213e;
        final String str = "fragment_" + componentCallbacksC0077bw.f4609k + "_rq#" + componentCallbacksC0077bw.f4598Z.getAndIncrement();
        final C0923qa c0923qa = (C0923qa) this.f4209a.mo2905a(null);
        AtomicReference atomicReference = this.f4210b;
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = this.f4213e;
        final AbstractC0927qe abstractC0927qe = this.f4211c;
        final InterfaceC0918pw interfaceC0918pw = this.f4212d;
        aks lifecycle = componentCallbacksC0077bw2.getLifecycle();
        if (lifecycle.f598a.m872a(akr.f595d)) {
            throw new IllegalStateException("LifecycleOwner " + componentCallbacksC0077bw2 + " is attempting to register while current state is " + lifecycle.f598a + ". LifecycleOwners must call register before they are STARTED.");
        }
        c0923qa.m19334c(str);
        bck bckVar = (bck) c0923qa.f47465d.get(str);
        if (bckVar == null) {
            bckVar = new bck(lifecycle);
        }
        akt aktVar = new akt() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // p000.akt
            /* JADX INFO: renamed from: a */
            public final void mo883a(akv akvVar, akq akqVar) {
                if (!akq.ON_START.equals(akqVar)) {
                    if (akq.ON_STOP.equals(akqVar)) {
                        c0923qa.f47467f.remove(str);
                        return;
                    } else {
                        if (akq.ON_DESTROY.equals(akqVar)) {
                            c0923qa.m19335d(str);
                            return;
                        }
                        return;
                    }
                }
                c0923qa.f47467f.put(str, new aie(interfaceC0918pw, abstractC0927qe));
                if (c0923qa.f47468g.containsKey(str)) {
                    Object obj = c0923qa.f47468g.get(str);
                    c0923qa.f47468g.remove(str);
                    interfaceC0918pw.mo3666a(obj);
                }
                C0917pv c0917pv = (C0917pv) c0923qa.f47469h.getParcelable(str);
                if (c0917pv != null) {
                    c0923qa.f47469h.remove(str);
                    interfaceC0918pw.mo3666a(abstractC0927qe.mo3937a(c0917pv.f47455a, c0917pv.f47456b));
                }
            }
        };
        ((aks) bckVar.f2948a).m879a(aktVar);
        ((ArrayList) bckVar.f2949b).add(aktVar);
        c0923qa.f47465d.put(str, bckVar);
        atomicReference.set(new C0920py());
    }
}
