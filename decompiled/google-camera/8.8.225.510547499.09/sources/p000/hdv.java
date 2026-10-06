package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.hardware.HardwareBuffer;
import com.google.android.material.snackbar.VMX.rgoX;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hdv implements fsy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kpw f27395a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ heq f27396b;

    public hdv(kpw kpwVar, heq heqVar) {
        this.f27395a = kpwVar;
        this.f27396b = heqVar;
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: a */
    public final void mo8699a(RuntimeException runtimeException) {
        ((nbe) ((nbe) ((nbe) hdw.f27397a.m17251b()).mo17283h(runtimeException)).mo17276G((char) 3484)).mo17290o(rgoX.Iohq);
        this.f27395a.close();
        this.f27396b.mo5957a(null);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: b */
    public final void mo8700b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
        if (bitmapWrapHardwareBuffer != null) {
            int iM17721g = ntw.m17721g(shotMetadata.m5099e());
            Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, true);
            Matrix matrix = new Matrix();
            matrix.postRotate(iM17721g);
            bitmapWrapHardwareBuffer = Bitmap.createBitmap(bitmapCopy, 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight(), matrix, true);
        }
        hardwareBuffer.close();
        this.f27395a.close();
        this.f27396b.mo5957a(bitmapWrapHardwareBuffer);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: c */
    public final void mo8701c(YuvImage yuvImage, ShotMetadata shotMetadata) {
        ((nbe) ((nbe) hdw.f27397a.m17251b()).mo17276G((char) 3489)).mo17290o("Got unexpected YUV buffer.");
        this.f27395a.close();
        this.f27396b.mo5957a(null);
        throw new IllegalStateException("Got unexpected YUV buffer.");
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: d */
    public final void mo8702d(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        hardwareBuffer.close();
        this.f27396b.mo5957a(null);
        throw new IllegalStateException("Got unexpected YUV HardwareBuffer.");
    }
}
