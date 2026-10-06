package p000;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmk extends bnq {

    /* JADX INFO: renamed from: a */
    public final boc f3784a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bmt f3786c;

    /* JADX INFO: renamed from: d */
    private final bmt f3787d;

    /* JADX INFO: renamed from: e */
    private final int f3788e;

    /* JADX INFO: renamed from: f */
    private final bmu f3789f;

    /* JADX INFO: renamed from: g */
    private boi f3790g = null;

    /* JADX INFO: renamed from: b */
    public boolean f3785b = true;

    public bmk(bmt bmtVar, bmt bmtVar2, int i, boc bocVar, CameraCharacteristics cameraCharacteristics) {
        this.f3786c = bmtVar;
        this.f3787d = bmtVar2;
        this.f3788e = i;
        this.f3784a = bocVar;
        this.f3789f = new bmu(cameraCharacteristics);
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: a */
    public final int mo2716a() {
        return this.f3788e;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: b */
    public final Camera.Parameters mo2717b() {
        return null;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: c */
    public final Handler mo2718c() {
        return this.f3786c.f3832b;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: d */
    public final bnu mo2719d() {
        return this.f3787d;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: e */
    public final bob mo2720e() {
        return this.f3789f;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: f */
    public final boi mo2721f() {
        if (this.f3790g == null) {
            this.f3790g = this.f3786c.f3832b.m2740b();
        }
        return this.f3790g;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: g */
    public final boj mo2722g() {
        return this.f3786c.f3833c;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: h */
    public final bok mo2723h() {
        return this.f3786c.f3834d;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: i */
    public final void mo2724i(byte[] bArr) {
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: j */
    public final void mo2725j(Handler handler, bnk bnkVar) {
        try {
            this.f3786c.f3834d.m2806a(new bmj(this, bnkVar, handler, 0));
        } catch (RuntimeException e) {
            this.f3787d.f3837g.mo2759c(e);
        }
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: k */
    public final void mo2726k(boolean z) {
        this.f3785b = z;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: l */
    public final void mo2727l(SurfaceTexture surfaceTexture) {
        mo2721f().f3990g = true;
        super.mo2727l(surfaceTexture);
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: m */
    public final void mo2728m(boi boiVar) {
        if (boiVar == null) {
            bop.m2814c(bmt.f3831a, "null parameters in applySettings()");
        } else if (!(boiVar instanceof bmv)) {
            bop.m2812a(bmt.f3831a, "Provided settings not compatible with the backing framework API");
        } else if (m2776s(boiVar, -2)) {
            this.f3790g = boiVar;
        }
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: n */
    public final void mo2729n() {
        mo2721f().f3990g = true;
        super.mo2727l(null);
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: o */
    public final void mo2730o(Handler handler, AmbientMode.AmbientController ambientController) {
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: p */
    public final void mo2731p(Handler handler, AmbientMode.AmbientController ambientController) {
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: q */
    public final void mo2732q(Handler handler, AmbientModeSupport.AmbientController ambientController, bno bnoVar, bno bnoVar2) {
        try {
            this.f3786c.f3834d.m2806a(new bey(this, new bms(this, ambientController, handler, bnoVar2, null, null, null, null), 3));
        } catch (RuntimeException e) {
            this.f3787d.f3837g.mo2759c(e);
        }
    }
}
