package p000;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class yb1 extends CompletableFuture {

    /* JADX INFO: renamed from: a */
    public final br6 f69594a;

    public yb1(br6 br6Var) {
        this.f69594a = br6Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f69594a.cancel();
        }
        return super.cancel(z);
    }
}
