package p000;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxx extends gxl {

    /* JADX INFO: renamed from: c */
    public static final nbh f26776c = nbh.m17259h("com/google/android/apps/camera/session/PhotosphereCaptureSession");

    /* JADX INFO: renamed from: d */
    public final gyr f26777d;

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f26778e;

    public gxx(gwx gwxVar, gqq gqqVar, gyr gyrVar, String str, cjr cjrVar, gyn gynVar) {
        super(gwxVar.mo9867a(gyw.PHOTOSPHERE, str, cjrVar, gynVar, gqqVar, mqu.f41450a));
        this.f26778e = new ReentrantLock();
        this.f26777d = gyrVar;
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: A */
    public final void mo9869A() {
        m9931H("finish");
        if (!m9933J().m2556E()) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        m9933J().m2559H(2, 3);
        m9929F().execute(new gxw(this, 0));
    }

    /* JADX INFO: renamed from: K */
    public final void m9945K() {
        m9931H("updatePreview");
        if (m9933J().m2556E()) {
            m9929F().execute(new gxw(this, 1));
        } else {
            m9932I("Ignoring updatePreview. CaptureSession is not started.");
        }
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: S */
    public final void mo9887S(kbc kbcVar) {
        super.mo9887S(kbcVar);
        mo9881M();
        this.f26723b.m9876H(mo9902h());
        m9935o().mo6401c(fdh.m8262b(mo9903i(), null, null));
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: r */
    public final nps mo9912r(byte[] bArr, hln hlnVar) {
        bArr.getClass();
        krd krdVar = hlnVar.f28266a;
        ExifInterface exifInterface = (ExifInterface) hlnVar.f28268c.mo16812f();
        m9931H("saveAndFinish");
        if (m9933J().m2554C()) {
            m9932I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return mo9910p();
        }
        m9933J().m2557F(2, 3);
        hlnVar.f28269d = m9934e().m3829b();
        m9933J().m2558G(3);
        if (m9934e().m3829b().mo16813g() && krdVar == krd.JPEG && exifInterface != null) {
            kep kepVar = new kep(exifInterface);
            kepVar.m14068d((Location) m9934e().m3829b().mo16809c());
            exifInterface = kepVar.f35783a;
        }
        if (exifInterface != null) {
            this.f26723b.f26685u.m13108n(exifInterface);
            ((hjz) mo9905k()).f28081g = exifInterface;
        }
        m9929F().execute(new apv(this, bArr, mrm.m16828h(exifInterface), hlnVar, 16));
        return mo9910p();
    }
}
