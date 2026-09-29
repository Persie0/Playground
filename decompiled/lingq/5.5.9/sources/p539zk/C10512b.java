package p539zk;

import android.content.Context;
import android.content.Intent;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.downloader.ParallelFileDownloaderImpl;
import com.tonyodev.fetch2.downloader.SequentialFileDownloaderImpl;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.C6752c;
import p033bl.C1610a;
import p077dl.C5200a;
import p122fl.C5579b;
import p122fl.InterfaceC5582e;
import p122fl.InterfaceC5587j;
import p122fl.InterfaceC5589l;
import p170i5.C6195n;
import p290o6.C7967l0;
import p349qo.C8656b;
import p388t1.C9181g;
import sl.C9072e;

/* JADX INFO: renamed from: zk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10512b implements InterfaceC10511a {

    /* JADX INFO: renamed from: H */
    public final C9181g f52470H;

    /* JADX INFO: renamed from: I */
    public final ListenerCoordinator f52471I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC5582e f52472J;

    /* JADX INFO: renamed from: K */
    public final boolean f52473K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC5589l f52474L;

    /* JADX INFO: renamed from: M */
    public final Context f52475M;

    /* JADX INFO: renamed from: N */
    public final String f52476N;

    /* JADX INFO: renamed from: O */
    public final C6195n f52477O;

    /* JADX INFO: renamed from: P */
    public final int f52478P;

    /* JADX INFO: renamed from: Q */
    public final boolean f52479Q;

    /* JADX INFO: renamed from: a */
    public final Object f52480a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f52481b;

    /* JADX INFO: renamed from: c */
    public volatile int f52482c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, InterfaceRunnableC10513c> f52483d;

    /* JADX INFO: renamed from: e */
    public volatile int f52484e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f52485f;

    /* JADX INFO: renamed from: g */
    public final Downloader<?, ?> f52486g;

    /* JADX INFO: renamed from: h */
    public final long f52487h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5587j f52488i;

    /* JADX INFO: renamed from: j */
    public final C5200a f52489j;

    /* JADX INFO: renamed from: k */
    public final boolean f52490k;

    /* JADX INFO: renamed from: l */
    public final C7967l0 f52491l;

    /* JADX INFO: renamed from: zk.b$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Download f52493b;

        public a(Download download) {
            this.f52493b = download;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            Intent intent;
            boolean z10;
            try {
                Thread threadCurrentThread = Thread.currentThread();
                C5207g.m11107b(threadCurrentThread, "Thread.currentThread()");
                threadCurrentThread.setName(this.f52493b.mo10575H() + '-' + this.f52493b.getF32331a());
            } catch (Exception unused) {
            }
            try {
                try {
                    InterfaceRunnableC10513c interfaceRunnableC10513cM19492r = C10512b.this.m19492r(this.f52493b);
                    synchronized (C10512b.this.f52480a) {
                        try {
                            if (C10512b.this.f52483d.containsKey(Integer.valueOf(this.f52493b.getF32331a()))) {
                                C10512b c10512b = C10512b.this;
                                interfaceRunnableC10513cM19492r.mo10644y1(new C1610a(c10512b.f52491l, c10512b.f52471I.f32447g, c10512b.f52490k, c10512b.f52478P));
                                C10512b.this.f52483d.put(Integer.valueOf(this.f52493b.getF32331a()), interfaceRunnableC10513cM19492r);
                                C9181g c9181g = C10512b.this.f52470H;
                                int f32331a = this.f52493b.getF32331a();
                                synchronized (c9181g.f47723d) {
                                    ((Map) c9181g.f47721b).put(Integer.valueOf(f32331a), interfaceRunnableC10513cM19492r);
                                    C9072e c9072e = C9072e.f47360a;
                                }
                                C10512b.this.f52488i.mo11829b("DownloadManager starting download " + this.f52493b);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (z10) {
                        interfaceRunnableC10513cM19492r.run();
                    }
                    C10512b.m19488a(C10512b.this, this.f52493b);
                    C10512b.this.f52477O.m12711a();
                    C10512b.m19488a(C10512b.this, this.f52493b);
                    intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                } catch (Throwable th3) {
                    C10512b.m19488a(C10512b.this, this.f52493b);
                    Intent intent2 = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                    intent2.setPackage(C10512b.this.f52475M.getPackageName());
                    intent2.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", C10512b.this.f52476N);
                    C10512b.this.f52475M.sendBroadcast(intent2);
                    throw th3;
                }
            } catch (Exception e10) {
                C10512b.this.f52488i.mo11831d("DownloadManager failed to start download " + this.f52493b, e10);
                C10512b.m19488a(C10512b.this, this.f52493b);
                intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
            }
            intent.setPackage(C10512b.this.f52475M.getPackageName());
            intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", C10512b.this.f52476N);
            C10512b.this.f52475M.sendBroadcast(intent);
        }
    }

    public C10512b(Downloader<?, ?> downloader, int i10, long j10, InterfaceC5587j interfaceC5587j, C5200a c5200a, boolean z10, C7967l0 c7967l0, C9181g c9181g, ListenerCoordinator listenerCoordinator, InterfaceC5582e interfaceC5582e, boolean z11, InterfaceC5589l interfaceC5589l, Context context, String str, C6195n c6195n, int i11, boolean z12) {
        C5207g.m11112g(downloader, "httpDownloader");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(c9181g, "downloadManagerCoordinator");
        C5207g.m11112g(listenerCoordinator, "listenerCoordinator");
        C5207g.m11112g(interfaceC5582e, "fileServerDownloader");
        C5207g.m11112g(interfaceC5589l, "storageResolver");
        C5207g.m11112g(context, "context");
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(c6195n, "groupInfoProvider");
        this.f52486g = downloader;
        this.f52487h = j10;
        this.f52488i = interfaceC5587j;
        this.f52489j = c5200a;
        this.f52490k = z10;
        this.f52491l = c7967l0;
        this.f52470H = c9181g;
        this.f52471I = listenerCoordinator;
        this.f52472J = interfaceC5582e;
        this.f52473K = z11;
        this.f52474L = interfaceC5589l;
        this.f52475M = context;
        this.f52476N = str;
        this.f52477O = c6195n;
        this.f52478P = i11;
        this.f52479Q = z12;
        this.f52480a = new Object();
        this.f52481b = i10 > 0 ? Executors.newFixedThreadPool(i10) : null;
        this.f52482c = i10;
        this.f52483d = new HashMap<>();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m19488a(C10512b c10512b, Download download) {
        synchronized (c10512b.f52480a) {
            if (c10512b.f52483d.containsKey(Integer.valueOf(download.getF32331a()))) {
                c10512b.f52483d.remove(Integer.valueOf(download.getF32331a()));
                c10512b.f52484e--;
            }
            c10512b.f52470H.m17514c(download.getF32331a());
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p539zk.InterfaceC10511a
    /* JADX INFO: renamed from: H0 */
    public final boolean mo19483H0(int i10) {
        boolean zM19490l;
        synchronized (this.f52480a) {
            try {
                zM19490l = m19490l(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM19490l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p539zk.InterfaceC10511a
    /* JADX INFO: renamed from: T0 */
    public final boolean mo19484T0(Download download) {
        synchronized (this.f52480a) {
            try {
                if (this.f52485f) {
                    throw new FetchException("DownloadManager is already shutdown.");
                }
                if (this.f52483d.containsKey(Integer.valueOf(download.getF32331a()))) {
                    this.f52488i.mo11829b("DownloadManager already running download " + download);
                    return false;
                }
                if (this.f52484e >= this.f52482c) {
                    this.f52488i.mo11829b("DownloadManager cannot init download " + download + " because the download queue is full");
                    return false;
                }
                this.f52484e++;
                this.f52483d.put(Integer.valueOf(download.getF32331a()), null);
                C9181g c9181g = this.f52470H;
                int f32331a = download.getF32331a();
                synchronized (c9181g.f47723d) {
                    ((Map) c9181g.f47721b).put(Integer.valueOf(f32331a), null);
                    C9072e c9072e = C9072e.f47360a;
                }
                ExecutorService executorService = this.f52481b;
                if (executorService == null || executorService.isShutdown()) {
                    return false;
                }
                executorService.execute(new a(download));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m19489b() {
        List listM13453u0;
        if (this.f52482c > 0) {
            C9181g c9181g = this.f52470H;
            synchronized (c9181g.f47723d) {
                try {
                    listM13453u0 = C6752c.m13453u0(((Map) c9181g.f47721b).values());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = listM13453u0.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    InterfaceRunnableC10513c interfaceRunnableC10513c = (InterfaceRunnableC10513c) it.next();
                    if (interfaceRunnableC10513c != null) {
                        interfaceRunnableC10513c.mo10631H();
                        this.f52470H.m17514c(interfaceRunnableC10513c.mo10636d1().f32331a);
                        this.f52488i.mo11829b("DownloadManager cancelled download " + interfaceRunnableC10513c.mo10636d1());
                    }
                }
            }
        }
        this.f52483d.clear();
        this.f52484e = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p539zk.InterfaceC10511a
    /* JADX INFO: renamed from: c */
    public final void mo19485c() {
        synchronized (this.f52480a) {
            if (this.f52485f) {
                throw new FetchException("DownloadManager is already shutdown.");
            }
            m19489b();
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f52480a) {
            if (this.f52485f) {
                return;
            }
            this.f52485f = true;
            if (this.f52482c > 0) {
                m19493w();
            }
            this.f52488i.mo11829b("DownloadManager closing download manager");
            try {
                ExecutorService executorService = this.f52481b;
                if (executorService != null) {
                    executorService.shutdown();
                    C9072e c9072e = C9072e.f47360a;
                }
            } catch (Exception unused) {
                C9072e c9072e2 = C9072e.f47360a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    @Override // p539zk.InterfaceC10511a
    /* JADX INFO: renamed from: g0 */
    public final boolean mo19486g0(int i10) {
        boolean z10;
        boolean zContainsKey;
        synchronized (this.f52480a) {
            if (this.f52485f) {
                z10 = false;
            } else {
                C9181g c9181g = this.f52470H;
                synchronized (c9181g.f47723d) {
                    try {
                        zContainsKey = ((Map) c9181g.f47721b).containsKey(Integer.valueOf(i10));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (zContainsKey) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m19490l(int i10) {
        if (this.f52485f) {
            throw new FetchException("DownloadManager is already shutdown.");
        }
        InterfaceRunnableC10513c interfaceRunnableC10513c = this.f52483d.get(Integer.valueOf(i10));
        if (interfaceRunnableC10513c != null) {
            interfaceRunnableC10513c.mo10631H();
            this.f52483d.remove(Integer.valueOf(i10));
            this.f52484e--;
            this.f52470H.m17514c(i10);
            this.f52488i.mo11829b("DownloadManager cancelled download " + interfaceRunnableC10513c.mo10636d1());
            return interfaceRunnableC10513c.mo10643s0();
        }
        C9181g c9181g = this.f52470H;
        synchronized (c9181g.f47723d) {
            InterfaceRunnableC10513c interfaceRunnableC10513c2 = (InterfaceRunnableC10513c) ((Map) c9181g.f47721b).get(Integer.valueOf(i10));
            if (interfaceRunnableC10513c2 != null) {
                interfaceRunnableC10513c2.mo10631H();
                ((Map) c9181g.f47721b).remove(Integer.valueOf(i10));
            }
            C9072e c9072e = C9072e.f47360a;
        }
        return false;
    }

    @Override // p539zk.InterfaceC10511a
    /* JADX INFO: renamed from: l0 */
    public final boolean mo19487l0() {
        boolean z10;
        synchronized (this.f52480a) {
            z10 = !this.f52485f && this.f52484e < this.f52482c;
        }
        return z10;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceRunnableC10513c m19491q(Download download, Downloader<?, ?> downloader) {
        Downloader.C4980b c4980bM16916x = C8656b.m16916x(download, "GET");
        downloader.mo10672D0(c4980bM16916x);
        return downloader.mo10679u0(c4980bM16916x, downloader.mo10674Y0(c4980bM16916x)) == Downloader.FileDownloaderType.SEQUENTIAL ? new SequentialFileDownloaderImpl(download, downloader, this.f52487h, this.f52488i, this.f52489j, this.f52490k, this.f52473K, this.f52474L, this.f52479Q) : new ParallelFileDownloaderImpl(download, downloader, this.f52487h, this.f52488i, this.f52489j, this.f52490k, this.f52474L.mo11808f(c4980bM16916x), this.f52473K, this.f52474L, this.f52479Q);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceRunnableC10513c m19492r(Download download) {
        C5207g.m11112g(download, "download");
        return !C5579b.m11826r(download.mo10577L()) ? m19491q(download, this.f52486g) : m19491q(download, this.f52472J);
    }

    /* JADX INFO: renamed from: w */
    public final void m19493w() {
        Iterator<Map.Entry<Integer, InterfaceRunnableC10513c>> it = this.f52483d.entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    this.f52483d.clear();
                    this.f52484e = 0;
                    return;
                }
                Map.Entry<Integer, InterfaceRunnableC10513c> next = it.next();
                InterfaceRunnableC10513c value = next.getValue();
                if (value != null) {
                    value.mo10632X0();
                    this.f52488i.mo11829b("DownloadManager terminated download " + value.mo10636d1());
                    this.f52470H.m17514c(next.getKey().intValue());
                }
            }
        }
    }
}
