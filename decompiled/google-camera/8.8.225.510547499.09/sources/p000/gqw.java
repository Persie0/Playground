package p000;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.imageproc.Resample;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqw implements gqy {

    /* JADX INFO: renamed from: a */
    private final nsz f26092a;

    /* JADX INFO: renamed from: b */
    private final lea f26093b;

    /* JADX INFO: renamed from: c */
    private gqz f26094c;

    /* JADX INFO: renamed from: d */
    private gqx f26095d;

    public gqw(nsz nszVar, lea leaVar) {
        this.f26092a = nszVar;
        this.f26093b = leaVar;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized gqx m9656b() {
        if (this.f26095d == null) {
            this.f26095d = new gqx(this.f26093b);
        }
        return this.f26095d;
    }

    /* JADX INFO: renamed from: c */
    private final synchronized gqy m9657c() {
        if (this.f26094c == null) {
            this.f26094c = new gqz(this.f26092a);
        }
        return this.f26094c;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[SYNTHETIC] */
    @Override // p000.gqy
    /* JADX INFO: renamed from: a */
    public final void mo9658a(kpw kpwVar, kpw kpwVar2) throws IllegalAccessException, InvocationTargetException {
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            HardwareBuffer hardwareBufferMo7250f2 = kpwVar2.mo7250f();
            try {
                if (hardwareBufferMo7250f != null && hardwareBufferMo7250f2 != null) {
                    gqx gqxVarM9656b = m9656b();
                    lby lbyVar = gqxVarM9656b.f26096a.f38013b;
                    EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                    try {
                        EGLImage eGLImage2 = new EGLImage(hardwareBufferMo7250f2);
                        try {
                            lcy lcyVarM15192b = lcy.m15192b(lbyVar, eGLImage);
                            try {
                                ldx ldxVarM15220j = ldx.m15220j(lbyVar, eGLImage2);
                                try {
                                    gqxVarM9656b.f26096a.m15235e(lcyVarM15192b, ldxVarM15220j);
                                    lzd.m16234m(lbyVar);
                                    ldxVarM15220j.close();
                                    lcyVarM15192b.close();
                                    eGLImage2.close();
                                    eGLImage.close();
                                    hardwareBufferMo7250f2.close();
                                    hardwareBufferMo7250f.close();
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        ldxVarM15220j.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    lcyVarM15192b.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                eGLImage2.close();
                                throw th5;
                            } catch (Throwable th6) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            eGLImage.close();
                            throw th7;
                        } catch (Throwable th8) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                            throw th7;
                        }
                    }
                }
                if (kpwVar.mo7245a() != ((kls) kpwVar2).f36491a || kpwVar.mo7245a() != 35) {
                    throw new UnsupportedOperationException("No transformer available to transform image!");
                }
                gqy gqyVarM9657c = m9657c();
                kpwVar.getClass();
                lku.m15669w(kpwVar.mo7245a() == ((kls) kpwVar2).f36491a);
                lku.m15669w(kpwVar.mo7245a() == 35);
                if (kpwVar.mo7247c() == ((kls) kpwVar2).f36492b && kpwVar.mo7246b() == ((kls) kpwVar2).f36493c) {
                    gsv gsvVar = ((gqz) gqyVarM9657c).f26098b;
                    lku.m15669w(kpwVar.mo7245a() == ((kls) kpwVar2).f36491a);
                    lku.m15669w(kpwVar.mo7245a() != 34);
                    lku.m15669w(((kls) kpwVar2).f36491a != 34);
                    kbc kbcVar = new kbc(kpwVar.mo7247c(), kpwVar.mo7246b());
                    kbc kbcVar2 = new kbc(((kls) kpwVar2).f36492b, ((kls) kpwVar2).f36493c);
                    lku.m15670x(kbcVar.equals(kbcVar2), "source image size " + kbcVar.toString() + " is different with destination image size " + kbcVar2.toString());
                    if (kpwVar.mo7245a() != 35) {
                        throw new UnsupportedOperationException(hIAHJKEnGsNbz.jZR + kpwVar.mo7245a());
                    }
                    List listMo7251g = kpwVar.mo7251g();
                    mws mwsVarM14505k = ((kls) kpwVar2).m14505k();
                    if (!YuvUtilNative.copyYUV_420_888Native(kpwVar.mo7247c(), kpwVar.mo7246b(), ((kpv) listMo7251g.get(0)).getBuffer(), ((kpv) listMo7251g.get(1)).getBuffer(), ((kpv) listMo7251g.get(2)).getBuffer(), ((kpv) listMo7251g.get(0)).getRowStride(), ((kpv) listMo7251g.get(1)).getRowStride(), ((kpv) listMo7251g.get(1)).getPixelStride(), ((kpv) mwsVarM14505k.get(0)).getBuffer(), ((kpv) mwsVarM14505k.get(1)).getBuffer(), ((kpv) mwsVarM14505k.get(2)).getBuffer(), ((kpv) mwsVarM14505k.get(0)).getRowStride(), ((kpv) mwsVarM14505k.get(1)).getRowStride(), ((kpv) mwsVarM14505k.get(1)).getPixelStride())) {
                        throw new IllegalStateException("Copy failed.");
                    }
                    nba it = ((kls) kpwVar2).m14505k().iterator();
                    while (it.hasNext()) {
                        ((kpv) it.next()).getBuffer().rewind();
                    }
                } else {
                    YuvWriteView yuvWriteViewM17650c = ((gqz) gqyVarM9657c).f26097a.m17650c(kpwVar);
                    YuvWriteView yuvWriteViewM17650c2 = ((gqz) gqyVarM9657c).f26097a.m17650c(kpwVar2);
                    long j = ntw.m17719e(yuvWriteViewM17650c).f8391a;
                    long jM5150c = YuvWriteView.m5150c(yuvWriteViewM17650c2);
                    lku.m15670x(j != 0, "src is null");
                    lku.m15670x(jM5150c != 0, "dst is null");
                    Resample.resampleLanczosYuvImpl(j, 0.0f, jM5150c);
                }
                if (hardwareBufferMo7250f2 != null) {
                    hardwareBufferMo7250f2.close();
                }
                if (hardwareBufferMo7250f != null) {
                    hardwareBufferMo7250f.close();
                    return;
                }
                return;
            } catch (Throwable th9) {
                if (hardwareBufferMo7250f2 == null) {
                    throw th9;
                }
                try {
                    hardwareBufferMo7250f2.close();
                    throw th9;
                } catch (Throwable th10) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                    throw th9;
                }
            }
        } catch (Throwable th11) {
            if (hardwareBufferMo7250f != null) {
                throw th11;
            }
            try {
                hardwareBufferMo7250f.close();
                throw th11;
            } catch (Throwable th12) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th11, th12);
                throw th11;
            }
        }
        if (hardwareBufferMo7250f != null) {
            throw th11;
        }
        hardwareBufferMo7250f.close();
        throw th11;
    }
}
