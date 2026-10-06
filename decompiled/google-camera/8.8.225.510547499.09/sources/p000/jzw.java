package p000;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzw implements jzz {

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f35431b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final MediaRecorder f35432a;

    /* JADX INFO: renamed from: c */
    private boolean f35433c = false;

    /* JADX INFO: renamed from: d */
    private mrm f35434d = mqu.f41450a;

    public jzw(MediaRecorder mediaRecorder) {
        this.f35432a = mediaRecorder;
        f35431b.getAndIncrement();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: A */
    public final synchronized void mo5583A(int i) {
        if (!this.f35433c) {
            this.f35432a.setVideoFrameRate(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: B */
    public final synchronized void mo5584B(int i, int i2) {
        if (!this.f35433c) {
            this.f35432a.setVideoSize(i, i2);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: C */
    public final synchronized void mo5585C() {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.start();
        } catch (RuntimeException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: D */
    public final synchronized void mo5586D() {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.stop();
        } catch (RuntimeException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: E */
    public final synchronized void mo5587E() {
        if (!this.f35433c) {
            this.f35432a.setVideoSource(2);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: a */
    public final MediaRecorder mo5588a() {
        return this.f35432a;
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: b */
    public final synchronized Surface mo5589b() {
        if (this.f35433c) {
            return null;
        }
        if (this.f35434d.mo16813g()) {
            return (Surface) this.f35434d.mo16809c();
        }
        return this.f35432a.getSurface();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5590c() {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.pause();
        } catch (RuntimeException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: d */
    public final synchronized void mo5591d() {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.prepare();
        } catch (IOException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: e */
    public final synchronized void mo5592e() {
        if (!this.f35433c) {
            this.f35432a.release();
            this.f35433c = true;
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: f */
    public final synchronized void mo5593f() {
        if (!this.f35433c) {
            this.f35434d = mqu.f41450a;
            this.f35432a.reset();
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: g */
    public final synchronized void mo5594g() {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.resume();
        } catch (RuntimeException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: h */
    public final synchronized void mo5595h(int i) {
        if (!this.f35433c) {
            this.f35432a.setAudioChannels(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5596i(int i) {
        if (!this.f35433c) {
            this.f35432a.setAudioEncoder(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: j */
    public final synchronized void mo5597j(int i) {
        if (!this.f35433c) {
            this.f35432a.setAudioEncodingBitRate(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: k */
    public final synchronized void mo5598k(int i) {
        if (!this.f35433c) {
            this.f35432a.setAudioSamplingRate(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: l */
    public final synchronized void mo5599l(int i) {
        if (!this.f35433c) {
            this.f35432a.setAudioSource(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: m */
    public final synchronized void mo5600m(double d) {
        if (!this.f35433c) {
            this.f35432a.setCaptureRate(d);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: n */
    public final synchronized void mo5601n(Surface surface) {
        if (!this.f35433c) {
            this.f35432a.setInputSurface(surface);
            this.f35434d = mrm.m16829i(surface);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: o */
    public final synchronized void mo5602o(float f, float f2) {
        if (!this.f35433c) {
            this.f35432a.setLocation(f, f2);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: p */
    public final synchronized void mo5603p(int i) {
        if (!this.f35433c) {
            this.f35432a.setMaxDuration(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: q */
    public final synchronized void mo5604q(long j) {
        if (!this.f35433c) {
            this.f35432a.setMaxFileSize(j);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: r */
    public final void mo5605r(FileDescriptor fileDescriptor) throws jzx {
        if (this.f35433c) {
            return;
        }
        try {
            this.f35432a.setNextOutputFile(fileDescriptor);
        } catch (IOException e) {
            throw new jzx(e);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: s */
    public final synchronized void mo5606s(MediaRecorder.OnErrorListener onErrorListener) {
        if (!this.f35433c) {
            this.f35432a.setOnErrorListener(onErrorListener);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: t */
    public final synchronized void mo5607t(MediaRecorder.OnInfoListener onInfoListener) {
        if (!this.f35433c) {
            this.f35432a.setOnInfoListener(onInfoListener);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: u */
    public final synchronized void mo5608u(int i) {
        if (!this.f35433c) {
            this.f35432a.setOrientationHint(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: v */
    public final synchronized void mo5609v(FileDescriptor fileDescriptor) {
        if (!this.f35433c) {
            this.f35432a.setOutputFile(fileDescriptor);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: w */
    public final synchronized void mo5610w(String str) {
        if (!this.f35433c) {
            this.f35432a.setOutputFile(str);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: x */
    public final synchronized void mo5611x(int i) {
        if (!this.f35433c) {
            this.f35432a.setOutputFormat(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: y */
    public final synchronized void mo5612y(int i) {
        if (!this.f35433c) {
            this.f35432a.setVideoEncoder(i);
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: z */
    public final synchronized void mo5613z(int i) {
        if (!this.f35433c) {
            this.f35432a.setVideoEncodingBitRate(i);
        }
    }
}
