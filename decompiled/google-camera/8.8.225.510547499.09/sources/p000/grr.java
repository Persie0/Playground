package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grr extends grv {

    /* JADX INFO: renamed from: a */
    private static final nbh f26174a = nbh.m17259h("com/google/android/apps/camera/processing/imagebackend/TaskCompressImageToJpeg");

    /* JADX INFO: renamed from: b */
    private final gsa f26175b;

    public grr(grm grmVar, Executor executor, grk grkVar, gyh gyhVar, gsa gsaVar) {
        super(grmVar, executor, grkVar, 4, gyhVar);
        this.f26175b = gsaVar;
    }

    /* JADX INFO: renamed from: a */
    public static final int m9678a(kpw kpwVar, ByteBuffer byteBuffer, Rect rect) {
        return JpegUtilNative.m4696a(kpwVar, byteBuffer, rect, kay.CLOCKWISE_0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBufferWrap;
        ExifInterface exifInterfaceM14063a;
        grt grtVar;
        int iLimit;
        gsb gsbVarMo9697c;
        hjy hjyVarMo9905k;
        gyh gyhVar;
        grk grkVar;
        kpw kpwVar;
        Executor executor;
        grm grmVar = this.f26188f;
        hjy hjyVarMo9905k2 = this.f26189g.mo9905k();
        hjyVarMo9905k2.getClass();
        ((hjz) hjyVarMo9905k2).f28075a = SystemClock.elapsedRealtime();
        switch (grmVar.f26152a.mo7245a()) {
            case 35:
                Rect rectI = m9688i(grmVar.f26152a, grmVar.f26156e);
                try {
                    grmVar.f26152a.mo7247c();
                    grmVar.f26152a.mo7246b();
                    kbc kbcVar = new kbc(rectI.width(), rectI.height());
                    grtVar = new grt(grmVar.f26153b, kbcVar.f35517a, kbcVar.f35518b);
                    m9689j(this.f26187e, grtVar, 3);
                    int i = ((grtVar.f26180b * 3) * grtVar.f26179a) / 2;
                    int i2 = i / 2;
                    gsbVarMo9697c = this.f26175b.mo9697c(Integer.valueOf(i2));
                    ByteBuffer byteBuffer = (ByteBuffer) gsbVarMo9697c.m9698a();
                    if (byteBuffer != null) {
                        int iM9678a = m9678a(grmVar.f26152a, byteBuffer, grmVar.f26156e);
                        if (iM9678a > i2) {
                            gsbVarMo9697c.close();
                            this.f26175b.mo9697c(Integer.valueOf(i));
                            ByteBuffer byteBuffer2 = (ByteBuffer) gsbVarMo9697c.m9698a();
                            if (byteBuffer2 == null) {
                                this.f26189g.mo9870B(ihd.f30944a, new dos("Failed to allocate jpeg buffer for encoding."));
                                gsbVarMo9697c.close();
                                grkVar = this.f26185c;
                                kpwVar = grmVar.f26152a;
                                executor = this.f26186d;
                            } else {
                                iLimit = m9678a(grmVar.f26152a, byteBuffer2, grmVar.f26156e);
                                byteBufferWrap = byteBuffer2;
                            }
                        } else {
                            byteBufferWrap = byteBuffer;
                            iLimit = iM9678a;
                        }
                        if (iLimit < 0) {
                            gsbVarMo9697c.close();
                            throw new RuntimeException("Error compressing jpeg.");
                        }
                        byteBufferWrap.limit(iLimit);
                        this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                        exifInterfaceM14063a = kep.m14064b().f35783a;
                        exifInterfaceM14063a.m4694x(ExifInterface.f7910s, this.f26188f.f26162k, TimeZone.getDefault());
                        break;
                    } else {
                        this.f26189g.mo9870B(ihd.f30944a, new dos("Failed to allocate jpeg buffer for encoding."));
                        gsbVarMo9697c.close();
                        grkVar = this.f26185c;
                        kpwVar = grmVar.f26152a;
                        executor = this.f26186d;
                    }
                    grkVar.mo9662b(kpwVar, executor);
                    return;
                } catch (Throwable th) {
                    this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                    throw th;
                }
            case 256:
                try {
                    ByteBuffer buffer = ((kpv) grmVar.f26152a.mo7251g().get(0)).getBuffer();
                    try {
                        int iLimit2 = buffer.limit();
                        byte[] bArr = new byte[iLimit2];
                        byteBufferWrap = ByteBuffer.wrap(bArr);
                        buffer.rewind();
                        byteBufferWrap.put(buffer);
                        buffer.rewind();
                        byteBufferWrap.rewind();
                        exifInterfaceM14063a = kep.m14063a(bArr);
                        kei keiVarM14034c = kei.m14034c(exifInterfaceM14063a);
                        Integer numMo4681b = exifInterfaceM14063a.mo4681b(ExifInterface.f7848ai);
                        numMo4681b.getClass();
                        int iIntValue = numMo4681b.intValue();
                        Integer numMo4681b2 = exifInterfaceM14063a.mo4681b(ExifInterface.f7849aj);
                        numMo4681b2.getClass();
                        int iIntValue2 = numMo4681b2.intValue();
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer numValueOf2 = Integer.valueOf(iIntValue2);
                        kay kayVarM14032a = kei.m14032a(keiVarM14034c);
                        kay kayVarM13889b = kay.m13889b(grmVar.f26153b.f35503e + kayVarM14032a.f35503e);
                        int iIntValue3 = numValueOf.intValue();
                        int iIntValue4 = numValueOf2.intValue();
                        Rect rect = grmVar.f26156e;
                        Rect rectH = m9687h(iIntValue3, iIntValue4, (kayVarM13889b == kay.CLOCKWISE_0 || kayVarM13889b == kay.CLOCKWISE_180) ? new Rect(rect) : new Rect(rect.top, rect.left, rect.bottom, rect.right));
                        grtVar = new grt(kayVarM14032a, iIntValue3, iIntValue4);
                        kpw kpwVar2 = grmVar.f26152a;
                        if (!rectH.equals(new Rect(0, 0, kpwVar2.mo7247c(), kpwVar2.mo7246b()))) {
                            grtVar = new grt(kayVarM14032a, rectH.width(), rectH.height());
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(BitmapFactory.decodeByteArray(bArr, 0, iLimit2), rectH.left, rectH.top, rectH.width(), rectH.height());
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteArray.length);
                            byteBufferAllocate.put(ByteBuffer.wrap(byteArray));
                            byteBufferAllocate.rewind();
                            byteBufferWrap = byteBufferAllocate;
                        }
                        this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                        m9689j(this.f26187e, grtVar, 3);
                        byteBufferWrap.getClass();
                        iLimit = byteBufferWrap.limit();
                        gsbVarMo9697c = null;
                    } catch (OutOfMemoryError e) {
                        this.f26189g.mo9870B(ihd.f30944a, new dos("Failed to allocate jpeg buffer for encoding."));
                        this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                        return;
                    }
                } catch (Throwable th2) {
                    this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                    throw th2;
                }
                break;
            default:
                this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
                throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
        }
        byte[] bArr2 = new byte[iLimit];
        byteBufferWrap.getClass();
        byteBufferWrap.get(bArr2);
        byteBufferWrap.rewind();
        if (gsbVarMo9697c != null) {
            gsbVarMo9697c.close();
        }
        ((grc) this.f26185c).f26118k.mo8958c(new gru(this.f26187e, grtVar, 3), new gsv());
        mrm mrmVarM16828h = mrm.m16828h(exifInterfaceM14063a);
        nps npsVar = grmVar.f26154c;
        kep kepVar = mrmVarM16828h.mo16813g() ? new kep((ExifInterface) mrmVarM16828h.mo16809c()) : kep.m14064b();
        kepVar.m14070f(grtVar.f26180b, grtVar.f26179a, (kay) grtVar.f26181c, mrm.m16828h((kpl) jvh.m13560h(npsVar)));
        ExifInterface exifInterface = kepVar.f35783a;
        hjy hjyVarMo9905k3 = this.f26189g.mo9905k();
        hjyVarMo9905k3.getClass();
        ((hjz) hjyVarMo9905k3).f28081g = exifInterface;
        gyh gyhVar2 = this.f26189g;
        new kbc(grtVar.f26180b, grtVar.f26179a);
        hln hlnVar = new hln(krd.JPEG);
        hlnVar.m10447a(exifInterface);
        hlnVar.m10448b((kay) grtVar.f26181c);
        jvh.m13561i(gyhVar2.mo9912r(bArr2, hlnVar), new cdc(this, grtVar, 7));
        nps npsVar2 = grmVar.f26154c;
        try {
            if (!npsVar2.isDone()) {
                ((nbe) ((nbe) f26174a.m17252c()).mo17276G((char) 3217)).mo17290o("CaptureResults unavailable to photoCaptureDoneEvent event.");
                hjy hjyVarMo9905k4 = this.f26189g.mo9905k();
                hjyVarMo9905k4.getClass();
                hjyVarMo9905k4.mo10403e(SystemClock.elapsedRealtime());
                return;
            }
            hjy hjyVarMo9905k5 = this.f26189g.mo9905k();
            hjyVarMo9905k5.getClass();
            hjyVarMo9905k5.mo10401c((kpl) npsVar2.get(), false);
            gyhVar = this.f26189g;
            hjyVarMo9905k = gyhVar.mo9905k();
        } catch (InterruptedException e2) {
            ((nbe) ((nbe) f26174a.m17251b()).mo17276G(3218)).mo17290o("CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
            gyhVar = this.f26189g;
        } catch (ExecutionException e3) {
            ((nbe) ((nbe) f26174a.m17252c()).mo17276G(3219)).mo17290o("CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
            gyhVar = this.f26189g;
        } finally {
            hjyVarMo9905k = this.f26189g.mo9905k();
            hjyVarMo9905k.getClass();
            hjyVarMo9905k.mo10403e(SystemClock.elapsedRealtime());
        }
    }
}
