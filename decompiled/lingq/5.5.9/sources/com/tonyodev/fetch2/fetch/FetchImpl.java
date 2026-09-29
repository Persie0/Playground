package com.tonyodev.fetch2.fetch;

import al.C0121h;
import al.InterfaceC0114a;
import android.os.Handler;
import cm.InterfaceC2041a;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2core.C4984a;
import com.tonyodev.fetch2core.Reason;
import dm.C5207g;
import ge.C5789m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p099el.C5426a;
import p122fl.InterfaceC5581d;
import p122fl.InterfaceC5585h;
import p122fl.InterfaceC5587j;
import p385sf.C9000b;
import p463wk.C9959b;
import p463wk.InterfaceC9958a;
import p489xk.C10221i;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchImpl implements InterfaceC9958a {

    /* JADX INFO: renamed from: a */
    public final Object f32412a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f32413b;

    /* JADX INFO: renamed from: c */
    public final RunnableC4969a f32414c;

    /* JADX INFO: renamed from: d */
    public final String f32415d;

    /* JADX INFO: renamed from: e */
    public final C9959b f32416e;

    /* JADX INFO: renamed from: f */
    public final C4984a f32417f;

    /* JADX INFO: renamed from: g */
    public final Handler f32418g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0114a f32419h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5587j f32420i;

    /* JADX INFO: renamed from: j */
    public final ListenerCoordinator f32421j;

    /* JADX INFO: renamed from: k */
    public final C10221i f32422k;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.FetchImpl$a */
    public static final class RunnableC4969a implements Runnable {

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.FetchImpl$a$a */
        public static final class a implements Runnable {
            public a(boolean z10, boolean z11) {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC4969a runnableC4969a = RunnableC4969a.this;
                synchronized (FetchImpl.this.f32412a) {
                }
                Iterator it = FetchImpl.this.f32413b.iterator();
                if (it.hasNext()) {
                    ((C5426a) it.next()).getClass();
                    Reason reason = Reason.NOT_SPECIFIED;
                    throw null;
                }
                synchronized (FetchImpl.this.f32412a) {
                }
                FetchImpl fetchImpl = FetchImpl.this;
                long j10 = fetchImpl.f32416e.f50674t;
                C4984a c4984a = fetchImpl.f32417f;
                RunnableC4969a runnableC4969a2 = fetchImpl.f32414c;
                c4984a.getClass();
                C5207g.m11112g(runnableC4969a2, "runnable");
                synchronized (c4984a.f32544a) {
                    if (!c4984a.f32545b) {
                        c4984a.f32547d.postDelayed(runnableC4969a2, j10);
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        public RunnableC4969a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FetchImpl fetchImpl = FetchImpl.this;
            synchronized (fetchImpl.f32412a) {
            }
            fetchImpl.f32418g.post(new a(fetchImpl.f32419h.mo514x(true), fetchImpl.f32419h.mo514x(false)));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public FetchImpl(String str, C9959b c9959b, C4984a c4984a, Handler handler, InterfaceC0114a interfaceC0114a, InterfaceC5587j interfaceC5587j, ListenerCoordinator listenerCoordinator, C10221i c10221i) {
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(c9959b, "fetchConfiguration");
        C5207g.m11112g(c4984a, "handlerWrapper");
        C5207g.m11112g(handler, "uiHandler");
        C5207g.m11112g(interfaceC0114a, "fetchHandler");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(listenerCoordinator, "listenerCoordinator");
        C5207g.m11112g(c10221i, "fetchDatabaseManagerWrapper");
        this.f32415d = str;
        this.f32416e = c9959b;
        this.f32417f = c4984a;
        this.f32418g = handler;
        this.f32419h = interfaceC0114a;
        this.f32420i = interfaceC5587j;
        this.f32421j = listenerCoordinator;
        this.f32422k = c10221i;
        this.f32412a = new Object();
        this.f32413b = new LinkedHashSet();
        RunnableC4969a runnableC4969a = new RunnableC4969a();
        this.f32414c = runnableC4969a;
        c4984a.m10687b(new InterfaceC2041a<C9072e>() { // from class: com.tonyodev.fetch2.fetch.FetchImpl.1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                FetchImpl.this.f32419h.mo510A0();
                return C9072e.f47360a;
            }
        });
        long j10 = c9959b.f50674t;
        synchronized (c4984a.f32544a) {
            if (!c4984a.f32545b) {
                c4984a.f32547d.postDelayed(runnableC4969a, j10);
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p463wk.InterfaceC9958a
    /* JADX INFO: renamed from: a */
    public final FetchImpl mo10651a(final int i10, final InterfaceC5581d... interfaceC5581dArr) {
        synchronized (this.f32412a) {
            try {
                this.f32417f.m10687b(new InterfaceC2041a<C9072e>() { // from class: com.tonyodev.fetch2.fetch.FetchImpl$attachFetchObserversForDownload$$inlined$synchronized$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        InterfaceC0114a interfaceC0114a = this.f32426b.f32419h;
                        InterfaceC5581d[] interfaceC5581dArr2 = interfaceC5581dArr;
                        interfaceC0114a.mo515z(i10, (InterfaceC5581d[]) Arrays.copyOf(interfaceC5581dArr2, interfaceC5581dArr2.length));
                        return C9072e.f47360a;
                    }
                });
            } finally {
            }
        }
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p463wk.InterfaceC9958a
    /* JADX INFO: renamed from: b */
    public final FetchImpl mo10652b(Request request, C5789m c5789m, InterfaceC5585h interfaceC5585h) {
        List listM17251q = C9000b.m17251q(request);
        C0121h c0121h = new C0121h(this, interfaceC5585h, c5789m);
        synchronized (this.f32412a) {
            try {
                this.f32417f.m10687b(new FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1(this, listM17251q, c0121h, interfaceC5585h));
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p463wk.InterfaceC9958a
    /* JADX INFO: renamed from: c */
    public final FetchImpl mo10653c() {
        InterfaceC2041a<List<? extends Download>> interfaceC2041a = new InterfaceC2041a<List<? extends Download>>() { // from class: com.tonyodev.fetch2.fetch.FetchImpl$cancelAll$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends Download> mo807E() {
                return this.f32429b.f32419h.mo511c();
            }
        };
        synchronized (this.f32412a) {
            this.f32417f.m10687b(new FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1(this, interfaceC2041a));
        }
        return this;
    }

    @Override // p463wk.InterfaceC9958a
    /* JADX INFO: renamed from: h */
    public final FetchImpl mo10654h(final int i10, final InterfaceC5581d... interfaceC5581dArr) {
        synchronized (this.f32412a) {
            this.f32417f.m10687b(new InterfaceC2041a<C9072e>() { // from class: com.tonyodev.fetch2.fetch.FetchImpl$removeFetchObserversForDownload$$inlined$synchronized$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    InterfaceC0114a interfaceC0114a = this.f32438b.f32419h;
                    InterfaceC5581d[] interfaceC5581dArr2 = interfaceC5581dArr;
                    interfaceC0114a.mo513h(i10, (InterfaceC5581d[]) Arrays.copyOf(interfaceC5581dArr2, interfaceC5581dArr2.length));
                    return C9072e.f47360a;
                }
            });
        }
        return this;
    }
}
