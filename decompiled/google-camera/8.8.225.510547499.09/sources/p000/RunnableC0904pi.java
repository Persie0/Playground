package p000;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.text.Layout;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.LinkImage;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.googlex.gcam.StaticMetadata;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: pi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0904pi implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f47412a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f47413b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f47414c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f47415d;

    public RunnableC0904pi(TextView textView, Typeface typeface, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = textView;
        this.f47414c = typeface;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(AmbientMode.AmbientController ambientController, int i, Object obj, int i2, byte[] bArr) {
        this.f47415d = i2;
        this.f47414c = ambientController;
        this.f47412a = i;
        this.f47413b = obj;
    }

    public RunnableC0904pi(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f47415d = i2;
        this.f47413b = systemForegroundService;
        this.f47412a = i;
        this.f47414c = notification;
    }

    public /* synthetic */ RunnableC0904pi(aox aoxVar, int i, Object obj, int i2) {
        this.f47415d = i2;
        this.f47414c = aoxVar;
        this.f47412a = i;
        this.f47413b = obj;
    }

    public RunnableC0904pi(bnn bnnVar, int i, String str, int i2) {
        this.f47415d = i2;
        this.f47414c = bnnVar;
        this.f47412a = i;
        this.f47413b = str;
    }

    public RunnableC0904pi(bnq bnqVar, int i, boi boiVar, int i2) {
        this.f47415d = i2;
        this.f47414c = bnqVar;
        this.f47412a = i;
        this.f47413b = boiVar;
    }

    public /* synthetic */ RunnableC0904pi(LicenseActivity licenseActivity, int i, ScrollView scrollView, int i2) {
        this.f47415d = i2;
        this.f47413b = licenseActivity;
        this.f47412a = i;
        this.f47414c = scrollView;
    }

    public /* synthetic */ RunnableC0904pi(epz epzVar, StaticMetadata staticMetadata, int i, int i2) {
        this.f47415d = i2;
        this.f47414c = epzVar;
        this.f47413b = staticMetadata;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(eqc eqcVar, int i, Runnable runnable, int i2) {
        this.f47415d = i2;
        this.f47414c = eqcVar;
        this.f47412a = i;
        this.f47413b = runnable;
    }

    public /* synthetic */ RunnableC0904pi(esl eslVar, Bitmap bitmap, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = eslVar;
        this.f47414c = bitmap;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(ezi eziVar, kpw kpwVar, int i, int i2) {
        this.f47415d = i2;
        this.f47414c = eziVar;
        this.f47413b = kpwVar;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(gxk gxkVar, Bitmap bitmap, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = gxkVar;
        this.f47414c = bitmap;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(ihk ihkVar, int i, jar jarVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f47415d = i2;
        this.f47413b = ihkVar;
        this.f47412a = i;
        this.f47414c = jarVar;
    }

    public /* synthetic */ RunnableC0904pi(irg irgVar, Bitmap bitmap, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = irgVar;
        this.f47414c = bitmap;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(jzb jzbVar, int i, MediaCodec.BufferInfo bufferInfo, int i2) {
        this.f47415d = i2;
        this.f47413b = jzbVar;
        this.f47412a = i;
        this.f47414c = bufferInfo;
    }

    public /* synthetic */ RunnableC0904pi(jzb jzbVar, MediaCodec mediaCodec, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = jzbVar;
        this.f47414c = mediaCodec;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(jzd jzdVar, MediaCodec mediaCodec, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = jzdVar;
        this.f47414c = mediaCodec;
        this.f47412a = i;
    }

    public /* synthetic */ RunnableC0904pi(kxz kxzVar, MediaFormat mediaFormat, int i, int i2) {
        this.f47415d = i2;
        this.f47413b = kxzVar;
        this.f47414c = mediaFormat;
        this.f47412a = i;
    }

    public RunnableC0904pi(C0923qa c0923qa, int i, IntentSender.SendIntentException sendIntentException, int i2) {
        this.f47415d = i2;
        this.f47413b = c0923qa;
        this.f47412a = i;
        this.f47414c = sendIntentException;
    }

    public RunnableC0904pi(C0923qa c0923qa, int i, bkn bknVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f47415d = i2;
        this.f47414c = c0923qa;
        this.f47412a = i;
        this.f47413b = bknVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, pw] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r4;
        kbz kbzVar;
        int i;
        long j;
        switch (this.f47415d) {
            case 0:
                Object obj = this.f47414c;
                int i2 = this.f47412a;
                Object obj2 = ((bkn) this.f47413b).f3651a;
                C0923qa c0923qa = (C0923qa) obj;
                String str = (String) c0923qa.f47463b.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                aie aieVar = (aie) c0923qa.f47467f.get(str);
                if (aieVar == null || (r4 = aieVar.f426a) == 0) {
                    c0923qa.f47469h.remove(str);
                    c0923qa.f47468g.put(str, obj2);
                    return;
                } else {
                    if (c0923qa.f47466e.remove(str)) {
                        r4.mo3666a(obj2);
                        return;
                    }
                    return;
                }
            case 1:
                ((TextView) this.f47413b).setTypeface((Typeface) this.f47414c, this.f47412a);
                return;
            case 2:
                ((C0923qa) this.f47413b).m19336e(this.f47412a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.f47414c));
                return;
            case 3:
                ((aox) this.f47414c).f1950j.m1628a(this.f47412a, this.f47413b);
                return;
            case 4:
                ((AmbientMode.AmbientController) this.f47414c).m1628a(this.f47412a, this.f47413b);
                return;
            case 5:
                ((SystemForegroundService) this.f47413b).f1820c.notify(this.f47412a, (Notification) this.f47414c);
                return;
            case 6:
                ((bnn) this.f47414c).f3888b.mo2771c(this.f47412a, (String) this.f47413b);
                return;
            case 7:
                ((bnn) this.f47414c).f3888b.mo2772d(this.f47412a, (String) this.f47413b);
                return;
            case 8:
                boj bojVarMo2722g = ((bnq) this.f47414c).mo2722g();
                if (bojVarMo2722g.m2803d()) {
                    return;
                }
                bojVarMo2722g.m2804e(this.f47412a);
                ((bnq) this.f47414c).mo2718c().obtainMessage(204, this.f47413b).sendToTarget();
                return;
            case 9:
                Object obj3 = this.f47414c;
                Object obj4 = this.f47413b;
                int i3 = this.f47412a;
                epz epzVar = (epz) obj3;
                try {
                    if (!((Boolean) epzVar.f15071d.f34942d).booleanValue()) {
                        ((nbe) ((nbe) epz.f15068a.m17251b()).mo17276G((char) 1771)).mo17290o("Processor not available to set options!");
                        return;
                    }
                    try {
                        ((epz) obj3).f15071d.mo3415bf(false);
                        ((epz) obj3).f15072e.mo13961e("MotionBlur#setOptions");
                        if (!((epz) obj3).f15069b.m7667i((StaticMetadata) obj4, i3, ((epz) obj3).f15074g, ((epz) obj3).f15075h, ((epz) obj3).f15073f.m7695a())) {
                            throw new IllegalStateException("Processor not initialized!");
                        }
                        ((StaticMetadata) obj4).m5121d();
                        kbzVar = epzVar.f15072e;
                        kbzVar.mo13962f();
                        epzVar.f15071d.mo3415bf(true);
                        return;
                    } catch (IllegalStateException e) {
                        ((nbe) ((nbe) ((nbe) epz.f15068a.m17251b()).mo17283h(e)).mo17276G(1770)).mo17290o("Error setting options.");
                        kbzVar = epzVar.f15072e;
                    }
                } catch (Throwable th) {
                    epzVar.f15072e.mo13962f();
                    epzVar.f15071d.mo3415bf(true);
                    throw th;
                }
                break;
            case 10:
                Object obj5 = this.f47414c;
                int i4 = this.f47412a;
                ?? r3 = this.f47413b;
                eqc eqcVar = (eqc) obj5;
                eqcVar.f15103e.mo13961e("MotionBlurQueue#firstTask-" + i4);
                eqcVar.f15100b.set(i4);
                r3.run();
                eqcVar.f15103e.mo13962f();
                return;
            case 11:
                ((iqi) ((esl) this.f47413b).f15336R.get()).mo11608i((Bitmap) this.f47414c, this.f47412a);
                return;
            case 12:
                Object obj6 = this.f47414c;
                ?? r2 = this.f47413b;
                int i5 = this.f47412a;
                ezi eziVar = (ezi) obj6;
                if (!eziVar.f21061q || !eziVar.f21062r) {
                    r2.close();
                    return;
                }
                C1058va c1058va = eziVar.f21043C;
                LinkImage linkImageCreate = LinkImage.create(new eyu(r2), i5);
                switch (linkImageCreate.getType()) {
                    case 1:
                        c1058va.f47803b.onNewBitmap((Bitmap) linkImageCreate.getBitmap().mo16809c(), linkImageCreate.getRotation());
                        break;
                    case 2:
                        c1058va.f47803b.onNewImage((Image) linkImageCreate.getImage().mo16809c(), linkImageCreate.getRotation());
                        break;
                    case 3:
                        c1058va.f47803b.onNewImage((ImageProxy) linkImageCreate.getImageProxy().mo16809c(), linkImageCreate.getRotation());
                        break;
                    default:
                        throw new IllegalStateException(String.format(Locale.US, "Unable to process LinkImage type: %d", Integer.valueOf(linkImageCreate.getType())));
                }
                if (i5 % 180 == 0) {
                    eziVar.f21063s = r2.mo7247c();
                    eziVar.f21064t = r2.mo7246b();
                    return;
                } else {
                    eziVar.f21063s = r2.mo7246b();
                    eziVar.f21064t = r2.mo7247c();
                    return;
                }
            case 13:
                Object obj7 = this.f47413b;
                Object obj8 = this.f47414c;
                int i6 = this.f47412a;
                jvd.m13538a();
                esl eslVar = (esl) obj7;
                htf htfVar = (htf) eslVar.f15408l.get();
                String strMo3773c = eslVar.f15412p.mo3773c();
                if (strMo3773c == null) {
                    hnp hnpVar = hnp.OFF;
                    ikw ikwVar = ikw.UNINITIALIZED;
                    switch (eslVar.m7783x().ordinal()) {
                        case 1:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 10:
                            strMo3773c = eslVar.f15405i.getString(C0100R.string.photo_accessibility_peek);
                            break;
                        case 2:
                        case 5:
                        case 8:
                        case 13:
                        case 19:
                            strMo3773c = eslVar.f15405i.getString(C0100R.string.video_accessibility_peek);
                            break;
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        default:
                            strMo3773c = eslVar.f15405i.getString(C0100R.string.media_accessibility_peek);
                            break;
                    }
                }
                htfVar.mo10741i(strMo3773c);
                eslVar.f15407k.mo13961e("updateCaptureIndicatorThumbnail");
                Bitmap bitmap = (Bitmap) obj8;
                ((htf) eslVar.f15408l.get()).mo10743k(bitmap, i6);
                eslVar.f15407k.mo13962f();
                eslVar.f15412p.mo3784s(new RunnableC0904pi(eslVar, bitmap, i6, 11));
                return;
            case 14:
                Object obj9 = this.f47413b;
                Object obj10 = this.f47414c;
                int i7 = this.f47412a;
                Bitmap bitmap2 = (Bitmap) obj10;
                irg irgVar = (irg) obj9;
                float fMax = Math.max(Math.max(bitmap2.getWidth() / irgVar.f31881e, bitmap2.getHeight() / irgVar.f31882f) / 2.0f, 1.0f);
                Object objCreateBitmap = obj10;
                if (i7 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i7);
                    objCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
                }
                kbz kbzVar2 = irgVar.f31888l;
                Object obj11 = objCreateBitmap;
                if (fMax > 1.0f) {
                    kbzVar2.mo13961e("resizeBitmap");
                    Bitmap bitmap3 = (Bitmap) objCreateBitmap;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap3, (int) (bitmap3.getWidth() / fMax), (int) (bitmap3.getHeight() / fMax), false);
                    kbzVar2.mo13962f();
                    bitmapCreateScaledBitmap.getWidth();
                    bitmapCreateScaledBitmap.getHeight();
                    obj11 = bitmapCreateScaledBitmap;
                }
                irgVar.m11642o((Bitmap) obj11, false);
                return;
            case 15:
                Object obj12 = this.f47413b;
                int i8 = this.f47412a;
                Object obj13 = this.f47414c;
                if (((jax) ((ihk) obj12).f30967b).mo4633a(i8)) {
                    ((izr) obj13).m11936q("Local AnalyticsService processed last dispatch request");
                    return;
                }
                return;
            case 16:
                Object obj14 = this.f47413b;
                Object obj15 = this.f47414c;
                int i9 = this.f47412a;
                MediaCodec mediaCodec = (MediaCodec) obj15;
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i9);
                if (inputBuffer == null || inputBuffer.limit() < 0) {
                    mediaCodec.queueInputBuffer(i9, 0, 0, ((jzd) obj14).f35257s, 0);
                    return;
                }
                jzd jzdVar = (jzd) obj14;
                khb khbVarMo5430e = jzdVar.f35247i.mo5430e(inputBuffer, inputBuffer.limit());
                if (khbVarMo5430e == null) {
                    mediaCodec.queueInputBuffer(i9, 0, 0, jzdVar.f35257s, jzdVar.f35247i.mo5426a() == 3 ? 0 : 4);
                    return;
                }
                long jM13782d = jzdVar.m13782d(TimeUnit.MICROSECONDS.convert(khbVarMo5430e.m14237b(), TimeUnit.NANOSECONDS));
                int iM14236a = khbVarMo5430e.m14236a();
                long j2 = jzdVar.f35257s;
                if (jM13782d > j2) {
                    if (j2 != -1 && jM13782d - j2 > 25000) {
                        synchronized (jzdVar.f35245g) {
                            int i10 = ((jzd) obj14).f35228L;
                            if (i10 != -1) {
                                long j3 = ((jzd) obj14).f35257s + 25000;
                                ((jzd) obj14).f35257s = j3;
                                ((MediaCodec) obj15).queueInputBuffer(i10, 0, iM14236a, j3, 0);
                                ((jzd) obj14).f35228L = -1;
                            }
                        }
                    } else {
                        mediaCodec = mediaCodec;
                    }
                    i = iM14236a;
                    j = jM13782d;
                    break;
                } else {
                    mediaCodec = mediaCodec;
                    j = j2;
                    i = 0;
                }
                mediaCodec.queueInputBuffer(i9, 0, i, j, 0);
                jzdVar.f35257s = j;
                jzdVar.f35227K = SystemClock.elapsedRealtime();
                return;
            case 17:
                ((jzb) this.f47413b).f35214a.m13783e((MediaCodec) this.f47414c, this.f47412a);
                return;
            case 18:
                Object obj16 = this.f47413b;
                int i11 = this.f47412a;
                Object obj17 = this.f47414c;
                jzd jzdVar2 = ((jzb) obj16).f35214a;
                if (i11 < 0) {
                    Log.w("AudioEncoder", "unexpected outputIndex: " + i11);
                    return;
                }
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj17;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    Deque deque = jzdVar2.f35256r;
                    long j4 = bufferInfo.presentationTimeUs;
                    synchronized (jzdVar2.f35246h) {
                        while (true) {
                            if (!deque.isEmpty()) {
                                mzj mzjVar = (mzj) deque.peek();
                                mzjVar.getClass();
                                if (!mzjVar.mo8324a(Long.valueOf(j4))) {
                                    if (!mzjVar.m17183l() || ((Long) mzjVar.m17180i()).longValue() <= j4) {
                                        mzjVar.toString();
                                        deque.poll();
                                    }
                                }
                            }
                            ByteBuffer outputBuffer = jzdVar2.f35248j.getOutputBuffer(i11);
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            bufferInfo.presentationTimeUs -= jzdVar2.f35259u;
                            if (jzdVar2.f35261w.get() == 0) {
                                long j5 = bufferInfo.presentationTimeUs;
                            }
                            jzdVar2.f35261w.set(bufferInfo.presentationTimeUs);
                            AtomicLong atomicLong = jzdVar2.f35262x;
                            double d = bufferInfo.presentationTimeUs;
                            double d2 = jzdVar2.f35251m;
                            Double.isNaN(d);
                            atomicLong.set((long) (d / d2));
                            if (!jzdVar2.f35252n.m13795d(jyv.AUDIO)) {
                                jzdVar2.f35252n.m13793b(jyv.AUDIO, jzdVar2.f35262x);
                            }
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo.size);
                            byteBufferAllocate.put(outputBuffer);
                            jzdVar2.f35254p.offer(new jzc(bufferInfo, byteBufferAllocate));
                            if (jzdVar2.f35254p.size() > 1000) {
                                Log.w("AudioEncoder", "Too many audio buffers in queue to be written. Video frame is very delayed.");
                                jzdVar2.f35252n.m13792a(jzf.VIDEO_BUFFER_DELAY);
                            }
                        }
                    }
                }
                jzdVar2.f35248j.releaseOutputBuffer(i11, false);
                if (jzdVar2.f35264z) {
                    if ((bufferInfo.presentationTimeUs < jzdVar2.f35258t || (bufferInfo.flags & 2) != 0) && (4 & bufferInfo.flags) == 0 && !((jzdVar2.f35263y && jzdVar2.f35217A) || jzdVar2.f35218B || jzdVar2.f35219C)) {
                        return;
                    }
                    jzdVar2.f35231O.mo14894e(null);
                    return;
                }
                return;
            case 19:
                Object obj18 = this.f47413b;
                Object obj19 = this.f47414c;
                int i12 = this.f47412a;
                kxz kxzVar = (kxz) obj18;
                int iMo14517a = kxzVar.f37691b.mo14517a((MediaFormat) obj19);
                synchronized (kxzVar.f37694e) {
                    ((kxz) obj18).f37695f.put(Integer.valueOf(i12), Integer.valueOf(iMo14517a));
                    break;
                }
                return;
            default:
                Object obj20 = this.f47413b;
                int i13 = this.f47412a;
                Object obj21 = this.f47414c;
                Layout layout = ((TextView) ((ActivityC0157ei) obj20).findViewById(C0100R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) obj21).scrollTo(0, layout.getLineTop(layout.getLineForOffset(i13)));
                    return;
                }
                return;
        }
    }
}
