package p000;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class isy extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ite f32041a;

    public isy(ite iteVar) {
        this.f32041a = iteVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getX() <= this.f32041a.f32061L.getWidth() && motionEvent2.getX() >= 0.0f) {
            return false;
        }
        ite iteVar = this.f32041a;
        if (iteVar.f32069T) {
            return false;
        }
        iteVar.m11764o();
        this.f32041a.f32066Q = new PointF(motionEvent2.getRawX(), motionEvent2.getRawY());
        return false;
    }
}
