package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bms extends CameraCaptureSession.CaptureCallback implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Handler f3827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bno f3828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bmk f3829c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AmbientModeSupport.AmbientController f3830d;

    public bms(bmk bmkVar, AmbientModeSupport.AmbientController ambientController, Handler handler, bno bnoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f3829c = bmkVar;
        this.f3830d = ambientController;
        this.f3827a = handler;
        this.f3828b = bnoVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.f3830d != null) {
            this.f3827a.post(new baa(this, 5));
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        try {
            if (this.f3828b != null) {
                ByteBuffer buffer = imageAcquireNextImage.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                this.f3827a.post(new bey(this, bArr, 2));
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (imageAcquireNextImage != null) {
                    try {
                        imageAcquireNextImage.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                        } catch (Exception e) {
                        }
                    }
                }
                throw th2;
            }
        }
    }

    public bms() {
    }
}
