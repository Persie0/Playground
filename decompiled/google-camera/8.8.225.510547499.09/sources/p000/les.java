package p000;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class les implements let {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f38079a;

    /* JADX INFO: renamed from: c */
    public final Surface f38081c;

    /* JADX INFO: renamed from: j */
    public final ler f38088j;

    /* JADX INFO: renamed from: m */
    public final boolean f38091m;

    /* JADX INFO: renamed from: p */
    private final boolean f38094p;

    /* JADX INFO: renamed from: k */
    public final Set f38089k = new HashSet();

    /* JADX INFO: renamed from: l */
    public final Set f38090l = new HashSet();

    /* JADX INFO: renamed from: n */
    public volatile lfp f38092n = lfp.f38157a;

    /* JADX INFO: renamed from: o */
    public volatile lfg f38093o = lfg.f38122c;

    /* JADX INFO: renamed from: d */
    public final Deque f38082d = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f38080b = new AtomicInteger(3);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f38086h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final nqf f38083e = nqf.m17621g();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f38085g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f38084f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f38087i = new AtomicBoolean(false);

    public les(MediaCodec mediaCodec, MediaFormat mediaFormat, mrf mrfVar, boolean z, Handler handler, boolean z2) {
        this.f38079a = mediaCodec;
        this.f38091m = z2;
        this.f38094p = z;
        ler lerVar = new ler(this);
        this.f38088j = lerVar;
        if (handler == null) {
            mediaCodec.setCallback(lerVar);
        } else {
            mediaCodec.setCallback(lerVar, handler);
        }
        m15262k(mediaCodec, mediaFormat, z2);
        this.f38081c = mrfVar == null ? null : (Surface) mrfVar.apply(mediaCodec);
    }

    /* JADX INFO: renamed from: h */
    private final int m15259h() {
        synchronized (this) {
            if (this.f38082d.isEmpty()) {
                return -1;
            }
            return ((Integer) this.f38082d.removeFirst()).intValue();
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m15260i() {
        this.f38082d.clear();
        this.f38089k.clear();
        this.f38090l.clear();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x004c, TryCatch #2 {, blocks: (B:3:0x0001, B:12:0x0023, B:13:0x0026, B:15:0x002e, B:17:0x0039, B:19:0x003d, B:20:0x0040, B:21:0x004a, B:8:0x0011, B:11:0x001c, B:5:0x000a), top: B:26:0x0001, inners: #3 }] */
    /* JADX INFO: renamed from: j */
    private final void m15261j(boolean z) {
        Surface surface;
        synchronized (this) {
            if (this.f38087i.getAndSet(false)) {
                try {
                    this.f38079a.stop();
                } catch (MediaCodec.CodecException e) {
                    if (z) {
                        this.f38088j.onError(this.f38079a, e);
                    }
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception while trying to stop codec", th);
                }
                m15260i();
                if (!this.f38083e.isDone()) {
                    MediaCodec mediaCodec = this.f38079a;
                    boolean z2 = lbo.f37882a;
                    mediaCodec.release();
                    surface = this.f38081c;
                    if (surface != null && this.f38094p) {
                        surface.release();
                    }
                    this.f38083e.mo14894e(true);
                }
            } else if (!this.f38083e.isDone()) {
                MediaCodec mediaCodec2 = this.f38079a;
                boolean z3 = lbo.f37882a;
                mediaCodec2.release();
                surface = this.f38081c;
                if (surface != null) {
                    surface.release();
                }
                this.f38083e.mo14894e(true);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m15262k(MediaCodec mediaCodec, MediaFormat mediaFormat, boolean z) {
        boolean zIsEncoder = mediaCodec.getCodecInfo().isEncoder();
        int i = zIsEncoder;
        if (z) {
            lku.m15614I(true, "Block mode requires Android R");
            i = (zIsEncoder ? 1 : 0) | 2;
        }
        try {
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, i);
        } catch (MediaCodec.CodecException e) {
            Log.w("AsynchMediaCodec", "Error while configuring codec: ".concat(String.valueOf(e.getDiagnosticInfo())), e);
            throw e;
        }
    }

    @Override // p000.let
    /* JADX INFO: renamed from: a */
    public final leu mo15263a() {
        lku.m15614I(!this.f38091m, "nextByteBuffer() called on codec in block mode");
        if (this.f38081c != null) {
            throw new AssertionError("MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
        }
        int iM15259h = m15259h();
        if (iM15259h < 0) {
            return null;
        }
        try {
            ByteBuffer inputBuffer = this.f38079a.getInputBuffer(iM15259h);
            if (inputBuffer == null) {
                return null;
            }
            leo leoVar = new leo(this, inputBuffer, iM15259h);
            synchronized (this) {
                this.f38089k.add(leoVar);
            }
            return leoVar;
        } catch (MediaCodec.CodecException e) {
            this.f38088j.onError(this.f38079a, e);
            return null;
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Error occurred while trying to fetch input buffer", th);
            return null;
        }
    }

    @Override // p000.let
    /* JADX INFO: renamed from: b */
    public final leu mo15264b() {
        lku.m15614I(this.f38091m, "nextRequest() requires codec configured in block mode");
        int iM15259h = m15259h();
        if (iM15259h < 0) {
            return null;
        }
        try {
            return new lep(this.f38079a.getQueueRequest(iM15259h), iM15259h);
        } catch (MediaCodec.CodecException e) {
            this.f38088j.onError(this.f38079a, e);
            return null;
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Exception occurred in getQueueRequest", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15265c(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            m15260i();
            this.f38080b.set(3);
            if (this.f38085g.get()) {
                this.f38093o.mo8418e(2);
            } else {
                this.f38093o.mo8418e(1);
            }
            if (this.f38085g.getAndSet(false)) {
                m15266d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15266d() {
        m15261j(true);
    }

    /* JADX INFO: renamed from: e */
    public final void m15267e() {
        m15261j(false);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m15268f() {
        if (this.f38081c == null && !this.f38091m) {
            int iM15259h = m15259h();
            if (iM15259h >= 0) {
                m15269g(iM15259h);
                return;
            } else {
                if (this.f38080b.get() == 1) {
                    this.f38084f.set(true);
                }
                return;
            }
        }
        m15269g(0);
    }

    /* JADX INFO: renamed from: g */
    public final void m15269g(int i) {
        this.f38080b.set(2);
        if (this.f38081c != null) {
            try {
                this.f38079a.signalEndOfInputStream();
                return;
            } catch (MediaCodec.CodecException e) {
                this.f38088j.onError(this.f38079a, e);
                return;
            } catch (Throwable th) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", th);
                return;
            }
        }
        try {
            try {
                if (this.f38091m) {
                    MediaFormat inputFormat = this.f38079a.getInputFormat();
                    HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(inputFormat.getInteger("width"), inputFormat.getInteger("height"), 35, 1, 65536L);
                    try {
                        this.f38079a.getQueueRequest(i).setHardwareBuffer(hardwareBufferCreate).setPresentationTimeUs(0L).setFlags(4).queue();
                        if (hardwareBufferCreate != null) {
                            hardwareBufferCreate.close();
                        }
                    } catch (Throwable th2) {
                        if (hardwareBufferCreate != null) {
                            try {
                                hardwareBufferCreate.close();
                            } catch (Throwable th3) {
                                try {
                                    Throwable.class.getDeclaredMethod(hsSUWRJfoeC.ogzbDrpHZHa, Throwable.class).invoke(th2, th3);
                                } catch (Exception e2) {
                                }
                            }
                        }
                        throw th2;
                    }
                } else {
                    this.f38079a.queueInputBuffer(i, 0, 0, 0L, 4);
                }
            } catch (MediaCodec.CodecException e3) {
                this.f38088j.onError(this.f38079a, e3);
            }
        } catch (Throwable th4) {
            Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", th4);
        }
        this.f38089k.clear();
    }
}
