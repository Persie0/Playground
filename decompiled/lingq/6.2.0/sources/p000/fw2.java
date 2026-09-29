package p000;

import android.media.MediaFormat;
import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class fw2 implements wpa, im0, yb7 {

    /* JADX INFO: renamed from: a */
    public wpa f39775a;

    /* JADX INFO: renamed from: b */
    public im0 f39776b;

    /* JADX INFO: renamed from: c */
    public wpa f39777c;

    /* JADX INFO: renamed from: d */
    public im0 f39778d;

    @Override // p000.im0
    /* JADX INFO: renamed from: a */
    public final void mo12217a() {
        im0 im0Var = this.f39778d;
        if (im0Var != null) {
            im0Var.mo12217a();
        }
        im0 im0Var2 = this.f39776b;
        if (im0Var2 != null) {
            im0Var2.mo12217a();
        }
    }

    @Override // p000.im0
    /* JADX INFO: renamed from: b */
    public final void mo12218b(float[] fArr, long j) {
        im0 im0Var = this.f39778d;
        if (im0Var != null) {
            im0Var.mo12218b(fArr, j);
        }
        im0 im0Var2 = this.f39776b;
        if (im0Var2 != null) {
            im0Var2.mo12218b(fArr, j);
        }
    }

    @Override // p000.wpa
    /* JADX INFO: renamed from: c */
    public final void mo12219c(long j, long j2, C0713b c0713b, MediaFormat mediaFormat) {
        wpa wpaVar = this.f39777c;
        if (wpaVar != null) {
            wpaVar.mo12219c(j, j2, c0713b, mediaFormat);
        }
        wpa wpaVar2 = this.f39775a;
        if (wpaVar2 != null) {
            wpaVar2.mo12219c(j, j2, c0713b, mediaFormat);
        }
    }

    @Override // p000.yb7
    /* JADX INFO: renamed from: d */
    public final void mo4256d(int i, Object obj) {
        if (i == 7) {
            this.f39775a = (wpa) obj;
            return;
        }
        if (i == 8) {
            this.f39776b = (im0) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        gf9 gf9Var = (gf9) obj;
        if (gf9Var == null) {
            this.f39777c = null;
            this.f39778d = null;
        } else {
            this.f39777c = gf9Var.getVideoFrameMetadataListener();
            this.f39778d = gf9Var.getCameraMotionListener();
        }
    }
}
