package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hhq extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hhr f27824a;

    public hhq(hhr hhrVar) {
        this.f27824a = hhrVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x;
        float fAbs;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f27824a.f27840l.ordinal()) {
            case 1:
                x = motionEvent2.getX() - motionEvent.getX();
                fAbs = Math.abs(f);
                break;
            case 2:
                x = motionEvent.getX() - motionEvent2.getX();
                fAbs = Math.abs(f);
                break;
            default:
                x = motionEvent2.getY() - motionEvent.getY();
                fAbs = Math.abs(f2);
                break;
        }
        if (x < -80.0f && fAbs > 200.0f) {
            AmbientModeSupport.AmbientController ambientController = this.f27824a.f27847s;
            if (ambientController != null) {
                ambientController.m1659i();
            }
            return true;
        }
        if (x <= 80.0f || fAbs <= 200.0f) {
            return false;
        }
        AmbientModeSupport.AmbientController ambientController2 = this.f27824a.f27847s;
        if (ambientController2 != null) {
            ambientController2.m1658h();
        }
        return true;
    }
}
