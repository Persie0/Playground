package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import android.opengl.EGL14;
import android.opengl.GLES30;
import android.os.Trace;
import android.util.SizeF;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqt implements hqs {

    /* JADX INFO: renamed from: c */
    private static final nbh f29193c = nbh.m17259h("com/google/android/apps/camera/timelapse/stabilization/EisControllerImp");

    /* JADX INFO: renamed from: a */
    public final hqz f29194a;

    /* JADX INFO: renamed from: b */
    public AmbientModeSupport.AmbientController f29195b;

    /* JADX INFO: renamed from: d */
    private final Object f29196d = new Object();

    /* JADX INFO: renamed from: e */
    private boolean f29197e = false;

    /* JADX INFO: renamed from: f */
    private final goy f29198f;

    /* JADX INFO: renamed from: g */
    private jay f29199g;

    public hqt(hqz hqzVar, goy goyVar, byte[] bArr) {
        this.f29194a = hqzVar;
        this.f29198f = goyVar;
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m10641f(hqx hqxVar) {
        if (hqxVar.f29215d) {
            kpl kplVar = hqxVar.f29212a;
            int i = hqxVar.f29216e;
            if (i == 2) {
                OisSample[] oisSampleArr = (OisSample[]) kplVar.mo9517d(CaptureResult.STATISTICS_OIS_SAMPLES);
                if (oisSampleArr != null) {
                    for (OisSample oisSample : oisSampleArr) {
                        this.f29199g.m12821l(oisSample.getXshift(), oisSample.getYshift(), oisSample.getTimestamp(), 0);
                    }
                }
                return;
            }
            ((nbe) ((nbe) f29193c.m17252c()).mo17276G(3908)).mo17291p("Api version not support Ois. Api version: %d", i);
        }
    }

    @Override // p000.hqs
    /* JADX INFO: renamed from: a */
    public final synchronized void mo10636a(final long j, final key keyVar, final kpw kpwVar, hqx hqxVar, final boolean z, final mrm mrmVar) {
        synchronized (this.f29196d) {
            if (this.f29197e) {
                return;
            }
            float fHeight = hqxVar.f29213b.height();
            float fWidth = hqxVar.f29213b.width();
            float fMo7246b = kpwVar.mo7246b();
            float fMo7247c = kpwVar.mo7247c();
            m10641f(hqxVar);
            Long l = (Long) hqxVar.f29212a.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
            l.getClass();
            long jLongValue = l.longValue();
            Long l2 = (Long) hqxVar.f29212a.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
            l2.getClass();
            long jLongValue2 = l2.longValue();
            Long l3 = (Long) hqxVar.f29212a.mo9517d(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW);
            l3.getClass();
            long jLongValue3 = l3.longValue();
            long jHeight = (long) (jLongValue3 * ((hqxVar.f29217f.height() * ((fMo7246b / fMo7247c) / (fHeight / fWidth))) / hqxVar.f29213b.height()));
            long j2 = jLongValue + ((jLongValue3 - jHeight) / 2);
            long j3 = jLongValue2 / 2;
            float fWidth2 = hqxVar.f29217f.width();
            float fWidth3 = hqxVar.f29213b.width();
            SizeF sizeF = hqxVar.f29214c;
            Float f = (Float) hqxVar.f29212a.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
            f.getClass();
            float width = sizeF.getWidth() / f.floatValue();
            Rect rect = hqxVar.f29213b;
            if (rect == null) {
                throw new NullPointerException("Null fullImageSize");
            }
            Rect rect2 = hqxVar.f29217f;
            if (rect2 == null) {
                throw new NullPointerException("Null cropRegion");
            }
            SizeF sizeF2 = hqxVar.f29214c;
            if (sizeF2 == null) {
                throw new NullPointerException("Null sensorSize");
            }
            long j4 = j3 + j2;
            final hqw hqwVar = new hqw(j4, jLongValue2, j4, jHeight, (fWidth2 / fWidth3) * width, rect, rect2, sizeF2);
            final hqz hqzVar = this.f29194a;
            if (hqzVar.f29228c.isShutdown()) {
                ((nbe) ((nbe) hqz.f29226a.m17252c()).mo17276G((char) 3912)).mo17290o("Executor service is shut down");
            } else {
                hqzVar.f29228c.execute(new Runnable() { // from class: hqy
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        hqz hqzVar2 = hqzVar;
                        kpw kpwVar2 = kpwVar;
                        hqw hqwVar2 = hqwVar;
                        key keyVar2 = keyVar;
                        boolean z2 = z;
                        long j5 = j;
                        mrm mrmVar2 = mrmVar;
                        drj drjVar = hqzVar2.f29233h;
                        int iMo7247c = kpwVar2.mo7247c();
                        int iMo7246b = kpwVar2.mo7246b();
                        List listMo7251g = kpwVar2.mo7251g();
                        ((kpv) listMo7251g.get(0)).getBuffer().position(0);
                        ((kpv) listMo7251g.get(0)).getBuffer().get(drj.f12392f, 0, iMo7247c * iMo7246b);
                        ((kpv) listMo7251g.get(0)).getBuffer().position(0);
                        System.currentTimeMillis();
                        ((jay) drjVar.f12398d).m12816g(hqwVar2.f29209g.width(), hqwVar2.f29209g.height());
                        ((jay) drjVar.f12398d).m12817h(hqwVar2.f29210h.width(), hqwVar2.f29210h.height());
                        Object obj = drjVar.f12398d;
                        byte[] bArr = drj.f12392f;
                        long j6 = hqwVar2.f29203a;
                        long j7 = hqwVar2.f29205c;
                        long j8 = hqwVar2.f29204b;
                        long j9 = hqwVar2.f29206d;
                        float f2 = hqwVar2.f29208f;
                        ((jay) obj).m12819j(bArr, iMo7247c, iMo7246b, j6, j7, j8, j9, f2, hqwVar2.f29207e, f2, drj.f12393g, drj.f12394h, null, 0, false);
                        Object obj2 = drjVar.f12396b;
                        System.currentTimeMillis();
                        float[] fArr = drj.f12394h;
                        hqzVar2.f29230e.add(keyVar2);
                        hqzVar2.f29229d.add(kpwVar2);
                        if (hqzVar2.f29227b.getAndDecrement() > 0) {
                            ((nbe) ((nbe) hqz.f29226a.m17252c()).mo17276G(3913)).mo17291p("Number of frames to skip: %d", hqzVar2.f29227b.get());
                            return;
                        }
                        key keyVar3 = (key) hqzVar2.f29230e.poll();
                        keyVar3.getClass();
                        kpw kpwVar3 = (kpw) hqzVar2.f29229d.poll();
                        kpwVar3.getClass();
                        if (z2) {
                            drj drjVar2 = hqzVar2.f29233h;
                            ((kpv) kpwVar3.mo7251g().get(0)).getBuffer().position(0);
                            ((kpv) kpwVar3.mo7251g().get(2)).getBuffer().position(0);
                            ((ByteBuffer) drjVar2.f12395a).position(0);
                            System.currentTimeMillis();
                            Object obj3 = drjVar2.f12397c;
                            FrameUtilNative.convertNV21ToYUV24(((kpv) kpwVar3.mo7251g().get(0)).getBuffer(), kpwVar3.mo7247c(), ((kpv) kpwVar3.mo7251g().get(2)).getBuffer(), kpwVar3.mo7247c(), (ByteBuffer) drjVar2.f12395a, kpwVar3.mo7247c() * 3, kpwVar3.mo7247c(), kpwVar3.mo7246b());
                            Object obj4 = drjVar2.f12396b;
                            System.currentTimeMillis();
                            Object obj5 = drjVar2.f12395a;
                            Object obj6 = hqzVar2.f29233h.f12399e;
                            if (fArr == null) {
                                throw new IllegalArgumentException("Transform should have 144 elements but only find 0");
                            }
                            ihk ihkVar = (ihk) obj6;
                            Object obj7 = ihkVar.f30966a;
                            ByteBuffer byteBuffer = (ByteBuffer) obj5;
                            byteBuffer.position(0);
                            hrc hrcVar = ((hrd) obj7).f29263l;
                            hrcVar.f29248a = byteBuffer;
                            hrcVar.f29249b = fArr;
                            hrd hrdVar = (hrd) ihkVar.f30966a;
                            hrdVar.f29263l.getClass();
                            if (!Thread.currentThread().getName().equals(hrdVar.f29255d)) {
                                ((nbe) ((nbe) hrd.f29252a.m17251b()).mo17276G(3914)).mo17301z("warpImage: This thread does not own the OpenGL context: %s =\\= %s", hrdVar.f29255d, Thread.currentThread().getName());
                                throw new RuntimeException("Here is not the same thread as OpenGL context.");
                            }
                            hrdVar.f29263l.onDrawFrame(hrdVar.f29262k);
                            Trace.beginSection("getWarpingResult");
                            hrb hrbVar = hrdVar.f29263l.f29250c;
                            GLES30.glBindBuffer(35051, hrbVar.f29244g[hrbVar.f29245h]);
                            GLES30.glReadPixels(0, 0, hrbVar.f29240c, hrbVar.f29239b, 6408, 5121, 0);
                            GLES30.glBindBuffer(35051, hrbVar.f29244g[hrbVar.m10648a()]);
                            System.currentTimeMillis();
                            ByteBuffer byteBuffer2 = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, hrbVar.f29240c * 4 * hrbVar.f29239b, 1);
                            jpd jpdVar = hrbVar.f29246i;
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            GLES30.glUnmapBuffer(35051);
                            jpd jpdVar2 = hrbVar.f29246i;
                            System.currentTimeMillis();
                            hrbVar.f29245h = hrbVar.m10648a();
                            Trace.endSection();
                            ((kpv) kpwVar3.mo7251g().get(0)).getBuffer().position(0);
                            System.currentTimeMillis();
                            FrameUtilNative.convertAYUVToNV12(byteBuffer2, ((kpv) kpwVar3.mo7251g().get(0)).getBuffer(), ((kpv) kpwVar3.mo7251g().get(2)).getBuffer(), kpwVar3.mo7247c(), kpwVar3.mo7246b());
                            System.currentTimeMillis();
                        }
                        ((hoj) ((hqt) hqzVar2.f29232g.f1702a).f29195b.f1702a).m10540f(j5, keyVar3, kpwVar3, mrmVar2, mrm.m16829i(Boolean.valueOf(z2)));
                    }
                });
            }
        }
    }

    @Override // p000.hqs
    /* JADX INFO: renamed from: b */
    public final synchronized void mo10637b(float f, float f2, float f3, long j) {
        synchronized (this.f29196d) {
            if (this.f29197e) {
                return;
            }
            this.f29199g.m12820k(f, f2, f3, j);
        }
    }

    @Override // p000.hqs
    /* JADX INFO: renamed from: c */
    public final synchronized void mo10638c() {
        synchronized (this.f29196d) {
            this.f29197e = true;
        }
        hqz hqzVar = this.f29194a;
        hqzVar.f29228c.shutdown();
        try {
            hqzVar.f29228c.awaitTermination(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((nbe) ((nbe) hqz.f29226a.m17252c()).mo17276G((char) 3911)).mo17290o("Eis executorService is interrupted while waiting");
        }
        Iterator it = hqzVar.f29229d.iterator();
        while (it.hasNext()) {
            ((kpw) it.next()).close();
        }
        Iterator it2 = hqzVar.f29230e.iterator();
        while (it2.hasNext()) {
            ((key) it2.next()).close();
        }
        drj drjVar = hqzVar.f29233h;
        if (drjVar != null) {
            Object obj = ((ihk) drjVar.f12399e).f30966a;
            hrb hrbVar = ((hrd) obj).f29263l.f29250c;
            int[] iArr = hrbVar.f29243f;
            if (iArr != null) {
                GLES30.glDeleteTextures(1, iArr, 0);
            }
            int[] iArr2 = hrbVar.f29244g;
            if (iArr2 != null) {
                GLES30.glDeleteFramebuffers(2, iArr2, 0);
            }
            if (((hrd) obj).f29256e != EGL10.EGL_NO_DISPLAY && ((hrd) obj).f29260i != null) {
                ((hrd) obj).f29261j.eglMakeCurrent(((hrd) obj).f29256e, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                ((hrd) obj).f29261j.eglDestroySurface(((hrd) obj).f29256e, ((hrd) obj).f29260i);
                ((hrd) obj).f29261j.eglDestroyContext(((hrd) obj).f29256e, ((hrd) obj).f29259h);
                EGL14.eglReleaseThread();
            }
        }
        hqzVar.f29229d.clear();
        hqzVar.f29230e.clear();
        this.f29199g.m12815f();
    }

    @Override // p000.hqs
    /* JADX INFO: renamed from: d */
    public final synchronized boolean mo10639d() {
        return this.f29199g.m12818i();
    }

    @Override // p000.hqs
    /* JADX INFO: renamed from: e */
    public final synchronized void mo10640e(boolean z, int i, int i2, AmbientModeSupport.AmbientController ambientController) {
        synchronized (this.f29196d) {
            if (this.f29197e) {
                return;
            }
            this.f29195b = ambientController;
            jay jayVarM9596i = goy.m9596i(enb.f14742e, i, i2, 1.0f, z, "");
            this.f29199g = jayVarM9596i;
            hqz hqzVar = this.f29194a;
            goy goyVar = this.f29198f;
            hqzVar.f29232g = new AmbientModeSupport.AmbientController(this);
            hqzVar.f29227b.set(jayVarM9596i.m12813d());
            hqzVar.f29228c.execute(new hso(hqzVar, i, i2, goyVar, jayVarM9596i, 1, null, null));
            this.f29199g.m12822m();
        }
    }
}
