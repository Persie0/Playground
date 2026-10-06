package p000;

import android.content.Context;
import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.AndroidModelExtractor;
import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;
import com.google.googlex.gcam.BufferUtils;
import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import p021j$.nio.file.Path;
import p021j$.nio.file.Paths;
import p021j$.time.Duration;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hio implements hiw {

    /* JADX INFO: renamed from: a */
    public static final nbh f27922a = nbh.m17259h("com/google/android/apps/camera/speechenhancer/SpeechEnhancerControllerImpl");

    /* JADX INFO: renamed from: m */
    private static final Duration f27923m = Duration.ofMillis(25);

    /* JADX INFO: renamed from: b */
    public final dhv f27924b;

    /* JADX INFO: renamed from: c */
    public final npu f27925c;

    /* JADX INFO: renamed from: d */
    public final npu f27926d;

    /* JADX INFO: renamed from: e */
    public final Object f27927e;

    /* JADX INFO: renamed from: f */
    public final kbz f27928f;

    /* JADX INFO: renamed from: g */
    public final List f27929g;

    /* JADX INFO: renamed from: h */
    public hin f27930h;

    /* JADX INFO: renamed from: i */
    public Path f27931i;

    /* JADX INFO: renamed from: j */
    public hiu f27932j;

    /* JADX INFO: renamed from: k */
    public final inr f27933k;

    /* JADX INFO: renamed from: l */
    public jfs f27934l;

    /* JADX INFO: renamed from: n */
    private final Context f27935n;

    /* JADX INFO: renamed from: o */
    private his f27936o;

    /* JADX INFO: renamed from: p */
    private boolean f27937p;

    static {
        Duration.ofMillis(500L);
    }

    public hio(Context context, dhv dhvVar, kbz kbzVar) {
        npu npuVarM15032y = kxk.m15032y(Executors.newFixedThreadPool(50));
        npu npuVarM15032y2 = kxk.m15032y(jzn.m13824l("SEnhWorker"));
        this.f27927e = new Object();
        this.f27929g = new ArrayList();
        this.f27930h = hin.UNINITIALIZED;
        this.f27935n = context;
        this.f27924b = dhvVar;
        this.f27928f = kbzVar;
        this.f27925c = npuVarM15032y;
        this.f27926d = npuVarM15032y2;
        this.f27933k = new hil(this);
    }

    /* JADX INFO: renamed from: k */
    public static final void m10344k(Runnable runnable, npu npuVar) {
        kxk.m14975U(npuVar.submit(runnable), new him(0), not.INSTANCE);
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: a */
    public final kba mo10345a(hiv hivVar) {
        if (this.f27929g.contains(hivVar)) {
            return new gog(14);
        }
        this.f27929g.add(hivVar);
        return new gto(this, hivVar, 10);
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: b */
    public final Duration mo10346b() {
        return f27923m;
    }

    /* JADX INFO: renamed from: c */
    public final void m10347c() {
        try {
            Context context = this.f27935n;
            lku.m15670x(true, "You must provide a valid context in order to use the bundled model in an Android app.");
            File cacheDir = context.getCacheDir();
            File file = new File(cacheDir, "avenh_camera");
            if (file.exists()) {
                for (String str : file.list()) {
                    new File(file, str).delete();
                }
            } else {
                file.mkdir();
            }
            String absolutePath = file.getAbsolutePath();
            AndroidModelExtractor.m4874a(context.getAssets(), "avenh_camera", cacheDir);
            this.f27931i = Paths.get(absolutePath, new String[0]);
        } catch (Exception e) {
            ((nbe) ((nbe) ((nbe) f27922a.m17251b()).mo17283h(e)).mo17276G((char) 3643)).mo17290o("Failed to extract the directory of streaming model assets.");
        }
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: d */
    public final void mo10348d() {
        synchronized (this.f27927e) {
            if (this.f27930h.equals(hin.PROCESSING)) {
                m10344k(new hfr(this, 13), this.f27926d);
            }
        }
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: e */
    public final void mo10349e(hiu hiuVar) {
        this.f27932j = hiuVar;
        this.f27936o = new his(hiuVar.f27956a);
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: f */
    public final void mo10350f() {
        synchronized (this.f27927e) {
            if (this.f27930h.equals(hin.UNINITIALIZED)) {
                m10344k(new hfr(this, 12), this.f27926d);
            }
        }
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: g */
    public final void mo10351g(ByteBuffer byteBuffer, final int i, final int i2, final int i3, long j, final mrm mrmVar) {
        final long nanos;
        synchronized (this.f27927e) {
            if (this.f27930h.equals(hin.PROCESSING)) {
                his hisVar = this.f27936o;
                long j2 = hisVar.f27950b;
                if (j2 == Long.MIN_VALUE) {
                    hisVar.f27950b = j;
                    nanos = 0;
                } else {
                    nanos = (((long) hisVar.f27949a) * (j - j2)) / Duration.ofSeconds(1L).toNanos();
                }
                final ByteBuffer byteBufferM4904c = BufferUtils.m4904c(byteBuffer);
                m10344k(new Runnable() { // from class: hij
                    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mpk] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hio hioVar = this.f27905a;
                        int i4 = i3 % 180;
                        int i5 = i;
                        int i6 = i2;
                        int i7 = i4 == 0 ? i5 : i6;
                        int i8 = i4 == 0 ? i6 : i5;
                        ByteBuffer byteBuffer2 = byteBufferM4904c;
                        long j3 = nanos;
                        mrm mrmVar2 = mrmVar;
                        mpz mpzVar = mpz.MONOCHROME;
                        if (mpzVar == null) {
                            throw new NullPointerException("Null colorspace");
                        }
                        if (byteBuffer2 == null) {
                            throw new NullPointerException("Null imageBuffer");
                        }
                        hiy hiyVar = new hiy(byteBuffer2, i7, i8, mpzVar, mrm.m16829i(Long.valueOf(j3)), mrmVar2);
                        hioVar.f27928f.mo13961e("SEController#provideVideoFrame");
                        ?? r2 = hioVar.f27934l.f33914a;
                        Optional.empty();
                        Optional.empty();
                        Optional.empty();
                        Optional.empty();
                        ByteBuffer byteBuffer3 = hiyVar.f27960a;
                        if (byteBuffer3 == null) {
                            throw new NullPointerException("Null imageBuffer");
                        }
                        int i9 = hiyVar.f27961b;
                        int i10 = hiyVar.f27962c;
                        mpz mpzVar2 = hiyVar.f27963d;
                        if (mpzVar2 == null) {
                            throw new NullPointerException("Null colorspace");
                        }
                        r2.mo16735d(new mqi(byteBuffer3, i9, i10, mpzVar2, Optional.ofNullable((Long) ((mrq) hiyVar.f27964e).f41482a), Optional.ofNullable(null)));
                        hioVar.f27928f.mo13962f();
                    }
                }, this.f27926d);
            }
        }
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: h */
    public final void mo10352h() {
        synchronized (this.f27927e) {
            boolean z = true;
            if (!this.f27930h.equals(hin.PREINITIALIZED) && !this.f27930h.equals(hin.STOPPED)) {
                z = false;
            }
            lku.m15616K(z, "Cannot start from %s", this.f27930h);
        }
        m10344k(new Runnable() { // from class: hik
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, mpk] */
            /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, mpk] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, mpk] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, mpk] */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2;
                npu npuVar;
                Path path;
                Optional optionalEmpty;
                hio hioVar = this.f27912a;
                if (!hioVar.f27931i.toFile().exists()) {
                    ((nbe) ((nbe) hio.f27922a.m17252c()).mo17276G((char) 3651)).mo17290o("Model assets are purged! Try to extract model assets again.");
                    hioVar.m10347c();
                }
                mps mpsVar = new mps(null);
                mpsVar.f41294l = 1;
                mpsVar.m16748d();
                mpsVar.f41292j = 1;
                mpsVar.f41284b = Optional.empty();
                mpsVar.f41290h = (byte) (mpsVar.f41290h | 4);
                mpsVar.m16747c(true);
                mpsVar.m16746b(16000.0f);
                mpsVar.m16745a(1);
                mpsVar.f41283a = Optional.empty();
                mpsVar.f41293k = 1;
                mpsVar.f41294l = 2;
                mpsVar.m16748d();
                mpsVar.m16747c(hioVar.f27924b.mo6184l(dis.f11708d));
                Path path2 = hioVar.f27931i;
                if (path2 == null) {
                    throw new NullPointerException("Null modelDirectory");
                }
                mpsVar.f41286d = path2;
                mpsVar.f41283a = Optional.m12505of(hioVar.f27933k);
                npu npuVar2 = hioVar.f27925c;
                if (npuVar2 == null) {
                    throw new NullPointerException("Null listeningExecutorService");
                }
                mpsVar.f41285c = npuVar2;
                mpsVar.m16746b(hioVar.f27932j.f27956a);
                mpsVar.m16745a(hioVar.f27932j.f27957b);
                if (mpsVar.f41290h != 15 || (i = mpsVar.f41294l) == 0 || (i2 = mpsVar.f41291i) == 0 || mpsVar.f41292j == 0 || (npuVar = mpsVar.f41285c) == null || (path = mpsVar.f41286d) == null || mpsVar.f41293k == 0) {
                    StringBuilder sb = new StringBuilder();
                    if (mpsVar.f41294l == 0) {
                        sb.append(" speechEnhancerMode");
                    }
                    if (mpsVar.f41291i == 0) {
                        sb.append(" rawAudioInterfaceType");
                    }
                    if (mpsVar.f41292j == 0) {
                        sb.append(" processedAudioInterfaceType");
                    }
                    if (mpsVar.f41285c == null) {
                        sb.append(" listeningExecutorService");
                    }
                    if (mpsVar.f41286d == null) {
                        sb.append(" modelDirectory");
                    }
                    if ((mpsVar.f41290h & 1) == 0) {
                        sb.append(" numberOfChannels");
                    }
                    if ((mpsVar.f41290h & 2) == 0) {
                        sb.append(" sampleRate");
                    }
                    if ((mpsVar.f41290h & 4) == 0) {
                        sb.append(" skipInitGoogle");
                    }
                    if ((mpsVar.f41290h & 8) == 0) {
                        sb.append(" useTpu");
                    }
                    if (mpsVar.f41293k == 0) {
                        sb.append(" environmentType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                mpt mptVar = new mpt(i, i2, mpsVar.f41283a, mpsVar.f41284b, npuVar, path, mpsVar.f41287e, mpsVar.f41288f, mpsVar.f41289g);
                boolean z2 = mptVar.f41303i != 1 || mptVar.f41295a.isPresent();
                lku.m15670x(z2, "Callback must be set.");
                boolean z3 = mptVar.f41302h != 1 || mptVar.f41296b.isPresent();
                lku.m15670x(z3, "The 'raw audio interface type' has been set to 'input stream', but input stream wasn't provided.");
                lku.m15670x(mptVar.f41298d != null, "Model directory must be set.");
                hioVar.f27928f.mo13961e("SEController#createInstance");
                try {
                    Duration duration = mpm.f41259a;
                    mqc mqcVar = new mqc();
                    lku.m15614I(true, "SpeechEnhancerParams must be set before calling build().");
                    mpp mppVar = new mpp(mptVar.f41303i, mptVar.f41295a);
                    int i3 = mptVar.f41304j;
                    Path path3 = mptVar.f41298d;
                    int i4 = mptVar.f41299e;
                    float f = mptVar.f41300f;
                    boolean z4 = mptVar.f41301g;
                    boolean z5 = i3 == 2;
                    if (i3 == 0) {
                        throw null;
                    }
                    lku.m15614I(path3 != null, "Avenh model directory must be set before calling build().");
                    lku.m15614I(true, "Callback must be set before calling build().");
                    SpeechEnhancerJniWrapperRealtime speechEnhancerJniWrapperRealtime = new SpeechEnhancerJniWrapperRealtime(z5, path3, i4, f, mppVar, false, z4, null);
                    speechEnhancerJniWrapperRealtime.initialize();
                    mqb speechEnhancerModelInfo = speechEnhancerJniWrapperRealtime.getSpeechEnhancerModelInfo();
                    liv livVar = new liv(speechEnhancerJniWrapperRealtime);
                    mqd mqdVarM16803a = mqe.m16803a();
                    mqdVarM16803a.m16802b(speechEnhancerModelInfo.f41328a);
                    mqe mqeVarM16801a = mqdVarM16803a.m16801a();
                    mqe.m16803a().m16801a();
                    new mqc();
                    lku.m15670x(true, "Callback must be set before calling build().");
                    mqh mqhVar = new mqh(mqeVarM16801a, livVar, mqcVar, null);
                    PipedInputStream pipedInputStream = new PipedInputStream(((int) mpm.f41259a.getSeconds()) * ((int) speechEnhancerModelInfo.f41329b) * speechEnhancerModelInfo.f41331d * speechEnhancerModelInfo.f41330c);
                    PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
                    mppVar.f41263a = Optional.m12505of(pipedOutputStream);
                    optionalEmpty = Optional.m12505of(new mpr(mptVar, mqhVar, pipedInputStream, pipedOutputStream, speechEnhancerJniWrapperRealtime));
                    mrm mrmVarM16829i = optionalEmpty.isPresent() ? mrm.m16829i(new jfs((mpk) optionalEmpty.get())) : mqu.f41450a;
                    hioVar.f27928f.mo13962f();
                    if (!mrmVarM16829i.mo16813g()) {
                        throw new mso("Create speech enhancer instance failed.");
                    }
                    hioVar.f27934l = (jfs) mrmVarM16829i.mo16809c();
                    try {
                        hioVar.f27934l.f33914a.mo16733b();
                        hioVar.f27934l.f33914a.mo16736e(hioVar.f27932j.f27958c);
                        int i5 = hioVar.f27932j.f27959d;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == 2) {
                            hioVar.f27934l.f33914a.mo16739h();
                        } else {
                            hioVar.f27924b.mo6177e();
                        }
                        synchronized (hioVar.f27927e) {
                            hioVar.f27930h = hin.INITIALIZED;
                        }
                        synchronized (hioVar.f27927e) {
                            if (hioVar.f27930h.equals(hin.INITIALIZED)) {
                                hioVar.f27934l.f33914a.mo16737f();
                                hioVar.f27930h = hin.STARTED;
                            }
                        }
                    } catch (Exception e) {
                        ((nbe) ((nbe) ((nbe) hio.f27922a.m17251b()).mo17283h(e)).mo17276G((char) 3650)).mo17290o("Initialize speech enhancer failed.");
                    }
                } catch (IOException e2) {
                    ((nbe) ((nbe) ((nbe) mpl.f41258a.m17251b()).mo17283h(e2)).mo17276G((char) 4579)).mo17290o("Failed to create SpeechEnhancerImpl instance.");
                    optionalEmpty = Optional.empty();
                }
            }
        }, this.f27926d);
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: i */
    public final void mo10353i() {
        synchronized (this.f27927e) {
            if (this.f27930h.equals(hin.STARTED) || this.f27930h.equals(hin.PROCESSING)) {
                this.f27930h = hin.STOPPED;
                m10344k(new hfr(this, 11), this.f27926d);
                this.f27936o.f27950b = Long.MIN_VALUE;
                this.f27937p = false;
            }
        }
    }

    @Override // p000.hiw
    /* JADX INFO: renamed from: j */
    public final boolean mo10354j(ByteBuffer byteBuffer) {
        synchronized (this.f27927e) {
            if (this.f27930h.equals(hin.STARTED)) {
                this.f27930h = hin.PROCESSING;
            } else if (!this.f27930h.equals(hin.PROCESSING)) {
                return false;
            }
            m10344k(new hea(this, BufferUtils.m4904c(byteBuffer), 11), this.f27926d);
            if (!this.f27937p) {
                this.f27937p = true;
            }
            return true;
        }
    }
}
