package p000;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bng implements Camera.ShutterCallback {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3872b = 0;

    /* JADX INFO: renamed from: a */
    public final AmbientModeSupport.AmbientController f3873a;

    /* JADX INFO: renamed from: c */
    private final Handler f3874c;

    public bng(Handler handler, AmbientModeSupport.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f3874c = handler;
        this.f3873a = ambientController;
    }

    @Override // android.hardware.Camera.ShutterCallback
    public final void onShutter() {
        this.f3874c.post(new baa(this, 6));
    }
}
