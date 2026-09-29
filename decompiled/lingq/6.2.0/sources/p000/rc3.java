package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rc3 extends k93 {

    /* JADX INFO: renamed from: i */
    public final ListenableFuture f59064i;

    public rc3(ListenableFuture listenableFuture) {
        this.f59064i = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public final void mo52a(Runnable runnable, Executor executor) {
        this.f59064i.mo52a(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f59064i.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, java.util.concurrent.Future
    public final Object get() {
        return this.f59064i.get();
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f59064i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f59064i.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    public final String toString() {
        return this.f59064i.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f59064i.get(j, timeUnit);
    }
}
