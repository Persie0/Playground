package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ad3 extends AbstractC3102i7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f510a;

    public ad3(AtomicReference atomicReference) {
        this.f510a = atomicReference;
    }

    @Override // p000.AbstractC3102i7
    /* JADX INFO: renamed from: a */
    public final void mo276a(Object obj) {
        AbstractC3102i7 abstractC3102i7 = (AbstractC3102i7) this.f510a.get();
        if (abstractC3102i7 != null) {
            abstractC3102i7.mo276a(obj);
        } else {
            C3386nv.m17633t("Operation cannot be started before fragment is in created state");
        }
    }
}
