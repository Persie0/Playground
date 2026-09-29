package p000;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class z7a extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, xz6 {

    /* JADX INFO: renamed from: c */
    public final ff9 f71031c;

    /* JADX INFO: renamed from: e */
    public final GestureDetector f71033e;

    /* JADX INFO: renamed from: a */
    public final PointF f71029a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f71030b = new PointF();

    /* JADX INFO: renamed from: d */
    public final float f71032d = 25.0f;

    /* JADX INFO: renamed from: f */
    public volatile float f71034f = 3.1415927f;

    public z7a(Context context, ff9 ff9Var) {
        this.f71031c = ff9Var;
        this.f71033e = new GestureDetector(context, this);
    }

    @Override // p000.xz6
    /* JADX INFO: renamed from: a */
    public final void mo11811a(float f, float[] fArr) {
        this.f71034f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f71029a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f71029a.x) / this.f71032d;
        float y = motionEvent2.getY();
        PointF pointF = this.f71029a;
        float f3 = (y - pointF.y) / this.f71032d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f71034f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f71030b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ff9 ff9Var = this.f71031c;
        PointF pointF3 = this.f71030b;
        synchronized (ff9Var) {
            float f5 = pointF3.y;
            ff9Var.f39017g = f5;
            Matrix.setRotateM(ff9Var.f39015e, 0, -f5, (float) Math.cos(ff9Var.f39018h), (float) Math.sin(ff9Var.f39018h), 0.0f);
            Matrix.setRotateM(ff9Var.f39016f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f71031c.f39021k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f71033e.onTouchEvent(motionEvent);
    }
}
