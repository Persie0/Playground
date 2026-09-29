package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class n37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC3695vr f52288p;

    public n37(AbstractC3695vr abstractC3695vr) {
        this.f52288p = abstractC3695vr;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f52288p.mo16613f(b78Var, Array.get(obj, i));
        }
    }
}
