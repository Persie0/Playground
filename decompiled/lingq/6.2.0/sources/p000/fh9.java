package p000;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class fh9 extends AbstractC3743x1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f39111a = new AtomicReference(null);

    @Override // p000.AbstractC3743x1
    /* JADX INFO: renamed from: a */
    public final boolean mo4330a(AbstractC3706w1 abstractC3706w1) {
        AtomicReference atomicReference = this.f39111a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC3352my.f52019f);
        return true;
    }

    @Override // p000.AbstractC3743x1
    /* JADX INFO: renamed from: b */
    public final Continuation[] mo4331b(AbstractC3706w1 abstractC3706w1) {
        this.f39111a.set(null);
        return AbstractC3423or.f54763a;
    }
}
