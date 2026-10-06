package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsm implements dsk {

    /* JADX INFO: renamed from: a */
    private final HardwareBuffer f12501a;

    /* JADX INFO: renamed from: b */
    private final ColorSpace f12502b;

    public dsm(Bitmap bitmap, HardwareBuffer hardwareBuffer) {
        this.f12501a = hardwareBuffer;
        this.f12502b = bitmap.getColorSpace();
    }

    @Override // p000.dsk
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6660a() {
        Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(this.f12501a, this.f12502b);
        bitmapWrapHardwareBuffer.getClass();
        this.f12501a.close();
        return bitmapWrapHardwareBuffer;
    }

    @Override // p000.dsk
    /* JADX INFO: renamed from: b */
    public final boolean mo6661b() {
        return true;
    }

    @Override // p000.dsk
    /* JADX INFO: renamed from: c */
    public final void mo6662c() {
    }
}
