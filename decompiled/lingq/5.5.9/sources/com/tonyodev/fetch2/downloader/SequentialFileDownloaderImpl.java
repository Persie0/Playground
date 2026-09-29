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
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.C6740a;
import kotlin.KotlinNullPointerException;
import kotlin.collections.C6753d;
import p033bl.C1610a;
import p077dl.C5200a;
import p122fl.AbstractC5588k;
import p122fl.C5579b;
import p122fl.InterfaceC5586i;
import p122fl.InterfaceC5587j;
import p122fl.InterfaceC5589l;
import p385sf.C9000b;
import p443w.C9783n;
import p539zk.InterfaceRunnableC10513c;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
public final class SequentialFileDownloaderImpl implements InterfaceRunnableC10513c {

    /* JADX INFO: renamed from: H */
    public final C4967a f32387H;

    /* JADX INFO: renamed from: I */
    public final Download f32388I;

    /* JADX INFO: renamed from: J */
    public final Downloader<?, ?> f32389J;

    /* JADX INFO: renamed from: K */
    public final long f32390K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC5587j f32391L;

    /* JADX INFO: renamed from: M */
    public final C5200a f32392M;

    /* JADX INFO: renamed from: N */
    public final boolean f32393N;

    /* JADX INFO: renamed from: O */
    public final boolean f32394O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC5589l f32395P;

    /* JADX INFO: renamed from: Q */
    public final boolean f32396Q;

    /* JADX INFO: renamed from: a */
    public volatile boolean f32397a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f32398b;

    /* JADX INFO: renamed from: c */
    public InterfaceRunnableC10513c.a f32399c;

    /* JADX INFO: renamed from: d */
    public volatile long f32400d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f32401e;

    /* JADX INFO: renamed from: f */
    public volatile long f32402f;

    /* JADX INFO: renamed from: g */
    public long f32403g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9070c f32404h;

    /* JADX INFO: renamed from: i */
    public double f32405i;

    /* JADX INFO: renamed from: j */
    public final C9783n f32406j;

    /* JADX INFO: renamed from: k */
    public final DownloadBlockInfo f32407k;

    /* JADX INFO: renamed from: l */
    public final int f32408l;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.downloader.SequentialFileDownloaderImpl$a */
    public static final class C4967a implements InterfaceC5586i {
        public C4967a() {
        }

        @Override // p122fl.InterfaceC5586i
        /* JADX INFO: renamed from: i */
        public final boolean mo431i() {
            return SequentialFileDownloaderImpl.this.f32397a;
        }
    }

