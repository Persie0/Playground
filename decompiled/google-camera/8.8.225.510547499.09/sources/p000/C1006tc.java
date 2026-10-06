package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1006tc extends CameraCaptureSession.CaptureCallback implements InterfaceC0962rm {

    /* JADX INFO: renamed from: a */
    public final boolean f47648a;

    /* JADX INFO: renamed from: b */
    public final List f47649b;

    /* JADX INFO: renamed from: c */
    public final List f47650c;

    /* JADX INFO: renamed from: d */
    public final List f47651d;

    /* JADX INFO: renamed from: e */
    public volatile Integer f47652e;

    /* JADX INFO: renamed from: f */
    private final Map f47653f;

    /* JADX INFO: renamed from: g */
    private final Map f47654g;

    /* JADX INFO: renamed from: h */
    private final long f47655h = C1008te.f47663b.m18851c();

    /* JADX INFO: renamed from: i */
    private final AmbientMode.AmbientController f47656i;

    public C1006tc(boolean z, List list, List list2, List list3, AmbientMode.AmbientController ambientController, Map map, Map map2, byte[] bArr, byte[] bArr2) {
        this.f47648a = z;
        this.f47649b = list;
        this.f47650c = list2;
        this.f47651d = list3;
        this.f47656i = ambientController;
        this.f47653f = map;
        this.f47654g = map2;
    }

    /* JADX INFO: renamed from: d */
    private final C1013tj m19442d(long j) {
        Object obj = this.f47653f.get(C0974ry.m19383a(j));
        if (obj != null) {
            return (C1013tj) obj;
        }
        throw new IllegalStateException("Unable to find the request for " + ((Object) C0974ry.m19384b(j)) + '!');
    }

    /* JADX INFO: renamed from: e */
    private static final long m19443e(CaptureRequest captureRequest) {
        Object tag = captureRequest.getTag();
        tag.getClass();
        return ((C0974ry) tag).f47571a;
    }

    @Override // p000.InterfaceC0962rm
    /* JADX INFO: renamed from: a */
    public final List mo19380a() {
        return this.f47650c;
    }

    @Override // p000.InterfaceC0962rm
    /* JADX INFO: renamed from: b */
    public final List mo19381b() {
        return this.f47651d;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        long jM19443e = m19443e(captureRequest);
        Object obj = this.f47654g.get(surface);
        if (obj == null) {
            throw new IllegalStateException("Unable to find the streamId for " + surface + " on frame " + ((Object) ("FrameNumber(value=" + j + ')')));
        }
        int i = ((C0979sc) obj).f47572a;
        C1013tj c1013tjM19442d = m19442d(jM19443e);
        int size = this.f47651d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC0972rw) this.f47651d.get(i2)).mo14443e(j, i);
        }
        int size2 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i3)).mo14443e(j, i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        this.f47656i.m1630c(this);
        long jM19443e = m19443e(captureRequest);
        totalCaptureResult.getFrameNumber();
        C1013tj c1013tjM19442d = m19442d(jM19443e);
        C1013tj c1013tj = new C1013tj(totalCaptureResult, 1);
        int size = this.f47651d.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0972rw) this.f47651d.get(i)).mo14449k(c1013tj);
        }
        int size2 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i2)).mo14449k(c1013tj);
        }
        int size3 = this.f47651d.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((InterfaceC0972rw) this.f47651d.get(i3)).mo14444f();
        }
        int size4 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i4)).mo14444f();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        this.f47656i.m1630c(this);
        long jM19443e = m19443e(captureRequest);
        captureFailure.getFrameNumber();
        C1013tj c1013tjM19442d = m19442d(jM19443e);
        int size = this.f47651d.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0972rw) this.f47651d.get(i)).mo14445g();
        }
        int size2 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i2)).mo14445g();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        long jM19443e = m19443e(captureRequest);
        captureResult.getFrameNumber();
        C1013tj c1013tjM19442d = m19442d(jM19443e);
        int size = this.f47651d.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0972rw) this.f47651d.get(i)).mo14448j();
        }
        int size2 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i2)).mo14448j();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        this.f47656i.m1630c(this);
        if (m19444c() != i) {
            throw new IllegalStateException("onCaptureSequenceAborted was invoked on " + m19444c() + ", but expected " + i + '!');
        }
        int size = this.f47650c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1013tj c1013tj = (C1013tj) this.f47650c.get(i2);
            int size2 = this.f47651d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC0972rw) this.f47651d.get(i3)).mo14440b(c1013tj);
            }
        }
        int size3 = this.f47650c.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C1013tj c1013tj2 = (C1013tj) this.f47650c.get(i4);
            int size4 = ((C0973rx) c1013tj2.f47674a).f47568c.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC0972rw) ((C0973rx) c1013tj2.f47674a).f47568c.get(i5)).mo14440b(c1013tj2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        this.f47656i.m1630c(this);
        if (m19444c() != i) {
            throw new IllegalStateException("onCaptureSequenceCompleted was invoked on " + m19444c() + ", but expected " + i + '!');
        }
        int size = this.f47650c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1013tj c1013tj = (C1013tj) this.f47650c.get(i2);
            int size2 = this.f47651d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC0972rw) this.f47651d.get(i3)).mo14446h(c1013tj);
            }
        }
        int size3 = this.f47650c.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C1013tj c1013tj2 = (C1013tj) this.f47650c.get(i4);
            int size4 = ((C0973rx) c1013tj2.f47674a).f47568c.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC0972rw) ((C0973rx) c1013tj2.f47674a).f47568c.get(i5)).mo14446h(c1013tj2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        C1013tj c1013tjM19442d = m19442d(m19443e(captureRequest));
        int size = this.f47651d.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0972rw) this.f47651d.get(i)).mo14447i(j2, j);
        }
        int size2 = ((C0973rx) c1013tjM19442d.f47674a).f47568c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC0972rw) ((C0973rx) c1013tjM19442d.f47674a).f47568c.get(i2)).mo14447i(j2, j);
        }
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.f47655h;
    }

    /* JADX INFO: renamed from: c */
    public final int m19444c() {
        int iIntValue;
        if (this.f47652e != null) {
            Integer num = this.f47652e;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException("SequenceNumber has not been set for " + this + '!');
        }
        synchronized (this) {
            Integer num2 = this.f47652e;
            if (num2 == null) {
                throw new IllegalStateException("SequenceNumber has not been set for " + this + '!');
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }
}
