package com.tonyodev.fetch2.fetch;

import com.tonyodev.fetch2.Error;

/* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.d */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4976d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1 f32512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Error f32513b;

    public RunnableC4976d(FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1 fetchImpl$executeCancelAction$$inlined$synchronized$lambda$1, Error error) {
        this.f32512a = fetchImpl$executeCancelAction$$inlined$synchronized$lambda$1;
        this.f32513b = error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32512a.f32437e.mo520d(this.f32513b);
    }
}
