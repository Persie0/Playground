package p000;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ore implements orf {

    /* JADX INFO: renamed from: a */
    private final Future f46448a;

    public ore(Future future) {
        this.f46448a = future;
    }

    @Override // p000.orf
    /* JADX INFO: renamed from: cF */
    public final void mo18947cF() {
        this.f46448a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f46448a + "]";
    }
}
