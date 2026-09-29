package za;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: za.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC10475k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C10468d.a {

    /* JADX INFO: renamed from: c */
    public final a f52410c;

    /* JADX INFO: renamed from: e */
    public final GestureDetector f52412e;

    /* JADX INFO: renamed from: a */
    public final PointF f52408a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f52409b = new PointF();

    /* JADX INFO: renamed from: d */
    public final float f52411d = 25.0f;

    /* JADX INFO: renamed from: f */
    public volatile float f52413f = 3.1415927f;

    /* JADX INFO: renamed from: za.k$a */
    public interface a {
    }

    public ViewOnTouchListenerC10475k(Context context, C10474j.a aVar) {
        this.f52410c = aVar;
        this.f52412e = new GestureDetector(context, this);
    }

    @Override // za.C10468d.a
    /* JADX INFO: renamed from: a */
    public final void mo19420a(float f3, float[] fArr) {
        this.f52413f = -f3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f52408a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        float x10 = (motionEvent2.getX() - this.f52408a.x) / this.f52411d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f52408a;
        float f11 = (y10 - pointF.y) / this.f52411d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f52413f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f52409b;
        pointF2.x -= (fCos * x10) - (fSin * f11);
        float f12 = (fCos * f11) + (fSin * x10) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        a aVar = this.f52410c;
        PointF pointF3 = this.f52409b;
        C10474j.a aVar2 = (C10474j.a) aVar;
        synchronized (aVar2) {
            float f13 = pointF3.y;
            aVar2.f52403g = f13;
            Matrix.setRotateM(aVar2.f52401e, 0, -f13, (float) Math.cos(aVar2.f52404h), (float) Math.sin(aVar2.f52404h), 0.0f);
            Matrix.setRotateM(aVar2.f52402f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return C10474j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f52412e.onTouchEvent(motionEvent);
    }
}
