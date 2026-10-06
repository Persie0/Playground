package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxz implements kqa {

    /* JADX INFO: renamed from: a */
    public static final nbh f37690a = nbh.m17259h("com/google/android/libraries/microvideo/gcamuxer/AsyncMediaMuxerWrapper");

    /* JADX INFO: renamed from: b */
    public final kqa f37691b;

    /* JADX INFO: renamed from: g */
    private final Executor f37696g;

    /* JADX INFO: renamed from: h */
    private final Runnable f37697h;

    /* JADX INFO: renamed from: i */
    private final boolean f37698i;

    /* JADX INFO: renamed from: c */
    public final Object f37692c = new Object();

    /* JADX INFO: renamed from: d */
    public Throwable f37693d = null;

    /* JADX INFO: renamed from: e */
    public final Object f37694e = new Object();

    /* JADX INFO: renamed from: f */
    public final HashMap f37695f = new HashMap();

    /* JADX INFO: renamed from: j */
    private int f37699j = 0;

    public kxz(kqa kqaVar, ExecutorService executorService) {
        this.f37691b = kqaVar;
        this.f37696g = new kxy(this, kxk.m14956B(executorService));
        executorService.getClass();
        this.f37697h = new kxw(executorService, 3);
        this.f37698i = true;
    }

    /* JADX INFO: renamed from: j */
    private final void m15045j() {
        synchronized (this.f37692c) {
            Throwable th = this.f37693d;
            this.f37693d = null;
            if (th != null) {
                throw new kye(th);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m15046k() {
        final nqf nqfVarM17621g = nqf.m17621g();
        this.f37696g.execute(new Runnable() { // from class: kxv
            @Override // java.lang.Runnable
            public final void run() {
                nqfVarM17621g.mo14894e(new Object());
            }
        });
        try {
            nqfVarM17621g.get(60L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) ((nbe) f37690a.m17252c()).mo17283h(e)).mo17276G((char) 4477)).mo17290o("Waiting for muxer interrupted / timed out");
            Thread.currentThread().interrupt();
        }
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: a */
    public final int mo14517a(MediaFormat mediaFormat) {
        int i;
        synchronized (this.f37694e) {
            i = this.f37699j;
            this.f37699j = i + 1;
            this.f37696g.execute(new RunnableC0904pi(this, mediaFormat, i, 19));
        }
        return i;
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: b */
    public final void mo14518b(String str, Object obj) {
        this.f37696g.execute(new kha(this, str, obj, 5));
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: c */
    public final void mo14519c() {
        this.f37696g.execute(new kxw(this.f37691b, 2));
        m15046k();
        if (this.f37698i) {
            this.f37697h.run();
        }
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: d */
    public final void mo14520d(final float f, final float f2) {
        this.f37696g.execute(new Runnable() { // from class: kxx
            @Override // java.lang.Runnable
            public final void run() {
                kxz kxzVar = this.f37685a;
                kxzVar.f37691b.mo14520d(f, f2);
            }
        });
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: e */
    public final void mo14521e(int i) {
        this.f37696g.execute(new gdi(this, i, 7));
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: f */
    public final void mo14522f() {
        this.f37696g.execute(new lcg(1));
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: g */
    public final void mo14523g() {
        this.f37696g.execute(new kxw(this.f37691b, 0));
        m15046k();
        m15045j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: h */
    public final void mo14524h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m15045j();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        byteBufferAllocateDirect.put(byteBuffer).flip();
        this.f37696g.execute(new eqa(this, i, byteBufferAllocateDirect, bufferInfo, 2));
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: i */
    public final boolean mo14525i() {
        return true;
    }
}
