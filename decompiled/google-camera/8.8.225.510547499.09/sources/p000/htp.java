package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htp extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CompositeVideoView f29542a;

    public htp(CompositeVideoView compositeVideoView) {
        this.f29542a = compositeVideoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f29542a.f6997a.performClick();
        return true;
    }
}
