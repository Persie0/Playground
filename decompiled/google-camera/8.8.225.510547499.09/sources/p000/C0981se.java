package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: se */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0981se implements InterfaceC1015tl {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1016tm f47573a;

    /* JADX INFO: renamed from: b */
    private final CameraCaptureSession f47574b;

    public C0981se(InterfaceC1016tm interfaceC1016tm, CameraCaptureSession cameraCaptureSession) {
        interfaceC1016tm.getClass();
        this.f47573a = interfaceC1016tm;
        this.f47574b = cameraCaptureSession;
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: a */
    public final int mo19388a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws Exception {
        captureRequest.getClass();
        try {
            return this.f47574b.capture(captureRequest, captureCallback, handler);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: b */
    public final int mo19389b(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws Exception {
        list.getClass();
        try {
            return this.f47574b.captureBurst(list, captureCallback, handler);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: c */
    public final int mo19390c(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws Exception {
        list.getClass();
        try {
            return this.f47574b.setRepeatingBurst(list, captureCallback, handler);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f47574b.close();
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: d */
    public final int mo19391d(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws Exception {
        captureRequest.getClass();
        try {
            return this.f47574b.setRepeatingRequest(captureRequest, captureCallback, handler);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }

    @Override // p000.InterfaceC0980sd
    /* JADX INFO: renamed from: e */
    public Object mo13866e(oov oovVar) {
        throw null;
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: f */
    public final InterfaceC1016tm mo19392f() {
        return this.f47573a;
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: g */
    public final void mo19393g() throws Exception {
        try {
            this.f47574b.abortCaptures();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }

    @Override // p000.InterfaceC1015tl
    /* JADX INFO: renamed from: h */
    public final void mo19394h(List list) throws Exception {
        try {
            CameraCaptureSession cameraCaptureSession = this.f47574b;
            ArrayList arrayList = new ArrayList(omn.m18678R(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0991so) it.next()).mo13866e(ooj.m18762a(OutputConfiguration.class)));
            }
            C0995ss.m19423e(cameraCaptureSession, arrayList);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                throw e;
            }
            e.getClass().getSimpleName();
            throw new C1032ub(e);
        }
    }
}
