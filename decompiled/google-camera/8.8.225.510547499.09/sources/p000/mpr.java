package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;
import p021j$.time.Duration;
import p021j$.time.Instant;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mpr extends InputStream implements InputStreamRetargetInterface, mpk {

    /* JADX INFO: renamed from: a */
    public static final nbh f41274a = nbh.m17259h("com/google/babelfish/device/avenh/l2l/speechenhancer2/SpeechEnhancerImpl");

    /* JADX INFO: renamed from: b */
    public final PipedOutputStream f41275b;

    /* JADX INFO: renamed from: c */
    public final mpt f41276c;

    /* JADX INFO: renamed from: e */
    private final PipedInputStream f41278e;

    /* JADX INFO: renamed from: f */
    private final mpv f41279f;

    /* JADX INFO: renamed from: h */
    private final mqh f41281h;

    /* JADX INFO: renamed from: d */
    private final AtomicReference f41277d = new AtomicReference(mpq.UNINITIALIZED);

    /* JADX INFO: renamed from: g */
    private Optional f41280g = Optional.empty();

    /* JADX INFO: renamed from: i */
    private volatile Thread f41282i = null;

    public mpr(mpt mptVar, mqh mqhVar, PipedInputStream pipedInputStream, PipedOutputStream pipedOutputStream, mpv mpvVar) {
        this.f41276c = mptVar;
        this.f41281h = mqhVar;
        this.f41278e = pipedInputStream;
        this.f41275b = pipedOutputStream;
        this.f41279f = mpvVar;
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: a */
    public final void mo16732a() {
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'flush()' must be called before calling 'provideRawAudio()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, "'start()' must be called before calling 'flush()'.");
        lku.m15614I((this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) ? false : true, "Can't call 'flush()' after calling 'shutdown()'.");
        lku.m15614I(this.f41276c.f41302h == 2, "raw audio interface type is set to 'InputStream' - calls to flush() aren't allowed in this mode.");
        if (this.f41277d.get() == mpq.PAUSED) {
            ((mpq) this.f41277d.get()).name();
        } else {
            this.f41279f.flush();
            this.f41276c.f41295a.ifPresent(fax.f21165r);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.f41276c.f41303i;
        lku.m15614I(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        return this.f41278e.available();
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: b */
    public final void mo16733b() {
        AtomicReference atomicReference = this.f41277d;
        mpq mpqVar = mpq.UNINITIALIZED;
        mpq mpqVar2 = mpq.INITIALIZING;
        while (!atomicReference.compareAndSet(mpqVar, mpqVar2)) {
            if (atomicReference.get() != mpqVar) {
                return;
            }
        }
        this.f41282i = Thread.currentThread();
        mpt mptVar = this.f41276c;
        if (mptVar.f41302h == 1) {
            this.f41280g = Optional.m12505of(new mpx((InputStream) mptVar.f41296b.get(), new AmbientMode.AmbientController(this), this.f41276c.f41297c, null));
        }
        this.f41277d.set(mpq.READY);
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: c */
    public final void mo16734c(ByteBuffer byteBuffer) {
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'provideRawAudio()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, "'start()' must be called before calling 'provideRawAudio()'.");
        lku.m15614I((this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) ? false : true, "Can't call 'provideRawAudio()' after calling 'shutdown()'.");
        lku.m15614I(this.f41276c.f41302h == 2, "raw audio interface type is set to 'InputStream' - calls to provideRawAudio() aren't allowed in this mode.");
        if (this.f41277d.get() == mpq.PAUSED) {
            ((mpq) this.f41277d.get()).name();
        } else {
            m16744i(byteBuffer);
        }
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: d */
    public final void mo16735d(mqi mqiVar) {
        boolean z = (this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true;
        lku.m15614I(z, "'initialize()' must be called before calling 'provideVideoFrame()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, "'start()' must be called before calling 'provideVideoFrame()'.");
        lku.m15614I((this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) ? false : true, "Can't call 'provideVideoFrame()' after calling 'shutdown()'.");
        if (this.f41277d.get() == mpq.PAUSED) {
            ((mpq) this.f41277d.get()).name();
            return;
        }
        mqh mqhVar = this.f41281h;
        if (mqhVar.f41367b.f41354b) {
            mqhVar.f41368c.m16805b();
            nnf nnfVar = nnf.INSTANCE;
            Instant instantNow = Instant.now();
            if ((mqhVar.f41372g.isAfter(Instant.EPOCH) ? Duration.between(mqhVar.f41372g, instantNow) : mqhVar.f41367b.f41360h.plusSeconds(1L)).compareTo(mqhVar.f41367b.f41360h) >= 0) {
                mqhVar.f41372g = instantNow;
                double dM16804a = mqhVar.f41368c.m16804a();
                mqe mqeVar = mqhVar.f41367b;
                double d = mqeVar.f41356d;
                double d2 = mqeVar.f41357e;
                if (dM16804a < d || dM16804a > d2) {
                    liv livVar = mqhVar.f41376k;
                    ((nbe) ((nbe) mqh.f41366a.m17252c()).mo17276G((char) 4594)).mo17293r("%s", "StoredVideoFrameProcessor: current input FPS (" + ((int) dM16804a) + ") is outside the allowed range (" + ((int) d) + ", " + ((int) d2) + ").");
                    ((nbe) ((nbe) mqh.f41366a.m17252c()).mo17276G((char) 4595)).mo17290o("SVFP: Input FPS warning");
                }
            }
        }
        int i = mqhVar.f41375j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                mqhVar.f41374i.set(mqiVar);
                return;
            default:
                return;
        }
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: e */
    public final void mo16736e(double d) {
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'setMixRawAudioRatio()'.");
        lku.m15614I((this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) ? false : true, "Can't call 'setMixRawAudioRatio()' after calling 'shutdown()'.");
        lku.m15607B(d >= 0.0d && d <= 1.0d, "ratio must be 0-1 (got %s)", String.valueOf(d));
        this.f41279f.setRawAudioMixingRatio(d);
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: f */
    public final void mo16737f() {
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "call 'initialize()' before calling 'start()'.");
        lku.m15614I((this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) ? false : true, "can't call 'start()' after calling 'stop()'.");
        lku.m15614I(this.f41277d.get() != mpq.PAUSED, "can't call 'start()' while paused. Use 'resume()' instead.");
        lku.m15614I(Thread.currentThread() == this.f41282i, "'start' must be called from the thread that was used to call initialize()");
        if (this.f41277d.get() != mpq.READY) {
            ((mpq) this.f41277d.get()).name();
            return;
        }
        this.f41281h.start();
        this.f41280g.ifPresent(fax.f21164q);
        this.f41277d.set(mpq.PROCESSING);
        ((mpq) this.f41277d.get()).name();
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: g */
    public final void mo16738g() {
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "call 'initialize()' before calling 'stop()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, IuyLAqNmW.OSXvocZqo);
        lku.m15614I(Thread.currentThread() == this.f41282i, "'stop' must be called from the thread that was used to call initialize()");
        if (this.f41277d.get() == mpq.SHUTTING_DOWN || this.f41277d.get() == mpq.SHUT_DOWN) {
            ((mpq) this.f41277d.get()).name();
            return;
        }
        this.f41277d.set(mpq.SHUTTING_DOWN);
        ((mpq) this.f41277d.get()).name();
        mqh mqhVar = this.f41281h;
        mqhVar.f41371f.set(false);
        ((mqc) mqhVar.f41370e).f41336b.set(true);
        this.f41280g.ifPresent(fax.f21166s);
        this.f41277d.set(mpq.SHUT_DOWN);
        ((mpq) this.f41277d.get()).name();
    }

    @Override // p000.mpk
    /* JADX INFO: renamed from: h */
    public final void mo16739h() {
        boolean z = false;
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'setMixAllSpeechRatio()'.");
        if (this.f41277d.get() != mpq.SHUTTING_DOWN && this.f41277d.get() != mpq.SHUT_DOWN) {
            z = true;
        }
        lku.m15614I(z, "Can't call 'setMixAllSpeechRatio()' after calling 'shutdown()'.");
        lku.m15607B(true, "ratio must be 0-1 (got %s)", String.valueOf(1.0d));
        this.f41279f.setAllSpeechMixingRatio(1.0d);
    }

    /* JADX INFO: renamed from: i */
    public final void m16744i(ByteBuffer byteBuffer) {
        lku.m15670x(byteBuffer.hasRemaining(), "audio buffer can't be empty");
        mpt mptVar = this.f41276c;
        if (mptVar.f41302h == 1) {
            mptVar.f41295a.ifPresent(new fax(20));
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.f41279f.provideRawAudio(bArr);
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f41276c.f41303i;
        lku.m15614I(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'read()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, "'start()' must be called before calling 'read()'.");
        return this.f41278e.read();
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f41276c.f41303i;
        lku.m15614I(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        lku.m15614I((this.f41277d.get() == mpq.UNINITIALIZED || this.f41277d.get() == mpq.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'read()'.");
        lku.m15614I(this.f41277d.get() != mpq.READY, "'start()' must be called before calling 'read()'.");
        return this.f41278e.read(bArr, i, i2);
    }
}
