package p000;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxp implements fbp, fbg, fbl, fbj {

    /* JADX INFO: renamed from: a */
    public static final long[] f29827a = {0, 150, 75, 150};

    /* JADX INFO: renamed from: b */
    public final fcp f29828b;

    /* JADX INFO: renamed from: c */
    private SensorEventListener f29829c;

    /* JADX INFO: renamed from: d */
    private boolean f29830d;

    /* JADX INFO: renamed from: e */
    private boolean f29831e;

    /* JADX INFO: renamed from: f */
    private boolean f29832f;

    /* JADX INFO: renamed from: g */
    private final jfs f29833g;

    /* JADX INFO: renamed from: h */
    private final djm f29834h;

    public hxp(Context context, BottomBarController bottomBarController, djm djmVar, fcp fcpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        jfs jfsVar = new jfs(context, (byte[]) null);
        this.f29832f = true;
        this.f29834h = djmVar;
        this.f29833g = jfsVar;
        this.f29831e = jfsVar.m13075J();
        this.f29829c = new hxo(this, (Vibrator) context.getSystemService("vibrator"), bottomBarController);
        this.f29828b = fcpVar;
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        this.f29834h.m6224E(this.f29829c);
        this.f29829c = null;
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f29832f = true;
        if (this.f29830d) {
            this.f29834h.m6224E(this.f29829c);
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        boolean zM13075J = this.f29833g.m13075J();
        this.f29831e = zM13075J;
        if (zM13075J && this.f29830d) {
            this.f29834h.m6225F(this.f29829c);
        }
        this.f29832f = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m10837d(boolean z) {
        this.f29830d = z;
        if (this.f29832f) {
            return;
        }
        if (this.f29831e && z) {
            this.f29834h.m6225F(this.f29829c);
        } else {
            this.f29834h.m6224E(this.f29829c);
        }
    }
}
