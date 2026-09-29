package com.tonyodev.fetch2.fetch;

import java.util.List;
import p122fl.InterfaceC5585h;

/* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.c */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4975c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1 f32510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f32511b;

    public RunnableC4975c(FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1 fetchImpl$executeCancelAction$$inlined$synchronized$lambda$1, List list) {
        this.f32510a = fetchImpl$executeCancelAction$$inlined$synchronized$lambda$1;
        this.f32511b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5585h interfaceC5585h = this.f32510a.f32436d;
        if (interfaceC5585h != null) {
            interfaceC5585h.mo520d(this.f32511b);
        }
    }
}
