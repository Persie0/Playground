package p000;

import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knp implements kpv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f36633a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f36634b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ HardwarePixels f36635c;

    public knp(HardwarePixels hardwarePixels, int i, int i2) {
        this.f36635c = hardwarePixels;
        this.f36633a = i;
        this.f36634b = i2;
    }

    @Override // p000.kpv
    public final ByteBuffer getBuffer() {
        lku.m15614I(!this.f36635c.f7927c.get(), "Accessing data after close!");
        HardwarePixels hardwarePixels = this.f36635c;
        long j = hardwarePixels.f7926b;
        int i = this.f36633a;
        int i2 = this.f36634b;
        int format = hardwarePixels.f7925a.getFormat();
        boolean z = i == 0 || format == 35 || format == 54;
        lku.m15670x(z, " Expect planes 1 and 2 to only appear in YCBCR_420_888 or YCBCR_P010 formats");
        return HardwarePixels.nativeGetData(j, i, i2, i != 0 ? 2 : 1);
    }

    @Override // p000.kpv
    public final int getPixelStride() {
        return HardwarePixels.nativePixelStride(this.f36635c.f7926b, this.f36633a);
    }

    @Override // p000.kpv
    public final int getRowStride() {
        return HardwarePixels.nativeRowStride(this.f36635c.f7926b, this.f36633a);
    }
}
