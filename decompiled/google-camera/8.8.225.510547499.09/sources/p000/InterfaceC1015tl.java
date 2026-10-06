package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1015tl extends AutoCloseable, InterfaceC0980sd {
    /* JADX INFO: renamed from: a */
    int mo19388a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: renamed from: b */
    int mo19389b(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: renamed from: c */
    int mo19390c(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: renamed from: d */
    int mo19391d(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: renamed from: f */
    InterfaceC1016tm mo19392f();

    /* JADX INFO: renamed from: g */
    void mo19393g();

    /* JADX INFO: renamed from: h */
    void mo19394h(List list);
}
