package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3167k0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC1112b f46448a;

    /* JADX INFO: renamed from: b */
    public final ListenableFuture f46449b;

    public RunnableC3167k0(AbstractC1112b abstractC1112b, ListenableFuture listenableFuture) {
        this.f46448a = abstractC1112b;
        this.f46449b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f46448a.f13524a != this) {
            return;
        }
        if (AbstractC1112b.f13522f.mo14234l(this.f46448a, this, AbstractC1112b.m6380i(this.f46449b))) {
            AbstractC1112b.m6377f(this.f46448a, false);
        }
    }
}
