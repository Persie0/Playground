package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klk implements kpj {

    /* JADX INFO: renamed from: a */
    private final CameraDevice f36476a;

    public klk(CameraDevice cameraDevice) {
        this.f36476a = cameraDevice;
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: a */
    public final int mo14491a() throws kec {
        try {
            return this.f36476a.getCameraAudioRestriction();
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: b */
    public final String mo14492b() {
        return this.f36476a.getId();
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: c */
    public final void mo14493c(kps kpsVar) throws kec {
        try {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(kpsVar.f36810a, mkv.m16504L(kpsVar.f36811b, hnk.f28498k), kpsVar.f36812c, new klq(kpsVar.f36813d));
            kpk kpkVar = kpsVar.f36814e;
            if (kpkVar != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest) kua.m14869h(kpkVar));
            }
            this.f36476a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj, p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36476a.close();
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: d */
    public final void mo14494d(List list, kph kphVar, Handler handler) throws kec {
        try {
            this.f36476a.createCaptureSession(list, new klq(kphVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: e */
    public final void mo14495e(List list, kph kphVar, Handler handler) throws kec {
        try {
            this.f36476a.createCaptureSessionByOutputConfigurations(kua.m14870i(list), new klq(kphVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: f */
    public final void mo14496f(List list, kph kphVar, Handler handler) throws kec {
        try {
            this.f36476a.createConstrainedHighSpeedCaptureSession(list, new klq(kphVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: h */
    public final kln mo14498h(int i) throws kec {
        try {
            return new kln(this.f36476a.createCaptureRequest(i));
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }

    @Override // p000.kpj
    /* JADX INFO: renamed from: g */
    public final void mo14497g(int i) throws kec {
        try {
            this.f36476a.setCameraAudioRestriction(i);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new kec(e);
        }
    }
}
