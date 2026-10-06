package p000;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bne implements Camera.PictureCallback {

    /* JADX INFO: renamed from: a */
    private final Handler f3869a;

    private bne(Handler handler) {
        this.f3869a = handler;
    }

    /* JADX INFO: renamed from: a */
    public static bne m2765a(Handler handler, bno bnoVar) {
        if (handler == null || bnoVar == null) {
            return null;
        }
        return new bne(handler);
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.f3869a.post(new cik(1));
    }
}
