package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gge extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ OptionsMenuContainer f24648a;

    /* JADX INFO: renamed from: b */
    private final gfa f24649b;

    public gge(OptionsMenuContainer optionsMenuContainer, gfa gfaVar) {
        this.f24648a = optionsMenuContainer;
        this.f24649b = gfaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.f24648a.m4245l();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f24648a.m4245l() || motionEvent2.getY() - motionEvent.getY() <= 80.0f || f2 <= 300.0f) {
            return false;
        }
        this.f24649b.mo9112L(2);
        return true;
    }
}