    public SequentialFileDownloaderImpl(Download download, Downloader<?, ?> downloader, long j10, InterfaceC5587j interfaceC5587j, C5200a c5200a, boolean z10, boolean z11, InterfaceC5589l interfaceC5589l, boolean z12) {
        C5207g.m11112g(download, "initialDownload");
        C5207g.m11112g(downloader, "downloader");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(c5200a, "networkInfoProvider");
        C5207g.m11112g(interfaceC5589l, "storageResolver");
        this.f32388I = download;
        this.f32389J = downloader;
        this.f32390K = j10;
        this.f32391L = interfaceC5587j;
        this.f32392M = c5200a;
        this.f32393N = z10;
        this.f32394O = z11;
        this.f32395P = interfaceC5589l;
        this.f32396Q = z12;
        this.f32400d = -1L;
        this.f32403g = -1L;
        this.f32404h = C6740a.m13372a(new InterfaceC2041a<DownloadInfo>() { // from class: com.tonyodev.fetch2.downloader.SequentialFileDownloaderImpl$downloadInfo$2
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final DownloadInfo mo807E() {
                SequentialFileDownloaderImpl sequentialFileDownloaderImpl = this.f32411b;
                Download download2 = sequentialFileDownloaderImpl.f32388I;
                InterfaceRunnableC10513c.a aVar = sequentialFileDownloaderImpl.f32399c;
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
        this.f32406j = new C9783n();
        this.f32407k = (DownloadBlockInfo) new InterfaceC2041a<DownloadBlockInfo>() { // from class: com.tonyodev.fetch2.downloader.SequentialFileDownloaderImpl$downloadBlock$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final DownloadBlockInfo mo807E() {
                DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
                downloadBlockInfo.f32517b = 1;
                downloadBlockInfo.f32516a = this.f32410b.f32388I.getF32331a();
                return downloadBlockInfo;
            }
        }.mo807E();
        this.f32408l = 1;
        this.f32387H = new C4967a();
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: H */
    public final void mo10631H() {
        InterfaceRunnableC10513c.a aVar = this.f32399c;
        if (!(aVar instanceof C1610a)) {
            aVar = null;
        }
        C1610a c1610a = (C1610a) aVar;
        if (c1610a != null) {
            c1610a.f9109a = true;
        }
        this.f32397a = true;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: X0 */
    public final void mo10632X0() {
        InterfaceRunnableC10513c.a aVar = this.f32399c;
        if (!(aVar instanceof C1610a)) {
            aVar = null;
        }
        C1610a c1610a = (C1610a) aVar;
        if (c1610a != null) {
            c1610a.f9109a = true;
        }
        this.f32398b = true;
    }

    /* JADX INFO: renamed from: a */
    public final long m10645a() {
        double d10 = this.f32405i;
        if (d10 < 1) {
            return 0L;
        }
        return (long) Math.ceil(d10);
    }

    /* JADX INFO: renamed from: b */
    public final DownloadInfo m10646b() {
        return (DownloadInfo) this.f32404h.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final Downloader.C4980b m10647c() {
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0(this.f32388I.mo10587i());
        linkedHashMapM13467T0.put("Range", "bytes=" + this.f32402f + '-');
        return new Downloader.C4980b(this.f32388I.getF32331a(), this.f32388I.mo10577L(), linkedHashMapM13467T0, this.f32388I.mo10582V(), C5579b.m11820l(this.f32388I.mo10582V()), this.f32388I.mo10586g(), this.f32388I.getF32324K(), "GET", this.f32388I.mo10589o(), "", 1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10648d() {
        if ((this.f32402f > 0 && this.f32400d > 0) || this.f32401e) {
            if (this.f32402f >= this.f32400d) {
                return true;
            }
        }
        return false;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: d1 */
    public final DownloadInfo mo10636d1() {
        m10646b().f32338h = this.f32402f;
        m10646b().f32339i = this.f32400d;
        return m10646b();
    }

    /* JADX INFO: renamed from: e */
    public final void m10649e(Downloader.C4979a c4979a) {
        if (!this.f32397a && !this.f32398b && m10648d()) {
            this.f32400d = this.f32402f;
            m10646b().f32338h = this.f32402f;
            m10646b().f32339i = this.f32400d;
            this.f32407k.f32520e = this.f32402f;
            this.f32407k.f32519d = this.f32400d;
            if (this.f32394O) {
                if (!this.f32389J.mo10673K(c4979a.f32525e, c4979a.f32526f)) {
                    throw new FetchException("invalid content hash");
                }
                if (!this.f32398b && !this.f32397a) {
                    InterfaceRunnableC10513c.a aVar = this.f32399c;
                    if (aVar != null) {
                        aVar.mo5258a(m10646b());
                    }
                    InterfaceRunnableC10513c.a aVar2 = this.f32399c;
                    if (aVar2 != null) {
                        aVar2.mo5259b(m10646b(), this.f32407k, this.f32408l);
                    }
                    m10646b().f32329P = this.f32403g;
                    m10646b().f32330Q = m10645a();
                    DownloadInfo downloadInfoM10646b = m10646b();
                    downloadInfoM10646b.getClass();
                    DownloadInfo downloadInfo = new DownloadInfo();
                    C9000b.m17258x(downloadInfoM10646b, downloadInfo);
                    InterfaceRunnableC10513c.a aVar3 = this.f32399c;
                    if (aVar3 != null) {
                        aVar3.mo5261d(m10646b(), m10646b().f32329P, m10646b().f32330Q);
                    }
                    m10646b().f32329P = -1L;
                    m10646b().f32330Q = -1L;
                    InterfaceRunnableC10513c.a aVar4 = this.f32399c;
                    if (aVar4 != null) {
                        aVar4.mo5264g(downloadInfo);
                    }
                }
            } else if (!this.f32398b && !this.f32397a) {
                InterfaceRunnableC10513c.a aVar5 = this.f32399c;
                if (aVar5 != null) {
                    aVar5.mo5258a(m10646b());
                }
                InterfaceRunnableC10513c.a aVar6 = this.f32399c;
                if (aVar6 != null) {
                    aVar6.mo5259b(m10646b(), this.f32407k, this.f32408l);
                }
                m10646b().f32329P = this.f32403g;
                m10646b().f32330Q = m10645a();
                DownloadInfo downloadInfoM10646b2 = m10646b();
                downloadInfoM10646b2.getClass();
                DownloadInfo downloadInfo2 = new DownloadInfo();
                C9000b.m17258x(downloadInfoM10646b2, downloadInfo2);
                InterfaceRunnableC10513c.a aVar7 = this.f32399c;
                if (aVar7 != null) {
                    aVar7.mo5261d(m10646b(), m10646b().f32329P, m10646b().f32330Q);
                }
                m10646b().f32329P = -1L;
                m10646b().f32330Q = -1L;
                InterfaceRunnableC10513c.a aVar8 = this.f32399c;
                if (aVar8 != null) {
                    aVar8.mo5264g(downloadInfo2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10650f(BufferedInputStream bufferedInputStream, AbstractC5588k abstractC5588k, int i10) throws IOException {
        long j10 = this.f32402f;
        byte[] bArr = new byte[i10];
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        int i11 = bufferedInputStream.read(bArr, 0, i10);
        while (!this.f32397a && !this.f32398b && i11 != -1) {
            abstractC5588k.mo11841b(bArr, i11);
            if (!this.f32398b && !this.f32397a) {
                this.f32402f += (long) i11;
                m10646b().f32338h = this.f32402f;
                m10646b().f32339i = this.f32400d;
                this.f32407k.f32520e = this.f32402f;
                this.f32407k.f32519d = this.f32400d;
                boolean zM11825q = C5579b.m11825q(jNanoTime2, System.nanoTime(), 1000L);
                if (zM11825q) {
                    this.f32406j.m18279a(this.f32402f - j10);
                    this.f32405i = C9783n.m18278b(this.f32406j);
                    this.f32403g = C5579b.m11810b(this.f32402f, this.f32400d, m10645a());
                    j10 = this.f32402f;
                }
                if (C5579b.m11825q(jNanoTime, System.nanoTime(), this.f32390K)) {
                    this.f32407k.f32520e = this.f32402f;
                    if (!this.f32398b && !this.f32397a) {
                        InterfaceRunnableC10513c.a aVar = this.f32399c;
                        if (aVar != null) {
                            aVar.mo5258a(m10646b());
                        }
                        InterfaceRunnableC10513c.a aVar2 = this.f32399c;
                        if (aVar2 != null) {
                            aVar2.mo5259b(m10646b(), this.f32407k, this.f32408l);
                        }
                        m10646b().f32329P = this.f32403g;
                        m10646b().f32330Q = m10645a();
                        InterfaceRunnableC10513c.a aVar3 = this.f32399c;
                        if (aVar3 != null) {
                            aVar3.mo5261d(m10646b(), m10646b().f32329P, m10646b().f32330Q);
                        }
                    }
                    jNanoTime = System.nanoTime();
                }
                if (zM11825q) {
                    jNanoTime2 = System.nanoTime();
                }
                i11 = bufferedInputStream.read(bArr, 0, i10);
            }
        }
        abstractC5588k.flush();
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02c4 A[Catch: all -> 0x02f9, TryCatch #13 {all -> 0x02f9, blocks: (B:153:0x029e, B:155:0x02a2, B:157:0x02a6, B:159:0x02c4, B:160:0x02cb, B:162:0x02cf, B:167:0x02e0, B:168:0x02e3, B:171:0x02ee, B:173:0x02f2, B:177:0x02fe, B:178:0x0300, B:180:0x0327, B:182:0x032b, B:184:0x033b), top: B:247:0x029e, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02cf A[Catch: all -> 0x02f9, TRY_LEAVE, TryCatch #13 {all -> 0x02f9, blocks: (B:153:0x029e, B:155:0x02a2, B:157:0x02a6, B:159:0x02c4, B:160:0x02cb, B:162:0x02cf, B:167:0x02e0, B:168:0x02e3, B:171:0x02ee, B:173:0x02f2, B:177:0x02fe, B:178:0x0300, B:180:0x0327, B:182:0x032b, B:184:0x033b), top: B:247:0x029e, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02de  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ee A[Catch: all -> 0x02f9, LOOP:0: B:164:0x02da->B:171:0x02ee, LOOP_END, TryCatch #13 {all -> 0x02f9, blocks: (B:153:0x029e, B:155:0x02a2, B:157:0x02a6, B:159:0x02c4, B:160:0x02cb, B:162:0x02cf, B:167:0x02e0, B:168:0x02e3, B:171:0x02ee, B:173:0x02f2, B:177:0x02fe, B:178:0x0300, B:180:0x0327, B:182:0x032b, B:184:0x033b), top: B:247:0x029e, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x02fe A[Catch: all -> 0x02f9, TryCatch #13 {all -> 0x02f9, blocks: (B:153:0x029e, B:155:0x02a2, B:157:0x02a6, B:159:0x02c4, B:160:0x02cb, B:162:0x02cf, B:167:0x02e0, B:168:0x02e3, B:171:0x02ee, B:173:0x02f2, B:177:0x02fe, B:178:0x0300, B:180:0x0327, B:182:0x032b, B:184:0x033b), top: B:247:0x029e, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x033b A[Catch: all -> 0x02f9, TRY_LEAVE, TryCatch #13 {all -> 0x02f9, blocks: (B:153:0x029e, B:155:0x02a2, B:157:0x02a6, B:159:0x02c4, B:160:0x02cb, B:162:0x02cf, B:167:0x02e0, B:168:0x02e3, B:171:0x02ee, B:173:0x02f2, B:177:0x02fe, B:178:0x0300, B:180:0x0327, B:182:0x032b, B:184:0x033b), top: B:247:0x029e, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x035f A[Catch: Exception -> 0x0286, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0286, blocks: (B:141:0x0281, B:196:0x035f), top: B:250:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:201:0x036e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0371  */
    /* JADX WARN: Code duplicated, block: B:205:0x0378  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:227:0x03af  */
    /* JADX WARN: Code duplicated, block: B:230:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:235:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02eb A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        AbstractC5588k abstractC5588kMo11803a;
        BufferedInputStream bufferedInputStream;
        Downloader.C4979a c4979aMo10675p;
        Exception exc;
        InterfaceRunnableC10513c.a aVar;
        InterfaceRunnableC10513c.a aVar2;
        C1610a c1610a;
        Throwable th3;
        Error errorM17247m;
        InterfaceRunnableC10513c.a aVar3;
        boolean z10;
        int i10;
        InterfaceRunnableC10513c.a aVar4;
        InterfaceRunnableC10513c.a aVar5;
        C1610a c1610a2;
        try {
            try {
                this.f32402f = this.f32388I.mo10574F();
                this.f32400d = this.f32388I.mo10591u();
                m10646b().f32338h = this.f32402f;
                m10646b().f32339i = this.f32400d;
                if (this.f32397a || this.f32398b) {
                    abstractC5588kMo11803a = null;
                    bufferedInputStream = null;
                    c4979aMo10675p = null;
                } else {
                    Downloader.C4980b c4980bM10647c = m10647c();
                    c4979aMo10675p = this.f32389J.mo10675p(c4980bM10647c, this.f32387H);
                    if (c4979aMo10675p != null) {
                        try {
                            if (c4979aMo10675p.f32522b && c4979aMo10675p.f32523c == -1) {
                                this.f32401e = true;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            abstractC5588kMo11803a = null;
                            bufferedInputStream = null;
                            try {
                                if (!this.f32397a && !this.f32398b) {
                                    this.f32391L.mo11831d("FileDownloader download:" + mo10636d1(), exc);
                                    errorM17247m = C9000b.m17247m(exc);
                                    errorM17247m.setThrowable(exc);
                                    if (c4979aMo10675p != null) {
                                        errorM17247m.setHttpResponse(C5579b.m11811c(c4979aMo10675p));
                                    }
                                    if (this.f32393N) {
                                        z10 = !this.f32392M.m10971b();
                                        for (i10 = 1; i10 <= 10; i10++) {
                                            try {
                                                Thread.sleep(500L);
                                                if (!this.f32392M.m10971b()) {
                                                    z10 = true;
                                                    break;
                                                }
                                            } catch (InterruptedException e11) {
                                                this.f32391L.mo11831d("FileDownloader", e11);
                                            }
                                        }
                                        if (z10) {
                                            errorM17247m = Error.NO_NETWORK_CONNECTION;
                                        }
                                    }
                                    m10646b().f32338h = this.f32402f;
                                    m10646b().f32339i = this.f32400d;
                                    m10646b().m10604h(errorM17247m);
                                    this.f32407k.f32520e = this.f32402f;
                                    this.f32407k.f32519d = this.f32400d;
                                    if (!this.f32398b && !this.f32397a) {
                                        m10646b().f32329P = -1L;
                                        m10646b().f32330Q = -1L;
                                        aVar3 = this.f32399c;
                                        if (aVar3 != null) {
                                            aVar3.mo5260c(m10646b(), errorM17247m, exc);
                                        }
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Exception e12) {
                                        this.f32391L.mo11831d("FileDownloader", e12);
                                    }
                                }
                                if (c4979aMo10675p != null) {
                                    try {
                                        this.f32389J.mo10676p0(c4979aMo10675p);
                                    } catch (Exception e13) {
                                        this.f32391L.mo11831d("FileDownloader", e13);
                                    }
                                }
                                if (abstractC5588kMo11803a != null) {
                                    abstractC5588kMo11803a.close();
                                }
                                aVar4 = this.f32399c;
                                if (aVar4 instanceof C1610a) {
                                    aVar5 = aVar4;
                                } else {
                                    aVar5 = null;
                                }
                                c1610a2 = (C1610a) aVar5;
                                if (c1610a2 != null) {
                                    c1610a2.f9109a = true;
                                }
                                this.f32398b = true;
                            } catch (Throwable th4) {
                                th3 = th4;
                                th2 = th3;
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Exception e14) {
                                        this.f32391L.mo11831d("FileDownloader", e14);
                                    }
                                }
                                if (c4979aMo10675p != null) {
                                    try {
                                        this.f32389J.mo10676p0(c4979aMo10675p);
                                    } catch (Exception e15) {
                                        this.f32391L.mo11831d("FileDownloader", e15);
                                    }
                                }
                                if (abstractC5588kMo11803a != null) {
                                    try {
                                        abstractC5588kMo11803a.close();
                                    } catch (Exception e16) {
                                        this.f32391L.mo11831d("FileDownloader", e16);
                                    }
                                }
                                aVar = this.f32399c;
                                if (aVar instanceof C1610a) {
                                    aVar2 = aVar;
                                } else {
                                    aVar2 = null;
                                }
                                c1610a = (C1610a) aVar2;
                                if (c1610a != null) {
                                    c1610a.f9109a = true;
                                }
                                this.f32398b = true;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            abstractC5588kMo11803a = null;
                            bufferedInputStream = null;
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (c4979aMo10675p != null) {
                                this.f32389J.mo10676p0(c4979aMo10675p);
                            }
                            if (abstractC5588kMo11803a != null) {
                                abstractC5588kMo11803a.close();
                            }
                            aVar = this.f32399c;
                            if (aVar instanceof C1610a) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            c1610a = (C1610a) aVar2;
                            if (c1610a != null) {
                                c1610a.f9109a = true;
                            }
                            this.f32398b = true;
                            throw th2;
                        }
                    }
                    boolean z11 = c4979aMo10675p != null ? c4979aMo10675p.f32522b : false;
                    if (this.f32397a || this.f32398b || c4979aMo10675p == null || !z11) {
                        if (c4979aMo10675p == null && !this.f32397a && !this.f32398b && !m10648d()) {
                            throw new FetchException("empty_response_body");
                        }
                        if (!z11 && !this.f32397a && !m10648d()) {
                            throw new FetchException("request_not_successful");
                        }
                        if (!this.f32397a && !this.f32398b && this.f32402f < this.f32400d && !m10648d()) {
                            throw new FetchException("unknown");
                        }
                        abstractC5588kMo11803a = null;
                    } else {
                        long j10 = 0;
                        this.f32402f = (c4979aMo10675p.f32521a == 206 || c4979aMo10675p.f32528h) ? this.f32388I.mo10574F() : 0L;
                        this.f32400d = c4979aMo10675p.f32523c;
                        if (c4979aMo10675p.f32521a == 206) {
                            this.f32391L.mo11829b("FileDownloader resuming Download " + mo10636d1());
                            j10 = this.f32402f;
                        } else {
                            this.f32391L.mo11829b("FileDownloader starting Download " + mo10636d1());
                        }
                        m10646b().f32338h = this.f32402f;
                        m10646b().f32339i = this.f32400d;
                        if (!this.f32395P.mo11804b(c4980bM10647c.f32533d)) {
                            this.f32395P.mo11807e(c4980bM10647c.f32533d, this.f32388I.getF32323J() == EnqueueAction.INCREMENT_FILE_NAME);
                        }
                        if (this.f32396Q) {
                            this.f32395P.mo11805c(c4980bM10647c.f32533d, m10646b().f32339i);
                        }
                        abstractC5588kMo11803a = this.f32395P.mo11803a(c4980bM10647c);
                        try {
                            abstractC5588kMo11803a.mo11840a(j10);
                            if (!this.f32397a && !this.f32398b) {
                                this.f32389J.mo10677s(c4980bM10647c);
                                bufferedInputStream = new BufferedInputStream(c4979aMo10675p.f32524d, 8192);
                                try {
                                    m10646b().f32338h = this.f32402f;
                                    m10646b().f32339i = this.f32400d;
                                    this.f32407k.f32520e = this.f32402f;
                                    DownloadBlockInfo downloadBlockInfo = this.f32407k;
                                    downloadBlockInfo.f32518c = j10;
                                    downloadBlockInfo.f32519d = this.f32400d;
                                    if (!this.f32398b && !this.f32397a) {
                                        m10646b().f32329P = -1L;
                                        m10646b().f32330Q = -1L;
                                        InterfaceRunnableC10513c.a aVar6 = this.f32399c;
                                        if (aVar6 != null) {
                                            aVar6.mo5263f(m10646b(), C9000b.m17251q(this.f32407k), this.f32408l);
                                        }
                                        InterfaceRunnableC10513c.a aVar7 = this.f32399c;
                                        if (aVar7 != null) {
                                            aVar7.mo5259b(m10646b(), this.f32407k, this.f32408l);
                                        }
                                    }
                                    m10650f(bufferedInputStream, abstractC5588kMo11803a, 8192);
                                } catch (Exception e17) {
                                    e = e17;
                                    exc = e;
                                    if (!this.f32397a) {
                                        this.f32391L.mo11831d("FileDownloader download:" + mo10636d1(), exc);
                                        errorM17247m = C9000b.m17247m(exc);
                                        errorM17247m.setThrowable(exc);
                                        if (c4979aMo10675p != null) {
                                            errorM17247m.setHttpResponse(C5579b.m11811c(c4979aMo10675p));
                                        }
                                        if (this.f32393N) {
                                            z10 = !this.f32392M.m10971b();
                                            while (i10 <= 10) {
                                                Thread.sleep(500L);
                                                if (!this.f32392M.m10971b()) {
                                                    z10 = true;
                                                    break;
                                                }
                                            }
                                            if (z10) {
                                                errorM17247m = Error.NO_NETWORK_CONNECTION;
                                            }
                                        }
                                        m10646b().f32338h = this.f32402f;
                                        m10646b().f32339i = this.f32400d;
                                        m10646b().m10604h(errorM17247m);
                                        this.f32407k.f32520e = this.f32402f;
                                        this.f32407k.f32519d = this.f32400d;
                                        if (!this.f32398b) {
                                            m10646b().f32329P = -1L;
                                            m10646b().f32330Q = -1L;
                                            aVar3 = this.f32399c;
                                            if (aVar3 != null) {
                                                aVar3.mo5260c(m10646b(), errorM17247m, exc);
                                            }
                                        }
                                    }
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (c4979aMo10675p != null) {
                                        this.f32389J.mo10676p0(c4979aMo10675p);
                                    }
                                    if (abstractC5588kMo11803a != null) {
                                        abstractC5588kMo11803a.close();
                                    }
                                    aVar4 = this.f32399c;
                                    if (aVar4 instanceof C1610a) {
                                        aVar5 = null;
                                    } else {
                                        aVar5 = aVar4;
                                    }
                                    c1610a2 = (C1610a) aVar5;
                                    if (c1610a2 != null) {
                                        c1610a2.f9109a = true;
                                    }
                                    this.f32398b = true;
                                } catch (Throwable th6) {
                                    th3 = th6;
                                    abstractC5588kMo11803a = abstractC5588kMo11803a;
                                    th2 = th3;
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (c4979aMo10675p != null) {
                                        this.f32389J.mo10676p0(c4979aMo10675p);
                                    }
                                    if (abstractC5588kMo11803a != null) {
                                        abstractC5588kMo11803a.close();
                                    }
                                    aVar = this.f32399c;
                                    if (aVar instanceof C1610a) {
                                        aVar2 = null;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    c1610a = (C1610a) aVar2;
                                    if (c1610a != null) {
                                        c1610a.f9109a = true;
                                    }
                                    this.f32398b = true;
                                    throw th2;
                                }
                            }
                        } catch (Exception e18) {
                            e = e18;
                            bufferedInputStream = null;
                        } catch (Throwable th7) {
                            th3 = th7;
                            bufferedInputStream = null;
                        }
                    }
                    bufferedInputStream = null;
                }
                if (!m10648d() && !this.f32398b && !this.f32397a) {
                    m10646b().f32338h = this.f32402f;
                    m10646b().f32339i = this.f32400d;
                    this.f32407k.f32520e = this.f32402f;
                    this.f32407k.f32519d = this.f32400d;
                    if (!this.f32398b && !this.f32397a) {
                        InterfaceRunnableC10513c.a aVar8 = this.f32399c;
                        if (aVar8 != null) {
                            aVar8.mo5258a(m10646b());
                        }
                        InterfaceRunnableC10513c.a aVar9 = this.f32399c;
                        if (aVar9 != null) {
                            aVar9.mo5259b(m10646b(), this.f32407k, this.f32408l);
                        }
                        m10646b().f32329P = this.f32403g;
                        m10646b().f32330Q = m10645a();
                        InterfaceRunnableC10513c.a aVar10 = this.f32399c;
                        if (aVar10 != null) {
                            aVar10.mo5261d(m10646b(), m10646b().f32329P, m10646b().f32330Q);
                        }
                    }
                } else if (m10648d() && c4979aMo10675p != null) {
                    m10649e(c4979aMo10675p);
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e19) {
                        this.f32391L.mo11831d("FileDownloader", e19);
                    }
                }
                if (c4979aMo10675p != null) {
                    try {
                        this.f32389J.mo10676p0(c4979aMo10675p);
                    } catch (Exception e20) {
                        this.f32391L.mo11831d("FileDownloader", e20);
                    }
                }
                if (abstractC5588kMo11803a != null) {
                    abstractC5588kMo11803a.close();
                }
            } catch (Exception e21) {
                this.f32391L.mo11831d("FileDownloader", e21);
            }
        } catch (Exception e22) {
            e = e22;
            c4979aMo10675p = null;
        } catch (Throwable th8) {
            th2 = th8;
            abstractC5588kMo11803a = null;
            bufferedInputStream = null;
            c4979aMo10675p = null;
        }
        aVar4 = this.f32399c;
        if (aVar4 instanceof C1610a) {
            aVar5 = null;
        } else {
            aVar5 = aVar4;
        }
        c1610a2 = (C1610a) aVar5;
        if (c1610a2 != null) {
            c1610a2.f9109a = true;
        }
        this.f32398b = true;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: s0 */
    public final boolean mo10643s0() {
        return this.f32397a;
    }

    @Override // p539zk.InterfaceRunnableC10513c
    /* JADX INFO: renamed from: y1 */
    public final void mo10644y1(C1610a c1610a) {
        this.f32399c = c1610a;
    }
}
