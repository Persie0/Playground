package com.bumptech.glide.load.engine;

import ae.C0062b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p356r5.InterfaceC8732b;
import p392t5.InterfaceC9207m;
import p392t5.RunnableC9196b;
import p392t5.ThreadFactoryC9195a;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2115a {

    /* JADX INFO: renamed from: a */
    public final boolean f10681a;

    /* JADX INFO: renamed from: b */
    public final HashMap f10682b;

    /* JADX INFO: renamed from: c */
    public final ReferenceQueue<C2121g<?>> f10683c;

    /* JADX INFO: renamed from: d */
    public C2121g.a f10684d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a */
    public static final class a extends WeakReference<C2121g<?>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8732b f10685a;

        /* JADX INFO: renamed from: b */
        public final boolean f10686b;

        /* JADX INFO: renamed from: c */
        public InterfaceC9207m<?> f10687c;

        public a(InterfaceC8732b interfaceC8732b, C2121g<?> c2121g, ReferenceQueue<? super C2121g<?>> referenceQueue, boolean z10) {
            InterfaceC9207m<?> interfaceC9207m;
            super(c2121g, referenceQueue);
            C0062b.m345f0(interfaceC8732b);
            this.f10685a = interfaceC8732b;
            if (c2121g.f10773a && z10) {
                interfaceC9207m = c2121g.f10775c;
                C0062b.m345f0(interfaceC9207m);
            } else {
                interfaceC9207m = null;
            }
            this.f10687c = interfaceC9207m;
            this.f10686b = c2121g.f10773a;
        }
    }

    public C2115a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC9195a());
        this.f10682b = new HashMap();
        this.f10683c = new ReferenceQueue<>();
        this.f10681a = false;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC9196b(this));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6305a(InterfaceC8732b interfaceC8732b, C2121g<?> c2121g) {
        try {
            a aVar = (a) this.f10682b.put(interfaceC8732b, new a(interfaceC8732b, c2121g, this.f10683c, this.f10681a));
            if (aVar != null) {
                aVar.f10687c = null;
                aVar.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m6306b(a aVar) {
        InterfaceC9207m<?> interfaceC9207m;
        synchronized (this) {
            this.f10682b.remove(aVar.f10685a);
            if (!aVar.f10686b || (interfaceC9207m = aVar.f10687c) == null) {
                return;
            }
            this.f10684d.mo6316a(aVar.f10685a, new C2121g<>(interfaceC9207m, true, false, aVar.f10685a, this.f10684d));
        }
    }
}
