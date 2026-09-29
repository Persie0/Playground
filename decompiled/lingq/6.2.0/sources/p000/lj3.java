package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class lj3 extends AbstractC3355n0 implements Runnable {

    /* JADX INFO: renamed from: h */
    public ListenableFuture f49737h;

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        this.f49737h = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        ListenableFuture listenableFuture = this.f49737h;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f49737h;
        if (listenableFuture != null) {
            m6387o(listenableFuture);
        }
    }
}
