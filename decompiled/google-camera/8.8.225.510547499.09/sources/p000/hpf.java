package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.os.SystemClock;
import android.util.SizeF;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpf extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f28765a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hpg f28766b;

    public hpf(hpg hpgVar, key keyVar) {
        this.f28766b = hpgVar;
        this.f28765a = keyVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        long nanos;
        if (this.f28765a.mo7042c() == null) {
            this.f28765a.close();
            return;
        }
        hqx hqxVar = null;
        if (!this.f28766b.f28811d.mo6184l(diy.f11747d) && this.f28766b.f28806am.m6240o()) {
            kpp kppVarMo7042c = this.f28765a.mo7042c();
            kppVarMo7042c.getClass();
            hpg hpgVar = this.f28766b;
            kmd kmdVar = hpgVar.f28776I;
            int iIntValue = ((Integer) hpgVar.f28811d.mo6173a(dib.f11374p).get()).intValue();
            boolean zMo6184l = this.f28766b.f28811d.mo6184l(dib.f11256aP);
            Rect rectMo14555h = kmdVar.mo14555h();
            SizeF sizeF = (SizeF) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            float fFloatValue = ((Float) this.f28766b.f28824q.mo3831be()).floatValue();
            Rect rect = ((gef) this.f28766b.f28783P.mo3831be()).f24363a;
            if (rect == null) {
                throw new NullPointerException("Null cropRegion");
            }
            hqxVar = new hqx(kppVarMo7042c, rectMo14555h, sizeF, zMo6184l, iIntValue, fFloatValue, rect);
        }
        synchronized (this.f28766b.f28820m) {
            if (!((Boolean) this.f28766b.f28812e.f34942d).booleanValue()) {
                ((nbe) ((nbe) hpg.f28767a.m17252c()).mo17276G(3826)).mo17290o("Frame server is not ready for recording");
                this.f28765a.close();
                return;
            }
            if (!this.f28765a.mo7049j().f36067c.contains(this.f28766b.f28789V)) {
                ((nbe) ((nbe) hpg.f28767a.m17252c()).mo17276G(3825)).mo17290o("The source of the frame is incorrect");
                this.f28765a.close();
                return;
            }
            hot hotVar = this.f28766b.f28827t;
            this.f28765a.mo7042c().getClass();
            hotVar.f28660g.mo6175c();
            if (this.f28766b.f28811d.mo6184l(diy.f11747d)) {
                hpg hpgVar2 = this.f28766b;
                hpa hpaVar = hpgVar2.f28828u;
                key keyVar = this.f28765a;
                kgg kggVar = hpgVar2.f28789V;
                kggVar.getClass();
                if (hpaVar.f28733c.get()) {
                    keyVar.close();
                } else {
                    synchronized (hpaVar.f28750t) {
                        if (hpaVar.f28728B == null) {
                            ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G(3818)).mo17290o("onImageAvailable() No ImageWriter available");
                            keyVar.close();
                        } else if (hpaVar.f28729C == null) {
                            ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G(3817)).mo17290o("onImageAvailable() No Camcorder available");
                            keyVar.close();
                        } else {
                            kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
                            if (kpwVarMo7043d == null) {
                                ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G((char) 3816)).mo17290o("onImageAvailable() ImageProxy is null");
                                keyVar.close();
                            } else {
                                hpaVar.f28748r.mo6175c();
                                long j = hpaVar.f28742l.get();
                                synchronized (hpaVar.f28750t) {
                                    hqm hqmVar = hpaVar.f28753w;
                                    hqmVar.getClass();
                                    hqmVar.m10607b(hpaVar.f28727A);
                                    int i = hpaVar.f28756z.f29161g;
                                    double dM17567a = hpaVar.f28735e.m17567a();
                                    double d = i;
                                    Double.isNaN(d);
                                    if ((j % ((long) ((int) (d / dM17567a))) == 0 && !hpaVar.f28733c.get()) || hpaVar.f28732b.get()) {
                                        long j2 = hpaVar.f28743m.get();
                                        int i2 = hpaVar.f28756z.f29162h;
                                        if (hpaVar.f28740j.get() == 0) {
                                            hpaVar.f28740j.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                                            nanos = hpaVar.f28740j.get();
                                        } else {
                                            nanos = (TimeUnit.SECONDS.toNanos(j2) / ((long) i2)) + hpaVar.f28740j.get();
                                        }
                                        hpaVar.f28748r.mo6175c();
                                        try {
                                            klx klxVar = hpaVar.f28728B;
                                            synchronized (klxVar.f36505a) {
                                                Image image = (Image) kua.m14869h(kpwVarMo7043d);
                                                try {
                                                    image.setTimestamp(nanos);
                                                    klxVar.f36506b.queueInputImage(image);
                                                } catch (IllegalStateException e) {
                                                    throw new kec(e);
                                                }
                                            }
                                            kpwVarMo7043d.close();
                                            hpaVar.f28743m.incrementAndGet();
                                            hqmVar.m10608c(hpaVar.f28727A);
                                            AmbientModeSupport.AmbientController ambientController = hpaVar.f28731E;
                                            if (ambientController != null) {
                                                ambientController.m1657g(hpaVar.f28743m.get() / hpaVar.m10563h(), hpaVar.f28756z.f29162h);
                                            }
                                        } catch (kec e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                }
                                hpaVar.f28742l.incrementAndGet();
                                hpaVar.f28738h.incrementAndGet();
                                kpwVarMo7043d.close();
                                keyVar.close();
                            }
                        }
                    }
                }
            } else {
                hpg hpgVar3 = this.f28766b;
                hoj hojVar = hpgVar3.f28817j;
                key keyVar2 = this.f28765a;
                kgg kggVar2 = hpgVar3.f28789V;
                kggVar2.getClass();
                mrm mrmVarM16828h = mrm.m16828h(hqxVar);
                hojVar.f28612v.mo6175c();
                kpw kpwVarMo7043d2 = keyVar2.mo7043d(kggVar2);
                if (kpwVarMo7043d2 == null) {
                    ((nbe) ((nbe) hoj.f28576a.m17252c()).mo17276G((char) 3787)).mo17290o("onImageAvailable() imageProxy is null");
                    keyVar2.close();
                } else {
                    boolean z = hojVar.f28593c.get();
                    if (mrmVarM16828h.mo16813g()) {
                        hqs hqsVar = hojVar.f28579C;
                        hqsVar.getClass();
                        boolean z2 = (((hqt) hqsVar).f29194a.f29227b.get() <= 0) & z;
                        hqsVar.mo10636a(hojVar.f28608r.get(), keyVar2, kpwVarMo7043d2, (hqx) mrmVarM16828h.mo16809c(), hojVar.m10541g(hojVar.f28608r.get(), hojVar.f28584H.f29161g, hojVar.f28596f.m17567a(), false, mqu.f41450a) && z2, mrm.m16829i(Boolean.valueOf(z2)));
                        z = z2;
                    } else {
                        int iMo7247c = kpwVarMo7043d2.mo7247c();
                        int iMo7246b = kpwVarMo7043d2.mo7246b();
                        int rowStride = ((kpv) kpwVarMo7043d2.mo7251g().get(0)).getRowStride();
                        int rowStride2 = ((kpv) kpwVarMo7043d2.mo7251g().get(2)).getRowStride();
                        ((kpv) kpwVarMo7043d2.mo7251g().get(0)).getBuffer().position(0);
                        ((kpv) kpwVarMo7043d2.mo7251g().get(2)).getBuffer().position(0);
                        goy goyVar = hojVar.f28588L;
                        FrameUtilNative.convertNV21ToNV12(((kpv) kpwVarMo7043d2.mo7251g().get(0)).getBuffer(), rowStride, ((kpv) kpwVarMo7043d2.mo7251g().get(2)).getBuffer(), rowStride2, iMo7247c, iMo7246b);
                        long j3 = hojVar.f28608r.get();
                        mqu mquVar = mqu.f41450a;
                        hojVar.m10540f(j3, keyVar2, kpwVarMo7043d2, mquVar, mquVar);
                    }
                    if (z) {
                        if (hojVar.f28595e.get()) {
                            hojVar.f28595e.set(false);
                        } else {
                            hojVar.f28608r.incrementAndGet();
                        }
                    }
                    hojVar.f28606p.incrementAndGet();
                }
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bo */
    public final void mo6748bo(kpp kppVar) {
        if (kppVar == null) {
            return;
        }
        this.f28766b.f28826s.mo3594a(kppVar);
    }
}
