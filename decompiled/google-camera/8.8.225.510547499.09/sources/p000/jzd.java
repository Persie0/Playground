package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jzd implements jza {

    /* JADX INFO: renamed from: D */
    public kba f35220D;

    /* JADX INFO: renamed from: E */
    public kba f35221E;

    /* JADX INFO: renamed from: G */
    public MediaFormat f35223G;

    /* JADX INFO: renamed from: N */
    public final HandlerThread f35230N;

    /* JADX INFO: renamed from: P */
    public int f35232P;

    /* JADX INFO: renamed from: Q */
    private final kbz f35233Q;

    /* JADX INFO: renamed from: R */
    private final jze f35234R;

    /* JADX INFO: renamed from: U */
    private final Handler f35237U;

    /* JADX INFO: renamed from: V */
    private final MediaCodec.Callback f35238V;

    /* JADX INFO: renamed from: a */
    public final npu f35239a;

    /* JADX INFO: renamed from: b */
    public final npu f35240b;

    /* JADX INFO: renamed from: c */
    public final npu f35241c;

    /* JADX INFO: renamed from: d */
    public final npu f35242d;

    /* JADX INFO: renamed from: i */
    public final knr f35247i;

    /* JADX INFO: renamed from: j */
    public final MediaCodec f35248j;

    /* JADX INFO: renamed from: k */
    public final jys f35249k;

    /* JADX INFO: renamed from: l */
    public final jww f35250l;

    /* JADX INFO: renamed from: m */
    public final double f35251m;

    /* JADX INFO: renamed from: n */
    public final jzh f35252n;

    /* JADX INFO: renamed from: o */
    public final boolean f35253o;

    /* JADX INFO: renamed from: q */
    public final boolean f35255q;

    /* JADX INFO: renamed from: u */
    public long f35259u;

    /* JADX INFO: renamed from: v */
    public final jww f35260v;

    /* JADX INFO: renamed from: e */
    public final Object f35243e = new Object();

    /* JADX INFO: renamed from: f */
    public final Object f35244f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f35245g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f35246h = new Object();

    /* JADX INFO: renamed from: p */
    public final Queue f35254p = new ArrayDeque(1000);

    /* JADX INFO: renamed from: r */
    public final Deque f35256r = new ArrayDeque();

    /* JADX INFO: renamed from: s */
    public long f35257s = -1;

    /* JADX INFO: renamed from: t */
    public volatile long f35258t = Long.MAX_VALUE;

    /* JADX INFO: renamed from: S */
    private long f35235S = 0;

    /* JADX INFO: renamed from: w */
    public final AtomicLong f35261w = new AtomicLong(0);

    /* JADX INFO: renamed from: x */
    public final AtomicLong f35262x = new AtomicLong(0);

    /* JADX INFO: renamed from: y */
    public volatile boolean f35263y = false;

    /* JADX INFO: renamed from: z */
    public volatile boolean f35264z = false;

    /* JADX INFO: renamed from: A */
    public volatile boolean f35217A = false;

    /* JADX INFO: renamed from: B */
    public volatile boolean f35218B = false;

    /* JADX INFO: renamed from: C */
    public volatile boolean f35219C = false;

    /* JADX INFO: renamed from: T */
    private final AtomicBoolean f35236T = new AtomicBoolean(false);

    /* JADX INFO: renamed from: F */
    public boolean f35222F = false;

    /* JADX INFO: renamed from: H */
    public final List f35224H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public final List f35225I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public Future f35226J = null;

    /* JADX INFO: renamed from: K */
    public long f35227K = -1;

    /* JADX INFO: renamed from: L */
    public int f35228L = -1;

    /* JADX INFO: renamed from: M */
    public byte[] f35229M = null;

    /* JADX INFO: renamed from: O */
    public final nqf f35231O = nqf.m17621g();

    public jzd(jxs jxsVar, knr knrVar, jys jysVar, jzh jzhVar, kbz kbzVar, jww jwwVar, jww jwwVar2, boolean z, jze jzeVar, boolean z2) throws jxx {
        jxw jxwVar;
        boolean z3 = false;
        jzb jzbVar = new jzb(this);
        this.f35238V = jzbVar;
        this.f35247i = knrVar;
        this.f35252n = jzhVar;
        this.f35250l = jwwVar;
        this.f35260v = jwwVar2;
        this.f35253o = z;
        this.f35234R = jzeVar;
        int i = jxsVar.f35089d;
        double d = i;
        double d2 = jxsVar.f35088c;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.f35251m = d / d2;
        if (z2 && i == 48000) {
            z3 = true;
        }
        this.f35255q = z3;
        int i2 = jxsVar.f35086a.f35034g;
        switch (i2) {
            case 1:
                jxwVar = jxw.AMR_NB;
                break;
            case 2:
                jxwVar = jxw.AMR_WB;
                break;
            case 3:
                jxwVar = jxw.AAC;
                break;
            case 4:
                jxwVar = jxw.HE_AAC;
                break;
            case 5:
                jxwVar = jxw.AAC_ELD;
                break;
            default:
                throw new IllegalArgumentException("Unsupported audio codec type: " + i2);
        }
        String str = jxwVar.f35111f;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        if (jxwVar.f35111f.equals("audio/mp4a-latm")) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        mediaFormat.setInteger(voNZjxiJou.JDchiyjdbOtw, jxsVar.f35088c);
        mediaFormat.setInteger("channel-count", jxsVar.f35090e);
        mediaFormat.setInteger("bitrate", jxsVar.f35087b);
        MediaCodec mediaCodecM13819g = jzn.m13819g(jxwVar);
        this.f35248j = mediaCodecM13819g;
        mediaCodecM13819g.getClass();
        this.f35239a = kxk.m15032y(jzn.m13824l("AEncFormat"));
        this.f35240b = kxk.m15032y(jzn.m13824l("AEncInput"));
        this.f35241c = kxk.m15032y(jzn.m13824l("AEncOutput"));
        this.f35242d = kxk.m15032y(jzn.m13824l("AEncReadAudio"));
        HandlerThread handlerThread = new HandlerThread("AudioEncoder");
        this.f35230N = handlerThread;
        handlerThread.start();
        Handler handlerM13557e = jvh.m13557e(handlerThread.getLooper());
        this.f35237U = handlerM13557e;
        mediaCodecM13819g.setCallback(jzbVar, handlerM13557e);
        mediaCodecM13819g.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f35249k = jysVar;
        this.f35233Q = kbzVar;
        this.f35232P = 1;
        if (z) {
            mediaCodecM13819g.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m13780c() {
        return TimeUnit.MICROSECONDS.convert(SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: j */
    private final void m13781j() {
        this.f35237U.post(new juz(this, 13));
        try {
            this.f35230N.join();
        } catch (InterruptedException e) {
        }
    }

    @Override // p000.jza
    /* JADX INFO: renamed from: a */
    public final void mo13778a() {
        synchronized (this.f35243e) {
            if (this.f35232P != 4) {
                if (this.f35230N.isAlive()) {
                    m13781j();
                }
                this.f35239a.shutdown();
                this.f35241c.shutdown();
                this.f35240b.shutdown();
                this.f35242d.shutdown();
                this.f35248j.release();
                this.f35247i.close();
                kba kbaVar = this.f35220D;
                if (kbaVar != null) {
                    kbaVar.close();
                }
                kba kbaVar2 = this.f35221E;
                if (kbaVar2 != null) {
                    kbaVar2.close();
                }
                this.f35232P = 4;
                SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x0049, B:8:0x000c, B:10:0x0012, B:11:0x0015), top: B:17:0x0003 }] */
    @Override // p000.jza
    /* JADX INFO: renamed from: b */
    public final void mo13779b(long j) {
        long jM13782d;
        synchronized (this.f35243e) {
            int i = this.f35232P;
            if (i == 2) {
                jM13782d = m13782d(j);
                if (i == 5) {
                    m13787i(jM13782d);
                }
                this.f35258t = jM13782d - this.f35259u;
                this.f35233Q.mo13961e("AudioEncoder#stop");
                this.f35234R.m13790a(1, this.f35258t, this.f35261w, this.f35231O);
                this.f35247i.mo5429d();
                this.f35237U.post(new juz(this, 12));
                m13781j();
                this.f35233Q.mo13962f();
                this.f35232P = 3;
            } else if (i == 5) {
                i = 5;
                jM13782d = m13782d(j);
                if (i == 5) {
                    m13787i(jM13782d);
                }
                this.f35258t = jM13782d - this.f35259u;
                this.f35233Q.mo13961e("AudioEncoder#stop");
                this.f35234R.m13790a(1, this.f35258t, this.f35261w, this.f35231O);
                this.f35247i.mo5429d();
                this.f35237U.post(new juz(this, 12));
                m13781j();
                this.f35233Q.mo13962f();
                this.f35232P = 3;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f35243e) {
            mo13779b(m13780c());
            mo13778a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m13782d(long j) {
        double d = j;
        double d2 = this.f35251m;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    /* JADX INFO: renamed from: e */
    public final void m13783e(MediaCodec mediaCodec, int i) {
        int i2;
        if (this.f35247i.mo5426a() == 3 && i >= 0) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
            khb khbVarMo5430e = this.f35247i.mo5430e(inputBuffer, inputBuffer.limit());
            if (khbVarMo5430e != null) {
                long jM13782d = m13782d(TimeUnit.MICROSECONDS.convert(khbVarMo5430e.m14237b(), TimeUnit.NANOSECONDS));
                mediaCodec.queueInputBuffer(i, 0, khbVarMo5430e.m14236a(), jM13782d, 0);
                this.f35257s = jM13782d;
            } else {
                if (this.f35247i.mo5426a() == 3) {
                    Log.w("AudioEncoder", "Read buffer from AudioRecord, but buffer size is 0.");
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                mediaCodec.queueInputBuffer(i, 0, 0, this.f35257s, i2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13784f(MediaFormat mediaFormat) {
        if (this.f35236T.getAndSet(true)) {
            throw new IllegalStateException("format changed twice");
        }
        if (this.f35231O.isDone()) {
            return;
        }
        m13785g(new jpm(this, mediaFormat, 14), this.f35239a);
    }

    /* JADX INFO: renamed from: g */
    public final void m13785g(Runnable runnable, npu npuVar) {
        kxk.m14975U(npuVar.submit(runnable), new juv(this, 2), not.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX INFO: renamed from: h */
    public final void m13786h() {
        while (!this.f35254p.isEmpty() && ((jzc) this.f35254p.peek()).f35215a.presentationTimeUs <= ((Long) ((jwf) this.f35260v).f34942d).longValue()) {
            jzc jzcVar = (jzc) this.f35254p.poll();
            if (jzcVar.f35215a.presentationTimeUs >= ((Long) ((jwf) this.f35250l).f34942d).longValue()) {
                MediaCodec.BufferInfo bufferInfo = jzcVar.f35215a;
                ByteBuffer byteBuffer = jzcVar.f35216b;
                if (!this.f35249k.mo13734o()) {
                    try {
                        this.f35249k.mo13729j(2000L);
                        if (this.f35235S < bufferInfo.presentationTimeUs) {
                            this.f35235S = bufferInfo.presentationTimeUs;
                            this.f35249k.mo13731l(byteBuffer, bufferInfo);
                            this.f35217A = true;
                        }
                    } catch (RuntimeException e) {
                        Log.e("AudioEncoder", "Could not start all required tracks.", e);
                        this.f35218B = true;
                        this.f35252n.m13792a(jzf.VIDEO_TRACK_FAIL_TO_START);
                    }
                } else if (this.f35235S < bufferInfo.presentationTimeUs) {
                    this.f35235S = bufferInfo.presentationTimeUs;
                    this.f35249k.mo13731l(byteBuffer, bufferInfo);
                    this.f35217A = true;
                }
                this.f35264z = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13787i(long j) {
        synchronized (this.f35246h) {
            mzj mzjVar = (mzj) this.f35256r.removeLast();
            this.f35256r.add(mzj.m17175e((Long) mzjVar.m17180i(), Long.valueOf(j)));
            this.f35259u += j - ((Long) mzjVar.m17180i()).longValue();
        }
    }
}
