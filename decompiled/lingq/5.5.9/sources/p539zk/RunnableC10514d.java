package p539zk;

import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.downloader.ParallelFileDownloaderImpl;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import p122fl.AbstractC5588k;
import p122fl.C5579b;
import p122fl.C5583f;
import p349qo.C8656b;
import sl.C9072e;

/* JADX INFO: renamed from: zk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC10514d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParallelFileDownloaderImpl f52494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5583f f52495b;

    public RunnableC10514d(ParallelFileDownloaderImpl parallelFileDownloaderImpl, C5583f c5583f) {
        this.f52494a = parallelFileDownloaderImpl;
        this.f52495b = c5583f;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0316 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        int i10;
        Downloader.C4979a c4979a;
        Downloader.C4979a c4979a2;
        int i11;
        long j10;
        try {
            Thread threadCurrentThread = Thread.currentThread();
            C5207g.m11107b(threadCurrentThread, "Thread.currentThread()");
            threadCurrentThread.setName(this.f52494a.m10637e().f32332b + '-' + this.f52494a.m10637e().f32331a + "-Slice-" + this.f52495b.f34393b);
        } catch (Exception unused) {
        }
        DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
        C5583f c5583f = this.f52495b;
        downloadBlockInfo.f32516a = c5583f.f34392a;
        downloadBlockInfo.f32517b = c5583f.f34393b;
        downloadBlockInfo.f32520e = c5583f.f34396e;
        downloadBlockInfo.f32518c = c5583f.f34394c;
        downloadBlockInfo.f32519d = c5583f.f34395d;
        DownloadInfo downloadInfoM10637e = this.f52494a.m10637e();
        C5583f c5583f2 = this.f52495b;
        Downloader.C4980b c4980bM16917y = C8656b.m16917y(downloadInfoM10637e, c5583f2.f34394c + c5583f2.f34396e, 0L, null, c5583f2.f34393b + 1, 12);
        Downloader.C4979a c4979a3 = null;
        try {
            try {
                try {
                    C5583f c5583f3 = this.f52495b;
                    randomAccessFile = new RandomAccessFile(C5579b.m11817i(C8656b.m16911s(this.f52494a.f32369U, c5583f3.f34392a, c5583f3.f34393b)), "rw");
                    try {
                        ParallelFileDownloaderImpl parallelFileDownloaderImpl = this.f52494a;
                        Downloader.C4979a c4979aMo10675p = parallelFileDownloaderImpl.f32364P.mo10675p(c4980bM16917y, parallelFileDownloaderImpl.f32362N);
                        if (this.f52494a.f32374b || this.f52494a.f32373a || c4979aMo10675p == null || !c4979aMo10675p.f32522b) {
                            if (c4979aMo10675p == null && !this.f52494a.f32373a && !this.f52494a.f32374b) {
                                throw new FetchException("empty_response_body");
                            }
                            if (c4979aMo10675p != null && !c4979aMo10675p.f32522b && !this.f52494a.f32373a && !this.f52494a.f32374b) {
                                throw new FetchException("request_not_successful");
                            }
                            if (!this.f52494a.f32373a && !this.f52494a.f32374b) {
                                throw new FetchException("unknown");
                            }
                        } else {
                            Ref$LongRef ref$LongRef = new Ref$LongRef();
                            this.f52494a.f32364P.mo10677s(c4980bM16917y);
                            byte[] bArr = new byte[8192];
                            InputStream inputStream = c4979aMo10675p.f32524d;
                            int i12 = inputStream != null ? inputStream.read(bArr, 0, 8192) : -1;
                            C5583f c5583f4 = this.f52495b;
                            long j11 = c5583f4.f34395d;
                            if (j11 < 1) {
                                j11 = 0;
                            }
                            try {
                                long j12 = j11 - (c5583f4.f34394c + c5583f4.f34396e);
                                long jNanoTime = System.nanoTime();
                                Ref$IntRef ref$IntRef = new Ref$IntRef();
                                Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                                while (true) {
                                    if ((!this.f52494a.f32379g && j12 <= 0) || i12 == -1 || this.f52494a.f32373a || this.f52494a.f32374b) {
                                        break;
                                    }
                                    long j13 = j11;
                                    if (this.f52494a.f32379g || i12 <= j12) {
                                        i10 = i12;
                                    } else {
                                        i12 = (int) j12;
                                        i10 = -1;
                                    }
                                    ref$IntRef.f38125a = i12;
                                    C5583f c5583f5 = this.f52495b;
                                    long j14 = j12;
                                    Downloader.C4979a c4979a4 = c4979aMo10675p;
                                    try {
                                        ref$LongRef2.f38126a = c5583f5.f34394c + c5583f5.f34396e;
                                        synchronized (this.f52494a.f32357I) {
                                            try {
                                                if (this.f52494a.f32373a || this.f52494a.f32374b) {
                                                    ref$LongRef2 = ref$LongRef2;
                                                    c4979a = c4979a4;
                                                } else {
                                                    AbstractC5588k abstractC5588k = this.f52494a.f32360L;
                                                    if (abstractC5588k != null) {
                                                        abstractC5588k.mo11840a(ref$LongRef2.f38126a);
                                                    }
                                                    AbstractC5588k abstractC5588k2 = this.f52494a.f32360L;
                                                    if (abstractC5588k2 != null) {
                                                        abstractC5588k2.mo11841b(bArr, ref$IntRef.f38125a);
                                                    }
                                                    if (this.f52494a.f32373a || this.f52494a.f32374b) {
                                                        c4979a = c4979a4;
                                                    } else {
                                                        c4979a = c4979a4;
                                                        try {
                                                            this.f52495b.f34396e += (long) ref$IntRef.f38125a;
                                                            randomAccessFile.seek(0L);
                                                            randomAccessFile.setLength(0L);
                                                            randomAccessFile.writeLong(this.f52495b.f34396e);
                                                            this.f52494a.f32377e += (long) ref$IntRef.f38125a;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            throw th;
                                                        }
                                                    }
                                                    long jNanoTime2 = System.nanoTime();
                                                    ref$LongRef.f38126a = jNanoTime2;
                                                    if (C5579b.m11825q(jNanoTime, jNanoTime2, this.f52494a.f32365Q)) {
                                                        if (!this.f52494a.f32373a && !this.f52494a.f32374b) {
                                                            downloadBlockInfo.f32520e = this.f52495b.f34396e;
                                                            ParallelFileDownloaderImpl parallelFileDownloaderImpl2 = this.f52494a;
                                                            InterfaceRunnableC10513c.a aVar = parallelFileDownloaderImpl2.f32375c;
                                                            if (aVar != null) {
                                                                aVar.mo5259b(parallelFileDownloaderImpl2.m10637e(), downloadBlockInfo, this.f52494a.f32361M);
                                                            }
                                                        }
                                                        jNanoTime = System.nanoTime();
                                                    }
                                                }
                                                C9072e c9072e = C9072e.f47360a;
                                                try {
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    c4979a3 = c4979a;
                                                    this.f52494a.f32366R.mo11831d("FileDownloader downloads slice " + this.f52495b, e);
                                                    this.f52494a.f32358J = e;
                                                    if (c4979a3 != null) {
                                                        try {
                                                            this.f52494a.f32364P.mo10676p0(c4979a3);
                                                        } catch (Exception e11) {
                                                            this.f52494a.f32366R.mo11831d("FileDownloader", e11);
                                                        }
                                                    }
                                                    if (randomAccessFile != null) {
                                                        randomAccessFile.close();
                                                    }
                                                    ParallelFileDownloaderImpl.m10630a(this.f52494a);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c4979a3 = c4979a;
                                                    th2 = th;
                                                    if (c4979a3 != null) {
                                                        try {
                                                            this.f52494a.f32364P.mo10676p0(c4979a3);
                                                        } catch (Exception e12) {
                                                            this.f52494a.f32366R.mo11831d("FileDownloader", e12);
                                                        }
                                                    }
                                                    if (randomAccessFile != null) {
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Exception e13) {
                                                            this.f52494a.f32366R.mo11831d("FileDownloader", e13);
                                                        }
                                                    }
                                                    ParallelFileDownloaderImpl.m10630a(this.f52494a);
                                                    throw th2;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                        if (this.f52494a.f32373a || this.f52494a.f32374b || i10 == -1) {
                                            c4979a2 = c4979a;
                                        } else {
                                            c4979a2 = c4979a;
                                            InputStream inputStream2 = c4979a2.f32524d;
                                            i11 = inputStream2 != null ? inputStream2.read(bArr, 0, 8192) : -1;
                                            if (this.f52494a.f32379g) {
                                                i10 = i11;
                                            } else {
                                                C5583f c5583f6 = this.f52495b;
                                                jNanoTime = jNanoTime;
                                                j10 = j13 - (c5583f6.f34394c + c5583f6.f34396e);
                                            }
                                            c4979aMo10675p = c4979a2;
                                            j11 = j13;
                                            ref$LongRef2 = ref$LongRef2;
                                            long j15 = j10;
                                            i12 = i11;
                                            j12 = j15;
                                            jNanoTime = jNanoTime;
                                        }
                                        i11 = i10;
                                        j10 = j14;
                                        c4979aMo10675p = c4979a2;
                                        j11 = j13;
                                        ref$LongRef2 = ref$LongRef2;
                                        long j16 = j10;
                                        i12 = i11;
                                        j12 = j16;
                                        jNanoTime = jNanoTime;
                                    } catch (Exception e14) {
                                        e = e14;
                                        c4979a3 = c4979a4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        c4979a3 = c4979a4;
                                    }
                                }
                                c4979aMo10675p = c4979aMo10675p;
                            } catch (Exception e15) {
                                e = e15;
                                c4979a3 = c4979aMo10675p;
                            } catch (Throwable th7) {
                                th = th7;
                                c4979a3 = c4979aMo10675p;
                            }
                        }
                        if (c4979aMo10675p != null) {
                            try {
                                this.f52494a.f32364P.mo10676p0(c4979aMo10675p);
                            } catch (Exception e16) {
                                this.f52494a.f32366R.mo11831d("FileDownloader", e16);
                            }
                        }
                        randomAccessFile.close();
                    } catch (Exception e17) {
                        e = e17;
                    }
                } catch (Exception e18) {
                    this.f52494a.f32366R.mo11831d("FileDownloader", e18);
                }
            } catch (Exception e19) {
                e = e19;
                randomAccessFile = null;
            } catch (Throwable th8) {
                th2 = th8;
                randomAccessFile = null;
                if (c4979a3 != null) {
                    this.f52494a.f32364P.mo10676p0(c4979a3);
                }
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                ParallelFileDownloaderImpl.m10630a(this.f52494a);
                throw th2;
            }
            ParallelFileDownloaderImpl.m10630a(this.f52494a);
        } catch (Throwable th9) {
            th = th9;
        }
    }
}
