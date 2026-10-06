package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.List;

/* JADX INFO: renamed from: sg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0983sg implements InterfaceC1016tm {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0953rd f47576a;

    /* JADX INFO: renamed from: b */
    public final CameraDevice f47577b;

    /* JADX INFO: renamed from: c */
    public final String f47578c;

    /* JADX INFO: renamed from: d */
    public final opn f47579d = ook.m18796j(null);

    public C0983sg(InterfaceC0953rd interfaceC0953rd, CameraDevice cameraDevice, String str) {
        this.f47576a = interfaceC0953rd;
        this.f47577b = cameraDevice;
        this.f47578c = str;
    }

    @Override // p000.InterfaceC1016tm
    /* JADX INFO: renamed from: a */
    public final void mo19395a(List list, InterfaceC1014tk interfaceC1014tk, Handler handler) throws Exception {
        try {
            InterfaceC1014tk interfaceC1014tk2 = (InterfaceC1014tk) this.f47579d.f46397a;
            if (!this.f47579d.m18856d(interfaceC1014tk2, interfaceC1014tk)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f47577b.createCaptureSession(list, new C0988sl(this, interfaceC1014tk, interfaceC1014tk2), handler);
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
    public final Object mo13866e(oov oovVar) {
        if (ooc.m18737c(oovVar, ooj.m18762a(CameraDevice.class))) {
            return this.f47577b;
        }
        return null;
    }
}
