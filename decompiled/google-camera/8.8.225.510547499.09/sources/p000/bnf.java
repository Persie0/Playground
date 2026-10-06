package p000;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnf implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    public final AmbientMode.AmbientController f3870a;

    /* JADX INFO: renamed from: b */
    private final Handler f3871b;

    private bnf(Handler handler, AmbientMode.AmbientController ambientController, byte[] bArr) {
        this.f3871b = handler;
        this.f3870a = ambientController;
    }

    /* JADX INFO: renamed from: a */
    public static bnf m2766a(Handler handler, AmbientMode.AmbientController ambientController) {
        if (handler == null || ambientController == null) {
            return null;
        }
        return new bnf(handler, ambientController, null);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f3871b.post(new bey(this, bArr, 6));
    }
}
