package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifk extends Handler {

    /* JADX INFO: renamed from: a */
    private final WeakReference f30660a;

    public ifk(ShutterButton shutterButton) {
        this.f30660a = new WeakReference(shutterButton);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ShutterButton shutterButton = (ShutterButton) this.f30660a.get();
        if (shutterButton == null) {
            return;
        }
        switch (message.what) {
            case 1000:
                ShutterButton.progressState = ifl.STATE_RESUME;
                removeMessages(1001);
                shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                return;
            case 1001:
                if (!hasMessages(1002)) {
                    ShutterButton.progressState = ifl.STATE_PAUSE;
                    shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                    return;
                } else {
                    removeMessages(1001);
                    ShutterButton.progressState = ifl.STATE_PAUSE;
                    shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                    return;
                }
            case 1002:
                ShutterButton.progressState = ifl.STATE_UPDATED;
                removeMessages(1001);
                shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                return;
            default:
                throw new IllegalArgumentException("Not supported state msg: " + message.what);
        }
    }
}
