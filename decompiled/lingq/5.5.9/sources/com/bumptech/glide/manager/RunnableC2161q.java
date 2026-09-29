package com.bumptech.glide.manager;

import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.manager.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2161q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f10891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2160p.c.a f10892b;

    public RunnableC2161q(C2160p.c.a aVar, boolean z10) {
        this.f10892b = aVar;
        this.f10891a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2160p.c.a aVar = this.f10892b;
        aVar.getClass();
        C7492l.m14880a();
        C2160p.c cVar = C2160p.c.this;
        boolean z10 = cVar.f10886a;
        boolean z11 = this.f10891a;
        cVar.f10886a = z11;
        if (z10 != z11) {
            cVar.f10887b.mo6264a(z11);
        }
    }
}
