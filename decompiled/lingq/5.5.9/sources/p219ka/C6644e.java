package p219ka;

/* JADX INFO: renamed from: ka.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6644e extends AbstractC6650k {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC6645f f37698e;

    public C6644e(AbstractC6645f abstractC6645f) {
        this.f37698e = abstractC6645f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p218k9.AbstractC6636f
    /* JADX INFO: renamed from: p */
    public final void mo13274p() {
        AbstractC6645f abstractC6645f = this.f37698e;
        synchronized (abstractC6645f.f37623b) {
            boolean z10 = false;
            this.f37591a = 0;
            this.f37701c = null;
            int i10 = abstractC6645f.f37629h;
            abstractC6645f.f37629h = i10 + 1;
            abstractC6645f.f37627f[i10] = this;
            if (!abstractC6645f.f37624c.isEmpty() && abstractC6645f.f37629h > 0) {
                z10 = true;
            }
            if (z10) {
                abstractC6645f.f37623b.notify();
            }
        }
    }
}
