package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iff extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShutterButton f30618a;

    public iff(ShutterButton shutterButton) {
        this.f30618a = shutterButton;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f30618a.buttonRect.contains(motionEvent.getX(), motionEvent.getY()) && this.f30618a.isClickEnabledAndNotBlocked() && this.f30618a.getMode() != ifi.PHOTO_LONGPRESS_LOCKED) {
            igf igfVar = this.f30618a.listener;
            if (this.f30618a.isLongPressInProgress.compareAndSet(false, true)) {
                this.f30618a.longPressStartMotionEvent = motionEvent;
                if (igfVar != null) {
                    igfVar.onShutterButtonLongPressed();
                }
            }
        }
    }
}
