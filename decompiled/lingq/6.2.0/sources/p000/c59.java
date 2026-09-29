package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final class c59 extends AbstractC3743x1 {

    /* JADX INFO: renamed from: a */
    public long f9589a;

    /* JADX INFO: renamed from: b */
    public sm0 f9590b;

    @Override // p000.AbstractC3743x1
    /* JADX INFO: renamed from: a */
    public final boolean mo4330a(AbstractC3706w1 abstractC3706w1) {
        C3229i c3229i = (C3229i) abstractC3706w1;
        if (this.f9589a >= 0) {
            return false;
        }
        long j = c3229i.f48064i;
        if (j < c3229i.f48065j) {
            c3229i.f48065j = j;
        }
        this.f9589a = j;
        return true;
    }

    @Override // p000.AbstractC3743x1
    /* JADX INFO: renamed from: b */
    public final Continuation[] mo4331b(AbstractC3706w1 abstractC3706w1) {
        long j = this.f9589a;
        this.f9589a = -1L;
        this.f9590b = null;
        return ((C3229i) abstractC3706w1).m15563u(j);
    }
}
