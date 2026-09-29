package com.tonyodev.fetch2.fetch;

import com.tonyodev.fetch2.Error;

/* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4974b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1 f32508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Error f32509b;

    public RunnableC4974b(FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1 fetchImpl$enqueueRequest$$inlined$synchronized$lambda$1, Error error) {
        this.f32508a = fetchImpl$enqueueRequest$$inlined$synchronized$lambda$1;
        this.f32509b = error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32508a.f32433e.mo520d(this.f32509b);
    }
}
