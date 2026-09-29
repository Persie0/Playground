package com.tonyodev.fetch2.downloader;

import cm.InterfaceC2041a;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C6740a;
import kotlin.KotlinNullPointerException;
import kotlin.collections.EmptyList;
import p033bl.C1610a;
import p077dl.C5200a;
import p122fl.AbstractC5588k;
import p122fl.C5579b;
import p122fl.C5583f;
import p122fl.C5584g;
import p122fl.InterfaceC5586i;
import p122fl.InterfaceC5587j;
import p122fl.InterfaceC5589l;
import p349qo.C8656b;
import p385sf.C9000b;
import p443w.C9783n;
import p539zk.InterfaceRunnableC10513c;
import p539zk.RunnableC10514d;
import sl.C9072e;
import sl.InterfaceC9070c;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFileDownloaderImpl implements InterfaceRunnableC10513c {

    /* JADX INFO: renamed from: H */
    public int f32356H;

    /* JADX INFO: renamed from: I */
    public final Object f32357I;

    /* JADX INFO: renamed from: J */
    public volatile Throwable f32358J;

    /* JADX INFO: renamed from: K */
    public List<C5583f> f32359K;

    /* JADX INFO: renamed from: L */
    public AbstractC5588k f32360L;

    /* JADX INFO: renamed from: M */
    public int f32361M;

    /* JADX INFO: renamed from: N */
    public final C4966a f32362N;

    /* JADX INFO: renamed from: O */
    public final Download f32363O;

    /* JADX INFO: renamed from: P */
    public final Downloader<?, ?> f32364P;

    /* JADX INFO: renamed from: Q */
    public final long f32365Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC5587j f32366R;

    /* JADX INFO: renamed from: S */
    public final C5200a f32367S;

    /* JADX INFO: renamed from: T */
    public final boolean f32368T;

    /* JADX INFO: renamed from: U */
    public final String f32369U;

    /* JADX INFO: renamed from: V */
    public final boolean f32370V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC5589l f32371W;

    /* JADX INFO: renamed from: X */
    public final boolean f32372X;

    /* JADX INFO: renamed from: a */
    public volatile boolean f32373a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f32374b;

    /* JADX INFO: renamed from: c */
    public InterfaceRunnableC10513c.a f32375c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f32376d;

    /* JADX INFO: renamed from: e */
    public volatile long f32377e;

    /* JADX INFO: renamed from: f */
    public volatile long f32378f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f32379g;

    /* JADX INFO: renamed from: h */
    public double f32380h;

    /* JADX INFO: renamed from: i */
    public final C9783n f32381i;

    /* JADX INFO: renamed from: j */
    public long f32382j;

    /* JADX INFO: renamed from: k */
    public ExecutorService f32383k;

    /* JADX INFO: renamed from: l */
    public volatile int f32384l;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.downloader.ParallelFileDownloaderImpl$a */
    public static final class C4966a implements InterfaceC5586i {
        public C4966a() {
        }

        @Override // p122fl.InterfaceC5586i
        /* JADX INFO: renamed from: i */
        public final boolean mo431i() {
            return ParallelFileDownloaderImpl.this.f32373a;
        }
    }

    public ParallelFileDownloaderImpl(Download download, Downloader<?, ?> downloader, long j10, InterfaceC5587j interfaceC5587j, C5200a c5200a, boolean z10, String str, boolean z11, InterfaceC5589l interfaceC5589l, boolean z12) {
        C5207g.m11112g(download, "initialDownload");
        C5207g.m11112g(downloader, "downloader");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(c5200a, "networkInfoProvider");
        C5207g.m11112g(str, "fileTempDir");
        C5207g.m11112g(interfaceC5589l, "storageResolver");
        this.f32363O = download;
        this.f32364P = downloader;
        this.f32365Q = j10;
        this.f32366R = interfaceC5587j;
        this.f32367S = c5200a;
        this.f32368T = z10;
        this.f32369U = str;
        this.f32370V = z11;
        this.f32371W = interfaceC5589l;
        this.f32372X = z12;
        this.f32376d = C6740a.m13372a(new InterfaceC2041a<DownloadInfo>() { // from class: com.tonyodev.fetch2.downloader.ParallelFileDownloaderImpl$downloadInfo$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final DownloadInfo mo807E() {
                ParallelFileDownloaderImpl parallelFileDownloaderImpl = this.f32386b;
                Download download2 = parallelFileDownloaderImpl.f32363O;
                InterfaceRunnableC10513c.a aVar = parallelFileDownloaderImpl.f32375c;
                if (aVar != null) {
                    DownloadInfo downloadInfoMo5262e = aVar.mo5262e();
                    C9000b.m17258x(download2, downloadInfoMo5262e);
                    return downloadInfoMo5262e;
                }
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                C5207g.m11115j(C5207g.class.getName(), kotlinNullPointerException);
                throw kotlinNullPointerException;
            }
        });
        this.f32378f = -1L;
        this.f32381i = new C9783n();
        this.f32382j = -1L;
        this.f32357I = new Object();
        this.f32359K = EmptyList.f38032a;
        this.f32362N = new C4966a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10630a(ParallelFileDownloaderImpl parallelFileDownloaderImpl) {
        synchronized (parallelFileDownloaderImpl.f32357I) {
            try {
                parallelFileDownloaderImpl.f32384l++;
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: H */
    public final void mo10631H() {
        InterfaceRunnableC10513c.a aVar = this.f32375c;
        if (!(aVar instanceof C1610a)) {
            aVar = null;
        }
        C1610a c1610a = (C1610a) aVar;
        if (c1610a != null) {
            c1610a.f9109a = true;
        }
        this.f32373a = true;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: X0 */
    public final void mo10632X0() {
        InterfaceRunnableC10513c.a aVar = this.f32375c;
        if (!(aVar instanceof C1610a)) {
            aVar = null;
        }
        C1610a c1610a = (C1610a) aVar;
        if (c1610a != null) {
            c1610a.f9109a = true;
        }
        this.f32374b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m10633b(Downloader.C4980b c4980b, ArrayList arrayList) throws IOException {
        boolean z10 = false;
        this.f32384l = 0;
        this.f32356H = arrayList.size();
        if (!this.f32371W.mo11804b(c4980b.f32533d)) {
            InterfaceC5589l interfaceC5589l = this.f32371W;
            String str = c4980b.f32533d;
            if (this.f32363O.getF32323J() == EnqueueAction.INCREMENT_FILE_NAME) {
                z10 = true;
            }
            interfaceC5589l.mo11807e(str, z10);
        }
        if (this.f32372X) {
            this.f32371W.mo11805c(c4980b.f32533d, m10637e().f32339i);
        }
        AbstractC5588k abstractC5588kMo11803a = this.f32371W.mo11803a(c4980b);
        this.f32360L = abstractC5588kMo11803a;
        if (abstractC5588kMo11803a != null) {
            abstractC5588kMo11803a.mo11840a(0L);
        }
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C5583f c5583f = (C5583f) it.next();
                if (this.f32373a || this.f32374b) {
                    break loop0;
                }
                ExecutorService executorService = this.f32383k;
                if (executorService != null) {
                    executorService.execute(new RunnableC10514d(this, c5583f));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m10634c() {
        double d10 = this.f32380h;
        if (d10 < 1) {
            return 0L;
        }
        return (long) Math.ceil(d10);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceRunnableC10513c.a m10635d() {
        return this.f32375c;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: d1 */
    public final DownloadInfo mo10636d1() {
        m10637e().f32338h = this.f32377e;
        m10637e().f32339i = this.f32378f;
        return m10637e();
    }

    /* JADX INFO: renamed from: e */
    public final DownloadInfo m10637e() {
        return (DownloadInfo) this.f32376d.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final List<C5583f> m10638f(boolean z10, Downloader.C4980b c4980b) {
        int iLongValue;
        long jLongValue;
        C5584g c5584g;
        long jLongValue2;
        if (!this.f32371W.mo11804b(m10637e().f32334d)) {
            C8656b.m16909q(this.f32369U, m10637e().f32331a);
        }
        int i10 = m10637e().f32331a;
        String str = this.f32369U;
        C5207g.m11112g(str, "fileTempDir");
        try {
            Long lM11822n = C5579b.m11822n(C8656b.m16914v(str, i10));
            iLongValue = lM11822n != null ? (int) lM11822n.longValue() : -1;
        } catch (Exception unused) {
        }
        int i11 = 1;
        if (!z10 || this.f32379g) {
            if (iLongValue != 1) {
                C8656b.m16909q(this.f32369U, m10637e().f32331a);
            }
            C8656b.m16892S(this.f32369U, m10637e().f32331a, 1);
            int i12 = m10637e().f32331a;
            long j10 = this.f32378f;
            int i13 = m10637e().f32331a;
            String str2 = this.f32369U;
            C5207g.m11112g(str2, "fileTempDir");
            try {
                Long lM11822n2 = C5579b.m11822n(C8656b.m16911s(str2, i13, 1));
                jLongValue = lM11822n2 != null ? lM11822n2.longValue() : 0L;
            } catch (Exception unused2) {
            }
            C5583f c5583f = new C5583f(i12, 1, 0L, j10, jLongValue);
            this.f32377e += c5583f.f34396e;
            return C9000b.m17251q(c5583f);
        }
        this.f32364P.mo10678t0(c4980b);
        long j11 = this.f32378f;
        float f3 = j11;
        float f10 = (f3 / 1024.0f) * 1024.0f;
        if (1024.0f * f10 >= 1.0f) {
            c5584g = new C5584g(6, (long) Math.ceil(f3 / 6));
        } else {
            c5584g = f10 >= 1.0f ? new C5584g(4, (long) Math.ceil(f3 / 4)) : new C5584g(2, j11);
        }
        if (iLongValue != c5584g.f34397a) {
            C8656b.m16909q(this.f32369U, m10637e().f32331a);
        }
        C8656b.m16892S(this.f32369U, m10637e().f32331a, c5584g.f34397a);
        ArrayList arrayList = new ArrayList();
        int i14 = c5584g.f34397a;
        if (1 > i14) {
            return arrayList;
        }
        long j12 = 0;
        while (!this.f32373a && !this.f32374b) {
            long j13 = c5584g.f34397a == i11 ? this.f32378f : c5584g.f34398b + j12;
            int i15 = m10637e().f32331a;
            int i16 = m10637e().f32331a;
            String str3 = this.f32369U;
            C5207g.m11112g(str3, "fileTempDir");
            try {
                Long lM11822n3 = C5579b.m11822n(C8656b.m16911s(str3, i16, i11));
                jLongValue2 = lM11822n3 != null ? lM11822n3.longValue() : 0L;
            } catch (Exception unused3) {
            }
            C5583f c5583f2 = new C5583f(i15, i11, j12, j13, jLongValue2);
            this.f32377e += c5583f2.f34396e;
            arrayList.add(c5583f2);
            if (i11 == i14) {
                return arrayList;
            }
            i11++;
            j12 = j13;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10639g() {
        return this.f32374b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10640h() {
        if ((this.f32377e > 0 && this.f32378f > 0) || this.f32379g) {
            if (this.f32377e >= this.f32378f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m10641i(Downloader.C4979a c4979a) {
        if (c4979a.f32522b && c4979a.f32523c == -1) {
            this.f32379g = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10642j() {
        long j10 = this.f32377e;
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        while (this.f32384l != this.f32356H && !this.f32373a && !this.f32374b) {
            m10637e().f32338h = this.f32377e;
            m10637e().f32339i = this.f32378f;
            boolean zM11825q = C5579b.m11825q(jNanoTime2, System.nanoTime(), 1000L);
            if (zM11825q) {
                this.f32381i.m18279a(this.f32377e - j10);
                this.f32380h = C9783n.m18278b(this.f32381i);
                this.f32382j = C5579b.m11810b(this.f32377e, this.f32378f, m10634c());
                j10 = this.f32377e;
            }
            if (C5579b.m11825q(jNanoTime, System.nanoTime(), this.f32365Q)) {
                synchronized (this.f32357I) {
                    if (!this.f32373a && !this.f32374b) {
                        m10637e().f32338h = this.f32377e;
                        m10637e().f32339i = this.f32378f;
                        InterfaceRunnableC10513c.a aVar = this.f32375c;
                        if (aVar != null) {
                            aVar.mo5258a(m10637e());
                        }
                        m10637e().f32329P = this.f32382j;
                        m10637e().f32330Q = m10634c();
                        InterfaceRunnableC10513c.a aVar2 = this.f32375c;
                        if (aVar2 != null) {
                            aVar2.mo5261d(m10637e(), m10637e().f32329P, m10637e().f32330Q);
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
                jNanoTime = System.nanoTime();
            }
            if (zM11825q) {
                jNanoTime2 = System.nanoTime();
            }
            try {
                Thread.sleep(this.f32365Q);
            } catch (InterruptedException e10) {
                this.f32366R.mo11831d("FileDownloader", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0515  */
    /* JADX WARN: Code duplicated, block: B:233:0x0517  */
    /* JADX WARN: Code duplicated, block: B:236:0x051c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0525 A[Catch: Exception -> 0x052b, TRY_LEAVE, TryCatch #2 {Exception -> 0x052b, blocks: (B:239:0x0521, B:241:0x0525), top: B:269:0x0521 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x0536 A[Catch: Exception -> 0x053c, TRY_LEAVE, TryCatch #8 {Exception -> 0x053c, blocks: (B:245:0x0532, B:247:0x0536), top: B:280:0x0532 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0558  */
    /* JADX WARN: Code duplicated, block: B:259:0x055b  */
    /* JADX WARN: Code duplicated, block: B:262:0x0560  */
    /* JADX WARN: Code duplicated, block: B:267:0x0545 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        Downloader.C4979a c4979aMo10675p;
        InterfaceRunnableC10513c.a aVar;
        InterfaceRunnableC10513c.a aVar2;
        C1610a c1610a;
        AbstractC5588k abstractC5588k;
        ExecutorService executorService;
        Exception exc;
        Downloader<?, ?> downloader;
        InterfaceRunnableC10513c.a aVar3;
        InterfaceRunnableC10513c.a aVar4;
        C1610a c1610a2;
        InterfaceRunnableC10513c.a aVarM10635d;
        try {
            try {
                try {
                    this.f32377e = this.f32363O.mo10574F();
                    this.f32378f = this.f32363O.mo10591u();
                    m10637e().m10601c(this.f32377e);
                    m10637e().m10611w(this.f32378f);
                    this.f32364P.mo10672D0(C8656b.m16916x(this.f32363O, "GET"));
                    Downloader.C4980b c4980bM16916x = C8656b.m16916x(this.f32363O, "GET");
                    c4979aMo10675p = this.f32364P.mo10675p(c4980bM16916x, this.f32362N);
                    if (c4979aMo10675p != null) {
                        try {
                            m10641i(c4979aMo10675p);
                        } catch (Exception e10) {
                            exc = e10;
                            if (!mo10643s0() && !m10639g()) {
                                this.f32366R.mo11831d("FileDownloader download:" + mo10636d1(), exc);
                                Error errorM17247m = C9000b.m17247m(exc);
                                errorM17247m.setThrowable(exc);
                                if (c4979aMo10675p != null) {
                                    errorM17247m.setHttpResponse(C5579b.m11811c(c4979aMo10675p));
                                }
                                if (this.f32368T) {
                                    boolean z10 = !this.f32367S.m10971b();
                                    for (int i10 = 1; i10 <= 10; i10++) {
                                        try {
                                            Thread.sleep(500L);
                                            if (!this.f32367S.m10971b()) {
                                                z10 = true;
                                                break;
                                            }
                                        } catch (InterruptedException e11) {
                                            this.f32366R.mo11831d("FileDownloader", e11);
                                        }
                                    }
                                    if (z10) {
                                        errorM17247m = Error.NO_NETWORK_CONNECTION;
                                    }
                                }
                                m10637e().m10601c(this.f32377e);
                                m10637e().m10611w(this.f32378f);
                                m10637e().m10604h(errorM17247m);
                                if (!m10639g() && !mo10643s0()) {
                                    m10637e().m10605j(-1L);
                                    m10637e().m10602d(-1L);
                                    InterfaceRunnableC10513c.a aVarM10635d2 = m10635d();
                                    if (aVarM10635d2 != null) {
                                        aVarM10635d2.mo5260c(m10637e(), errorM17247m, exc);
                                        C9072e c9072e = C9072e.f47360a;
                                    }
                                }
                            }
                            try {
                                ExecutorService executorService2 = this.f32383k;
                                if (executorService2 != null) {
                                    executorService2.shutdown();
                                    C9072e c9072e2 = C9072e.f47360a;
                                }
                            } catch (Exception e12) {
                                this.f32366R.mo11831d("FileDownloader", e12);
                            }
                            try {
                                AbstractC5588k abstractC5588k2 = this.f32360L;
                                if (abstractC5588k2 != null) {
                                    abstractC5588k2.close();
                                    C9072e c9072e3 = C9072e.f47360a;
                                }
                            } catch (Exception e13) {
                                this.f32366R.mo11831d("FileDownloader", e13);
                            }
                            if (c4979aMo10675p != null) {
                                downloader = this.f32364P;
                            }
                            aVar3 = this.f32375c;
                            if (aVar3 instanceof C1610a) {
                                aVar4 = aVar3;
                            } else {
                                aVar4 = null;
                            }
                            c1610a2 = (C1610a) aVar4;
                            if (c1610a2 != null) {
                                c1610a2.f9109a = true;
                            }
                            this.f32374b = true;
                        }
                    }
                    if (mo10643s0() || m10639g() || c4979aMo10675p == null || !c4979aMo10675p.m10684e()) {
                        if (c4979aMo10675p == null && !mo10643s0() && !m10639g() && !m10640h()) {
                            throw new FetchException("empty_response_body");
                        }
                        if (c4979aMo10675p != null && !c4979aMo10675p.m10684e() && !mo10643s0() && !m10639g() && !m10640h()) {
                            throw new FetchException("request_not_successful");
                        }
                        if (!mo10643s0() && !m10639g() && !m10640h()) {
                            throw new FetchException("unknown");
                        }
                    } else {
                        this.f32378f = c4979aMo10675p.m10681b();
                        if (!this.f32379g && this.f32378f <= 0) {
                            throw new FetchException("empty_response_body");
                        }
                        this.f32377e = 0L;
                        m10637e().m10601c(this.f32377e);
                        m10637e().m10611w(this.f32378f);
                        List<C5583f> listM10638f = m10638f(c4979aMo10675p.m10680a(), c4980bM16916x);
                        this.f32359K = listM10638f;
                        this.f32361M = listM10638f.size();
                        try {
                            this.f32364P.mo10676p0(c4979aMo10675p);
                        } catch (Exception e14) {
                            this.f32366R.mo11831d("FileDownloader", e14);
                        }
                        List<C5583f> list = this.f32359K;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (!((C5583f) obj).m11839f()) {
                                arrayList.add(obj);
                            }
                        }
                        if (!mo10643s0() && !m10639g()) {
                            m10637e().m10601c(this.f32377e);
                            m10637e().m10611w(this.f32378f);
                            List<C5583f> list2 = this.f32359K;
                            ArrayList<DownloadBlockInfo> arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                            for (C5583f c5583f : list2) {
                                DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
                                downloadBlockInfo.m10668b(c5583f.m11836c());
                                downloadBlockInfo.m10667a(c5583f.m11837d());
                                downloadBlockInfo.m10669c(c5583f.m11834a());
                                downloadBlockInfo.m10671e(c5583f.m11838e());
                                downloadBlockInfo.m10670d(c5583f.m11835b());
                                arrayList2.add(downloadBlockInfo);
                            }
                            if (!mo10643s0() && !m10639g()) {
                                m10637e().m10605j(-1L);
                                m10637e().m10602d(-1L);
                                InterfaceRunnableC10513c.a aVarM10635d3 = m10635d();
                                if (aVarM10635d3 != null) {
                                    aVarM10635d3.mo5263f(m10637e(), arrayList2, this.f32361M);
                                    C9072e c9072e4 = C9072e.f47360a;
                                }
                                for (DownloadBlockInfo downloadBlockInfo2 : arrayList2) {
                                    InterfaceRunnableC10513c.a aVarM10635d4 = m10635d();
                                    if (aVarM10635d4 != null) {
                                        aVarM10635d4.mo5259b(m10637e(), downloadBlockInfo2, this.f32361M);
                                        C9072e c9072e5 = C9072e.f47360a;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                this.f32383k = Executors.newFixedThreadPool(arrayList.size());
                            }
                            m10633b(c4980bM16916x, arrayList);
                            m10642j();
                            m10637e().m10601c(this.f32377e);
                            m10637e().m10611w(this.f32378f);
                        }
                    }
                    m10637e().m10601c(this.f32377e);
                    m10637e().m10611w(this.f32378f);
                    Throwable th3 = this.f32358J;
                    if (th3 != null) {
                        throw th3;
                    }
                    if (!m10640h() && !m10639g() && !mo10643s0()) {
                        InterfaceRunnableC10513c.a aVarM10635d5 = m10635d();
                        if (aVarM10635d5 != null) {
                            aVarM10635d5.mo5258a(m10637e());
                            C9072e c9072e6 = C9072e.f47360a;
                        }
                        m10637e().m10605j(this.f32382j);
                        m10637e().m10602d(m10634c());
                        InterfaceRunnableC10513c.a aVarM10635d6 = m10635d();
                        if (aVarM10635d6 != null) {
                            aVarM10635d6.mo5261d(m10637e(), m10637e().m10600b(), m10637e().getF32330Q());
                            C9072e c9072e7 = C9072e.f47360a;
                        }
                    } else if (!mo10643s0() && !m10639g() && m10640h()) {
                        if (this.f32379g) {
                            this.f32378f = this.f32377e;
                            m10637e().m10601c(this.f32377e);
                            m10637e().m10611w(this.f32378f);
                        } else {
                            Iterator<T> it = this.f32359K.iterator();
                            long jM11834a = 0;
                            while (it.hasNext()) {
                                jM11834a += ((C5583f) it.next()).m11834a();
                            }
                            if (jM11834a != this.f32378f) {
                                this.f32358J = new FetchException("download_incomplete");
                                Throwable th4 = this.f32358J;
                                if (th4 != null) {
                                    throw th4;
                                }
                            }
                        }
                        if (!m10639g() && !mo10643s0() && (aVarM10635d = m10635d()) != null) {
                            aVarM10635d.mo5258a(m10637e());
                            C9072e c9072e8 = C9072e.f47360a;
                        }
                        if (!this.f32370V) {
                            C8656b.m16909q(this.f32369U, m10637e().getF32331a());
                            if (!mo10643s0() && !m10639g()) {
                                m10637e().m10605j(this.f32382j);
                                m10637e().m10602d(m10634c());
                                DownloadInfo downloadInfoM10637e = m10637e();
                                downloadInfoM10637e.getClass();
                                DownloadInfo downloadInfo = new DownloadInfo();
                                C9000b.m17258x(downloadInfoM10637e, downloadInfo);
                                InterfaceRunnableC10513c.a aVarM10635d7 = m10635d();
                                if (aVarM10635d7 != null) {
                                    aVarM10635d7.mo5261d(m10637e(), m10637e().m10600b(), m10637e().getF32330Q());
                                    C9072e c9072e9 = C9072e.f47360a;
                                }
                                m10637e().m10605j(-1L);
                                m10637e().m10602d(-1L);
                                InterfaceRunnableC10513c.a aVarM10635d8 = m10635d();
                                if (aVarM10635d8 != null) {
                                    aVarM10635d8.mo5264g(downloadInfo);
                                    C9072e c9072e10 = C9072e.f47360a;
                                }
                            }
                        } else {
                            if (c4979aMo10675p == null || !this.f32364P.mo10673K(c4979aMo10675p.m10683d(), c4979aMo10675p.m10682c())) {
                                C8656b.m16909q(this.f32369U, m10637e().getF32331a());
                                throw new FetchException("invalid content hash");
                            }
                            C8656b.m16909q(this.f32369U, m10637e().getF32331a());
                            if (!mo10643s0() && !m10639g()) {
                                m10637e().m10605j(this.f32382j);
                                m10637e().m10602d(m10634c());
                                DownloadInfo downloadInfoM10637e2 = m10637e();
                                downloadInfoM10637e2.getClass();
                                DownloadInfo downloadInfo2 = new DownloadInfo();
                                C9000b.m17258x(downloadInfoM10637e2, downloadInfo2);
                                InterfaceRunnableC10513c.a aVarM10635d9 = m10635d();
                                if (aVarM10635d9 != null) {
                                    aVarM10635d9.mo5261d(m10637e(), m10637e().m10600b(), m10637e().getF32330Q());
                                    C9072e c9072e11 = C9072e.f47360a;
                                }
                                m10637e().m10605j(-1L);
                                m10637e().m10602d(-1L);
                                InterfaceRunnableC10513c.a aVarM10635d10 = m10635d();
                                if (aVarM10635d10 != null) {
                                    aVarM10635d10.mo5264g(downloadInfo2);
                                    C9072e c9072e12 = C9072e.f47360a;
                                }
                            }
                        }
                    }
                    try {
                        ExecutorService executorService3 = this.f32383k;
                        if (executorService3 != null) {
                            executorService3.shutdown();
                            C9072e c9072e13 = C9072e.f47360a;
                        }
                    } catch (Exception e15) {
                        this.f32366R.mo11831d("FileDownloader", e15);
                    }
                    try {
                        AbstractC5588k abstractC5588k3 = this.f32360L;
                        if (abstractC5588k3 != null) {
                            abstractC5588k3.close();
                            C9072e c9072e14 = C9072e.f47360a;
                        }
                    } catch (Exception e16) {
                        this.f32366R.mo11831d("FileDownloader", e16);
                    }
                    if (c4979aMo10675p != null) {
                        downloader = this.f32364P;
                        downloader.mo10676p0(c4979aMo10675p);
                    }
                    aVar3 = this.f32375c;
                    if (aVar3 instanceof C1610a) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar3;
                    }
                    c1610a2 = (C1610a) aVar4;
                    if (c1610a2 != null) {
                        c1610a2.f9109a = true;
                    }
                    this.f32374b = true;
                } catch (Exception e17) {
                    this.f32366R.mo11831d("FileDownloader", e17);
                }
            } catch (Exception e18) {
                exc = e18;
                c4979aMo10675p = null;
            } catch (Throwable th5) {
                th2 = th5;
                c4979aMo10675p = null;
                try {
                    executorService = this.f32383k;
                    if (executorService != null) {
                        executorService.shutdown();
                        C9072e c9072e15 = C9072e.f47360a;
                    }
                } catch (Exception e19) {
                    this.f32366R.mo11831d("FileDownloader", e19);
                }
                try {
                    abstractC5588k = this.f32360L;
                    if (abstractC5588k != null) {
                        abstractC5588k.close();
                        C9072e c9072e16 = C9072e.f47360a;
                    }
                } catch (Exception e20) {
                    this.f32366R.mo11831d("FileDownloader", e20);
                }
                if (c4979aMo10675p != null) {
                    try {
                        this.f32364P.mo10676p0(c4979aMo10675p);
                    } catch (Exception e21) {
                        this.f32366R.mo11831d("FileDownloader", e21);
                    }
                }
                aVar = this.f32375c;
                if (aVar instanceof C1610a) {
                    aVar2 = aVar;
                } else {
                    aVar2 = null;
                }
                c1610a = (C1610a) aVar2;
                if (c1610a != null) {
                    c1610a.f9109a = true;
                }
                this.f32374b = true;
                throw th2;
            }
        } catch (Throwable th6) {
            th2 = th6;
            executorService = this.f32383k;
            if (executorService != null) {
                executorService.shutdown();
                C9072e c9072e17 = C9072e.f47360a;
            }
            abstractC5588k = this.f32360L;
            if (abstractC5588k != null) {
                abstractC5588k.close();
                C9072e c9072e18 = C9072e.f47360a;
            }
            if (c4979aMo10675p != null) {
                this.f32364P.mo10676p0(c4979aMo10675p);
            }
            aVar = this.f32375c;
            if (aVar instanceof C1610a) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            c1610a = (C1610a) aVar2;
            if (c1610a != null) {
                c1610a.f9109a = true;
            }
            this.f32374b = true;
            throw th2;
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: s0 */
    public final boolean mo10643s0() {
        return this.f32373a;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: y1 */
    public final void mo10644y1(C1610a c1610a) {
        this.f32375c = c1610a;
    }
}
