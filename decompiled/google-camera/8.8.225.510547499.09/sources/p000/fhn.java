package p000;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhn implements fid {

    /* JADX INFO: renamed from: b */
    private static final float[] f22030b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    private final MediaFormat f22032c;

    /* JADX INFO: renamed from: f */
    private lby f22035f;

    /* JADX INFO: renamed from: g */
    private lex f22036g;

    /* JADX INFO: renamed from: h */
    private lew f22037h;

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f22031a = new ArrayBlockingQueue(16);

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f22033d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private final SparseArray f22034e = new SparseArray();

    public fhn(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        this.f22032c = mediaFormat2;
        mediaFormat2.setInteger("color-format", 2135033992);
    }

    /* JADX INFO: renamed from: h */
    private final void m8435h(long j, HardwareBuffer hardwareBuffer, MediaCodec.QueueRequest queueRequest) {
        long jConvert = TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS);
        queueRequest.setHardwareBuffer(hardwareBuffer);
        queueRequest.setPresentationTimeUs(jConvert);
        if (this.f22033d.compareAndSet(true, false)) {
            queueRequest.setFlags(1);
            queueRequest.setIntegerParameter("request-sync", 0);
        }
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: a */
    public final int mo8436a() {
        return 35;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: b */
    public final synchronized nps mo8437b() {
        lex lexVar;
        for (int i = 0; i < this.f22034e.size(); i++) {
            ((lei) this.f22034e.valueAt(i)).close();
        }
        this.f22034e.clear();
        lexVar = this.f22036g;
        return lexVar != null ? lexVar.mo15275a() : npp.f44031a;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8438c(kyt kytVar, lby lbyVar, lfg lfgVar, Handler handler) {
        this.f22035f = lbyVar;
        lex lexVarM14879r = kua.m14879r(new fii(kytVar));
        this.f22036g = lexVarM14879r;
        lfc lfcVarM15277c = ((lfa) lexVarM14879r).m15277c(this.f22032c);
        lfcVarM15277c.f38113c = handler;
        lfcVarM15277c.f38116f = true;
        lfcVarM15277c.m15279b(new fiu(this, lfgVar, 1));
        this.f22037h = lfcVarM15277c.m15278a();
        lex lexVar = this.f22036g;
        lexVar.getClass();
        lexVar.mo15276b();
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: d */
    public final synchronized boolean mo8439d() {
        return this.f22037h != null;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: e */
    public final float[] mo8440e() {
        return f22030b;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: f */
    public final void mo8441f(kpw kpwVar) throws IllegalAccessException, InvocationTargetException {
        try {
            HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
            try {
                leu leuVar = (leu) this.f22031a.poll(5000L, TimeUnit.MILLISECONDS);
                if (leuVar == null || hardwareBufferMo7250f == null) {
                    if (leuVar != null) {
                        leuVar.close();
                    }
                    if (hardwareBufferMo7250f != null) {
                        hardwareBufferMo7250f.close();
                        return;
                    }
                    return;
                }
                try {
                    m8435h(kpwVar.mo7248d(), hardwareBufferMo7250f, (MediaCodec.QueueRequest) leuVar.mo15258b());
                    leuVar.close();
                    hardwareBufferMo7250f.close();
                } catch (Throwable th) {
                    try {
                        leuVar.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (hardwareBufferMo7250f != null) {
                    try {
                        hardwareBufferMo7250f.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                }
                throw th3;
            }
        } catch (InterruptedException e) {
        }
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: g */
    public final synchronized void mo8442g(kpw kpwVar, fic ficVar) {
        leu leuVar;
        lby lbyVar = this.f22035f;
        lbyVar.getClass();
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        if (hardwareBufferMo7250f != null) {
            try {
                EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                try {
                    try {
                        leuVar = (leu) this.f22031a.poll(5000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        leuVar = null;
                    }
                    try {
                        lcy lcyVarM15192b = lcy.m15192b(lbyVar, eGLImage);
                        if (leuVar != null) {
                            try {
                                int iMo15257a = leuVar.mo15257a();
                                int iMo7247c = kpwVar.mo7247c();
                                int iMo7246b = kpwVar.mo7246b();
                                lei leiVar = (lei) this.f22034e.get(iMo15257a);
                                lby lbyVar2 = this.f22035f;
                                lbyVar2.getClass();
                                if (leiVar == null) {
                                    HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(iMo7247c, iMo7246b, 35, 1, 66048L);
                                    EGLImage eGLImage2 = new EGLImage(hardwareBufferCreate);
                                    leiVar = new lei(ldx.m15220j(lbyVar2, eGLImage2), eGLImage2, hardwareBufferCreate, null, null);
                                    this.f22034e.put(iMo15257a, leiVar);
                                }
                                ficVar.mo8456a(lcyVarM15192b, leiVar.f38030b);
                                lzd.m16235n(lcyVarM15192b.f37915b);
                                m8435h(kpwVar.mo7248d(), leiVar.f38029a, (MediaCodec.QueueRequest) leuVar.mo15258b());
                                lcyVarM15192b.close();
                                leuVar.close();
                                eGLImage.close();
                            } catch (Throwable th) {
                                try {
                                    lcyVarM15192b.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        } else {
                            lcyVarM15192b.close();
                            eGLImage.close();
                        }
                        hardwareBufferMo7250f.close();
                    } catch (Throwable th3) {
                        if (leuVar == null) {
                            throw th3;
                        }
                        try {
                            leuVar.close();
                            throw th3;
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            throw th3;
                        }
                        try {
                            hardwareBufferMo7250f.close();
                            throw th;
                        } catch (Throwable th5) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th5);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        eGLImage.close();
                        throw th6;
                    } catch (Throwable th7) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                hardwareBufferMo7250f.close();
                throw th8;
            }
        }
    }
}
