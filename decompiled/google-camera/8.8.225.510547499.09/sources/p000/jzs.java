package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import com.google.android.material.snackbar.VMX.rgoX;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzs implements jyw {

    /* JADX INFO: renamed from: A */
    private final kbz f35347A;

    /* JADX INFO: renamed from: B */
    private final double f35348B;

    /* JADX INFO: renamed from: C */
    private final jww f35349C;

    /* JADX INFO: renamed from: D */
    private final jww f35350D;

    /* JADX INFO: renamed from: E */
    private final jxv f35351E;

    /* JADX INFO: renamed from: F */
    private final jze f35352F;

    /* JADX INFO: renamed from: G */
    private MediaCodec.Callback f35353G;

    /* JADX INFO: renamed from: H */
    private long f35354H;

    /* JADX INFO: renamed from: c */
    public final MediaCodec f35361c;

    /* JADX INFO: renamed from: d */
    public final Surface f35362d;

    /* JADX INFO: renamed from: e */
    public final jzh f35363e;

    /* JADX INFO: renamed from: f */
    public final int f35364f;

    /* JADX INFO: renamed from: g */
    public final Range f35365g;

    /* JADX INFO: renamed from: i */
    public final HandlerThread f35367i;

    /* JADX INFO: renamed from: j */
    public final Handler f35368j;

    /* JADX INFO: renamed from: k */
    public final boolean f35369k;

    /* JADX INFO: renamed from: l */
    public final boolean f35370l;

    /* JADX INFO: renamed from: m */
    public long f35371m;

    /* JADX INFO: renamed from: n */
    public long f35372n;

    /* JADX INFO: renamed from: w */
    public MediaFormat f35381w;

    /* JADX INFO: renamed from: x */
    public int f35382x;

    /* JADX INFO: renamed from: y */
    private final boolean f35383y;

    /* JADX INFO: renamed from: z */
    private final jys f35384z;

    /* JADX INFO: renamed from: a */
    public final Object f35359a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f35360b = new Object();

    /* JADX INFO: renamed from: h */
    public final nqf f35366h = nqf.m17621g();

    /* JADX INFO: renamed from: I */
    private volatile long f35355I = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public final AtomicLong f35373o = new AtomicLong(0);

    /* JADX INFO: renamed from: p */
    public final AtomicLong f35374p = new AtomicLong(0);

    /* JADX INFO: renamed from: J */
    private final AtomicLong f35356J = new AtomicLong(0);

    /* JADX INFO: renamed from: q */
    public final AtomicLong f35375q = new AtomicLong(0);

    /* JADX INFO: renamed from: r */
    public volatile boolean f35376r = false;

    /* JADX INFO: renamed from: s */
    public volatile boolean f35377s = false;

    /* JADX INFO: renamed from: K */
    private volatile boolean f35357K = false;

    /* JADX INFO: renamed from: t */
    public volatile boolean f35378t = false;

    /* JADX INFO: renamed from: L */
    private final AtomicBoolean f35358L = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u */
    public final List f35379u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public boolean f35380v = false;

    public jzs(jxv jxvVar, jym jymVar, int i, int i2, int i3, jys jysVar, mrm mrmVar, mrm mrmVar2, boolean z, jzh jzhVar, kbz kbzVar, jww jwwVar, jww jwwVar2, boolean z2, jze jzeVar) throws jxx {
        jxz jxzVar;
        this.f35353G = new jzr(this);
        this.f35351E = jxvVar;
        this.f35363e = jzhVar;
        this.f35349C = jwwVar;
        this.f35350D = jwwVar2;
        this.f35352F = jzeVar;
        this.f35370l = z2;
        double dM13669a = jxvVar.m13669a();
        double dM13671c = jxvVar.m13671c();
        Double.isNaN(dM13669a);
        Double.isNaN(dM13671c);
        this.f35348B = dM13669a / dM13671c;
        int i4 = jxvVar.f35100d;
        switch (i4) {
            case 1:
                jxzVar = jxz.H263;
                break;
            case 2:
                jxzVar = jxz.H264;
                break;
            case 3:
                jxzVar = jxz.MPEG_4_SP;
                break;
            case 4:
            default:
                throw new IllegalArgumentException("Unsupported video codec type: " + i4);
            case 5:
                jxzVar = jxz.HEVC;
                break;
        }
        String str = jxzVar.f35117e;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, jxvVar.f35098b.m13661b().f35517a, jxvVar.f35098b.m13661b().f35518b);
        mediaFormatCreateVideoFormat.setInteger("color-format", jymVar.f35196d);
        mediaFormatCreateVideoFormat.setInteger("bitrate", jxvVar.m13670b());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", jxvVar.m13671c());
        mediaFormatCreateVideoFormat.setInteger("capture-rate", jxvVar.m13669a());
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", jxvVar.f35103g);
        mediaFormatCreateVideoFormat.setInteger("color-standard", i);
        mediaFormatCreateVideoFormat.setInteger("color-range", i2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        mediaFormatCreateVideoFormat.setInteger(rgoX.BukIpLiGb, 1);
        int i5 = jxvVar.f35101e;
        if (i5 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i5);
        }
        int i6 = jxvVar.f35102f;
        if (i6 != -1) {
            mediaFormatCreateVideoFormat.setInteger("level", i6);
        }
        jxn jxnVar = jxvVar.f35099c;
        if (jxnVar.m13657e()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", jxnVar.f35058i);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        String.valueOf(mediaFormatCreateVideoFormat);
        MediaCodec mediaCodecM13819g = jzn.m13819g(jxzVar);
        this.f35361c = mediaCodecM13819g;
        mediaCodecM13819g.getClass();
        HandlerThread handlerThread = new HandlerThread("VideoEncoder");
        this.f35367i = handlerThread;
        handlerThread.start();
        Handler handlerM13557e = jvh.m13557e(handlerThread.getLooper());
        this.f35368j = handlerM13557e;
        if (z) {
            this.f35369k = true;
        } else {
            if (mrmVar2.mo16813g()) {
                this.f35353G = (MediaCodec.Callback) mrmVar2.mo16809c();
                this.f35369k = true;
            } else {
                this.f35369k = false;
            }
            mediaCodecM13819g.setCallback(this.f35353G, handlerM13557e);
        }
        mediaCodecM13819g.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f35383y = mrmVar.mo16813g();
        if (mrmVar.mo16813g()) {
            Surface surface = (Surface) mrmVar.mo16809c();
            this.f35362d = surface;
            mediaCodecM13819g.setInputSurface(surface);
        } else if (jymVar == jym.SURFACE) {
            this.f35362d = mediaCodecM13819g.createInputSurface();
        } else {
            this.f35362d = null;
        }
        this.f35384z = jysVar;
        this.f35347A = kbzVar;
        this.f35364f = jxvVar.m13670b();
        this.f35365g = mediaCodecM13819g.getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
        this.f35382x = 1;
        if (z2) {
            mediaCodecM13819g.start();
            m13848d(false);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m13845g() {
        this.f35368j.post(new jzq(this, 1));
        try {
            this.f35367i.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:45:0x00c3, B:47:0x00c8, B:49:0x00d5, B:50:0x00d8, B:52:0x00dc, B:54:0x00e0, B:55:0x00e3, B:56:0x00e8, B:8:0x000e, B:10:0x001b, B:12:0x0028, B:14:0x002c, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:24:0x0040, B:26:0x0044, B:28:0x004e, B:29:0x0061, B:30:0x0082, B:35:0x008d, B:36:0x008e, B:38:0x0092, B:40:0x0098, B:41:0x009e, B:43:0x00a2, B:44:0x00ae, B:19:0x0038, B:23:0x003f, B:31:0x0083, B:32:0x008a), top: B:61:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044 A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:45:0x00c3, B:47:0x00c8, B:49:0x00d5, B:50:0x00d8, B:52:0x00dc, B:54:0x00e0, B:55:0x00e3, B:56:0x00e8, B:8:0x000e, B:10:0x001b, B:12:0x0028, B:14:0x002c, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:24:0x0040, B:26:0x0044, B:28:0x004e, B:29:0x0061, B:30:0x0082, B:35:0x008d, B:36:0x008e, B:38:0x0092, B:40:0x0098, B:41:0x009e, B:43:0x00a2, B:44:0x00ae, B:19:0x0038, B:23:0x003f, B:31:0x0083, B:32:0x008a), top: B:61:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:45:0x00c3, B:47:0x00c8, B:49:0x00d5, B:50:0x00d8, B:52:0x00dc, B:54:0x00e0, B:55:0x00e3, B:56:0x00e8, B:8:0x000e, B:10:0x001b, B:12:0x0028, B:14:0x002c, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:24:0x0040, B:26:0x0044, B:28:0x004e, B:29:0x0061, B:30:0x0082, B:35:0x008d, B:36:0x008e, B:38:0x0092, B:40:0x0098, B:41:0x009e, B:43:0x00a2, B:44:0x00ae, B:19:0x0038, B:23:0x003f, B:31:0x0083, B:32:0x008a), top: B:61:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:45:0x00c3, B:47:0x00c8, B:49:0x00d5, B:50:0x00d8, B:52:0x00dc, B:54:0x00e0, B:55:0x00e3, B:56:0x00e8, B:8:0x000e, B:10:0x001b, B:12:0x0028, B:14:0x002c, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:24:0x0040, B:26:0x0044, B:28:0x004e, B:29:0x0061, B:30:0x0082, B:35:0x008d, B:36:0x008e, B:38:0x0092, B:40:0x0098, B:41:0x009e, B:43:0x00a2, B:44:0x00ae, B:19:0x0038, B:23:0x003f, B:31:0x0083, B:32:0x008a), top: B:61:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:45:0x00c3, B:47:0x00c8, B:49:0x00d5, B:50:0x00d8, B:52:0x00dc, B:54:0x00e0, B:55:0x00e3, B:56:0x00e8, B:8:0x000e, B:10:0x001b, B:12:0x0028, B:14:0x002c, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:24:0x0040, B:26:0x0044, B:28:0x004e, B:29:0x0061, B:30:0x0082, B:35:0x008d, B:36:0x008e, B:38:0x0092, B:40:0x0098, B:41:0x009e, B:43:0x00a2, B:44:0x00ae, B:19:0x0038, B:23:0x003f, B:31:0x0083, B:32:0x008a), top: B:61:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0061, please report this as an issue */
    @Override // p000.jyw
    /* JADX INFO: renamed from: a */
    public final void mo13741a(long j) {
        Surface surface;
        int i;
        int iDequeueInputBuffer;
        synchronized (this.f35359a) {
            int i2 = this.f35382x;
            int i3 = 2;
            if (i2 == 2) {
                double d = j - this.f35371m;
                double d2 = this.f35348B;
                Double.isNaN(d);
                this.f35355I = (long) (d * d2);
                this.f35347A.mo13961e("VideoEncoder#stop");
                if (this.f35362d != null && this.f35382x == 5) {
                    this.f35361c.signalEndOfInputStream();
                }
                if (this.f35362d == null) {
                    synchronized (this.f35359a) {
                        i = this.f35382x;
                        if (i != 5 && i != 2) {
                            throw new IllegalStateException("encoding is not yet started.");
                        }
                    }
                    if (this.f35362d == null) {
                        throw new IllegalStateException("As " + String.valueOf(jym.SURFACE) + "is used as color format, you are not allowed to add data here");
                    }
                    iDequeueInputBuffer = this.f35361c.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        this.f35361c.getInputBuffer(iDequeueInputBuffer).clear();
                        this.f35361c.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
                    }
                }
                surface = this.f35362d;
                if (surface != null && !surface.isValid()) {
                    this.f35366h.mo14894e(null);
                }
                if (!this.f35369k) {
                    this.f35352F.m13790a(2, this.f35355I, this.f35374p, this.f35366h);
                }
                this.f35368j.post(new jzq(this, i3));
                m13845g();
                this.f35382x = 3;
                this.f35347A.mo13962f();
            } else if (i2 == 5) {
                m13849e(j);
                double d3 = j - this.f35371m;
                double d4 = this.f35348B;
                Double.isNaN(d3);
                this.f35355I = (long) (d3 * d4);
                this.f35347A.mo13961e("VideoEncoder#stop");
                if (this.f35362d != null) {
                    this.f35361c.signalEndOfInputStream();
                }
                if (this.f35362d == null) {
                    synchronized (this.f35359a) {
                        i = this.f35382x;
                        if (i != 5) {
                            throw new IllegalStateException("encoding is not yet started.");
                        }
                        if (this.f35362d == null) {
                            throw new IllegalStateException("As " + String.valueOf(jym.SURFACE) + "is used as color format, you are not allowed to add data here");
                        }
                        iDequeueInputBuffer = this.f35361c.dequeueInputBuffer(10000L);
                        if (iDequeueInputBuffer >= 0) {
                            this.f35361c.getInputBuffer(iDequeueInputBuffer).clear();
                            this.f35361c.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
                        }
                    }
                }
                surface = this.f35362d;
                if (surface != null) {
                    this.f35366h.mo14894e(null);
                }
                if (!this.f35369k) {
                    this.f35352F.m13790a(2, this.f35355I, this.f35374p, this.f35366h);
                }
                this.f35368j.post(new jzq(this, i3));
                m13845g();
                this.f35382x = 3;
                this.f35347A.mo13962f();
            }
            if (this.f35382x != 4) {
                this.f35361c.release();
                if (this.f35367i.isAlive()) {
                    m13845g();
                }
                Surface surface2 = this.f35362d;
                if (surface2 != null && !this.f35383y) {
                    surface2.release();
                }
                this.f35382x = 4;
                SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m13846b(long j) {
        double d = j;
        double d2 = this.f35348B;
        Double.isNaN(d);
        return (long) (d / d2);
    }

    /* JADX INFO: renamed from: c */
    public final void m13847c(MediaFormat mediaFormat) {
        mediaFormat.setInteger("time-lapse-enable", 1);
        mediaFormat.setInteger("time-lapse-fps", this.f35351E.m13669a());
        String.valueOf(mediaFormat);
        if (this.f35358L.getAndSet(true)) {
            throw new IllegalStateException("format changed twice");
        }
        this.f35384z.mo13724e(mediaFormat);
        this.f35384z.mo13730k();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        mo13741a(SystemClock.uptimeMillis() * 1000);
    }

    /* JADX INFO: renamed from: d */
    public final void m13848d(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        MediaCodec mediaCodec = this.f35361c;
        mediaCodec.getClass();
        mediaCodec.setParameters(bundle);
    }

    /* JADX INFO: renamed from: e */
    public final void m13849e(long j) {
        this.f35371m += j - this.f35372n;
    }

    /* JADX INFO: renamed from: f */
    public final void m13850f(int i, MediaCodec.BufferInfo bufferInfo) {
        if (i < 0) {
            Log.w("VideoEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + i);
        } else {
            ByteBuffer outputBuffer = this.f35361c.getOutputBuffer(i);
            if (outputBuffer == null) {
                throw new RuntimeException("encoderOutputBuffer " + i + " was null");
            }
            if ((bufferInfo.flags & 2) != 0) {
                bufferInfo.size = 0;
            }
            if (this.f35348B == 2.0d) {
                double d = bufferInfo.presentationTimeUs;
                double d2 = this.f35348B;
                Double.isNaN(d);
                bufferInfo.presentationTimeUs = (long) (d * d2);
            }
            if (bufferInfo.size != 0 && !this.f35366h.isDone()) {
                if (!this.f35384z.mo13734o()) {
                    try {
                        this.f35384z.mo13729j(1000L);
                    } catch (RuntimeException e) {
                        Log.e("VideoEncoder", "Could not start all required tracks.", e);
                        this.f35357K = true;
                        this.f35363e.m13792a(jzf.OTHER);
                    }
                }
                long j = bufferInfo.presentationTimeUs;
                if (((Long) ((jwf) this.f35349C).f34942d).longValue() == 0) {
                    this.f35349C.mo3415bf(Long.valueOf(j));
                    this.f35375q.set(j);
                }
                this.f35350D.mo3415bf(Long.valueOf(j));
                this.f35374p.set(j);
                this.f35356J.set(m13846b(j));
                if (!this.f35363e.m13795d(jyv.VIDEO) && !this.f35369k) {
                    this.f35363e.m13793b(jyv.VIDEO, this.f35356J);
                }
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f35384z.mo13733n(outputBuffer, bufferInfo);
                this.f35377s = true;
                long j2 = this.f35354H;
                if (j2 > 0 && j > j2) {
                    this.f35384z.mo13723d((j - j2) / 1000);
                }
                this.f35354H = j;
                this.f35373o.incrementAndGet();
            }
            this.f35361c.releaseOutputBuffer(i, false);
            if ((bufferInfo.presentationTimeUs >= this.f35355I && (bufferInfo.flags & 2) == 0) || (bufferInfo.flags & 4) != 0 || ((this.f35376r && this.f35377s) || this.f35357K || this.f35378t)) {
                this.f35366h.mo14894e(null);
            }
        }
        this.f35366h.isDone();
    }
}
