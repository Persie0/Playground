package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC3695vr f50512p;

    public m37(AbstractC3695vr abstractC3695vr) {
        this.f50512p = abstractC3695vr;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f50512p.mo16613f(b78Var, it.next());
        }
    }
}
