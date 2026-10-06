package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import com.google.android.camera.experimental2015.ExperimentalSessionExtensions;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kli implements kpi {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession f36474a;

    public kli(CameraCaptureSession cameraCaptureSession) {
        this.f36474a = cameraCaptureSession;
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: a */
    public final int mo14483a(kpk kpkVar, kpg kpgVar, Handler handler) throws kpf {
        try {
            return this.f36474a.capture((CaptureRequest) kua.m14869h(kpkVar), new klh(kpgVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new kpf(e);
        }
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: b */
    public final int mo14484b(List list, kpg kpgVar, Handler handler) throws kpf {
        try {
            return this.f36474a.captureBurst(kua.m14870i(list), new klh(kpgVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new kpf(e);
        }
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: c */
    public final int mo14485c(kpk kpkVar, kpg kpgVar, Handler handler) throws kpf {
        try {
            return this.f36474a.setRepeatingRequest((CaptureRequest) kua.m14869h(kpkVar), new klh(kpgVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new kpf(e);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36474a.close();
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: d */
    public final kpj mo14486d() {
        return new klk(this.f36474a.getDevice());
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: f */
    public final void mo14488f(List list) throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.f36474a;
        List<OutputConfiguration> listM14870i = kua.m14870i(list);
        int[] iArr = ivz.f32455a;
        cameraCaptureSession.finalizeOutputConfigurations(listM14870i);
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: g */
    public final void mo14489g(Surface surface, int i) throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.f36474a;
        if (ivz.m11819a(ivz.f32455a, 0)) {
            ExperimentalSessionExtensions.prepare(cameraCaptureSession, i, surface);
        } else {
            cameraCaptureSession.prepare(surface);
        }
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: e */
    public final void mo14487e() throws kpf {
        try {
            this.f36474a.abortCaptures();
        } catch (IllegalStateException | SecurityException e) {
            throw new kpf(e);
        }
    }

    @Override // p000.kpi
    /* JADX INFO: renamed from: h */
    public final void mo14490h() throws kpf {
        try {
            this.f36474a.stopRepeating();
        } catch (IllegalStateException | SecurityException e) {
            throw new kpf(e);
        }
    }
}
