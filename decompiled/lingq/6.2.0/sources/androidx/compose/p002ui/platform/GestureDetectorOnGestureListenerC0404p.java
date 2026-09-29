package androidx.compose.p002ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.p002ui.focus.C0301c;
import p000.i44;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC0404p implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i44 f4855a;

    public GestureDetectorOnGestureListenerC0404p(i44 i44Var) {
        this.f4855a = i44Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        i44 i44Var = this.f4855a;
        vi3 vi3Var = (vi3) i44Var.f43482c;
        if (!i44Var.f43480a) {
            int i = i44Var.f43481b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((C0301c) ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) vi3Var).f4479b.getFocusOwner()).m1363i(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((C0301c) ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) vi3Var).f4479b.getFocusOwner()).m1363i(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
