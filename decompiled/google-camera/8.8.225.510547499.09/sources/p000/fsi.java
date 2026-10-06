package p000;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsi {

    /* JADX INFO: renamed from: c */
    public final MediaCodec f23462c;

    /* JADX INFO: renamed from: d */
    public final Handler f23463d;

    /* JADX INFO: renamed from: e */
    public final kbo f23464e;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ fsj f23468i;

    /* JADX INFO: renamed from: j */
    private Surface f23469j;

    /* JADX INFO: renamed from: k */
    private lfk f23470k;

    /* JADX INFO: renamed from: n */
    private lea f23473n;

    /* JADX INFO: renamed from: p */
    private long f23475p;

    /* JADX INFO: renamed from: q */
    private final float[] f23476q;

    /* JADX INFO: renamed from: r */
    private final float[] f23477r;

    /* JADX INFO: renamed from: s */
    private final float[] f23478s;

    /* JADX INFO: renamed from: t */
    private final float[] f23479t;

    /* JADX INFO: renamed from: u */
    private final kay f23480u;

    /* JADX INFO: renamed from: v */
    private ldx f23481v;

    /* JADX INFO: renamed from: a */
    public final Deque f23460a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final Deque f23461b = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque f23465f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public boolean f23466g = false;

    /* JADX INFO: renamed from: l */
    private boolean f23471l = false;

    /* JADX INFO: renamed from: m */
    private boolean f23472m = false;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f23467h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    private final Set f23474o = new HashSet();

    public fsi(fsj fsjVar, MediaCodec mediaCodec, Handler handler, kay kayVar) {
        this.f23468i = fsjVar;
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.f23476q = fArr;
        float[] fArr2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.f23477r = fArr2;
        float[] fArr3 = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.f23478s = fArr3;
        this.f23462c = mediaCodec;
        this.f23463d = handler;
        kbs kbsVarM13951k = kbs.m13951k("codec " + fsjVar.f23482a.getAndIncrement() + " ", fsjVar.f23487f);
        this.f23464e = kbsVarM13951k;
        this.f23480u = kayVar;
        if (fsjVar.f23492k.mo9812h(fsjVar.f23484c.mo14558k())) {
            this.f23479t = fsjVar.f23492k.mo9811g(kayVar) ? fArr2 : fArr3;
        } else {
            this.f23479t = fArr;
        }
        kbsVarM13951k.mo13940b("created");
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m8769e() {
        while (!this.f23465f.isEmpty()) {
            kpw kpwVar = (kpw) this.f23465f.removeFirst();
            this.f23464e.mo13940b("Closing image at " + kpwVar.mo7248d() + " after codec error");
            kpwVar.close();
        }
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m8770f() {
        lku.m15613H(!this.f23472m);
        ldx ldxVar = this.f23481v;
        while (!this.f23471l && !this.f23465f.isEmpty() && ldxVar != null && this.f23470k != null) {
            kpw kpwVar = (kpw) this.f23465f.removeFirst();
            m8774j(kpwVar);
            this.f23475p = kpwVar.mo7248d();
            kpwVar.close();
        }
        if (this.f23471l || !this.f23465f.isEmpty() || !this.f23466g || ldxVar == null) {
            return;
        }
        if (this.f23468i.f23489h) {
            m8779d(this.f23475p);
        } else {
            m8775k();
        }
        this.f23471l = true;
    }

    /* JADX INFO: renamed from: g */
    private final synchronized void m8771g() {
        lku.m15613H(!this.f23472m);
        while (!this.f23471l && !this.f23460a.isEmpty() && !this.f23465f.isEmpty() && this.f23470k != null) {
            int iIntValue = ((Integer) this.f23460a.removeFirst()).intValue();
            kpw kpwVar = (kpw) this.f23465f.removeFirst();
            Image inputImage = this.f23462c.getInputImage(iIntValue);
            long jConvert = TimeUnit.MICROSECONDS.convert(kpwVar.mo7248d(), TimeUnit.NANOSECONDS);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            kls klsVar = new kls(inputImage);
            fsj fsjVar = this.f23468i;
            kay kayVar = this.f23480u;
            if (!fsjVar.f23492k.mo9812h(fsjVar.f23484c.mo14558k())) {
                fsjVar.f23486e.mo9658a(kpwVar, klsVar);
            } else if (kpwVar.mo7247c() == klsVar.f36492b && kpwVar.mo7246b() == klsVar.f36493c) {
                fsjVar.f23492k.mo9809e(kpwVar, klsVar, kayVar);
            } else {
                fsjVar.f23486e.mo9658a(kpwVar, klsVar);
                fsjVar.f23492k.mo9808d(klsVar, kayVar);
            }
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            this.f23464e.mo13940b("frame transform done in " + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos2, TimeUnit.NANOSECONDS) + "ms");
            kpwVar.close();
            this.f23462c.queueInputBuffer(iIntValue, 0, this.f23468i.f23490i, jConvert, 0);
        }
        if (!this.f23460a.isEmpty() && this.f23465f.isEmpty() && this.f23466g && !this.f23471l) {
            this.f23462c.queueInputBuffer(((Integer) this.f23460a.removeFirst()).intValue(), 0, 0, 0L, 4);
            this.f23471l = true;
        }
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m8772h() {
        if (this.f23472m) {
            m8769e();
        } else if (this.f23468i.f23488g) {
            m8770f();
        } else {
            m8771g();
        }
    }

    /* JADX INFO: renamed from: i */
    private final synchronized void m8773i() {
        if (this.f23472m) {
            lku.m15613H(this.f23470k == null);
            return;
        }
        while (!this.f23461b.isEmpty()) {
            lfk lfkVar = this.f23470k;
            Pair pair = (Pair) this.f23461b.removeFirst();
            Integer num = (Integer) pair.first;
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) pair.second;
            if ((bufferInfo.flags & 4) == 0 && (bufferInfo.flags & 2) == 0) {
                if (lfkVar == null) {
                    this.f23464e.mo13942d("Submitting to null muxer track; was it closed already without an error?");
                } else if (!this.f23468i.f23489h) {
                    fsj.m8780c(lfkVar, bufferInfo, this.f23462c.getOutputBuffer(num.intValue()));
                } else if (!this.f23474o.contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                    fsj.m8780c(lfkVar, bufferInfo, this.f23462c.getOutputBuffer(num.intValue()));
                    this.f23474o.add(Long.valueOf(bufferInfo.presentationTimeUs));
                }
            }
            this.f23462c.releaseOutputBuffer(num.intValue(), false);
            if ((bufferInfo.flags & 4) != 0) {
                lea leaVar = this.f23473n;
                if (leaVar != null) {
                    leaVar.close();
                    this.f23473n = null;
                }
                ldx ldxVar = this.f23481v;
                if (ldxVar != null) {
                    ldxVar.close();
                    this.f23481v = null;
                    this.f23469j = null;
                }
                Surface surface = this.f23469j;
                if (surface != null) {
                    surface.release();
                    this.f23469j = null;
                }
                m8769e();
                this.f23462c.release();
                this.f23468i.f23483b.decrementAndGet();
                this.f23464e.mo13940b("Released codec (success); current active count: " + this.f23468i.f23483b.get());
                if (lfkVar != null) {
                    lfkVar.close();
                    this.f23470k = null;
                }
                if (!this.f23461b.isEmpty()) {
                    this.f23464e.mo13942d("Recevied EOS but output buffers still present?");
                    this.f23461b.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final synchronized void m8774j(kpw kpwVar) {
        ldx ldxVar = this.f23481v;
        if (ldxVar == null) {
            return;
        }
        long jMo7248d = kpwVar.mo7248d();
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            if (hardwareBufferMo7250f == null) {
                this.f23464e.mo13947i("Attempting to encode image with no hardware buffer content. Skipping.");
                return;
            }
            EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
            try {
                lcy lcyVarM15192b = lcy.m15192b(this.f23468i.f23491j, eGLImage);
                try {
                    ldxVar.m15166e(fse.f23448c, new fsf(jMo7248d, 2));
                    lea leaVar = this.f23473n;
                    if (leaVar != null) {
                        leaVar.m15236f(lcyVarM15192b, ldxVar, this.f23479t);
                    }
                    lzd.m16234m(this.f23468i.f23491j);
                    lcyVarM15192b.close();
                    eGLImage.close();
                    hardwareBufferMo7250f.close();
                    return;
                } catch (Throwable th) {
                    try {
                        lcyVarM15192b.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    eGLImage.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (hardwareBufferMo7250f != null) {
                try {
                    hardwareBufferMo7250f.close();
                } catch (Throwable th6) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                }
            }
            throw th5;
        }
        throw th;
    }

    /* JADX INFO: renamed from: k */
    private final synchronized void m8775k() {
        this.f23468i.f23491j.execute(new fnx(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized fqu m8776a(kyt kytVar) {
        lku.m15614I(this.f23470k == null, "Trying to add track twice");
        this.f23462c.setCallback(new fsg(this, kytVar), this.f23463d);
        fsj fsjVar = this.f23468i;
        if (fsjVar.f23488g) {
            fsjVar.f23485d.setInteger("color-format", 2130708361);
            this.f23462c.configure(this.f23468i.f23485d, (Surface) null, (MediaCrypto) null, 1);
            Surface surfaceCreateInputSurface = this.f23462c.createInputSurface();
            this.f23481v = ldx.m15221k(this.f23468i.f23491j, new leh(surfaceCreateInputSurface), kzh.m15087d(this.f23468i.f23485d.getInteger("width"), this.f23468i.f23485d.getInteger("height")));
            this.f23473n = lea.m15230a(this.f23468i.f23491j);
            this.f23469j = surfaceCreateInputSurface;
        } else {
            this.f23462c.configure(fsjVar.f23485d, (Surface) null, (MediaCrypto) null, 1);
        }
        this.f23470k = kytVar;
        this.f23462c.start();
        return new fsh(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m8777b(Exception exc) {
        this.f23464e.mo13943e("Error while encoding track", exc);
        synchronized (this) {
            lfk lfkVar = this.f23470k;
            if (lfkVar != null) {
                lfkVar.close();
                this.f23470k = null;
                this.f23472m = true;
            }
        }
        m8769e();
        this.f23462c.release();
        this.f23468i.f23483b.decrementAndGet();
        this.f23464e.mo13940b("Released codec due to error; current active count: " + this.f23468i.f23483b.get());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8778c() {
        try {
            m8772h();
            m8773i();
        } catch (IllegalStateException e) {
            m8777b(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8779d(long j) {
        ldx ldxVar = this.f23481v;
        if (ldxVar == null) {
            return;
        }
        if (this.f23467h.get()) {
            m8775k();
            return;
        }
        ldxVar.m15166e(fse.f23446a, new fsf(j, 0));
        lzd.m16234m(this.f23468i.f23491j);
        this.f23463d.postDelayed(new eqd(this, j, 6), 10L);
    }
}
