package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: renamed from: sl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0988sl extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1016tm f47596a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1014tk f47597b;

    /* JADX INFO: renamed from: c */
    private final opn f47598c;

    /* JADX INFO: renamed from: d */
    private final opn f47599d = ook.m18796j(null);

    public C0988sl(InterfaceC1016tm interfaceC1016tm, InterfaceC1014tk interfaceC1014tk, InterfaceC1014tk interfaceC1014tk2) {
        this.f47596a = interfaceC1016tm;
        this.f47597b = interfaceC1014tk;
        this.f47598c = ook.m18796j(interfaceC1014tk2);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC1015tl m19401a(CameraCaptureSession cameraCaptureSession) {
        InterfaceC1015tl interfaceC1015tl = (InterfaceC1015tl) this.f47599d.f46397a;
        if (interfaceC1015tl != null) {
            return interfaceC1015tl;
        }
        InterfaceC1015tl c0982sf = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? new C0982sf(this.f47596a, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession) : new C0981se(this.f47596a, cameraCaptureSession);
        if (this.f47599d.m18856d(null, c0982sf)) {
            return c0982sf;
        }
        Object obj = this.f47599d.f46397a;
        obj.getClass();
        return (InterfaceC1015tl) obj;
    }

    /* JADX INFO: renamed from: b */
    private final void m19402b() {
        InterfaceC1014tk interfaceC1014tk = (InterfaceC1014tk) this.f47598c.m18853a(null);
        if (interfaceC1014tk != null) {
            interfaceC1014tk.mo19449a();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m19403c() {
        m19402b();
        this.f47597b.mo19449a();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" Active");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" CaptureQueueEmpty");
        C0987sk.m19399a(cameraCaptureSession, null);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) throws Exception {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" Closed");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC1014tk);
        sb2.append("#onClosed");
        Trace.beginSection(interfaceC1014tk.toString().concat("#onClosed"));
        ((C1028ty) interfaceC1014tk).m19453d();
        Trace.endSection();
        m19403c();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) throws Exception {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" Configuration Failed");
        Log.w("CXCP", interfaceC1014tk.toString().concat(" Configuration Failed"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC1014tk);
        sb2.append("#onConfigureFailed");
        Trace.beginSection(interfaceC1014tk.toString().concat("#onConfigureFailed"));
        ((C1028ty) interfaceC1014tk).m19453d();
        Trace.endSection();
        m19403c();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        InterfaceC1015tl interfaceC1015tlM19401a = m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" Configured");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC1014tk);
        sb2.append("#configure");
        Trace.beginSection(interfaceC1014tk.toString().concat("#configure"));
        ((C1028ty) interfaceC1014tk).m19451b(interfaceC1015tlM19401a);
        Trace.endSection();
        m19402b();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        InterfaceC1014tk interfaceC1014tk = this.f47597b;
        m19401a(cameraCaptureSession);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC1014tk);
        sb.append(" Ready");
    }
}
