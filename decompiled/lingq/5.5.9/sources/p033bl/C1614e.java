package p033bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2.helper.PriorityListProcessorImpl$networkChangeListener$1;
import com.tonyodev.fetch2core.C4984a;
import dm.C5207g;
import p041c5.C1702c;
import p077dl.C5200a;
import p122fl.InterfaceC5587j;
import p539zk.C10512b;
import p539zk.InterfaceC10511a;
import sl.C9072e;

/* JADX INFO: renamed from: bl.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1614e implements InterfaceC1611b<Download> {

    /* JADX INFO: renamed from: H */
    public final InterfaceC5587j f9116H;

    /* JADX INFO: renamed from: I */
    public final ListenerCoordinator f9117I;

    /* JADX INFO: renamed from: J */
    public volatile int f9118J;

    /* JADX INFO: renamed from: K */
    public final Context f9119K;

    /* JADX INFO: renamed from: L */
    public final String f9120L;

    /* JADX INFO: renamed from: M */
    public final PrioritySort f9121M;

    /* JADX INFO: renamed from: a */
    public final Object f9122a;

    /* JADX INFO: renamed from: b */
    public volatile NetworkType f9123b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f9124c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f9125d;

    /* JADX INFO: renamed from: e */
    public volatile long f9126e;

    /* JADX INFO: renamed from: f */
    public final PriorityListProcessorImpl$networkChangeListener$1 f9127f;

    /* JADX INFO: renamed from: g */
    public final C1612c f9128g;

    /* JADX INFO: renamed from: h */
    public final RunnableC1613d f9129h;

    /* JADX INFO: renamed from: i */
    public final C4984a f9130i;

    /* JADX INFO: renamed from: j */
    public final C1702c f9131j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC10511a f9132k;

    /* JADX INFO: renamed from: l */
    public final C5200a f9133l;

    public C1614e(C4984a c4984a, C1702c c1702c, C10512b c10512b, C5200a c5200a, InterfaceC5587j interfaceC5587j, ListenerCoordinator listenerCoordinator, int i10, Context context, String str, PrioritySort prioritySort) {
        C5207g.m11112g(c4984a, "handlerWrapper");
        C5207g.m11112g(c1702c, "downloadProvider");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(listenerCoordinator, "listenerCoordinator");
        C5207g.m11112g(context, "context");
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(prioritySort, "prioritySort");
        this.f9130i = c4984a;
        this.f9131j = c1702c;
        this.f9132k = c10512b;
        this.f9133l = c5200a;
        this.f9116H = interfaceC5587j;
        this.f9117I = listenerCoordinator;
        this.f9118J = i10;
        this.f9119K = context;
        this.f9120L = str;
        this.f9121M = prioritySort;
        this.f9122a = new Object();
        this.f9123b = NetworkType.GLOBAL_OFF;
        this.f9125d = true;
        this.f9126e = 500L;
        PriorityListProcessorImpl$networkChangeListener$1 priorityListProcessorImpl$networkChangeListener$1 = new PriorityListProcessorImpl$networkChangeListener$1(this);
        this.f9127f = priorityListProcessorImpl$networkChangeListener$1;
        C1612c c1612c = new C1612c(this);
        this.f9128g = c1612c;
        synchronized (c5200a.f33250a) {
            c5200a.f33251b.add(priorityListProcessorImpl$networkChangeListener$1);
        }
        context.registerReceiver(c1612c, new IntentFilter("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET"));
        this.f9129h = new RunnableC1613d(this);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5269a(C1614e c1614e) {
        return (c1614e.f9125d || c1614e.f9124c) ? false : true;
    }

    @Override // p033bl.InterfaceC1611b
    /* JADX INFO: renamed from: F */
    public final void mo5265F() {
        synchronized (this.f9122a) {
            m5271l();
            this.f9124c = false;
            this.f9125d = false;
            m5270b();
            this.f9116H.mo11829b("PriorityIterator resumed");
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p033bl.InterfaceC1611b
    /* JADX INFO: renamed from: R0 */
    public final boolean mo5266R0() {
        return this.f9124c;
    }

    @Override // p033bl.InterfaceC1611b
    /* JADX INFO: renamed from: V0 */
    public final void mo5267V0() {
        synchronized (this.f9122a) {
            Intent intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
            intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", this.f9120L);
            this.f9119K.sendBroadcast(intent);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5270b() {
        if (this.f9118J > 0) {
            C4984a c4984a = this.f9130i;
            RunnableC1613d runnableC1613d = this.f9129h;
            long j10 = this.f9126e;
            c4984a.getClass();
            C5207g.m11112g(runnableC1613d, "runnable");
            synchronized (c4984a.f32544a) {
                if (!c4984a.f32545b) {
                    c4984a.f32547d.postDelayed(runnableC1613d, j10);
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9122a) {
            try {
                C5200a c5200a = this.f9133l;
                PriorityListProcessorImpl$networkChangeListener$1 priorityListProcessorImpl$networkChangeListener$1 = this.f9127f;
                c5200a.getClass();
                C5207g.m11112g(priorityListProcessorImpl$networkChangeListener$1, "networkChangeListener");
                synchronized (c5200a.f33250a) {
                    try {
                        c5200a.f33251b.remove(priorityListProcessorImpl$networkChangeListener$1);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f9119K.unregisterReceiver(this.f9128g);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p033bl.InterfaceC1611b
    /* JADX INFO: renamed from: i */
    public final boolean mo5268i() {
        return this.f9125d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final void m5271l() {
        synchronized (this.f9122a) {
            try {
                this.f9126e = 500L;
                m5273r();
                m5270b();
                this.f9116H.mo11829b("PriorityIterator backoffTime reset to " + this.f9126e + " milliseconds");
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p033bl.InterfaceC1611b
    public final void pause() {
        synchronized (this.f9122a) {
            try {
                m5273r();
                this.f9124c = true;
                this.f9125d = false;
                this.f9132k.mo19485c();
                this.f9116H.mo11829b("PriorityIterator paused");
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5272q(NetworkType networkType) {
        C5207g.m11112g(networkType, "<set-?>");
        this.f9123b = networkType;
    }

    /* JADX INFO: renamed from: r */
    public final void m5273r() {
        if (this.f9118J > 0) {
            C4984a c4984a = this.f9130i;
            RunnableC1613d runnableC1613d = this.f9129h;
            c4984a.getClass();
            C5207g.m11112g(runnableC1613d, "runnable");
            synchronized (c4984a.f32544a) {
                if (!c4984a.f32545b) {
                    c4984a.f32547d.removeCallbacks(runnableC1613d);
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    @Override // p033bl.InterfaceC1611b
    public final void start() {
        synchronized (this.f9122a) {
            m5271l();
            this.f9125d = false;
            this.f9124c = false;
            m5270b();
            this.f9116H.mo11829b("PriorityIterator started");
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p033bl.InterfaceC1611b
    public final void stop() {
        synchronized (this.f9122a) {
            try {
                m5273r();
                this.f9124c = false;
                this.f9125d = true;
                this.f9132k.mo19485c();
                this.f9116H.mo11829b("PriorityIterator stop");
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
