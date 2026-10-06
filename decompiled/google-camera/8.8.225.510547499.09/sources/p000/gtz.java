package p000;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface gtz extends AutoCloseable {
    /* JADX INFO: renamed from: a */
    gug mo4258a();

    /* JADX INFO: renamed from: b */
    void mo4259b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, boolean z2, String str, gug gugVar, hjy hjyVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU8);

    /* JADX INFO: renamed from: c */
    void mo4260c(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, boolean z2, String str, gug gugVar, hjy hjyVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU9);

    /* JADX INFO: renamed from: d */
    void mo4261d(Bitmap bitmap, ShotMetadata shotMetadata);

    /* JADX INFO: renamed from: e */
    void mo4262e();

    /* JADX INFO: renamed from: f */
    boolean mo4263f(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata);

    /* JADX INFO: renamed from: g */
    boolean mo4264g();

    /* JADX INFO: renamed from: h */
    InterleavedImageU8 mo4265h(HardwareBuffer hardwareBuffer);
}
