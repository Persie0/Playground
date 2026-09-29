package p000;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends fd3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qn3 f35428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f35429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pk9 f35430c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2991f7 f35431d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f35432e;

    public dd3(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, qn3 qn3Var, AtomicReference atomicReference, pk9 pk9Var, InterfaceC2991f7 interfaceC2991f7) {
        this.f35432e = abstractComponentCallbacksC0635c;
        this.f35428a = qn3Var;
        this.f35429b = atomicReference;
        this.f35430c = pk9Var;
        this.f35431d = interfaceC2991f7;
    }

    @Override // p000.fd3
    /* JADX INFO: renamed from: a */
    public final void mo3635a() {
        StringBuilder sb = new StringBuilder("fragment_");
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f35432e;
        sb.append(abstractComponentCallbacksC0635c.f5693e);
        sb.append("_rq#");
        sb.append(abstractComponentCallbacksC0635c.f5715s0.getAndIncrement());
        String string = sb.toString();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) this.f35428a.f57974a;
        hd3 hd3Var = abstractComponentCallbacksC0635c2.f5675Q;
        this.f35429b.set((hd3Var != null ? hd3Var.f42213O : abstractComponentCallbacksC0635c2.m2089Q()).f63705i.m21216c(string, abstractComponentCallbacksC0635c, this.f35430c, this.f35431d));
    }
}
