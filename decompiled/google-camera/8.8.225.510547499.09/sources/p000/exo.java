package p000;

import android.opengl.Matrix;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class exo extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ exp f20787a;

    public exo(exp expVar) {
        this.f20787a = expVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (exh.f20734a) {
            if (!exh.f20735b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            LightCycleNative.UndoAddImage();
        }
        this.f20787a.f20840d.m8032a();
        if (this.f20787a.f20793F.m8005c() == 0) {
            this.f20787a.f20840d.m8034d();
            if (this.f20787a.f20794G == 6) {
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                this.f20787a.f20840d.m8033b(fArr);
            }
            exp expVar = this.f20787a;
            exw exwVar = expVar.f20844h;
            exwVar.f20902g = false;
            exwVar.f20903h = false;
            exwVar.f20901f = 0;
            expVar.f20793F.f20749F.f20866b = -1.0d;
            expVar.f20850n = true;
            if (!expVar.f20859w) {
                expVar.f20841e.m4203c(expVar.f20860x);
            }
        }
        exp expVar2 = this.f20787a;
        if (expVar2.f20859w) {
            expVar2.f20841e.m4204d(true, expVar2.f20793F.f20772n);
        }
    }
}
