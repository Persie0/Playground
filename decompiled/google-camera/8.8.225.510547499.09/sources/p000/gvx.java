package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.imageproc.Resample;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvx implements gvw {

    /* JADX INFO: renamed from: a */
    public final dhv f26542a;

    /* JADX INFO: renamed from: b */
    public final jww f26543b;

    /* JADX INFO: renamed from: c */
    private final jwn f26544c;

    public gvx(jww jwwVar, jwn jwnVar, dhv dhvVar) {
        this.f26542a = dhvVar;
        this.f26543b = jwwVar;
        this.f26544c = jwnVar;
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: a */
    public final Bitmap mo9805a(Bitmap bitmap, int i, kmq kmqVar) {
        if (mo9812h(kmqVar)) {
            return m9813i(bitmap, i, kmqVar, true);
        }
        return i != 0 ? imq.m11478a(bitmap, i) : bitmap;
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: b */
    public final Bitmap mo9806b(Bitmap bitmap, int i, kmq kmqVar) {
        return m9813i(bitmap, i, kmqVar, true);
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: c */
    public final InterleavedImageU8 mo9807c(InterleavedImageU8 interleavedImageU8, int i, kmq kmqVar) {
        nrn nrnVarM17722h = ntw.m17722h(i);
        boolean z = false;
        boolean z2 = nrnVarM17722h == nrn.f44250b || nrnVarM17722h == nrn.f44252d;
        if (nrnVarM17722h == nrn.f44257i || nrnVarM17722h == nrn.f44255g) {
            z = true;
        }
        if (!mo9812h(kmqVar) || (!z2 && !z)) {
            return interleavedImageU8;
        }
        InterleavedImageU8 interleavedImageU9 = new InterleavedImageU8(interleavedImageU8.m5004c(), interleavedImageU8.m5003b(), interleavedImageU8.m5002a());
        Resample.m5157a(interleavedImageU8.m5005e(), z2 ? nrn.f44251c : nrn.f44253e, interleavedImageU9.m5006f());
        return interleavedImageU9;
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: d */
    public final void mo9808d(kpw kpwVar, kay kayVar) {
        kpwVar.getClass();
        lku.m15669w(kpwVar.mo7245a() == 35);
        System.currentTimeMillis();
        boolean zM11544p = inr.m11544p(kayVar);
        ByteBuffer buffer = ((kpv) kpwVar.mo7251g().get(0)).getBuffer();
        int rowStride = ((kpv) kpwVar.mo7251g().get(0)).getRowStride();
        ByteBuffer buffer2 = ((kpv) kpwVar.mo7251g().get(1)).getBuffer();
        int rowStride2 = ((kpv) kpwVar.mo7251g().get(1)).getRowStride();
        ByteBuffer buffer3 = ((kpv) kpwVar.mo7251g().get(2)).getBuffer();
        int rowStride3 = ((kpv) kpwVar.mo7251g().get(2)).getRowStride();
        FrameUtilNative.mirrorYUV420888(buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, kpwVar.mo7247c(), kpwVar.mo7246b(), zM11544p);
        System.currentTimeMillis();
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: e */
    public final void mo9809e(kpw kpwVar, kpw kpwVar2, kay kayVar) {
        kpwVar.getClass();
        lku.m15669w(kpwVar.mo7245a() == 35);
        System.currentTimeMillis();
        kls klsVar = (kls) kpwVar2;
        FrameUtilNative.mirrorYUV420888(((kpv) kpwVar.mo7251g().get(0)).getBuffer(), ((kpv) kpwVar.mo7251g().get(0)).getRowStride(), ((kpv) kpwVar.mo7251g().get(1)).getBuffer(), ((kpv) kpwVar.mo7251g().get(1)).getRowStride(), ((kpv) kpwVar.mo7251g().get(2)).getBuffer(), ((kpv) kpwVar.mo7251g().get(2)).getRowStride(), ((kpv) klsVar.m14505k().get(0)).getBuffer(), ((kpv) klsVar.m14505k().get(0)).getRowStride(), ((kpv) klsVar.m14505k().get(1)).getBuffer(), ((kpv) klsVar.m14505k().get(1)).getRowStride(), ((kpv) klsVar.m14505k().get(2)).getBuffer(), ((kpv) klsVar.m14505k().get(2)).getRowStride(), kpwVar.mo7247c(), kpwVar.mo7246b(), inr.m11544p(kayVar));
        System.currentTimeMillis();
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: f */
    public final void mo9810f(ExifInterface exifInterface, kmq kmqVar, int i) {
        if (mo9812h(kmqVar)) {
            Bitmap bitmapDecodeByteArray = null;
            if (exifInterface.f7919bB.m14027f()) {
                byte[] bArr = exifInterface.f7919bB.f35719b;
                if (bArr != null) {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            } else {
                exifInterface.f7919bB.m14028g();
            }
            if (bitmapDecodeByteArray == null) {
                return;
            }
            Bitmap bitmapM9813i = m9813i(bitmapDecodeByteArray, i, kmqVar, false);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bitmapM9813i.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream)) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                exifInterface.f7919bB.m14026e();
                exifInterface.f7919bB.f35719b = byteArray;
            }
        }
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean mo9811g(kay kayVar) {
        return inr.m11544p(kayVar);
    }

    @Override // p000.gvw
    /* JADX INFO: renamed from: h */
    public final boolean mo9812h(kmq kmqVar) {
        if (!this.f26542a.mo6184l(dib.f11332bm)) {
            this.f26543b.mo3415bf(false);
        }
        if (!((Boolean) this.f26543b.mo3831be()).booleanValue()) {
            return false;
        }
        if (kmqVar.equals(kmq.f36557a)) {
            return true;
        }
        return kmqVar.equals(kmq.BACK) && ((Boolean) this.f26544c.mo3831be()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m9813i(Bitmap bitmap, int i, kmq kmqVar, boolean z) {
        if (bitmap == null || !mo9812h(kmqVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        System.currentTimeMillis();
        if (i == kay.CLOCKWISE_90.f35503e || i == kay.CLOCKWISE_270.f35503e) {
            matrix.postScale(1.0f, -1.0f);
        } else {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z) {
            matrix.postRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        System.currentTimeMillis();
        return bitmapCreateBitmap;
    }
}
